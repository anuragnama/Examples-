
	 import java.util.LinkedList;
     import java.util.LinkedList;

          public class LettersTest {

		public static void main(String[] args) {
			
			
			Singleton newInstance= Singleton.getInstance();
			
			System.out.println("instance ID : " + System.identityHashCode(newInstance));
			
			System.out.println(newInstance.getLetterList());
			
			// for player1
			
			LinkedList<String>playOneTiles= newInstance.getTiles(7);
			
			System.out.println(" player 1 :" + playOneTiles);
			
			System.out.println(newInstance.getLetterList());
			
			// for player2
			
			Singleton Instancetwo = Singleton.getInstance();
			
			System.out.println("instance ID2 : " + System.identityHashCode(newInstance));
			
	        System.out.println(newInstance.getLetterList());
			
			LinkedList<String>playTwoTiles= newInstance.getTiles(7);
			
			System.out.println(" player 2 :" + playTwoTiles);
			
		}
	}


