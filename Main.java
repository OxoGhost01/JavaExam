public class Main {

    public static void main(String[] args) {

        // We create the pokemons
        Pokemon salameche = new PokemonFeu("Salamèche", 100, 20);
        Pokemon carapuce = new PokemonEau("Carapuce", 100, 20);
        Pokemon bulbizarre = new PokemonPlante("Bulbizarre", 100, 20);

        // Print the stats of all the pokemons
        System.out.println("Début du combat");
        System.out.println(salameche);
        System.out.println(carapuce);
        System.out.println(bulbizarre);

        // Combat until one die
        while (!salameche.isDead() || !carapuce.isDead() || !bulbizarre.isDead()) {
            System.out.println("\nSalamèche attaque Carapuce");
            salameche.attaquer(carapuce);
            System.out.println(carapuce);

            System.out.println("\nCarapuce attaque Salamèche");
            carapuce.attaquer(salameche);
            System.out.println(salameche);

            System.out.println("\nBulbizarre attaque Carapuce");
            bulbizarre.attaquer(carapuce);
            System.out.println(carapuce);
        }

        // Print who lost
        System.out.println("\nRésultat");
        if (salameche.isDead()) {
            System.out.println("Salamèche est KO");
        }
        if (carapuce.isDead()) {
            System.out.println("Carapuce est KO");
        }
        if (bulbizarre.isDead()) {
            System.out.println("Bulbizarre est KO");
        }
    }
}
