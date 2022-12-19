// Q1. WAP to reverse a String.
//     Input: “iNeuron”
//     Output: “norueNi”


import java.util.Scanner;

class Main {
	public static void main(String args[]) {
    
    Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();              // Input = "iNeuron"
    String s2 = "";
    for(int i=0 ; i<s1.length() ; i++){
         s2 = s1.charAt(i) + s2;
    }
    System.out.println(s2);               // Output = "norueNi"
	
  }
}
