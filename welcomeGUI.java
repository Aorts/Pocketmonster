
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

public class welcomeGUI extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                welcomeGUI form = new welcomeGUI();
                    form.setVisible(true);
            }
        });
    }
    public welcomeGUI() {
// Create Form Frame
        super("POKET-MONSER");
            // Set defalt of window
            setSize(800, 750);
            setLocation(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            getContentPane().setLayout(new FlowLayout() );


             



                // Create Label
                JLabel labelHead = new JLabel("Welcome to The pokemon world");
                JLabel label = new JLabel("So Please Enter your name ");
                // Create Button
                JButton btnOpen = new JButton(" GO ");
                Icon imageBG = new ImageIcon(getClass().getResource("PBg.jpg"));          // FOOD
                JLabel imgBg = new JLabel(imageBG);
                imgBg.setBounds(0, 0, 800, 600);
                getContentPane().add(imgBg);
                // Set x,y,w,h

                    // Label
                    labelHead.setBounds(160, 43, 300,14);
                    label.setBounds(160, 53, 200, 14);
                    // Button
                    btnOpen.setBounds(171, 95, 100, 23);

                // Create TextField
                JTextField NamePlayer;
                    NamePlayer  = new JTextField(25);

                    // Create Event for Button
                    btnOpen.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            String Name;
                            // set name form input
                            try {
                                 Name = NamePlayer.getText();
                                setting.getName(Name);
                            } catch ( InputMismatchException e ) {
                               final ImageIcon icon = new ImageIcon(getClass().getResource("/logo_fail.png"));
                               JOptionPane.showMessageDialog(null," Success to Use  Your Mana -1 ","USE MANA",JOptionPane.INFORMATION_MESSAGE,icon);
                            }
                            
                                
                            // New Page
                            choosePOKE choose = new choosePOKE();
                            choose.setVisible(true);
                                // Hide Current Form
                               setVisible(false);
                        }
                    });  
                    
            // Call to Layout  
            getContentPane().add(labelHead);
            getContentPane().add(label);
            getContentPane().add(NamePlayer);
            getContentPane().add(btnOpen);

            //getContentPane().add(imgBg);
              
        
    }   
}