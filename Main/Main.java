package Main;
import java.util.*;

public class Main {
    public static void main(String[] args){
        String ID;
        int should;
        //boolean next = true;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        ID = in.next();
        System.out.println("\n======================================");
        System.out.println("Welcome to ||Pokemon Go Went Gone|| " + ID);
        System.out.println("======================================\n");
        System.out.println("Let Should your pokemon\n");
        Scanner pokemon = new Scanner(System.in);
        System.out.println("1. Kamex \n2.Squirtle \n3.Rizadon");
        System.out.print("\nShould your pokemon : ");
        should = pokemon.nextInt();

        if(should == 1){
            System.out.println("Your pokemon is Kamex");
        }
        else if(should == 2){
            System.out.println("Your pokemon is Squirtle");
        }
        else if(should == 3){
            System.out.println("Your pokemon is Rizadon");
        }
        else {
            System.out.println("We have just 3 Pokemon pls should only 1-3");
        }


        


    }
    
}