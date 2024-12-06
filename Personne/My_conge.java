package Personne;
import java.util.Scanner;
public class My_conge extends Conge {

    // Vos congés actuels avec toutes les informations
    public void vosStatistique(float conge, float congeUtilise, float nouveauConge) {
        tousConge = (conge - congeUtilise) + nouveauConge;
        System.out.println("Votre congé à ce moment est " + tousConge);
    }

    // Affichage et ajout des informations sur les congés
    public static void main(String args[]) {
        Scanner situationConge = new Scanner(System.in);
        System.out.println("Entrez votre congé actuel");
        float mesConge = situationConge.nextFloat();
        System.out.println("Entrez votre congé écoulé");
        float congeTerminer = situationConge.nextFloat();
        System.out.println("Entrez votre nouvelle solde de congé");
        float congeAjouter = situationConge.nextFloat();

        // Affiche toutes vos informations sur les congés
        My_conge infoConge = new My_conge();
        infoConge.totalConge(mesConge, congeAjouter, congeTerminer);
        infoConge.congeRestant(mesConge, congeTerminer, congeAjouter);
        infoConge.vosStatistique(mesConge, congeTerminer, congeAjouter);
    }
}
