import java.lang.*;

class Main{
  public static boolean happy = true;
  public static int a = 45;
  public static int b = 35;
  public static String str = "Hello world";
  public static String checkString = "extreme";



public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

   System.out.println(sum(a, b));

   System.out.println(upperCase(str));

   System.out.println(isFirstUpper(checkString));

}

public static boolean iAmHappy() {
  // fill out what is missing here: 
  return happy;
}

public static int sum(int a, int b) {
  return a+b;
}

public static String upperCase(String str) {
  return str.toUpperCase();
}

public static boolean isFirstUpper(String checkString) {
    char charCheck = checkString.charAt(0);
    if(Character.isUpperCase(charCheck)) {
      return true;
    }
    return false;

}
}


