public class MoodAnalyser
{
	String message;

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
	public String analyseMood1()
	{
		if(this.message.contains("sad"))
		{
			return "SAD";
		}
		else
		{
			return "HAPPY";
		}
	}

	public MoodAnalyser()
	{}

	public MoodAnalyser(String message)
	{
	  this.message = message;
	  analyseMood1();
	}

}

