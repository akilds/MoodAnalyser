class MoodAnalysisException extends Exception
{
	MoodAnalysisException(String s)
	{
		super(s);
	}
}

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
   //Test Case 2.1
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

   //USE CASE 3 - Custom Exception
   //TEST CASE 3.1
	public String analyseMood3(String message) throws MoodAnalysisException
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
		  catch(Exception e)
		  {
		    return " ";
		  }
	}

   //TEST CASE 3.2
   public String analyseMood4(String message) throws MoodAnalysisException
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
        catch(Exception e)
        {
          return "EMPTY MOOD ";
        }
   }

}

