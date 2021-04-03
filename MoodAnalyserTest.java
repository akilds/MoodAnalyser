import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	//Test Case 1.1
	@Test
	public void testSadMoodAnalysis()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals(mood,"SAD");
	}

	//Test Case 1.2
	@Test
	public void testHappyMoodAnalysis()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a happy message");
		Assert.assertEquals(mood,"HAPPY");
	}

	//Test Case 1.3
	@Test
	public void testMoodAnalysis()
	{
		MoodAnalyser happyMoodAnalyser = new MoodAnalyser("This is a happy message");
		String happyMood = happyMoodAnalyser.mood;
        Assert.assertEquals(happyMood,"HAPPY");	
        MoodAnalyser sadMoodAnalyser = new MoodAnalyser("This is a sad message");
		String sadMood = sadMoodAnalyser.mood;
        Assert.assertEquals(sadMood,"SAD");
	}

   //Test Case 2.1
	@Test
	public void exceptionMoodAnalysis()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood2(null);
		Assert.assertEquals(mood,"HAPPY");
	}

   //TEST CASE 3.1
   @Test
	public void customException() throws MoodAnalysisException
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood3(null);
		Assert.assertEquals(mood," ");
	}

   //TEST CASE 3.2
   @Test
   public void customException() throws MoodAnalysisException
   {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String mood = moodAnalyser.analyseMood4(null);
      Assert.assertEquals(mood,"EMPTY MOOD");
   }
}

