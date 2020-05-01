
public class setting {

    protected static String Nameplayer;

    protected static String PokemonName;


    
    public static void getName(String Nameplayer) {
        setting.Nameplayer = Nameplayer;
    }

    public static String getNamePlayer() {
        return Nameplayer;
    }

    public static void getNamePoke(String PokemonName) {
        setting.PokemonName = PokemonName;
    }

    public static String getNamePOKE() {
        return PokemonName;
    }


    
}