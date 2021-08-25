package com.variables;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        {   // uncomment the lines in-front of which ** are there when you're at that part and make sure to re-comment
            // the above part you're done with this will help you understand this better :)
            // ignore the warnings too

            {//Primitive Data Types in Java
                // byte -1[-128 to 127]
                // short -2
                // int -4 1,2,3,4
                // long -8
                // float -4 3.14
                // double -8
                // char -2 a,b,c,d
                // boolean -1 true/false
                byte age = 19;
                int phone = 1234567890;
                // L for long
                long phone2 = 12345678900L;
                // F for float
                float pi = 3.14F;
                // L and F helps java interpret the declaration easily
                char letter = 'a';
                boolean isAdult = true;
            }


            {//Non-primitive types
                String name =new String("Anuj");
                String friend = new String("Nimish");
                //System.out.println(name.length()); **
                //Strings(Non-primitive)
                //Concatenation
                String name1 = "Anuj";
                String name2 = "Shany";
                String name3 = name1+" "+name2;
                //System.out.println(name3); **
                //CharAt
                String Name = "Anuj";
                //System.out.println(Name.charAt(1)); **
                //Replace
                String Name2 = Name.replace('A','B');
                //System.out.println(Name2); **
                //System.out.println(Name); **
                //Substring
                String Multi = "Chandler and Joey ";
                //System.out.println(Multi.substring(13,17)); **
                //Arrays(Non-primitive)
                int Age = 19; //Example of int
                //Creating Array
                int[] marks = new int[3]; //--> int array
                //Storing Value in Array
                marks[0] = 97;
                marks[1] = 98;
                marks[2] = 95;
                // if we initialize A array and don't give it any value it'll take null values for the array
                //System.out.println(marks[2]);**
                //Length
                //System.out.println(marks.length);**
                //Sorting
                // - We imported a package for this function (we imported the arrays class for this function Arrays is
                // A inbuilt class in Java

                    //System.out.println(marks[0]);** //--> before sorting
                Arrays.sort(marks);
                    //System.out.println(marks[0]);** //--> after sorting
                //How to initialize A array if we already know the elements to be placed in it(we don't use new keyword)
                int[] Marks = {98,95,97};

                //2D array
                // can be said as collection of 2 arrays into one so indexing will be same
                //        index         0            1
                //        index     0{0, 1, 2} 1{0, 1, 2}
                int[][] finalMarks ={{97,98,95},{84,96,99}};

                // if we do this it'll print 97 as it is the first element of first array
                    //System.out.println(finalMarks[0][0]); **
                // if we do this it'll print 84 as it is the first element of second array
                    //System.out.println(finalMarks[1][0]); **
            }
            {   //Casting is a concept of java
                double price = 100.00;
                double finalPrice = price + 18; // --> here in last we are adding 18 which is int this is implicit casting
                // casting is basically storing on type of data struct into another
                // in simple words we can store content of a glass in a bucket but not vice-versa
                // we can add int to double as double can store 8byte

                    //System.out.println(finalPrice); **
                // here explicit casting will be applied
                // it's just that we loose some portion of data when we do this

                int p = 100;

                //int fP = p +18.0; //--> we're trying to store double in int so in this but this will not work
                //this will be the correct syntax for the same

                int fp = p +(int)18.18;//--> we just use() and mention the type in which we want it to convert
                //System.out.println(fp);**

                // The important thing to note here is that the conversion we want to do should be compatible atleat
                // we cannot convert string into int

            }
            {
                //Constants
                int Age= 30;
                Age = 31;
                // above is a example of that this is not a constant in java

                // PI value should be constant value which we do by
                final float PI = 3.14F;
                // Now this value cannot be changed
            }
            {
                //Operators
                // 4 types of operator exist in java
                // Arithmetic Operators
                // Assignment Operators
                // Logical Operators
                // Comparison Operators
            }
        }
    }
}
