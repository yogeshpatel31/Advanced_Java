
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DialogExample();
		
	}

	private static JDialog d;
	JTextField searchBox_title;
	JTextField searchBox_author;

	DialogExample() {
		JFrame f = new JFrame();
		d = new JDialog(f, "Dialog Example", true);
		
		d.setLayout(new FlowLayout());
		JButton b = new JButton("Search");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogExample.d.setVisible(false);
				
				String title = searchBox_title.getText();
				String author = searchBox_author.getText();
				
				if(title.length() > 0 ) {
					
					if(author.length() > 0) {
						//Title & Author
						
						
						
						
						
						
						
						
					}else {
						//Title
						
						
					}
					
				}else {
						if(author.length() > 0) {
						//Author
						
						
					}
					
					
					
				}
				
				
				
				
				
				
				
			}
		});
		
		searchBox_title = new JTextField(25);
		
		d.add(new JLabel("Title"));
		d.add(searchBox_title);
		
		searchBox_author = new JTextField(25);
		
		d.add(new JLabel("Author"));
		d.add(searchBox_author);
		
		
		
		//d.add(new JLabel("Click button to continue."));
		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);
	}

}
