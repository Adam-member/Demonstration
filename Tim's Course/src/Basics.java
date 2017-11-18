
public class Basics {
	private static int score = 17;
	public static void main(String[] args) {
		int scoreTrack = scoreFinder();
		boolean gameOve = scoreTally();
		System.out.println(scoreTrack);
		System.out.println(gameOve);
		// TODO Auto-generated method stub
	
	}
		public static int scoreFinder(){
			
			int modifier = score + 9;
			return modifier;
		}
		public static boolean scoreTally(){
			boolean gameOver = false;
			
			if(score > 19){
				System.out.println("Success!");
				gameOver = true;
			}
			else{
				System.out.println("Mission failed");
				gameOver = false;
			}
			return gameOver;
		}
		
		

}

