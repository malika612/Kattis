import java.util.*;

class OddEcho
 {final static Scanner S = new Scanner(System.in);
  public static void main(String[] args)
   {int n = S.nextInt(); S.nextLine();
    for (int i = 0; i < n; ++ i)
     {String catelog = S.nextLine();
      if (i % 2 == 0)
       {System.out.println(catelog);
       }
     }
   }
 }
