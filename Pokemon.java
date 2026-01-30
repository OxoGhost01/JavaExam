public class Pokemon {
    protected String nom;
    protected int hp;
    protected int atk;

    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public boolean isDead() {
        return this.hp <= 0;
    }

    public void attaquer(Pokemon pokemon) {
        pokemon.hp -= this.atk;
    }

    @Override
    public String toString() {
        return nom + " | HP: " + hp + " | ATK: " + atk;
    }
}
