import java.util.*;
public class Pattern2 {
    public static void main(String args[]){
        // Print star pattern using nested loop

        /* for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        } */
       // Print inverted star pattern

       /* for(int i=4; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();

        } */
       // Another way

       /* int n = 4;
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print("*");
        }
        System.out.println();
       } */

      // Print Half Paramid Pattern

      /* for(int i=1; i<=4; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
      } */

      // Print character pattern

      int n = 4;
      char ch = 'A';

      for(int i=0; i<n; i++){
        for(int j=0; j<=i; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
      }
      

    }
}