// GUESSER GAME PROJECT
// New features added -> 1) Number must in 1 to 10
//                       2) Number of Player play a game could be anything
//                       3) Good Apperance on console window


import java.util.Scanner;

class Guesser{
	int guessNum;
	
	public int guessNumber(){
		Scanner s = new Scanner(System.in);
		System.out.println("Guesser please guess a Number");
		guessNum = s.nextInt();
		if(guessNum <= 0 || guessNum > 10) {
			System.out.println("!! ALERT !! Guesser please guess the Number Between 1 to 10");
			System.out.println("------------------------------------------------------------------");
			guessNum = guessNumber();
		}
		return guessNum;
	}
}

class Player{
	int playerGuessNum;
	
	public int guessNumber(int num){
		Scanner s = new Scanner(System.in);
		System.out.println("Player " + num + " please guess a Number");
		playerGuessNum = s.nextInt();
		if(playerGuessNum <= 0 || playerGuessNum > 10) {
			System.out.println("!! ALERT !! Player please guess the Number Between 1 to 10");
			System.out.println("------------------------------------------------------------------");
			playerGuessNum = guessNumber(num);
		}
		return playerGuessNum;
	}
}

class Umpire{
	
	int numFromGuesser;
    Player players[];
    
    public void collectNumFromGuesser() {
    	Guesser g = new Guesser();
    	numFromGuesser = g.guessNumber();
    }
    
    public void collectNumFromPlayer(int numOfPlayers) {
    	players = new Player[numOfPlayers+1];
    	
    	for(int i=1 ; i<=numOfPlayers ; i++) {
    		players[i] = new Player();
    	}
    	
    	for(int i=1 ; i<=numOfPlayers ; i++) {
    		players[i].playerGuessNum = players[i].guessNumber(i);
    	}
    }
    
    public void compare() {
    	System.out.println("------------------------------------------------------------------");
    	System.out.println("!! GAME RESULT !!");
    	int count = 0;
    	for(int i=1 ; i<players.length ; i++) {
    		if(numFromGuesser == players[i].playerGuessNum) {
    			System.out.println("Player " + i + " won the game");
    			count++;
    		}
    	}
    	if(count == 0) {
    	   System.out.println("Game Lost !! Try Again !!");
    	}
    }
}

public class Guesser_game {

	public static void main(String[] args) {
		
	 System.out.println("  !! GAME START !!  ");
	 System.out.println("------------------------------------------------------------------");
	 System.out.println("How many player will play the game");
	 Scanner s = new Scanner(System.in);
	 int numberOfPlayers = s.nextInt();
	 while(numberOfPlayers < 1) {
		 System.out.println("!! ALERT !!   Number of players must be greater 0");
		 System.out.println("------------------------------------------------------------------");
		 System.out.println("How many player will play the game");
		 numberOfPlayers = s.nextInt();
	 }
    Umpire u = new Umpire();
    u.collectNumFromGuesser();
    u.collectNumFromPlayer(numberOfPlayers);
    u.compare();
	}

}
