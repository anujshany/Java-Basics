package com.variables;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    // Complete Exception Handling before coming to this part
    //Methods/Functions
    // Methods basically are functions declared in a class
    // we create methods for repetitive actions
    // we create methods like this
    // this function is accessed on the line no 407-409
    public static void printJava(){
        System.out.println("Hello Java");
    }
    // This commences our java basics check the mini project folder for the project and before implementing it
    // try to understand it

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

            {
                //Logical Operators
                // && --> And operator in which even if one parameter is false the whole outcome will be false

                int a = 58;
                int b = 48;

                //if(a < 50 && b < 50)** // --> here using AND operator we check both parameters
                    //System.out.println("Both Less Than 50"); **

                // || --> logical OR operator this checks for one parameter to be true and outcome will be false
                 //if(a < 50 || b <50)**
                     //System.out.println("At least Less Than 50");**

                // ! --> NOT operator
                boolean isAdult = false;
                //if (!isAdult)** // --> using ! in the if statement changes it to check it for false statement and if we just do
                              // if(isAdult) this will check for true condition only
                    //System.out.println("is Adult");**
                //else**
                    //System.out.println("Not Adult");**

                // we use this negation operator if we want to explicitly check for conditions if they are true or false
            }
            {
                //Working of Conditional Statements
                Scanner sc = new Scanner(System.in);
                // cost of pen = 10 , notebook = 40
                //int cash = sc.nextInt();**
                //if(cash < 10){**
                    //System.out.println("Cannot buy anything");**
                    //System.out.println("Get more cash");**
                //}**
                //else if (cash > 10 && cash < 50 ){**
                    //System.out.println("Can purchase 1 thing");**
                //}**
                //else {**
                    //System.out.println("Can Get Both");**
                //}**

            }
              {
                // Conditional Statements - SWITCH
                // takes one value and checks multiple conditions on that basis
                int day = 1; // 1 - monday and so on
                // inside SWITCH, we have cases

                //switch (day){**
                    //case 1 :** //--> if value of day is 1 then this case will be applied
                        //System.out.println("Monday");**
                        //break;** // --> we use this to breakout of the function otherwise all other statements will get printed too
                    //case 2 :** // --> if value is 2 we do this
                        //System.out.println("Tuesday");**
                        //break;**
                    //default:** //--> else any other value we implement this default
                        //System.out.println("Wednesday -- Sunday");**
              }
              {
                  //Loops
                  // 3 types of loops
                  // for loops
                  // do while loops
                  // while loops

                  //FOR LOOP --> 1 to 100
                  //for(int i = 1; i <=100; i++ ){**
                      //System.out.println(i);**
                  //}**
                  //FOR LOOP --> 100 to 1
                  //for(int i = 100; i >=1; i--){**
                      //System.out.println(i);**
                  //}**

                  //WHILE LOOP
                  //int j = 101;**
                  //while(j>= 1){**
                      //System.out.println(j);**
                      //j--;**
                  //}**

                  // DO WHILE LOOP
                    //int k = 100;**
                    //do{**
                        //System.out.println(k);**
                        //k--;**
                    //} while (k >= 1);**

              }
              {
                  //Implementation of Loops
                  //Scanner sc = new Scanner(System.in);**
                  //int number = 0;**
                  //do{**
                      //System.out.println("Input a number : ");**
                      //number = sc.nextInt();**
                      //System.out.print("Here is your number : ");**
                      //System.out.println(number);**
                  //}while (number >= 0);**
                  //System.out.println("Number is negative THE END");**

              }

              {
                  //Break and Continue
                  //int i = 0;
                  //while(true){
                      //if(i == 3){**//--> this here means that we dont want 3 to get printed so what we do is use
                          // continue keyword, and we increment the value of i because if we do not update it it'll
                          // remain stuck at 3 only
                          //i++;**
                          //continue;**
                      //}**
                      //System.out.println(i);**
                      //i++;**
                      //if(i > 5){**
                          //break;**
                      //}**

                      //if the while loop is set to true it will run for infinite times
                      // to exit out of it we use break; statements
                  }

                  {
                    //EXCEPTION HANDLING
                    // exceptions are written in the code by the programmer due to some silly mistakes
                    // for this we use try and catch
                    int[] marks ={99,85,96};
                    //System.out.println(marks[5]);**//--> here we are trying to access the bound outside the array
                    //System.out.println("The Student Name is Anuj");** //--> this will not execute due to the exception
                    // so we use try catch block
                        //try {** // declared in this because if there is a chance of error this won't crash the whole
                      // file
                            //System.out.println(marks[5]);**
                        //} catch (Exception exception){**
                            // here we write arguments that we want to execute after catching the exception

                        //}**
                      //System.out.println("The Name of Student is Anuj");**
                  }
            }
            printJava();
            printJava();
            printJava();
    }




}



