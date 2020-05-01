    import java.awt.EventQueue;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.Random;


    public class Shop extends JFrame {
        
        public static void main(String[] args) {
    
            EventQueue.invokeLater(new Runnable() {
    
                public void run() {
    
                    Shop frame = new Shop();
    
                                    frame.setVisible(true);
    
                                    }   } );
        }
    
     
    
    public Shop() {
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setBounds(0, 0, 800, 750);

    setLocation(400, 200);
    
    setTitle("SHOP");
    
     
    
    getContentPane().setLayout(null);
    
    JLabel btn5 = new JLabel("Welcome to SHOP ");

    btn5.setBounds(350, 29, 600, 23);
    btn5.setForeground(Color.BLACK);
    getContentPane().add(btn5);
    
    JButton btn1 = new JButton("BUY HP POTIONS");
    
    btn1.setBounds(70, 400, 155, 23);
    
    getContentPane().add(btn1);
    
     
    
    JButton btn2 = new JButton("BUY MANA POTION");
    
    btn2.setBounds(570, 400, 155, 23);
    
    getContentPane().add(btn2);
    
     
    
    JButton btn3 = new JButton("BUY PORK");
    
    btn3.setBounds(320, 400, 155, 23);
    
    getContentPane().add(btn3);
    
     
    JButton btn4 = new JButton("BACK");
    btn4.setBounds(650, 630, 89, 23);
    getContentPane().add(btn4);


    btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            
    
    }
});

    btn2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            
    }   });


    btn3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        
           
     
    
    }
                                             });
       btn4.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent evt) {
                                
        menuGUI menu = new menuGUI();
         menu.setVisible(true);
                                                                       // Hide Current Form
        setVisible(false);
                                            
                                            }
                                        });
    }
}