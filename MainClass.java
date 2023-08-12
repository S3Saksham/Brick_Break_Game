//package demogame;
//
//import javax.swing.JFrame;
//
//public class MainClass {
//
//	public static void main(String[] args) {
//		JFrame jf= new JFrame();
//		jf.setTitle("Brick Breaker" );
//		jf.setSize(700,600);
//		jf.setLocationRelativeTo(null);
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		jf.setVisible(true);// for visibility
//		jf.setResizable(false);// so that user can't reset the size 
//		 
//	Gameplay gm= new Gameplay();
//	jf.add(gm);
//		
//
//	}
//
//}
//===============================================================
package demogame;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setTitle("Brick Breaker");
		f.setSize(700,600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		
		GamePlay gm=new GamePlay();
		f.add(gm);

	}

}

