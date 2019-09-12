
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GeneralGUIBuilding {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Nilam");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		//frame.setTitle("Nilam");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton button = new JButton("Click me");
		button.setSize(100,25);
		button.setLocation(75,75);
		
		JButton button2 = new JButton("Add");
		button2.setSize(100,25);
		button2.setLocation(10,20);
		
		button.setVisible(true);
		button2.setVisible(true);
		panel.add(button);
		panel.add(button2);
	}

}
