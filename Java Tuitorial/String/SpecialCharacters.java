public class SpecialCharacters {
    public static void main(String[] args) {
        String str="a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-z A-Z 0-9]",""));
    }
    
}
