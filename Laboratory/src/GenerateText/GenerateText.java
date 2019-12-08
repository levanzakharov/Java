package GenerateText;

import HelpMethods.HelpMethods;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class GenerateText {
    private final String Language;
    private final String Parameters;
    private final GetValues obj = new GetValues();
    private String[] LanguageList = {"en","ge","ru"};
    private ArrayList Alphabet = new ArrayList<Character>();
    private int Paragraph;
    private int SentenceFrom;
    private int SentenceTo;
    private int WordFrom;
    private int WordTo;
    private int LetterFrom;
    private int LetterTo;
    private String RandomText;

    public GenerateText() {
        this.Language = "en";
        this.Parameters = "p-2-s-5-7-w-7-9-l-7-9";
    }

    public GenerateText(String Language, String Parameters){
        this.Language = Language;
        this.Parameters = Parameters;
    }

    public Boolean CheckValues(){
        return Arrays.asList(LanguageList).contains(Language) & HelpMethods.CountLetter(Parameters) >= 5;
    }

    public String[] GenerateTextMethod(){
        Alphabet = obj.GenerateAlphabet(Language);

        ArrayList ParameterValuesList = HelpMethods.SplitString(Parameters, "-");
        Paragraph = obj.GetValuesFromParameter(ParameterValuesList,"p")[0];

        int[] Values = obj.GetValuesFromParameter(ParameterValuesList, "s");
        SentenceFrom = Values[0];
        SentenceTo = Values[1];

        Values = obj.GetValuesFromParameter(ParameterValuesList, "w");
        WordFrom = Values[0];
        WordTo = Values[1];

        Values = obj.GetValuesFromParameter(ParameterValuesList, "l");
        LetterFrom = Values[0];
        LetterTo = Values[1];

        RandomText = "";
        for (int i = 0; i < Paragraph; i++){
            int randomInt = HelpMethods.RandomInt(SentenceFrom,SentenceTo);
            for (int j = 0; j < randomInt; j++){
                randomInt = HelpMethods.RandomInt(WordFrom,WordTo);
                for (int k = 0; k < randomInt; k++){
                    randomInt = HelpMethods.RandomInt(LetterFrom,LetterTo);
                    for (int m = 0; m < randomInt; m++){
                        RandomText += Alphabet.get(HelpMethods.RandomInt(0, Alphabet.size()-1));
                    }
                    RandomText += " ";
                }
                RandomText += "    ";
            }
            RandomText += "\n\n";
        }
        System.out.println(RandomText);
        return new String[]{Language,Parameters,RandomText};
    }


}
