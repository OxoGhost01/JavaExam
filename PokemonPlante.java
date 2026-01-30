public class PokemonPlante extends Pokemon {

    public PokemonPlante(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon pokemon) {
        if (pokemon != null){
            if (pokemon instanceof PokemonEau) {
                pokemon.hp -= this.atk * 2;
            } else if (pokemon instanceof PokemonFeu || pokemon instanceof PokemonPlante) {
                pokemon.hp -= this.atk / 2;
            } else {
                pokemon.hp -= this.atk;
            }
        }
    }
}
