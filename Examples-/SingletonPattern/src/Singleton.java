
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance= null;
	String []Letters= 
	{ "a", "a", "b", "c", "c","d", "d", "d",
			"e", "e","f",  "g"  };
			 
	private LinkedList<String>LettersList=new LinkedList<String>(Arrays.asList(Letters));
	static boolean firstThread=true;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		
		if(firstInstance==null){
			
			if (firstThread){
				firstThread=false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			firstInstance= new Singleton();
			Collections.shuffle(firstInstance.LettersList);
		}
		return firstInstance;
		
	}
	
	public LinkedList<String>getLetterList(){
		return firstInstance.LettersList;
	}
	
	public LinkedList<String>getTiles(int howManyTiles){
		
		LinkedList<String>tilesToSend=new LinkedList<String>();
		
		for (int i = 0; i < howManyTiles; i++) {
			
			tilesToSend.add(firstInstance.LettersList.remove(0));
			
		}
		return tilesToSend;
	}
}


