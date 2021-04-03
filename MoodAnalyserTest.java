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
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
	}

}
