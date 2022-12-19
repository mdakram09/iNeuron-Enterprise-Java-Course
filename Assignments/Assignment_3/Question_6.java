// Q6. WAP to sort a String Alphabetically.
//     Input = "teluskoineuron" 
//     Output = "eeiklnnoorstuu"  
  
  
import java.util.Scanner;
class Main {
public static void main(String args[]) {
        
     Scanner s = new Scanner(System.in);
     String s1 = s.nextLine();
     
     s1 = s1.toLowerCase();
    
     int arr[] = new int[26];
     for(int i=0 ; i<s1.length() ; i++){
         arr[s1.charAt(i)-'a']++;
     }
     String s2 = "";
     for(int i=0 ; i<26 ; i++){
         if(arr[i] > 0){
             int count = arr[i];
             for(int j=1 ; j<=count ; j++){
                 s2 = s2 + (char)(i+'a');
             }
         }
     }  
	 System.out.println(s2);	
}
}  
