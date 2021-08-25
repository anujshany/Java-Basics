package com.variables;

import java.util.Arrays;
import java.util.Scanner;


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
                //byte age = 19;**
                //int phone = 1234567890;**
                // L for long
                //long phone2 = 12345678900L;**
                // F for float
                //float pi = 3.14F;**
                // L and F helps java interpret the declaration easily
                //char letter = 'a';**
                //boolean isAdult = true;**
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
                // Arithmetic Operators = maths operators
                // Assignment Operators
                // Logical Operators
                // Comparison Operators

                // Demonstration of + as A Arithmetic Operators
                double a = 1;
                double b = 2;
                double sum = a+b;
                //System.out.println(sum);**
                // Demonstration of - as A Arithmetic Operator
                double diff = a-b;
                //System.out.println(diff);**
                // Demonstration of * as A Arithmetic Operator
                double mul = a*b;
                //System.out.println(mul);**
                // Demonstration of * as A Arithmetic Operator
                double div = a/b;
                //System.out.println(div);**
                // using the modulo Arithmetic Operator --> it will basically give us the remainder of the division
                double modulo = a % b;
                //System.out.println(modulo);**
            }

            {
                //Assignment Operators
                // we've used assignment operators till now --> = is the operator
                int X = 5;
                // we here use the operator to assign a value to X and we've given it the value 5
                //System.out.println(X);**
            }

            {
                //Unary Operator
                int numb = 1;
                //numb = numb +1;**
                // this can also be re-written as
                //numb++;**
                // there is one thing to understand here the placement of ++
                // if it is numb++ then it'll be like

                //System.out.println(numb++);** //--> 1
                //System.out.println(numb);**  // --> 2

                // and if it is ++numb then
                //System.out.println(++numb); //--> 2
                //System.out.println(numb);  //--2

                // the basic difference can be that when we do numb++ it'll change the value next time we call it
                // but when we do ++numb it'll instantly change the value of numb
                // as we use ++ we can use -- too if required

            }

            {
                //Maths
                // let's assume we have 5 and 6 we want to find the max value from it
                //System.out.println(Math.max(5,6));**  //--> we use Math.max for the same

                // and if we want to find the minimum of the same we will do
                //System.out.println(Math.min(5,6));**

                //this is majorly used when we are implementing Data-Structures and Algorithms with Java

                // random --> this gives us a random value between 0.0 and 1.0 in the long form as default
                //System.out.println(Math.random());**

                // we can use typecasting for the same but in a explicit manner
                //System.out.println((int)Math.random());** //--> this will always give us value as 0

                // but if we need a random int we can do the following
                //System.out.println((int)(Math.random()*100));**  //--> this will give us the value multiplied by 100 which
                // will be converted into int because we did explicit casting
            }

            {
                //Taking Input
                Scanner sc = new Scanner(System.in); //--> sc input object
                //System.out.println("Input Your Age :");**
                //int age = sc.nextInt();** //--> used nextInt as we assign a Int value to the input object declared
                //System.out.println(age);**

                // Doing the same but just with float
                Scanner flt = new Scanner(System.in); //--> flt input object
                //System.out.println("Input Your Age :");**
                //float age = flt.nextFloat();88
                //System.out.println(age);**

                //There are multiple values we can use for input but here we'll focus on some major part here

                //String Input
                //Scanner str = new Scanner(System.in);
                //System.out.println("Input Your Name : ");**
                //String name = str.next();** // --> this only takes input of tokens(one word) not a whole line
                //System.out.println(name);**

                //Sentence Input
                Scanner sent = new Scanner(System.in);
                //System.out.println("Input Your Line : ");**
                //String sentence =sent.nextLine();**
                //System.out.println(sentence);**

            }

            {
                //Comparison Operators -->
                // a == b --> is equal
                // a != b --> is not equal
                // a < b --> less than
                // a > b --> greater than
                // a <= b --> less than equal to
                // a >= b --> greater than equal to
            }
            {
                //Conditional Statements
                boolean isSunUp = false; //--> declaring a false boolean and checking it through a conditional Statement
                //if(isSunUp==true)**
                    //System.out.println("Day");**
                //else**
                    //System.out.println("Night");**


                int AGE = 21; //--> setting checks for if else
                //if (AGE>18)**
                    //System.out.println("Can Vote");**
                //else**
                    //System.out.println("Can't Vote");**
            }
        }
    }
}
