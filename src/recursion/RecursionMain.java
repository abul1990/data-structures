package src.recursion;

public class RecursionMain {
    public static void main(String[] args) {
        RecursionMain recursion = new RecursionMain();
        var rec = recursion.factorial(-2);
        System.out.println(rec);

        var fibonacci = recursion.fibonacci(-2);
        System.out.println(fibonacci);

        var sumofDigits = recursion.sumofDigits(111);
        System.out.println(sumofDigits);

        var power = recursion.power(2,-2);
        System.out.println(power);

        var gcd = recursion.gcd(-8,4);
        System.out.println(gcd);

        var decimalToBinary = recursion.decimalToBinary(15);
        System.out.println(decimalToBinary);
    }

    public int factorial(int n) {
        if (n<1) {
            return -1;
        }
        if (n==0 || n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public int fibonacci(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumofDigits(int n) {

        if (n==0 || n < 0) {
            return 0;
        }
        return n%10 + sumofDigits(n/10);
    }

    public int power(int base, int exp) {
        if (exp<0) {
            return -1;
        }
        if (exp==0 || exp==1) {
            return base;
        }
        return base * power(base, exp-1);
    }

    public int gcd(int a, int b) {
        if (a<0 || b<0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public int decimalToBinary(int n) {
        if (n==0) {
            return 0;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }

//    REVERSE SOLUTION
    public String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
//    IS PALINDROME SOLUTION
    public  boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }
//    SOME RECURSIVE SOLUTION
//    public boolean someRecursive(int[] arr, OddFunction odd) {
//        if (arr.length == 0 ) {
//            return false;
//        } else if (odd.run(arr[0]) == false) {
//            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
//        } else {
//            return true;
//        }
//    }
//    FIRST UPPERCASE SOLUTION
    public static char first(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return first(str.substring(1, str.length()));
        }
    }
//    CAPITALIZE WORD SOLUTION
    public static String capitalizeWord(String str) {

        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0,str.length()-1))+ Character.toString(chr);
    }

}
