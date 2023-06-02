import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String,Pokemon> pokemons = new HashMap<>();



    public void addPokemon(Pokemon pokemon){
        String id = pokemon.getId();
        this.pokemons.put(id,pokemon);
    }


}
