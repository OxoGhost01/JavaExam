## Java exam

### Subject : 
Système de Combat Pokémon avec Héritage
Objectif

Implémenter un système de combat Pokémon en utilisant les concepts d'héritage et de polymorphisme en Java.
Description

Vous allez créer une hiérarchie de classes représentant différents types de Pokémon. Chaque type a des forces et faiblesses spécifiques selon le principe "pierre-feuille-ciseaux".
Étape 1 : Classe de base Pokemon

Créez une classe Pokemon avec les caractéristiques suivantes :

Attributs :

    nom (String) : le nom du Pokémon
    hp (int) : points de vie (Health Points)
    atk (int) : force d'attaque de base

Méthodes :

    Constructeur qui initialise les attributs
    isDead() : retourne true si les points de vie sont ≤ 0
    attaquer(Pokemon p) : permet au Pokémon d'attaquer un autre Pokémon
    toString() : affiche les informations du Pokémon

Étape 2 : Classes dérivées pour les types élémentaires

Créez trois classes qui héritent de Pokemon :
1. PokemonFeu (type Feu)

Efficacité des attaques :

    ×2 de dégâts contre PokemonPlante
    ×0.5 de dégâts contre PokemonEau et PokemonFeu
    ×1 de dégâts contre Pokemon (type normal)

2. PokemonEau (type Eau)

Efficacité des attaques :

    ×2 de dégâts contre PokemonFeu
    ×0.5 de dégâts contre PokemonEau et PokemonPlante
    ×1 de dégâts contre Pokemon (type normal)

3. PokemonPlante (type Plante)

Efficacité des attaques :

    ×2 de dégâts contre PokemonEau
    ×0.5 de dégâts contre PokemonPlante et PokemonFeu
    ×1 de dégâts contre Pokemon (type normal)

Étape 3 : Mécanique de combat

Lorsqu'un Pokémon attaque un autre Pokémon :

    Calculer les dégâts en fonction des types
    Appliquer le multiplicateur approprié (×2, ×1, ×0.5)
    Réduire les points de vie du Pokémon cible

Note technique : Pour déterminer le type d'un Pokémon, vous pouvez utiliser :

```p.getClass().getSimpleName() // retourne "PokemonFeu", "PokemonEau", etc.
ou instanceOf
```

Étape 4 : Programme de test

Créez une classe principale pour :

    Instancier différents Pokémon de chaque type
    Simuler des combats
    Afficher l'état des Pokémon avant/après chaque attaque
    Déterminer le vainqueur

Contraintes

    Respecter le principe d'héritage
    Utiliser le polymorphisme pour gérer les différents types
    Implémenter correctement les multiplicateurs de dégâts
    Gérer les cas où un Pokémon est KO (hp ≤ 0)

Exemple de scénario

```Salameche (Feu, HP: 100, ATK: 20) attaque Carapuce (Eau)
→ Dégâts réduits : 10 points
Carapuce attaque Salameche
→ Dégâts doublés : 40 points
```

## QCM
Q1

What is the proper filename extension for a Java bytecode compiled file?

A. .java
B. .bytecode
C. .class
D. .dll
Q2

Given that a Date class exists in both the java.util and java.sql packages, what is the result of compiling the following class?

```java
1: import java.util.*; 
2: import java.sql.*; 
3: public class BirthdayManager { 
4:      private Date rob = new Date(); 
5:      private java.util.Date sharon = new java.util.Date(); 
6: } 
```

A. The code does not compile because of lines 1 and 2.
B. The code does not compile because of line 4.
C. The code does not compile because of line 5.
D. The code compiles without issue.
Q3

Which package is imported into every Java class by default?

A. java.util 
B. java.lang 
C. system.lang 
D. java.system

Q4

What is the result of compiling and executing the following class?

```java
1: public class ParkRanger { 
2:      int birds = 10; 
3:      public static void main(String[] data) { 
4:          int trees = 5; 
5:          System.out.print(trees+birds); 
6:      } 
7: } 
```

A. It does not compile.
B. It compiles but throws an exception at runtime.
C. It compiles and outputs 5.
D. It compiles and outputs 15.
Q5

Given that the current directory is /user/home, with an application Java file in /user/home/Manager.java that uses the default package, which are the correct commands to compile and run the application in Java?

```bash
A. javac Manager
java Manager
B. javac Manager.java
java Manager
C. javac Manager
java Manager.class
D. javac Manager.java
java Manager.class
```
Q6

Given the following class definition, which command will cause the application to output the message White-tailed?

```java
package forest; 
public class Deer { 
    public static void main(String... deerParams) {
        System.out.print(theInput[2]); 
    } 
} 
```

```bash
A. java forest.Deer deer 5 "White-tailed deer"
B. java forest.Deer "White-tailed deer" deer 3
C. java forest.Deer Red deer White-tailed deer
D. java forest.Deer My "deer White-tailed"
```
Q7

Which of the following declarations does not compile?

```java
A. double num1, int num2 = 0;
B. int num1, num2;
C. int num1, num2 = 0;
D. int num1 = 0, num2 = 0;
```
Q8

What is the output of the following application?

```java
package dinosaur; 
public class Park { 
    public final static void main(String... arguments) { 
        int pterodactyl = 6; 
        long triceratops = 3; 
        if(pterodactyl % 3 >= 1){
            triceratops++; triceratops--; 
        }
        System.out.print(triceratops); 
    } 
} 
```

A. 2
B. 3
C. 4
D. The code does not compile.
Q9

What is the output of the following application?

```java
package restaurant; 
public class Pieces { 
    public static void main(String[] info) { 
        int flair = 15; 
        if(flair >= 15 && flair < 37) { 
            System.out.print("Not enough"); 
        } 
        if(flair==37) { 
            System.out.print("Just right"); 
        } else { 
            System.out.print("Too many"); 
        } 
    } 
} 
```

A. Not enough
B. Just right
C. Too many
D. None of the above
Q10

What's the output of the following code?

```java
public class Main {  
    public static void main(String args[]) {  
        boolean myVal = false;  
        if (myVal = true)  {
            for (int i = 0; i < 2; i++){
                System.out.println(i);
            }
        } else {  
            System.out.println("else");  
        }   
    }  
}  
```

a. else
b. 0
1
2
c. 0
1
d. Compilation error
