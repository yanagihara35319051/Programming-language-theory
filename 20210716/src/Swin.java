import javax.swing.JButton;
import javax.swing.JFrame;
public class Swin {
	public static void main(String[] args) {
		JFrame frame=new JFrame("ウインドウを表示");
		frame.setSize(850,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JButton button =new JButton("OK");
		frame.add(button);
		frame.setVisible(true);
		
	}
}
