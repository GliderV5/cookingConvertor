package script;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cuisine {

    public static void main(String[] args) {
        // Créer un scanner pour lire l'entrée de l'utilisateur
        Scanner sc = new Scanner(System.in);

        // Demander la quantité initiale
        String input = JOptionPane.showInputDialog("Quantité initiale : ");
        // Vérifier si l'utilisateur a cliqué sur annuler ou sur la croix
        if (input == null || input.equals(JOptionPane.CANCEL_OPTION) || input.equals(JOptionPane.CLOSED_OPTION)) {
            // Terminer le programme
            System.exit(0);
        }
        double init = Double.parseDouble(input);

        // Demander la quantité finale
        input = JOptionPane.showInputDialog("Quantité finale : ");
        // Vérifier si l'utilisateur a cliqué sur annuler ou sur la croix
        if (input == null || input.equals(JOptionPane.CANCEL_OPTION) || input.equals(JOptionPane.CLOSED_OPTION)) {
            // Terminer le programme
            System.exit(0);
        }
        double dest = Double.parseDouble(input);

        // Entrer dans une boucle infinie
        while (true) {
            try {
                // Demander la valeur d'un autre ingrédient
                input = JOptionPane.showInputDialog("Entrez maintenant la valeur d'un autre ingrédient : ");
                // Vérifier si l'utilisateur a cliqué sur annuler ou sur la croix
                if (input == null || input.equals(JOptionPane.CANCEL_OPTION) || input.equals(JOptionPane.CLOSED_OPTION)) {
                    // Terminer le programme
                    System.exit(0);
                }
                double valeur = Double.parseDouble(input);

                // Calculer et afficher le résultat
                double resultat = valeur * dest / init;
                JOptionPane.showMessageDialog(null, "résultat : " + resultat);
            } catch (Exception e) {
                // Quitter le programme en cas d'erreur
                System.exit(0);
            }
        }
    }
}
