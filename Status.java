import java.util.Random;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class Status {
    protected int hp;
    protected double attackDamage;
    protected double skillDamage;
            protected int maxHp,lvl,Mana;
            protected double exp;
            protected int coins;
            protected double gotExp;

            protected boolean evolve = false;

            public Status(){
                hp = 100;
                Mana = 100;
                lvl = 1;
                maxHp = 100 ;
                exp = 1;
                attackDamage = 10;
                skillDamage = 25;
                coins = 0;
                gotExp = 0;
            }
           
    public void status(int Nid,String currentPokemon){
        
        System.out.println("Pokemon :" + currentPokemon);
        if (Nid == 1) {
            System.out.println("Skill : Torrent");
            System.out.println("Skill Damage : " + getskillDamage() );
        } 

        else if (Nid == 2) {
            System.out.println("Skill : Turboblaze");
            System.out.println("Skill Damage : " + getskillDamage() );
        } 

        else if (Nid == 3) {
            System.out.println("Skill : Solar Power");
            System.out.println("Skill Damage : " + getskillDamage() );
        }
        System.out.println("Level :"+getLv());
        System.out.println("Exp :"+getExp());
        System.out.println("Hp :" + getHp() + "/" + getMaxHp());
        System.out.println("Mana :"+ getMana() + "/100");
        System.out.println("Attack Damage " + getAttackDamage() );
        System.out.println("Coins " + getCoins() );
    }

    public double getExp() {return gotExp;}

    public int getLv() {return lvl;}

    public int getHp(){return hp;}

    public int getMana(){return Mana;}
    
    public int getMaxHp(){return maxHp;}

    public double getAttackDamage(){return attackDamage;}

    public double getskillDamage(){return skillDamage;}

    public int getCoins(){return coins;}

    
    public void setLv(double exp){
        int levelUp;
            levelUp = 100;
            gotExp = gotExp + exp;

            if(gotExp >= levelUp){
                this.gotExp = gotExp - levelUp;
                this.lvl = this.lvl+1;

            }
            /*if(lvl == 5 ){
                evolve = true;
            }*/
    }


    public void setCoins(int golds){
    
        coins = coins + golds;

    }

    public void fightMe(){
        
        Random rand = new Random();


            Random expDrop = new Random();
            int exps = expDrop.nextInt(499);

            exp = (exps+1)/10;

            setLv(exp);

            Random goldDrop = new Random();

            int gold = goldDrop.nextInt(4);
            int golds = (gold+1)*10;
            //System.out.println("Congrate you got " + golds + " Coins");
            
            setCoins(golds);

    }


}