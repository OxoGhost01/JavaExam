public class PokemonFeu extends Pokemon {

    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon pokemon) {
        if (pokemon != null){
            if (pokemon instanceof PokemonPlante) {
                pokemon.hp -= this.atk * 2;
            } else if (pokemon instanceof PokemonEau || pokemon instanceof PokemonFeu) {
                pokemon.hp -= this.atk / 2;
            } else {
                pokemon.hp -= this.atk;
            }
        }
    }
}
