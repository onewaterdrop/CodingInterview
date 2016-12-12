package anagram.solver;

import java.util.HashMap;
import java.util.Map;

public class AnagramSolverImpl implements AnagramSolver {

	@Override
	public boolean isAnagram(String word1, String word2) {
		
		if(word1 == null || word2 == null)return false;
		if(word1.length() != word2.length())return false;
		
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		
		
		
//		for (int i = 0; i < word1.length(); i++) {
//			boolean isLetterMatch = false;
//			
//			Character word1Letter = word1.charAt(i);
//			
//			for (int j = 0; j < word2.length(); j++) {
//				
//				Character word2Letter = word2.charAt(j);
//				
//				if(word1Letter == word2Letter ){
//					isLetterMatch = true;
//					break;
//				}
//				
//			}
//			
//			if(!isLetterMatch)return false;
//			
//		}
//		

		Map<Character, Integer> word1Map = new HashMap<Character, Integer>();
		Map<Character, Integer> word2Map = new HashMap<Character, Integer>();
		
		createCntMap(word1, word1Map);
		createCntMap(word2, word2Map);
		
		
		return word1Map.equals(word2Map);
	}

	private void createCntMap(String word1, Map<Character, Integer> word1Map) {
		for(int i=0;i<word1.length();i++){
			
			Character word1letter = word1.charAt(i);
			if (word1Map.containsKey(word1letter)) {
				
				Integer letterCnt = word1Map.get(word1letter);
				letterCnt ++;
				word1Map.put(word1letter, letterCnt);
				
			}else{
				word1Map.put(word1letter, 1);
			}
			
		}
	}

}
