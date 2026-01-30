public class Pokemon {
    protected String nom;
    protected int hp;
    protected int atk;

    public Pokemon(String nom, int hp, int atk) {
        /* Initialize the attributes */
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public boolean isDead() {
        /* Check if the pokemon is dead */
        return this.hp <= 0;
    }

    public void attaquer(Pokemon pokemon) {
        /* Attack a pokemon */
        pokemon.hp -= this.atk;
    }

    @Override
    public String toString() {
        /* Print the stats of the pokemon */
        return nom + " | HP: " + hp + " | ATK: " + atk;
    }
}
