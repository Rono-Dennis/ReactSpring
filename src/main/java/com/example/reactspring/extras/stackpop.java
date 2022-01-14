package com.example.reactspring.extras;

import java.util.HashMap;

public class stackpop {
//    static boolean isValidParentheseUsing2Pointers(String testString) {
//        if (testString == null || "".equals(testString)) return false;
//        if (testString.length() % 2 != 0) return false;
//        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
//        hashMap.put('<', '>');
//        hashMap.put('{', '}');
//        hashMap.put('[', ']');
//        hashMap.put('(', ')');
//        char[] charArray = testString.toCharArray();
//        for (int i = 0, j = i + 1; j < charArray.length; i = i + 2, j = i + 1) {
//            char currentc = charArray[i];
//            char nextc = charArray[j];
//            char closingChar = hashMap.get(currentc);
//            if (closingChar != nextc)
//                return false;
//        }
//        return true;
//    }





    public static class Converter
    {
        public static boolean toBinary(int num)
        {
            String binary="";


            while(num>0)
            {
                binary=(num%2)+binary;
                num/=2;
            }

            binary.length();
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(binary,binary);
            char[] charArray = binary.toCharArray();
            for(int i = 0; i>=charArray.length; i++ );
            System.out.println(charArray);
            System.out.println(charArray[0]);
            System.out.println(charArray.length-1);

            if (charArray[0] == charArray.length-1)
                return true;
                else

//            return binary;
            return false;
        }

        public static void main(String[] args) {

            int number = 15;

            System.out.println(Converter.toBinary(number));
        }
    }
//ur code goes here


//    public static class Program {
//        public static void main(String[ ] args) {
//            System.out.println("enter a number");
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            System.out.print(Converter.toBinary(x));
//        }
//    }


    // Java to check whether
// the number has only
// first and last bits set


//
////    new one
//    static class GFG
//    {
//// function to check whether
//// the number has only
//// first and last bits set
//        static boolean onlyFirstAndLastAreSet(int n)
//        {
//            if (n == 1)
//                return true;
//            if (n == 2)
//                return false;
//            return (((n - 1) &
//                    (n - 2)) == 0);
//        }
//
//        // Driver Code
//        public static void main(String[] args)
//        {
//            int n = 15;
//            if (onlyFirstAndLastAreSet(n))
//                System.out.println("Yes");
//            else
//                System.out.println("No");
//        }
//    }

// This code is contributed
// by Smitha








    // Java Program to Convert Integer Values into Binary

// Importing CLasses/Files










//
//    public static class GFG {
//        // Function to print binary number
//        static void printBinary(int[] binary, int id)
//        {
//            // Iteration over array
//            for (int i = id - 1; i >= 0; i--)
//                System.out.print(binary[i] + "");
//        }
//
//        // Function converting decimal to binary
//        public static void decimalToBinary(int num)
//        {
//            // Creating and assigning binary array size
//            int[] binary = new int[35];
//            int id = 0;
//
//            // Number should be positive
//            while (num > 0) {
//                binary[id++] = num % 2;
//                num = num / 2;
//            }
//
//            // Print Binary
//            printBinary(binary, id);
//        }
//
//        // Main Driver Code
//        public static void main(String[] args)
//        {
//            // Entered number to be convert into binary
//            int num = 5;
//
//            // Calling Our Above Function
//            decimalToBinary(num);
//        }
//    }










//



}
