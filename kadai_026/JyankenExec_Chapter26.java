package kadai_026;

import java.util.HashMap;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        // じゃんけんの手を格納するHashMapを作成
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // じゃんけんクラスのインスタンスを作成
        Janken_Chapter26 jyanken = new Janken_Chapter26();

        // じゃんけんを実行
        jyanken.playGame();
    }
}
