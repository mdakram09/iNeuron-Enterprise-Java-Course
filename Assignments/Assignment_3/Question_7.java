// Q7. WAP to count the number of Vowels and Consonants of a String value.
//     Input = "TeluskoIneuron"  
//     Output = TeluskoIneuron conatins 7 Vowels and 7 Consonants 

import java.util.Scanner;

class Main {
	
  public static void main(String args[]) {
        
     Scanner s = new Scanner(System.in);
     String s1 = s.nextLine();
     
     String str1 = s1.toLowerCase();
    
     int vowels = 0;
     int consonants = 0;
     for(int i=0 ; i<str1.length() ; i++){
         if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || 
         str1.charAt(i) == 'o' || str1.charAt(i) == 'u'){
             vowels++;
         }else{
             consonants++;
         }
     }
     System.out.println(s1 + " contains " + vowels + " Vowels and " + consonants + " Consonants");	
	}
  
}
