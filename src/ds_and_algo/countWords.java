package ds_and_algo;

public class countWords {
	public static int wordCount(String sentence) {
		if(sentence == null || sentence.isEmpty()) {
			return 0;
		}
		String[] words = sentence.split(" ");
		
		return words.length;
	}
	public static void main(String args[]) {
		String sentence = "This is a sample sentence.";
		
		int wordCount = wordCount(sentence);
		
		System.out.println("Number of words in the sentence: "+wordCount);
	}

}
