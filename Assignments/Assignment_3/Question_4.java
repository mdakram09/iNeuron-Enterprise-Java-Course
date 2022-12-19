// Q4. WAP to check if the String is a Pangram or not.
//     Input -> String s1 = "abcdefghijklmnopqrstuvwxyz"
//     Ouput -> abcdefghijklmnopqrstuvwxyz is Pangram  


import java.util.Scanner;
class Main {
	public static void main(String args[]) {
        
     Scanner s = new Scanner(System.in);
     String s1 = s.nextLine();
     
     String str1 = s1.toLowerCase();
     
     int arr[] = new int[26];
     for(int i=0 ; i<str1.length() ; i++){
         arr[str1.charAt(i)-'a']++;
     }
    
     boolean flag = false;
     for(int i=0 ; i<26 ; i++){
         if(arr[i] == 0){
             flag = true;
             break;
         }
     }    
	 if(flag){
         System.out.println(s1 + " is not Pangram");
     }else{
         System.out.println(s1 + " is Pangram");
     }	
	}
}
  
