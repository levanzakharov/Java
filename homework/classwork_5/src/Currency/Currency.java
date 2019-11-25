package Currency;

import File.FileMethods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Currency implements CurrencyInterface{
    private float ExRate;
    private String[][] CurrencyTypeList = {{"BUSD","BEUR","BGBP"},{"SUSD","SEUR","SGBP"}};

    @Override
    public float ExChange(int BuyOrSell,int Currency,float money) {
        float ExMoney = 0;
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("E:\\JAVA\\Java\\homework\\classwork_5\\src\\File\\Currency.txt"));
            String line = "";

            while ((line = br.readLine()) != null) {
                if (line.startsWith(CurrencyTypeList[BuyOrSell-1][Currency-1])) {
                    String[] ExString = line.split("=");
                    ExRate = Float.parseFloat(ExString[1]);
                }
            }

            ExMoney = money*ExRate;

            return ExMoney;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }


    public void ChangeCurrency(int BuyOrSell,int Currency,float money){
        try {
            FileMethods obj = new FileMethods();
            obj.ModifyFile(CurrencyTypeList[BuyOrSell-1][Currency-1],money);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
