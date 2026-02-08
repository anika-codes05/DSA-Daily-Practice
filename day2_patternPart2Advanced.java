public class day2_patternPart2Advanced {
    public static void main(String args[]){
        HollowRectangle(5,6);
        InvertedRotatedHalfPyramid(5);
         InvertedHalfPyramidWithNumbers( 6);
         FloydsTriangle(5);
         triangle0_1(5);
         butterflyPattern(4);
         solidRhombus(5);
         hollowRhombus(5);
         diamondPattern(4);


    }
    public static void HollowRectangle(int r,int c){
        for(int i=1;i<=r;i++){//outer loop
            for(int j=1;j<=c;j++){//inner loop
                if(i==1||j==1||i==r||j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }System.out.println();
        }

    }
    public static void InvertedRotatedHalfPyramid(int row){
        // making outerloop
        System.out.println("this is a invertedrotated halg pyramid pattern: ");
        for(int i=1;i<=row;i++){
            // inner loop
            for(int j=1;j<=row-i;j++){
                // to print spaces
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//to print stars 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void InvertedHalfPyramidWithNumbers(int n){
        System.out.println("this is a inverted halp pyramid with number pattern: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print(j);
            }System.out.println();
        }
    }
    public static void FloydsTriangle(int n){
        System.out.println("this is the floyd's triangle pattern : ");
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");  //HAPPY TO SOLVE TILL HERE:)
                num++;

            }System.out.println();
        }
    }
    public static void triangle0_1(int n){
        System.out.println("this is a pattern of 0-1 triangle : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ // i+j is even 
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");// in case of odd value of i+j
                }
            }System.out.println();
        }
    }
    public static void butterflyPattern(int n){
        System.out.println(" this is a butterfly pattern : ");
        //first half
        for(int i=1;i<=n;i++){
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            //print spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
             //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

        }
        //inverted pattern second half
        for(int i=n;i>=1;i--){
             //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            //print spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
             //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static void solidRhombus(int n){
        System.out.println("this is a pattern of solid rhombus");
        for(int i=1;i<=n;i++){
            //print spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star print
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        System.out.println("this is the oatrtern of the hollow rhombus");
        for(int i=1;i<=n;i++){
        // to print the space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //to print the hollow rectangle here
        for(int j=1;j<=n;j++){
            if(i==1||j==1||j==n||i==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        } System.out.println();
        }
        
        
    }
    public static void diamondPattern(int n){
        System.out.println("this is the diamond pattern");
       //this is first half code
        for(int i=1;i<=n;i++){
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }System.out.println();
        }
        //this is the second half the inverted pattern 
        
        for(int i=n;i>=1;i--){
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void fibonacciSeries(int n){
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
