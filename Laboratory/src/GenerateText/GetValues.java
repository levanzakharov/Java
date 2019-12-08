package GenerateText;

import HelpMethods.HelpMethods;
import java.util.ArrayList;

public class GetValues implements GetValuesInterface {
    private ArrayList<Character> Alphabet = new ArrayList<>();
    private int From;
    private int To;

    @Override
    public ArrayList GenerateAlphabet(String Language) {
        switch (Language) {
            case "ge":
                for(int i = 0; i<33;i++) {
                    Alphabet.add((char)('ა'+i));
                }
                break;
            case "ru":
                for(int i = 0; i<33;i++) {
                    Alphabet.add((char)('а'+i));
                }
                for(int i = 0; i<33;i++) {
                    Alphabet.add((char)('А'+i));
                }
                break;
            default:
                for(int i = 0; i<26;i++) {
                    Alphabet.add((char)('a'+i));
                }
                for(int i = 0; i<26;i++) {
                    Alphabet.add((char)('A'+i));
                }
                break;
        }
        return Alphabet;
    }

    @Override
    public Boolean checkValuesFromParameter(ArrayList Values, String cvladi, int i) {
        boolean check = false;
        if ((Values.indexOf(cvladi)+i) <= Values.size()-1){
            check = HelpMethods.isNumber(Values.get(Values.indexOf(cvladi) + i).toString());
        }
        return check;
    }

    @Override
    public int[] GetValuesFromParameter(ArrayList Values,String cvladi) {
        if (Values.contains(cvladi) & checkValuesFromParameter(Values,cvladi,1) & checkValuesFromParameter(Values,cvladi,2) ){
            int a = Integer.parseInt( Values.get( Values.indexOf(cvladi)+1 ).toString() );
            int b = Integer.parseInt( Values.get( Values.indexOf(cvladi)+2 ).toString() );
            From = Math.min(a,b);
            To = Math.max(a,b);
            Values.remove(Values.indexOf(cvladi)+2);
            Values.remove(Values.indexOf(cvladi)+1);
            Values.remove(cvladi);
        }
        else if (Values.contains(cvladi) & checkValuesFromParameter(Values,cvladi,1) & !checkValuesFromParameter(Values,cvladi,2) ){
            int a = Integer.parseInt( Values.get( Values.indexOf(cvladi)+1 ).toString() );
            int b = a+5;
            From = Math.min(a,b);
            To = Math.max(a,b);
            Values.remove(Values.indexOf(cvladi)+1);
            Values.remove(cvladi);
        }
        else if (Values.contains(cvladi) & !checkValuesFromParameter(Values,cvladi,1) ){
            Values.remove(cvladi);
            From = 5;
            To = 10;
        }
        else if (!Values.contains(cvladi)){
            From = 5;
            To = 10;
        }
        return new int[]{From,To};
    }

}
