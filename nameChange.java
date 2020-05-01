    import java.awt.EventQueue;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;


public class nameChange extends JFrame {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				nameChange frame = new nameChange();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public nameChange() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 249);
		setTitle("Change The Name");
		getContentPane().setLayout(null);
		
		// Text Field
		final JTextField txt = new JTextField();
		txt.setBounds(103, 41, 144, 20);
		getContentPane().add(txt);
		txt.setColumns(10);
		
		// Label
		final JLabel lbl = new JLabel("");
		lbl.setBounds(103, 120, 144, 14);
		getContentPane().add(lbl);
		
		// Button
		JButton btn1 = new JButton("OK");
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String ChangeName;
    
                ChangeName = txt.getText();
                // set name poke
                
                setting.getName(ChangeName);
                                    // Hide Current Form
                                   setVisible(false);
        
        }
    });
		btn1.setBounds(128, 72, 99, 23);
		getContentPane().add(btn1);
		
	}
}