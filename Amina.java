class Amina
 {public static void main(String[] args)
   {System.out.println("Hello Amina");
    int num = 2;
    int num2 = 4;
    int result = num * num2;
    assert result == 8;
    int result2 = num + num2;
    assert result2 == 6;
    System.out.println("" + "The result of integers is" + " " + result);
    String s = "ABC";
    System.out.println("" + "The string s is" + " " + s);
    String t = s + s;
    System.out.println("" + "Adding the two s's equals" + " " + t);
    String u = t + t;
    System.out.println("" + "Adding the two t's equals" + " " + u);
    String s2 = s.substring(0,1);
    System.out.println("" + "The first letter of s is" + " " + s2);
    String s3 = s.substring(1,2);
    System.out.println("" + "The second letter of s is" + " " + s3);
    String s4 = s.substring(1,3);
    System.out.println("" + "The third and fourth letter of s is" + " " + s4);
    if (num > num2)
     {System.out.println(" " + "Num is bigger than num2");
     }
     else
      {System.out.println(" " + num + " " + "is less than" + " " + num2);
      }
    for (int i = 0; i < 11; ++i)
     {System.out.println(" " + i + " " + "hello world");
     }
     int num3 = add (num, num2);
     System.out.println(" " + num3);
   }
   static int add (int a, int b)
    {return a + b;
    }
 }
