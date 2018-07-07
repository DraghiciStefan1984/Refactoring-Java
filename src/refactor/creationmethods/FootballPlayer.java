package refactor.creationmethods;

//Demonstrate the Creation Method replacement of Constructors

public class FootballPlayer 
{
	private double passerRating; // Specific to QBs
	private int rushingYards; // Specific to RBs & QBs
	private int receivingYards; // Specific to RBs & WRs 
	private int totalTackles; // Specific to DEF
	private int interceptions; // Specific to DEF
	private int fieldGoals; // Specific to Kickers
	private double avgPunt; // Specific to Punters
	private double avgKickoffReturn; // Specific to Special Teams
	private double avgPuntReturn; // Specific to Special Teams
	
	// CReate a catch-all constructor
	private FootballPlayer(double passerRating, int rushingYards,
			int receivingYards, int totalTackles, int interceptions,
			int fieldGoals, double avgPunt, double avgKickoffReturn,
			double avgPuntReturn)
	{	
		this.passerRating = passerRating;
		this.rushingYards = rushingYards;
		this.receivingYards = receivingYards;
		this.totalTackles = totalTackles;
		this.interceptions = interceptions;
		this.fieldGoals = fieldGoals;
		this.avgPunt = avgPunt;
		this.avgKickoffReturn = avgKickoffReturn;
		this.avgPuntReturn = avgPuntReturn;	
	}
	
	// Create static methods that return an object with the desired arguments and zero or null for the rest
	public static FootballPlayer createQB(double passerRating, int rushingYards)
	{	
		return new FootballPlayer(passerRating, rushingYards, 0, 0, 0, 0, 0.0, 0.0, 0.0); 	
	}
	
	public static FootballPlayer createWR(int rushingYards, int receivingYards)
	{	
		return new FootballPlayer(0, rushingYards, receivingYards, 0, 0, 0, 0.0, 0.0, 0.0); 	
	}
	
	public static FootballPlayer createKicker(int fieldGoals, double avgPunt)
	{	
		return new FootballPlayer(0, 0, 0, 0, 0, 38, 37.8, 0.0, 0.0); 
	}
	
	public double getPasserRating() { return passerRating; }
}
