    
    
    import java.awt.EventQueue;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    
     
    
    public class menuGUI extends JFrame {
        
        public static void main(String[] args) {
    
            EventQueue.invokeLater(new Runnable() {
    
                public void run() {
    
                    menuGUI frame = new menuGUI();
    
                                    frame.setVisible(true);
    
                                    }   } );
        }
    
     
    
    public menuGUI() {
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setBounds(0, 0, 800, 750);

    setLocation(400, 200);
    
    setTitle("Pokemon");
    
     
    
    getContentPane().setLayout(null);
    
     
    
    JButton btn1 = new JButton("STATUS");
    
    btn1.setBounds(320, 50, 150, 23);
    
    getContentPane().add(btn1);
    
     
    
    JButton btn2 = new JButton("FIGHT");
    
    btn2.setBounds(320, 250, 150, 23);
    
    getContentPane().add(btn2);
    
     
    
    JButton btn3 = new JButton("SHOP");
    
    btn3.setBounds(320, 450, 150, 23);
    
    getContentPane().add(btn3);
    
     
    
    JButton btn4 = new JButton("NAME CHANGE");
    
    btn4.setBounds(320, 650, 150, 23);
    
    getContentPane().add(btn4);
    

    btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            
            // set name poke
            
            StatusGUI status = new StatusGUI();
                                //status.setVisible(true);
                                // Hide Current Form
                               setVisible(false);
           
     
    
    } });


                                            /* btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            
            // set name poke
            
            StatusGUI status = new StatusGUI();
                                status.setVisible(true);
                                // Hide Current Form
                               setVisible(false);
           
     
    
    }
                                             });

btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            
            // set name poke
            
            StatusGUI status = new StatusGUI();
                                status.setVisible(true); 
                                setVisible(false);
                                                    }  });*/
     
btn2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent evt) {                                            
             fightGUI fightME = new fightGUI();
                        fightME.setVisible(true);


                        setVisible(false);
   }  });


   btn4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {                                            
              nameChange fightME = new nameChange();
                         fightME.setVisible(true);
 

    }  });

    btn3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {                                            
                  Shop fightME = new Shop();
                             fightME.setVisible(true);
     
    
        }  });


    }
    
    }