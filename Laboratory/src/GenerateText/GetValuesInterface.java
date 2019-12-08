package GenerateText;

import java.util.ArrayList;

public interface GetValuesInterface {
    ArrayList GenerateAlphabet(String Language);
    Boolean checkValuesFromParameter(ArrayList Values,String cvladi,int i);
    int[] GetValuesFromParameter(ArrayList Values,String cvladi);


}
