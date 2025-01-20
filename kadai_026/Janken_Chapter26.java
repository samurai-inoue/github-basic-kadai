package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Janken_Chapter26 {
    // 自分のじゃんけんの手を入力する
	public String getMyChoice() {
        System.out.println("じゃんけんの手を入力しましょう");
    	Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        // 入力値を検証
        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("無効な入力です。もう一度選んでください (r: グー, s: チョキ, p: パー):");
            choice = scanner.nextLine();
        }
        return choice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        String[] choices = {"r", "s", "p"}; // じゃんけんの手の配列
        int randomIndex = (int) (Math.floor(Math.random() * 3));
        return choices[randomIndex];
    }

    // じゃんけんを行う
    public void playGame() {
    	
    	HashMap<String, String> handMap = new HashMap<>();
    	handMap.put("r", "グー"); //じゃんけんのグーを表す
      	handMap.put("s", "チョキ"); //じゃんけんのチョキを表す
      	handMap.put("p", "パー"); //じゃんけんのパーを表す
                	
    	
        // 自分の手を取得
        String myChoice = getMyChoice();
        // 相手の手を取得
        String opponentChoice = getRandom();

        // 自分と相手の手を出力
        System.out.println("自分の手: " + handMap.get(myChoice));
        System.out.println("相手の手: " + handMap.get(opponentChoice));

        // 勝敗を判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) || // グー > チョキ
                   (myChoice.equals("s") && opponentChoice.equals("p")) || // チョキ > パー
                   (myChoice.equals("p") && opponentChoice.equals("r"))) { // パー > グー
            System.out.println("自分の勝ちです！");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
