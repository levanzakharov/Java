package GenerateText;

import HelpMethods.HelpMethods;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class GenerateText{
    private final String Language;
    private final String Parameters;
    private final GetValues obj = new GetValues();
    private String[] LanguageList = {"en","ge","ru"};

    public GenerateText() {
        this.Language = "en";
        this.Parameters = "p-2-s-5-7-w-7-9-l-7-9";
    }

    public GenerateText(String Language, String Parameters){
        this.Language = Language;
        this.Parameters = Parameters;
    }

    public Boolean CheckValues(){
        return Arrays.asList(LanguageList).contains(Language) & HelpMethods.CountLetter(Parameters) >= 4;
    }

    public String[] GenerateTextMethod(){
        ArrayList alphabet = obj.GenerateAlphabet(Language);

        ArrayList ParameterValuesList = HelpMethods.SplitString(Parameters, "-");

        int paragraph = obj.GetValuesFromParameter(ParameterValuesList, "p")[0];

        int[] Values = obj.GetValuesFromParameter(ParameterValuesList, "s");
        int sentenceFrom = Values[0];
        int sentenceTo = Values[1];

        Values = obj.GetValuesFromParameter(ParameterValuesList, "w");
        int wordFrom = Values[0];
        int wordTo = Values[1];

        Values = obj.GetValuesFromParameter(ParameterValuesList, "l");
        int letterFrom = Values[0];
        int letterTo = Values[1];

        StringBuilder randomText = new StringBuilder();
        for (int i = 0; i < paragraph; i++){
            int randomInt = HelpMethods.RandomInt(sentenceFrom, sentenceTo);
            for (int j = 0; j < randomInt; j++){
                randomInt = HelpMethods.RandomInt(wordFrom, wordTo);
                for (int k = 0; k < randomInt; k++){
                    randomInt = HelpMethods.RandomInt(letterFrom, letterTo);
                    for (int m = 0; m < randomInt; m++){
                        randomText.append(alphabet.get(HelpMethods.RandomInt(0, alphabet.size() - 1)));
                    }
                    randomText.append(" ");
                }
                randomText.append("    ");
            }
            randomText.append("\n\n");
        }
        System.out.println(randomText);
        return new String[]{Language,Parameters, randomText.toString()};
    }


}
