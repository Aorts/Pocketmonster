

import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Main extends JFrame {
    public static void main(String[] args){
        String ID;
        int should;
        int Nid = 0;
        boolean event = true;
        boolean next = true;
        Status player = new Status();
        String currentPokemon = (" ");
        int select;

        Scanner in = new Scanner(System.in);
        //System.out.println("Welcome to The pokemon world ");
        //System.out.print("Enter Your Name : ");
        //ID = in.next();
        System.out.println("\n======================================");
        System.out.println("Welcome to ||Pokemon Go Went Gone|| " + ID);
        System.out.println("======================================\n");
        System.out.println("Let Choose your pokemon\n");
        while (next==true) {
        Scanner pokemon = new Scanner(System.in);
        System.out.println("1.Kamex \n2.Kyurem \n3.Rizadon");
        System.out.print("\nShould Number of  your pokemon : ");
        should = pokemon.nextInt();

        if(should == 1){
            System.out.print("\n\n\n\n\n\n\n");
            System.out.println("==========================");
            System.out.println("Your pokemon is Kamex");
            System.out.println("==========================");
            next = false;
            currentPokemon = "Kamex";
            Nid = 1;
        }
        else if(should == 2){
            System.out.print("\n\n\n\n\n\n\n");
            System.out.println("==========================");
            System.out.println("Your pokemon is Kyurem");
            System.out.println("==========================");
            next = false;
            currentPokemon = "Kyurem";
            Nid = 2;
        }
        else if(should == 3){
            System.out.print("\n\n\n\n\n\n\n");
            System.out.println("==========================");
            System.out.println("Your pokemon is Rizadon");
            System.out.println("==========================");
            next = false;
            currentPokemon = "Rizadon";
            Nid = 3;
        }
        else {
            System.out.println("We have just 3 Pokemon pls should only 1-3\n");
            System.out.println("Choose again\n");
        }
    }
        while (event==true) {
        System.out.println("What are you gonna do?");
        System.out.println("==========================");
            System.out.println("1 . STATUS");
            System.out.println("2 . FIGHT");
            System.out.println("3 . EVOLVE");
            System.out.println("4 . SHOP");
            System.out.println("5 . End game");
            System.out.println("==========================");

            Scanner in1 = new Scanner(System.in);
            System.out.println("Enter Event");
            select = in1.nextInt();

            if(select == 1){
                player.status(Nid,currentPokemon); //Status bar
            }
            else if(select == 2){
                player.fightMe(); //Hit monster to earn exp and get first time gift
            }

            else if (select == 3){
                if(player.evolve == true){
                    System.out.println("you can evolve your pokemon ");
                }
                else{
                    System.out.println("you cant evolve your pokemon comeback agian if your pokemon lvl 5 ");
                }

            }
            else if (select == 4){


            }
                
            else{
                event = false; //End Program
            }
        }

    }
    
}