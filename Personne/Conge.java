package Personne;
import java.util.Scanner;

public class Conge {
    float sommeCoge;
    float congeAnnuel;
    float tousConge;

    // Totale des congés actuels
    public void totalConge(float conge, float nouveauConge, float congeUtilise) {
        sommeCoge = (conge + nouveauConge) - congeUtilise;
        System.out.println("Votre solde de congé est " + sommeCoge);
    }

    // Congé restant
    public void congeRestant(float conge, float congeUtilise, float nouveauConge) {
        congeAnnuel = (conge - congeUtilise) + nouveauConge;
        System.out.println("Votre congé restant est " + congeAnnuel);
    }
}
