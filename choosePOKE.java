
    import java.awt.EventQueue;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    
     
    
    public class choosePOKE extends JFrame {
        
        public static void main(String[] args) {
    
            EventQueue.invokeLater(new Runnable() {
    
                public void run() {
    
                    choosePOKE frame = new choosePOKE();
    
                                    frame.setVisible(true);
    
                                    }   } );
        }
    
     
    
    public choosePOKE() {
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setBounds(0, 0, 800, 750);

    setLocation(400, 200);
    
    setTitle("Pokemon");
    
     
    
    getContentPane().setLayout(null);
    
     
    
    JButton btn1 = new JButton("Kamex");
    
    btn1.setBounds(100, 400, 89, 23);
    
    getContentPane().add(btn1);
    
     
    
    JButton btn2 = new JButton("Kyurem");
    
    btn2.setBounds(600, 400, 89, 23);
    
    getContentPane().add(btn2);
    
     
    
    JButton btn3 = new JButton("Rizadon");
    
    btn3.setBounds(350, 400, 89, 23);
    
    getContentPane().add(btn3);
    
     
    JLabel btn4 = new JLabel("Welcome to ||Pokemon Go||     " + setting.getNamePlayer());

    btn4.setBounds(300, 29, 600, 23);
    btn4.setForeground(Color.BLACK);
    getContentPane().add(btn4);



    btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            String pokemon;

            pokemon = "Kamex";
            // set name poke
            
            setting.getNamePoke(pokemon);
           
            //setting.getNamePoke(pokemon);
            menuGUI menu = new menuGUI();
                            menu.setVisible(true);
                                // Hide Current Form
                               setVisible(false);
    
    }
});

    btn2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            String pokemon;

            pokemon = "Kyurem";
            // set name poke
            
            setting.getNamePoke(pokemon);
            menuGUI menu = new menuGUI();
                            menu.setVisible(true);
                                // Hide Current Form
                               setVisible(false);
           
     
    
    }   });


    btn3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            String pokemon;

            pokemon = "Rizadon";
            // set name poke
            
            setting.getNamePoke(pokemon);

            setting.getNamePoke(pokemon);
            menuGUI menu = new menuGUI();
                            menu.setVisible(true);
                                // Hide Current Form
                               setVisible(false);
           
     
    
    }
                                             });
    }
}
    
