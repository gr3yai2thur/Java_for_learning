import javax.swing.*;
import java.awt.FlowLayout;

class gui 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setTitle("KuroSensei");
		frame.setSize(600, 400);
		
		frame.setLayout(new FlowLayout());
		
		JLabel lb = new JLabel();
		lb.setText("Welcome");
		
		frame.add(lb);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
