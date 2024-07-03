public class StringCompare {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="HellO";
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
