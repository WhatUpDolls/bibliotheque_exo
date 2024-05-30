import classes.Categories;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenue sur la bibliothèque. Que souhaitez-vous faire ?");
        System.out.print("Créer un livre : 1, Créer un membre : 2");

        System.out.print("Choisir une catégorie : "+ Arrays.toString(Categories.values()));
        String action;
        String input1 = input.nextLine();
        System.out.println(input1);
        System.out.println("1".equals(input1));

        if ("1".equals(input1) || Objects.equals(input1, "Livre")) {
            // action = "Livre";
            System.out.println("Quel est son titre ?");
            String titre = input.nextLine();
            System.out.println("Quel est son auteur ?");
            String auteur = input.nextLine();
            System.out.println("Quel est son id ?");
            int idbook = input.nextInt();
            System.out.println("Est-il disponible ?");
            boolean dispo = input.nextBoolean();

            System.out.println("Voulez-vous créer le livre : "+ titre + " de "+auteur+" avec l'id "+idbook+ " disponible : "+dispo);


        } else {if (Objects.equals(input1, "2") || Objects.equals(input1, "Membre"))
                    {action = "Membre";}
        }



    }
}