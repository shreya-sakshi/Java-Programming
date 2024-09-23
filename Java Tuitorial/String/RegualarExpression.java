public class RegualarExpression {
    public static void main(String[] args) {
        
        int b = 180011100;
        String str = String.valueOf(b);

        System.out.println(str.matches("[01].*"));
        System.out.println(str.matches("[01]+"));
    }
}
