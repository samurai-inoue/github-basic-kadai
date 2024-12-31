package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
	
		Dictionary_Chapter21 englishMap = new Dictionary_Chapter21();
		
		ArrayList<String> englishList = new ArrayList<String>();	
			englishList.add("apple");
			englishList.add("banana"); 
			englishList.add("grape");
			englishList.add("orange");
			
			for(String word : englishList) {
				if(englishMap.existenceWord(word)) {
					System.out.println(word + "の意味は" + englishMap.englishkey(word));
				}else {
					System.out.println(word + "は辞書には存在しません");
				}
			}
	}
}
