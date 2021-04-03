public class MoodAnalyser extends Exception
{
	
	String message;
	String mood;
	//USE CASE 1 - Analysing Mood
	//Test Case 1.1 and 1.2
	public String analyseMood(String message)
	{
		if(message.contains("sad"))
		{
			return "SAD";
		}
		else
		{
			return "HAPPY";
		}
	}

	//Test Case 1.3
	public void analyseMood1()
	{
		if(this.message.contains("sad"))
		{
			this.mood = "SAD";
		}
		else
		{
			this.mood = "HAPPY";
		}
	}

	//Default Constructor
	public MoodAnalyser()
	{

	}

	//Parameterised Constructor
	public MoodAnalyser(String message)
	{
	  this.message = message;
	  analyseMood1();
	}

	//USE CASE 2 - Handling NULL Exception
	public String analyseMood2(String message) 
	{
	  try 
	  {
	    if(message.contains("sad"))
		{
	    	return "SAD";
		}
		else
		{
			return "HAPPY";
		}
	  }
	  catch(NullPointerException e)
	  {
	    return "HAPPY";     
	  }
	}
}

