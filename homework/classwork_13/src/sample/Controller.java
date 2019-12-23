package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {
    @FXML
    private TextField output;
    @FXML
    private Label calculationDisplay;
    @FXML
    private Button sinInv;
    @FXML
    private Button cosInv;
    @FXML
    private Button tanInv;
    @FXML
    private Button lnInv;
    @FXML
    private Button logInv;
    @FXML
    private Button sqrtInv;
    @FXML
    private Button powInv;
    @FXML
    private Button RndInv;

    private double Lastnumber = 0;
    private int CounterBrackets = 0;
    private double ANS = 0;

    private String calculationText = "";
    private int Counter = 0;

    public void MainProcess(ActionEvent actionEvent) {
        System.out.println(calculationText);

        calculationTextCheck(output.getText(), Lastnumber);
        calculationDisplay.setText(calculationText);
        ClearValue();

        System.out.println(calculationText);

        ScriptEngineManager SEM =new ScriptEngineManager();
        ScriptEngine SE =  SEM.getEngineByName("JavaScript");

        try {
            String str = SE.eval(calculationText).toString();
            output.setText(str);
            ANS = Double.parseDouble(str);
        }
        catch (ScriptException ex){
            Error();
            System.out.println(ex);
        }
    }

    public void processNumpad(javafx.event.ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);

        Lastnumber = Double.parseDouble(output.getText());
    }

    public void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        calculationTextCheck(value, Lastnumber);
        calculationDisplay.setText(calculationText);
        ClearValue();
    }

    private void Error(){
        output.setText("Error");
    }

    @FXML
    void ClearScreen(){
        calculationText = "";
        calculationDisplay.setText("");
        output.setText("");

        CounterBrackets = 0;
    }

    private void ClearValue(){
        output.setText("");
    }

    private void HideButtons(){
        if (Counter % 2 == 0){
            sinInv.setVisible(false);
            cosInv.setVisible(false);
            tanInv.setVisible(false);
            lnInv.setVisible(false);
            logInv.setVisible(false);
            sqrtInv.setVisible(false);
            powInv.setVisible(false);
            RndInv.setVisible(false);
        }
        else {
            sinInv.setVisible(true);
            cosInv.setVisible(true);
            tanInv.setVisible(true);
            lnInv.setVisible(true);
            logInv.setVisible(true);
            sqrtInv.setVisible(true);
            powInv.setVisible(true);
            RndInv.setVisible(true);
        }
        Counter++;
    }

    private void calculationTextCheck(String value,double Lastnumber){
        if(value.equals("x!")){
            calculationText += "factorial("+Lastnumber+")";
            ClearValue();
        }
        else if(value.equals("√")){
            calculationText += ("Math.sqrt("+Lastnumber+",2)");
            ClearValue();
        }
        else if(value.equals("x^2")){
            calculationText += ("Math.pow("+Lastnumber+",2)");
            ClearValue();
        }
        else if(value.equals("x^y")){
            calculationText += "Math.pow(";
            ClearValue();
        }
        else if(value.equals("(")){
            calculationText += "(";
            CounterBrackets += 1;
        }
        else if(value.equals(")")){
            if (CounterBrackets > 0){
                calculationText += Lastnumber+")";
            }
            ClearValue();
        }
        else if (HelpMethods.isNumber(value) | value.equals(".")){
            calculationText += value;
        }
        else if (value.equals("π")){
            calculationText += Math.PI;
            ClearValue();
        }
        else if (value.equals("e") ){
            calculationText += Math.E;
            ClearValue();
        }
        else if (value.equals("Rnd") ){
            calculationText += Math.random();
            ClearValue();
        }
        else if (value.equals("sin") ){
            calculationText += ("Math.sin("+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("cos") ){
            calculationText += ("Math.cos("+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("tan") ){
            calculationText += ("Math.tan("+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("sin^(-1)") ){
            calculationText += ("Math.asin("+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("cos^(-1)") ){
            calculationText += ("Math.acos("+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("tan^(-1)") ){
            calculationText += ("Math.atan("+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("log") ){
            calculationText += ("Math.log("+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("10^x") ){
            calculationText += ("Math.pow(10,"+Lastnumber+")");
            ClearValue();
        }
        else if (value.equals("ln") ){
            calculationText += ("Math.ln("+Lastnumber+")");
            ClearValue();
        }

        else if (value.equals("e^x") ){
            calculationText += ("Math.pow("+Math.E+","+Lastnumber+")");
            ClearValue();
        }

        else  if (value.equals("EXP") ){
            calculationText += ("Math.exp("+Lastnumber+")");
            ClearValue();
        }

        else  if (value.equals("%") ){
            calculationText += "%";
            ClearValue();
        }

        else  if (value.equals("Ans") ){
            calculationText += ANS;
            ClearValue();
        }

        else  if (value.equals("Inv") ){
            HideButtons();
        }

        else if (!value.equals("AC")){
            calculationText += Lastnumber;
            calculationText += value;
            ClearValue();
        }
    }
}
