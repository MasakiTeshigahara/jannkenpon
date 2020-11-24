package javaStudy;
/**
 *
 * @author Masaki Teshigahara
 *
 */
public class Ex_02_1_Janken {
	/**
	 * 定数
	 * ・HAND_Gを”グー”
	 * ・HAND_Cを”チョキ”
	 * ・HAND_Pを”パー”
	 * @param args
	 * nameP1とnameP2の名前を設定する
	 */
	public static void main( String[] args) {
		final String HAND_G = "グー";
		final String HAND_C = "チョキ";
		final String HAND_P = "パー";

		
		  //フィールド
		  //コマンドライン引数に二つの文字列を受け取り
		  //nameP1とnameP2の名前に設定する
		 
		 
		String nameP1 = args[0];
		String nameP2 = args[1];

		
		 //Ex2_02_1_PlayerクラスのnameP1をインスタンス化しp1とする
		 //Ex2_02_1_PlayerクラスのnameP2をインスタンス化しp2とする
		 
		Ex2_02_1_Player p1 = new Ex2_02_1_Player(nameP1);
		Ex2_02_1_Player p2 = new Ex2_02_1_Player(nameP2);

		System.out.println("ジャンケンポン");

		 // p1のmakeHandStatusメソッドが実行される
		 //p2のmakeHandStatusメソッドが実行される
		 
		p1.makeHandStatus();
		p2.makeHandStatus();

		
		 // p1のmakeHandStatusメソッドの実行結果を出力する
		  //p2のmakeHandStatusメソッドの実行結果を出力する
		 
		System.out.println(p1.name + "さんの手: " + p1.handStatus );
		System.out.println(p2.name + "さんの手: " + p2.handStatus );

		
		  //p1とp2の実行結果が同じなら
		  //”あいこ！勝負つかず”と出力
		 
		if((p1.handStatus).equals(p2.handStatus)) {
			System.out.println("あいこ！勝負つかず");

			 // p1が”グー”p2が”チョキ”の時
			 //p1が”チョキ”p2が”パー”の時
			 //p1が”パー”p2が”グー”の時
			 //p1の勝利と出力
			 
		}else if (  (p1.handStatus.equals( HAND_G ) && p2.handStatus.equals( HAND_C))
					||(p1.handStatus.equals( HAND_C ) && p2.handStatus.equals( HAND_P))
					||(p1.handStatus.equals( HAND_P ) && p2.handStatus.equals( HAND_G)) ){

	System.out.println(p1.name + "さんの勝利！");
			
			 // p1が”チョキ”p2が”グー”の時
			 //p1が”パー”p2が”チョキ”の時
			 //p1が”グー”p2が”パー”の時
			 //p2の勝利と出力
			 
		}else if ( (p1.handStatus.equals( HAND_C ) && p2.handStatus.equals( HAND_G))
					||(p1.handStatus.equals( HAND_P ) && p2.handStatus.equals( HAND_C))
					||(p1.handStatus.equals( HAND_G ) && p2.handStatus.equals( HAND_P)) ){

	System.out.println(p2.name + "さんの勝利！");

}else {
	
	 // 上記の条件に当てはまあない例外が起きた場合
	 //"[ERROR]ジャンケンの判定が不正です。"と表示する
	System.out.println("[ERROR]ジャンケンの判定が不正です。");

}
}
}
