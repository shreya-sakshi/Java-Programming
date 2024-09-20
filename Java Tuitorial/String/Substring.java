public class Substring 
{
    public static void main(String[] args) 
    {
        String str ="programmer@gmail.com";
        int i =str.indexOf("@");
        String username = str.substring(0,i);
        String domain = str.substring(i+1 ,str.length());
        System.out.println("Username : " +username);
        System.out.println("DomainName : " +domain);

        // System.out.println(domain.startsWith("gmail"));

        int j = domain.indexOf(".");
        String name = domain.substring(0, j);
        System.out.println(name.equals("gmail"));
    }
}