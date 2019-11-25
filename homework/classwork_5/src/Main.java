import Console.User;
import Currency.Currency;
import File.FileMethods;

public class Main {
    private static Currency obj_Currency= new Currency();
    private static String[] CurrencyTypeList = {"USD","EUR","GBP"};
    private static FileMethods obj_FileMethods = new FileMethods();

    public static void main(String[] args) {
        obj_FileMethods.ReadFile();
        int ChoiceExchange = User.ChangeExchangeCourse();
        int ChoiceBuyOrSell = User.BuyOrSell();
        int ChoiceCurrency = User.CurrencyChoice();

        if(ChoiceExchange == 1){
            if( ChoiceCurrency < 4){
                float money = User.EnterMoney();
                obj_Currency.ChangeCurrency(ChoiceBuyOrSell,ChoiceCurrency,money);
            }
            else {
                System.out.println("Please Enter Currency Number Correctly");
            }
        }
        else if(ChoiceExchange == 2){
            float money = User.EnterMoney();

            float exMoney = obj_Currency.ExChange(ChoiceBuyOrSell, ChoiceCurrency, money);

            if (ChoiceBuyOrSell == 1){
                if(ChoiceCurrency <4){
                    System.out.println("You Converted "+ money +" GEL to "+ exMoney +" "+CurrencyTypeList[ChoiceCurrency-1]);
                }
                else {
                    System.out.println("Please Enter Currency Number Correctly");
                }
            }
            else if(ChoiceBuyOrSell == 2){
                if(ChoiceCurrency <4){
                    System.out.println("You Converted "+ money +" "+CurrencyTypeList[ChoiceCurrency-1]+" to "+ exMoney +" GEL");
                }
                else {
                    System.out.println("Please Enter Currency Number Correctly");
                }
            }
            else{
                System.out.println("Please Enter Choise Number Correctly");
            }
        }
        else {
            System.out.println("Please Enter Choise Number Correctly");
        }
    }
}
