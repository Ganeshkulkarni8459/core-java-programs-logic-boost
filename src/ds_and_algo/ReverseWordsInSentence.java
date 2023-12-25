package ds_and_algo;

public class ReverseWordsInSentence {
	public static String reverseWords(String sentence) {
		String[] words = sentence.split(" ");
		
		StringBuilder reversed = new StringBuilder();
		
		for(int i=words.length -1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}
		return reversed.toString().trim();
	}
	public static void main(String[] args) {
        String sentence = "Hello, how are you?"; 
        
        System.out.println("Original Sentence: " +sentence);

        String reversedSentence = reverseWords(sentence);

        System.out.println("Reversed Sentence: " +reversedSentence);
    }
}
