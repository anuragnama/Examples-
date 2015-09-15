import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Singleton newInstance= Singleton.getInstance();
		System.out.println("instance ID : " + System.identityHashCode(newInstance));
		
          System.out.println(newInstance.getLetterList());
		
		LinkedList<String>playOneTiles= newInstance.getTiles(7);
		
		System.out.println(" player 1 :" + playOneTiles); 
		
		System.out.println("got tiles ");

	}

}
