// Q2. WAP to reverse a sentence while preserving the position.
//     Input : “Think Twice”
//     Output : “kniht eciwt”


import java.util.Scanner;

class Main {
	public static void main(String args[]) {
    
    Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();                    // Input = "Think Twice"
    s1 = s1.toLowercase();
        String s2 = "";
        String arr[] = s1.split(" ");
        for(int i=0 ; i<arr.length ; i++){
            String temp = arr[i];
            String temp1 = "";
            for(int j=0 ; j<temp.length() ; j++){
                temp1 = temp.charAt(j) + temp1;
            }
            s2 = s2 + temp1 + " ";
        }
        System.out.println(s2);                 // Output = "kniht eciwt"
	}
}
