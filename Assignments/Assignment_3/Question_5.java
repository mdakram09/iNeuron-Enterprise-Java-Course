// Q5. WAP to print repeatedly occurring characters in the given String.
//     Input -> "teluskoineuron"
//     Output -> "euon"   


import java.util.Scanner;
class Main {
  
	public static void main(String args[]) {
        
     Scanner s = new Scanner(System.in);
     String s1 = s.nextLine();
     
     s1 = s1.toLowercase();
     
     int arr[] = new int[26];
     String s2 = "";
     for(int i=0 ; i<s1.length() ; i++){
         arr[s1.charAt(i)-'a']++;
         if(arr[s1.charAt(i)-'a'] == 2){
             s2 = s2 + s1.charAt(i);
         }
     }  
	 System.out.println(s2);	
	}
  
}
