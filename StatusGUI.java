

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import java.util.InputMismatchException;
import java.util.*;

public class StatusGUI extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Status player = new Status();

    private JFrame stt;
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                StatusGUI stt = new StatusGUI();
                    //j.setVisible(true);
            }
        });
    }
    public StatusGUI() {
// Create Form Frame
        //super("STATUS");
              //Set defalt of window
              //setSize(800, 750);
              //setLocation(400, 200);
              //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              //getContentPane().setLayout(new FlowLayout() );
        //try{
            stt = new JFrame("Status");
            JLabel name = new JLabel("Name : " + setting.getNamePlayer());
            JLabel level = new JLabel("Level : " + player.getLv());
            JLabel exp = new JLabel("Exp : " + player.getExp());
            JLabel hp = new JLabel("Hp : " + player.getHp() + "/" + player.getMaxHp());
            JLabel atk = new JLabel("Attack Damage : " + player.getAttackDamage());
            JLabel skill = new JLabel("Skill Damage : "+ player.getskillDamage());
            JLabel coins = new JLabel("Coins : "+ player.getCoins());
            JLabel Mana = new JLabel("MANA : " + player.getMana());

            JButton btn1 = new JButton("BACK");
            btn1.setBounds(650, 630, 89, 23);
            getContentPane().add(btn1);

            btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {

                    menuGUI menu = new menuGUI();
                                    menu.setVisible(true);
                                       // Hide Current Form
                                       stt.setVisible(false);
            
            }
        });


            name.setBounds(350,100,150,40);
            //change.setBounds(170,20,100,20);
            //change.addActionListener(new ActionListener(){
                //public void actionPerformed(ActionEvent e){
                    //changename T7 = new changename(b);
                    //j.setVisible(false);
               // }
            //);

            level.setBounds(350,130,150,40);
            exp.setBounds(350,170,150,40);
            hp.setBounds(350,210,150,40);
            Mana.setBounds(350,250,150,40);
            atk.setBounds(350,290,150,40);
            skill.setBounds(350,330,150,40);
            coins.setBounds(350,370,150,40);
            stt.setLocation(400, 200);
            stt.add(name);
            stt.add(level);
            stt.add(exp);
            stt.add(hp);
            stt.add(Mana);
            stt.add(coins);
            stt.add(atk);
            stt.add(skill);
            stt.add(btn1);
            stt.setSize(800,750);
            stt.setLayout(null);
            stt.setVisible(true);
            
        //}catch(Exception e){
           // System.out.println("Something wrong in this class");
        //}
    }
}