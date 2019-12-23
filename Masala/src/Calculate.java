import java.util.ArrayList;

public class Calculate {
    public void GetValues(String gantoleba){
        ArrayList values = HelpMethods.SplitString(gantoleba, "");

        //5+3*5

        if (HelpMethods.CountLetter(gantoleba,'(') == 1){
            int i = 0;
            while (values.get(i).toString().equals(")")){
                values.get(values.indexOf('('));
                i++;
            }

        }
    }
}
