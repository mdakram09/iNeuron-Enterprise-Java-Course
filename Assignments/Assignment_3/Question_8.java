// Q8. WAP to count number of special characters.
//     Input = "Tel@usko#$ineuro*n"
//     Output = Tel@usko#$ineuro*n contains 4 special charcters  

import java.util.Scanner;

class Main {
  
	public static void main(String args[]) {
        
     Scanner s = new Scanner(System.in);
     String s1 = s.nextLine();
     
     String str1 = s1.toLowerCase();
     int count = 0;
     for(int i=0 ; i<str1.length() ; i++){
         if(!(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')){
             count++;
         }
     }
     System.out.println(s1 + " contains " + count + " special charcters");
    
  }
    
}
