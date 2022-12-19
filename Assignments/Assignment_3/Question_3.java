// Q3. WAP to check if the String is Anagram or not.
//     Input -> s1 = Race , s2 = Care
//     Output -> Race and Care are Anagram
  
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
        
     Scanner s = new Scanner(System.in);
     String s1 = s.nextLine();
     String s2 = s.nextLine();
     
     String str1 = s1.toLowerCase();
     String str2 = s2.toLowerCase();
     
     int arr[] = new int[26];
     for(int i=0 ; i<str1.length() ; i++){
         arr[str1.charAt(i)-'a']++;
     }
     for(int i=0 ; i<str2.length() ; i++){
         arr[str2.charAt(i)-'a']--;
     }
     boolean flag = false;
     for(int i=0 ; i<26 ; i++){
         if(arr[i] != 0){
             flag = true;
             break;
         }
     }    
	 if(flag){
         System.out.println(s1 + " and " + s2 + " are not Anagram");
     }else{
         System.out.println(s1 + " and " + s2 + " are Anagram");
     }	
	}
}
