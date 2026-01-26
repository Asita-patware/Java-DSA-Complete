public class PatternPart2 {


        // Prints hollow rectangle pattern
        public static void hollowPattern(int totRows , int totCols){
            for(int i=1; i<=totRows; i++){
                for(int j=1;  j<=totCols; j++){
                    if (i==1 || j== 1 || i == totRows || j == totCols) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


        // Prints inverted rotated half triangle
        public static void invertedRotatedHalfPattern(int totRows){
            for(int i=1; i<=totRows; i++){
                for(int j=1; j<=totRows-i; j++){
                    System.out.print(" ");
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print("*");

                    } 
                    System.out.println();    
            }
        }


        // Prints inverted half number pattern
        public static void invertedHalfPattern(int totRows){
            for(int i=1; i<=totRows; i++){
                for(int j=1; j<=totRows-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }


        // Prints Floyd's Triangle
        public static void FloydsTriangle(int totRows){
               int counter = 1;
               for(int i=1; i<=totRows; i++){
                 for(int j=1; j<=i; j++){
                    System.out.print(counter + " ");
                    counter++;
                 }System.out.println();
                }
        }


        // Prints triangle of 1s and 0s
        public static void Triangle01(int totRows){
                for(int i=1; i<=totRows; i++){
                    for(int j=1; j<=i; j++){
                        int sum = i+j;
                        if (sum%2 == 0) {
                            System.out.print("1");
                        }else{
                            System.out.print("0");
                        }
                    }System.out.println();       
                }
        }


        // Prints butterfly pattern
        public static void butterfly(int totRows){
            for(int i=1; i<=totRows; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=2*(totRows-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }System.out.println();
            }
                for(int i=4; i>=1; i--){
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    for(int j=1; j<=2*(totRows-i); j++){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }System.out.println();
                } 
        }

         
        // Prints solid rhombus of stars
        public static void solidRhombus(int totRows, int star){
            for(int i=1; i<=totRows; i++){
                for(int j=1; j<=(totRows-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=star; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }


        // Prints hollow rhombus
        public static void hollowRhombus(int totRows){
            for(int i=1; i<=totRows; i++){
                for(int j=1; j<=(totRows-i); j++){ // spaces
                    System.out.print(" ");
                }
                for(int j=1;  j<=totRows; j++){ // star_boundary
                    if (i==1 || j== 1 || i == totRows || j == totRows) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
            
          
        // Prints diamond pattern
        public static void diamondPattern(int totRows){
            for(int i=1; i<=totRows; i++){
                for(int j=1; j<=(totRows-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }System.out.println();
            }
            for(int i=4; i>=1; i--){
                for(int j=1; j<=(totRows-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=(2*i)-1; j++){
                        System.out.print("*");
                }System.out.println();
            }
        }

               

        public static void main(String[] args) {

        System.out.println("Hollow Rectangle:");
        hollowPattern(4, 5);

        System.out.println("\nInverted Rotated Half Triangle:");
        invertedRotatedHalfPattern(4);

        System.out.println("\nInverted Half Number Pattern:");
        invertedHalfPattern(5);

        System.out.println("\nFloyd's Triangle:");
        FloydsTriangle(5);

        System.out.println("\nTriangle of 0s and 1s:");
        Triangle01(5);

        System.out.println("\nButterfly Pattern:");
        butterfly(4);

        System.out.println("\nSolid Rhombus:");
        solidRhombus(5, 5);

        System.out.println("\nHollow Rhombus:");
        hollowRhombus(5);

        System.out.println("\nDiamond Pattern:");
        diamondPattern(4);
    }

        



  
}
