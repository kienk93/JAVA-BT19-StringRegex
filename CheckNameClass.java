import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String className_Regex = "^[CAP]+[0-9]{0,4}+[GHIKLM]$";
    public CheckNameClass(){
        pattern = Pattern.compile(className_Regex);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}