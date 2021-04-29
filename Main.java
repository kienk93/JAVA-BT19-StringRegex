public class Main {
    public static final String[] classNameRight = {"A1234G","C3456H","P3827I"};
    public static final String[] classNameWrong = {"Z01234G","X3456H","Q3827I"};
    public static void main(String[] args) {
        CheckNameClass checkNameClass = new CheckNameClass();
        for (String checkName : classNameRight){
            boolean isValid = checkNameClass.validate(checkName);
            System.out.println("ClassName is " + checkName + " isValid " +isValid);
        }for (String checkName : classNameWrong){
            boolean isValid = checkNameClass.validate(checkName);
            System.out.println("ClassName is " + checkName + " isValid " +isValid);
        }

    }
}