//  2. Write a program to print
// Output - 1 1 1 1
//          2 2 2 2
//          3 3 3 3
//          4 4 4 4

class Main {
         public static void main(String args[]) {
           int n = 4;
           for(int i=0 ; i<n ; i++){
              for(int j=0 ; j<n ; j++){
                 System.out.print(i+1);  
              }
              System.out.println();
           }
         }
}
