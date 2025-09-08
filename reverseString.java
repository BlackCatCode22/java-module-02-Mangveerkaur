

public class reverseString{
    public static void main(String[] args) {

String str = "Hello World";
String reversedStr = "";

for (int i = 0; i < str.length(); i++) {
  reversedStr = str.charAt(i) + reversedStr;
}

System.out.println("Reversed string: "+ reversedStr);
    
    
        
    
  }
}