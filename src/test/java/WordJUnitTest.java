import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordJUnitTest
{
	@Test
	public void testStringList1(){
		WordCoding wordCoding=new WordCoding("My name is Maheshh maheswari");
		Assertions.assertEquals(2, wordCoding.countWord("m",5));
	}

	@Test
	public void testStringList2(){
		WordCoding wordCoding=new WordCoding("Ba ba blackship have you any wool");
		Assertions.assertEquals(1, wordCoding.countWord("b",5));
	}

	@Test
	public void testStringList3(){
		WordCoding wordCoding=new WordCoding("Ba ba blackship have you any wool");
		Assertions.assertNotEquals(3, wordCoding.countWord("m",5));
	}

	@Test
	public void testStringList4(){
		WordCoding wordCoding=new WordCoding("Jhony jhoney yes papa eating sugar no papa");
		Assertions.assertNotEquals(3, wordCoding.countWord("j",5));
	}
}
