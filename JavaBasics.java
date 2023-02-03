import java.util.*;
public class JavaBasics
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int num = sc.nextInt();
        // System.out.println(num);

        // float price = sc.nextFloat();
        // System.out.println(price);

        //Userdefine Sum of a and b
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        //Product of a and b
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a*b;
        // System.out.println(product);

        // Area of Circle
        // float r = sc.nextInt();
        // float area = 3.14f * r * r;
        // System.out.print(area);

        // Typecasting
        // float a = 25.12f;
        // // int b = a;
        // int b =(int)a;
        // System.out.println(b);
         
        // char ch = '$';
        // int number = ch;
        // System.out.print(number);

        // Type Promotions
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a + b + c);
        // System.out.println(bt);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;
        // System.out.println(ans);


        // Patterns
        // System.out.print("Hello World!\n");
        // System.out.println("* * * * *");
        // System.out.println("* * * *");
        // System.out.println("* * *");
        // System.out.println("* *");
        // System.out.println("*");
        
        // int a = 10;
        // int b = 5;
        // System.out.println(a);
        // System.out.println(b);

        // String name = "Tony Stark";
        // System.out.println(name);

        // a = b;
        // System.out.println(a);

        // a = 25;
        // System.out.println(a);

        // Sum of two numbers
        // int a = 10;
        // int b = 9;
        // int sum = a + b;
        // System.out.println(sum);

        // Operators
        // Binary Operator
        // int A = 10;
        // int B = 5;
        // System.out.println("Add = " + (A+B));
        // System.out.println("Subtract = " + (A-B));
        // System.out.println("Multiply = " + (A*B));
        // System.out.println("Division = " + (A/B));
        // System.out.println("Module(remainder) = " + (A/B));

        // Unary Operator
        // int A = 10;
        // int B = ++A; //pre increment
        // System.out.println(A);
        // System.out.println(B);

        // int A = 10;
        // int B = A++; //post increment
        // System.out.println(A);
        // System.out.println(B);

        // int A = 10;
        // int B = --A; //post decrement
        // System.out.println(A);
        // System.out.println(B);

        // int A = 10;
        // int B = A--; //post decrement
        // System.out.println(A);
        // System.out.println(B);

        // Relational Operators
        // int a = 10;
        // int b = 5;
        // System.out.println((a == b));
        // System.out.println((a != b));
        // System.out.println((a > b));
        // System.out.println((a < b));
        // System.out.println((a >= b));
        // System.out.println((a <= b));

        // Logical Operators
        // System.out.println((3 > 2) && (5 > 0)); // Logical AND
        // System.out.println((3 > 5) || (5 < 0)); // Logical OR
        // System.out.println(!(4 < 6)); // Logical NOT

        // Assignment Operator 
        // int a = 10;
        // // a = a + 10;
        // // a += 10;
        // // a = a - 10;
        
        // a -= 10;
        // System.out.println(a);

        // Conditional Statement
        // int age = 16;
        // if(age >= 18)
        // {
        //     System.out.println("adult : drive, vote");

        // }
        // if(age > 13 && age < 18)
        // {
        //     System.out.println("teenager");
        // }
        // else
        // {
        //     System.out.println("not adult");
        // }

        // Print the largest of 2
        // int A = sc.nextInt();
        // int B = sc.nextInt();

        // if(A >= B)
        // {
        //     System.out.println("A is largest of 2");
        // }
        // else
        // {
        //     System.out.println("B is largest of 2");
        // }

        // Print if a number is Odd or Even

        // int A = sc.nextInt();
        
        // if(A % 2 == 0)
        // {
        //     System.out.println("Even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }

        // else if Statements

        // int age = sc.nextInt();

        // if(age >= 18)
        // {
        //     System.out.println("Adult");
        // }
        // else if(age >= 13 && age < 18)
        // {
        //     System.out.println("Teenager");
        // }
        // else 
        // {
        //     System.out.println("Child");
        // }

        // Income Tax Calculator

        // int income = sc.nextInt();
        // int tax;

        // if(income < 500000)
        // {
        //     tax = 0;
        // }
        // else if(income > 500000 && income <=1000000)
        // {
        //     tax = (int)(income * 0.2);
        // }
        // else 
        // {
        //     tax = (int)(income * 0.3);
        // }

        // System.out.println("Your tax is: " + tax);

        // Print the largest of 3

        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // if((A >= B) && (A >= C))
        // {
        //     System.out.println("A is the largest");
        // }
        // else if(B >= C)
        // {
        //     System.out.println("B is the largest");
        // }
        // else
        // {
        //     System.out.println("C is the largest");
        // }

        // Ternary Operator
        // int number = 4;

        // String type =((number % 2 ==0)) ? "Even" : "Odd";
        // System.out.println(type);

        // int marks = sc.nextInt();

        // String reportCard = marks >= 33 ? "Pass" : "Fail";
        // System.out.println(reportCard);

        // Switch Statements

        // int number = sc.nextInt();

        // switch(number)
        // {
        //     case 1 : System.out.print("Samosa");
        //              break;
        //     case 2 : System.out.print("Burger");
        //              break;
        //     case 3 : System.out.print("Mango shake");
        //              break;
        //     default : System.out.print("We wake up");
        // }

       // Calculator

       
       // System.out.println("Enter value of a : ");
       // int b = sc.nextInt();
       // System.out.println("Enter operator : ");
       // char operator = sc.next().charAt(0);

      // switch(operator)
      // {
     // case '+' : System.out.println(a + b);
     //            break;
     // case '-' : System.out.println(a - b);
     //            break;    
        
     // case '*' : System.out.println(a * b);
     //            break;
        
     // case '/' : System.out.println(a / b);
     //            break;

     // case '%' : System.out.println(a % b);
     //            break;

     //default : System.out.println("Our calculator is not advanced");

     // lOOPS STATEMENTS

     // WHILE LOOP

    //  int counter = 0;
    //  while(counter < 15)
    //  {
    //     System.out.println("Hello World!");
    //     counter++;
    //  }

    //  System.out.println("Printed Hello World! 15x");

    // Print number from 1 to 10

    // int counter = 1;
    // while(counter <=10)
    // {
    //     System.out.println(counter);
    //     counter++;
    // }

    // Print number from 1 to n
    // System.out.print("Enter your number" + " ");
    // int n = sc.nextInt();
    // int counter = 1;
    // while(counter <= n)
    // {
    //     System.out.print(counter + " ");
    //     counter++;
    // }
    // System.out.println();

    // Print sum of first n natural numbers
    // System.out.print("Enter the number" + " ");
    // int n = sc.nextInt();
    // int i = 1;
    // int sum = 0;

    // while(i <= n)
    // {
        
    //     sum += i;
    //     i++;
        
    // }
    // System.out.print("Sum is : " + sum);

    // FOR LOOP
    // for(int i = 1; i < 5; i++)
    // {
    //     System.out.println("Hello World!");
    // }

    // Print Square Pattern
    // for(int line = 1; line <= 4; line++)
    // {
    //     System.out.println("* * * *");
    // }

    // int line = 1;
    // while(line <= 4)
    // {
    //     System.out.println("* * * *");
    //     line++;
    // }

    // Print Reverse of a number
    // System.out.print("Enter a number : " + " ");
    // int n = sc.nextInt();
    // while(n > 0)
    // {
    //     int lastDigit = n % 10;
    //     System.out.print(lastDigit);
    //     n = n / 10; // n/= 10
    // }

    // Reverse the given number
    // System.out.print("Enter a number : " + " ");
    // int n = sc.nextInt();
    // int rev = 0;
    // while(n > 0)
    // {
    //     int lastDigit = n % 10;
    //     rev = (rev * 10) + lastDigit;
    //     n = n / 10;

    // }
    // System.out.print("Reverse number : " + rev);

    // Do While Loop

    // int counter = 1;
    // do 
    // {
    //     System.out.println("Hello World!");
    //     counter++;
    // } while(counter <= 10);

    // Break Statement
    // for(int i = 1; i <= 5; i++)
    // {
    //     if(i == 3)
    //     {
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("I am out");

    // Keep Entering numbers till users enters a multiple of 10
    // do 
    // {
    //     System.out.print("Enter your number : " + " ");
    //     int n = sc.nextInt();
    //     if(n % 10 == 0)
    //     {
    //         break;
    //     }
    //     System.out.println(n);
    // }while(true);

    // Continue Statement
    // for(int i = 1; i <= 5; i++)
    // {
    //     if(i == 3)
    //     {
    //         continue;
    //     }
    //     System.out.println(i);
    // }
    
    // Display all numbers entered by user except multiples of 10
    // do
    // {
    //     System.out.print("Enter your number : " + " ");
    //     int n = sc.nextInt();
    //     if(n % 10 == 0)
    //     {
    //         continue;
    //     }
    //     System.out.println("Your number was : " + n);

    // } while(true);

    // Check if a number is prime or not
    // System.out.print("Enter your number : " + " ");
    // int n = sc.nextInt();

    // if(n == 2)
    // {
    //     System.out.println("n is Prime");
    // }
    // else
    // {
    //     boolean isPrime = true;
    // for(int i = 2; i <= Math.sqrt(n); i++)
    // {
    //     if(n % i == 0) // n is a multiple of i(i not equal to 1 or n)
    //     {
    //         isPrime = false;
    //     }

    // }
    // if(isPrime == true)
    // {
    //     System.out.println("n is Prime");
    // }
    // else 
    // {
    //     System.out.println("n is not Prime");
    // }

    // }

    }
}