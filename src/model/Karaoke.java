package model;


public class Karaoke {

	public static void main(String[] args) 
	{
//		Song song = new Song("Journey", 
//				"Don't Stop Believin'", 
//				"https://www.youtube.com/watch?v=1k8craCGpgs");
		SongBook songBook = new SongBook();
		songBook.importFrom("songs.txt");
		System.out.println(System.getProperty("java.class.path"));
		
		
		KaraokeMachine machine = new KaraokeMachine(songBook);
		//machine.run();
		System.out.println("Saving song book....");
		songBook.exportTo("songs.txt");
		
		
//*****************//Testing**************************************************************************************************
//
		
	}
}
