public class HexaDecimalRegularExpression {
    
    public static void main(String[] args) {
        
        String str ="BB769Z";

        System.out.println(str.matches("[0-9 A-F]*"));
        System.out.println(str.matches("[0-9 A-F]+"));
    }
}
