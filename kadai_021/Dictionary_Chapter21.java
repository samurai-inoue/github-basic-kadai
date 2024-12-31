package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {


		private HashMap<String,String> englishMap = new HashMap<>();
		
		public  Dictionary_Chapter21() {

		englishMap.put("apple","リンゴ");
		englishMap.put("peach","桃");
		englishMap.put("banana","バナナ");
		englishMap.put("lemon","レモン");
		englishMap.put("pear","梨");
		englishMap.put("kiwi","キウィ");
		englishMap.put("strawberry","いちご");
		englishMap.put("grape","ぶどう");
		englishMap.put("muscat","マスカット");
		englishMap.put("cherry","さくらんぼ");
	}
		
		public String findMeaning(String word) {
			if(englishMap.containsKey(word)) {
				return englishMap.get(word);
			} else {
				return word + "は辞書には存在しません";
			}
	}
}