package refactor.creationmethods;

public class TestApp 
{
	public static void main(String[] args) 
	{
		// The creation methods 
		// Explain what type of player is being made
		// Are easier to understand (especially the attributes)
		
		FootballPlayer aaronRodgers = FootballPlayer.createQB(108.0, 259);
		FootballPlayer calvinJohnson = FootballPlayer.createWR(11, 1964);
		FootballPlayer sebastianJanikowski = FootballPlayer.createKicker(31, 33.0);
		System.out.println("Aaron Rodgers Passer Rating: " + aaronRodgers.getPasserRating());
		
		FootballPlayer2 jamellFleming = new FootballPlayer2("Jamell Fleming", "Oklahoma", 4.53, 10.75);
		
		System.out.println(jamellFleming.getPlayerName());
		System.out.println(jamellFleming.getCollege());
		System.out.println(jamellFleming.get40YdDash());
		System.out.println(jamellFleming.getRepsBenchPress());
		System.out.println(jamellFleming.get60YdDash());
	}
}
