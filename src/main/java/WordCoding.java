import java.util.ArrayList;
import java.util.Locale;

public class WordCoding
{

	private String stringList;
	private ArrayList<String> wordList;

	/**
	 *
	 * @param stringList - String list initializion
	 *
	 */
	public WordCoding(String stringList)
	{
		this.stringList = stringList;
		this.wordList= new ArrayList<>();
	}

	/**
	 * Method countWord will test the business rule
	 * and display word list as per the business rule.
	 *
	 * Business Rule
	 * 1) Any word Start with testcharacter (ignor case)
	 * 2) wordLength check for word length.
	 */
	public int countWord(String testcharacter, int wordLength){
		String [] wordArray= this.stringList.split(" ");
		int count=0;
		for (int i = 0; i < wordArray.length ; i++)
		{
			if ((wordArray[i].toUpperCase(Locale.ROOT).startsWith(testcharacter) || wordArray[i].toLowerCase(Locale.ROOT).startsWith(testcharacter))
					&& wordArray[i].length()>wordLength){
				wordList.add(wordArray[i]);
				count++;
			}
		}
		return count;
	}
}
