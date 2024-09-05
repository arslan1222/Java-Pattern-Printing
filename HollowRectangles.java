public class HollowRectangles{

    // Hollow Rectangle
    /*
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=0; i<=totRows; i++){
            for(int j=0; j<=totCols; j++){
                if(i == 0 || i == totRows || j == 0 || j == totCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    */

   // Inverted & Rotated half pyramid
   /*
    public static void Half_Pyramid(int n){
        for(int i=1; i<=n; i++){
            // For spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // For stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */
   /*
    public static void half_pyramid_with_numbers(int n){
        
        for(int i=0; i<=n; i++){  // 1st approach
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
        // 2nd approach
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */
        /*
        public static void floyd_triangle(int n){
            int count = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(count+ " ");
                    count++;
                }
                System.out.println();
            }
        }
        */
        // 0-1 triangle
        /*
        public static void zero_one_triangle(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    if((i + j) % 2 == 0){
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
        */
       /*
        // Solid Rumbus Triangle
        public static void solid_rumbus(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=n; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } */

        // Hollow Rumbus
        /*
        public static void Hollow_Rumbus(int totRows, int totCols){  // My approach
            for(int i=1; i<=totRows; i++){
                for(int j=1; j<=totRows-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=totRows; k++){
                    if(i==1 || i==totRows || k==1 || k==totCols){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void Hollow_Rumbus(int n){  // other approach
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=n; k++){
                    if(i==1 || i==n || k==1 || k==n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        */
       /*
        public static void Diamon_Pattern(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=(2*i)-1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // 2nd half
            for(int i=n; i>=1; i--){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=(2*i)-1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        */
        /*
        // Number Pyramid
        public static void Number_Pyramid(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        */

       public static void Palindromic_pattern(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Descending order
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();

        }
       }


    public static void main(String args[]){

        // hollow_rectangle(10, 11);
        // Half_Pyramid(10);
        // half_pyramid_with_numbers(5);
        // floyd_triangle(5);
        // zero_one_triangle(5);
        // solid_rumbus(5);
        // Hollow_Rumbus(5,5); // 1st approach
        // Hollow_Rumbus(7);
        // Diamon_Pattern(3);
        // Number_Pyramid(5);
        Palindromic_pattern(5);

        
    }
}