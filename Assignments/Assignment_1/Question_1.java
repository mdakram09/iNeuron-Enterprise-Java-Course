// 1.Write a program(WAP) to print INEURON using pattern programming logic.

class Main {
	
	public static void main(String args[]) {
		int n = 5;
	    for(int i=0 ; i<n ; i++){
        
			// PRINT I in INEURON
			System.out.print("*");
			System.out.print("  ");
        
			// PRINT N in INEURON
			for(int j=0 ; j<n ; j++){
				if(j==0 || j==n-1 || i==j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
        
			// PRINT E in INEURON
			for(int j=0 ; j<n ; j++){
				if(i==0 || i==n-1 || i==(n-1)/2 || j==0 ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
        
			// PRINT U in INEURON
			for(int j=0 ; j<n ; j++){
				if(j==0 || j==n-1 || i==n-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
        
			// PRINT R in INEURON
			for(int j=0 ; j<n ; j++){
				if(j==0 || i==0 || i==(n-1)/2 || (j==n-1 && i<=(n-1)/2) || (i==j/2+(n-1)/2 && j%2 ==0)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
        
			// PRINT O in INEURON
			for(int j=0 ; j<n ; j++){
				if(j==0 || j==n-1 || i==n-1 || i==0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
        
			// PRINT N in INEURON
			for(int j=0 ; j<n ; j++){
				if(j==0 || j==n-1 || i==j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}  	    
	}
}
