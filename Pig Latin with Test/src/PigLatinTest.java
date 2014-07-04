import static org.junit.Assert.*;
import student.TestCase;

import org.junit.Test;


public class PigLatinTest extends TestCase
	{

	public PigLatinTest()
		{
		}

	@Test
	public void testMain()
		   {
	        setSystemIn("This is my test\n");  // Don't forget the newline!
	        PigLatin.main(null);
	        assertEquals("Please enter your word(s) to be translated: \nhis-tay\nis-ay\ny-may\nest-tay\n", systemOut().getHistory());
		   }


	}
