package javaStudy;

/**
 *
 * @author Masaki Teshigahara
 * 定数
 * ・HAND_Gを”グー”
 * ・HAND_Cを”チョキ”
 * ・HAND_Pを”パー”
 *
 */
public class Ex2_02_1_Player {
	final String HAND_G = "グー";
	final String HAND_C = "チョキ";
	final String HAND_P = "パー";

  //フィールド
  //String型でnameを設定
  //String型でhandStatusを設定
 
	String name;
	String handStatus;
/**
 * コンストラクタ
 * @param nm
 * Ex2_02_1_Playerメソッド
 * nmの引数に入った値を、フィールドで設定したnameに入る
 */
	Ex2_02_1_Player(String nm){
		this.name =nm;
	}

  //Ex2_02_1_Playerメソッドにて
  //case1～3にランダムに選択される
 
	void makeHandStatus() {
		int random1to3 = 1 + (int)(Math.random()*3.0);

		switch(random1to3) {
		case 1:
			this.handStatus = HAND_G;
			break;

		case 2:
			this.handStatus = HAND_C;
			break;

		case 3:
			this.handStatus = HAND_P;
			break;
		}
	}
}
