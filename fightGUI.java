
    import java.awt.EventQueue;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.Random;
    
     
    
    public class fightGUI extends JFrame {
        

        Status player = new Status();

        public static void main(String[] args) {
    
            EventQueue.invokeLater(new Runnable() {
    
                public void run() {
    
                    fightGUI fight = new fightGUI();
    
                                    fight.setVisible(true);
    
                                    }   } );
        }
    
     
    
    public fightGUI() {
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setBounds(0, 0, 800, 750);

    setLocation(400, 200);
    
    setTitle("FIGHT ME!!!");
    
     
    
    getContentPane().setLayout(null);
    
     
    
    JButton btn1 = new JButton("Bulbasaur");
    
    btn1.setBounds(100, 400, 120, 23);
    
    getContentPane().add(btn1);
    
     
    
    JButton btn2 = new JButton("Jynx");
    
    btn2.setBounds(600, 400, 120, 23);
    
    getContentPane().add(btn2);
    
     
    
    JButton btn3 = new JButton("Daikenki");
    
    btn3.setBounds(350, 400, 120, 23);
    
    getContentPane().add(btn3);
    
     
    JLabel btn4 = new JLabel("YOU HAVE TO CHOOSE YOUE ENEMY ");

    btn4.setBounds(300, 29, 600, 23);
    btn4.setForeground(Color.BLACK);
    getContentPane().add(btn4);


    JButton btn5 = new JButton("BACK");
            btn5.setBounds(650, 630, 89, 23);
            getContentPane().add(btn5);

            btn5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {

                    menuGUI menu = new menuGUI();
                                    menu.setVisible(true);
                                       // Hide Current Form
                                       setVisible(false);
            
            }
        });



    btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

            int gold = 50;

            double exp = 30;

            player.setCoins(gold);


            player.setLv(exp);

            

    }
});

    btn2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            int gold = 50;

            double exp = 30;

            player.setCoins(gold);


            player.setLv(exp);
           
     
    
    }   });


    btn3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

            int gold = 50;

            double exp = 30;

            player.setCoins(gold);


            player.setLv(exp);
     
    
    }
                                             });
    }
}
    
