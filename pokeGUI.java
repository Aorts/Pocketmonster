import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;

 

public class pokeGUI extends JFrame {
    
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                                pokeGUI frame = new pokeGUI();

                                frame.setVisible(true);

                                }   } );
    }

 

public pokeGUI() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 450, 300);

setTitle("Pokemon");

 

getContentPane().setLayout(null);

 

JButton btn1 = new JButton("Button 1");

btn1.setBounds(41, 29, 89, 23);

getContentPane().add(btn1);

 

JButton btn2 = new JButton("Button 2");

btn2.setBounds(126, 81, 89, 23);

getContentPane().add(btn2);

 

JButton btn3 = new JButton("Button 3");

btn3.setBounds(193, 134, 89, 23);

getContentPane().add(btn3);

 

JButton btn4 = new JButton("Button 4");

btn4.setBounds(298, 183, 89, 23);

getContentPane().add(btn4);

 

}

}