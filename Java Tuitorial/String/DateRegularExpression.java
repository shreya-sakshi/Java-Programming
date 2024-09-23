public class DateRegularExpression {
    public static void main(String[] args) {
        String str ="01/12/2020";

        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
    
}
