package PatternPrint;

public class ReverseString {
    public static void main(String[] args) {
    //System.out.println("Enter the String");
    String str1 = "India";
    System.out.println("The orignal String is: "+ str1);
    System.out.println(reverse(str1));
    }

    public static String reverse(String str){
        StringBuilder sb1 = new StringBuilder();
       char[] chars = str.toCharArray();
       for (int i=chars.length-1;i>=0;i--){
           sb1.append(chars[i]);
       }
       return (sb1.toString().toUpperCase());
    }
}
