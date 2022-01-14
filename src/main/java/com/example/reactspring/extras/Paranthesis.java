package com.example.reactspring.extras;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Paranthesis {
//    public static boolean isValid(String s) {
//        int length=s.length();
//        char [] array=s.toCharArray();
//        if(length==0) return true;
//        Stack<Character> stack=new Stack<Character>();
//        for(int i=0; i<length; i++)
//        {
//            if(array[i]=='(' || array[i]=='{' || array[i]=='[' )
//            {
//                stack.push(array[i]);
//            }
//            if(array[i]==')' ||array[i]=='}' ||array[i]==']')
//            {
//                if(stack.isEmpty())
//
//                    return false;
//try{
//    char temp=stack.pop();
//    char temp1=stack.pop();
//
//
//    if((temp=='(' && temp1==')' ) || (temp=='{' && temp1=='}' ) || (temp=='[' && temp1==']' ))
//    {
//        return true;
//    }else
//    {
//        return false;
//    }
//}catch ( Exception e)
//{
//    e.printStackTrace();
//}
//
//
//
//            }
//        }
//        if(!stack.isEmpty()) return false;
//        return true;
//    }


//    public static void main(String[] args) {
//        String validCharacter = "[";
//        String validaCharacter1 = "]";
//
//        System.out.println(isValid(validCharacter+ validaCharacter1));
//
//    }

    public static boolean checkValid(int n)
    {

        while (n>0)
        {
            String v = "";

            v= (n%2)+v;
            n/=2;

            List<String> list = new ArrayList<String>();
            list.add(v);


            for( String listed: list)
                System.out.println("List is:"+listed);

            // find first element
            String first = list.get(0);
            System.out.println("first number is:"+first);
//
//            // find last element
//            String last = list.get(list.size() - 1);
//            System.out.println(last);

//            if (first == last)
//                return true;
//            else
//                return false;
        }






//        ir


//         String f = v.toArray();

//         int length = v.length();
//
//         for(int i=0; i<=length; i++)
//
//         if(length==0)
//             return false;

//         else if(length == )
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        System.out.println("New List:" );
        System.out.println(Paranthesis.checkValid(number));
    }

}
