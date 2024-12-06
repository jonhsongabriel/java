import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.*;
import java.util.*;
public class Caractere {

    //déclaration des variable
    public String nom;
    public char categorie;
    private double salaire;
    private static final String TRAVAILLE="Service actuel";

    //Constructeur des variable
    public Caractere(String sonNom){
        nom=sonNom;
    }

    //Decalration de categorie
    public void sonCategorie(char employerCategorie){
        categorie=employerCategorie;
    }

    //Déclaration de son salaire
    public void sonSalaireActuel(double sonSalaire){
        salaire=sonSalaire;
    }

    
    //Declaration d'une personne salaria information
    public void presentationPersonne(){
        System.out.println("Les nom des personne est "+ nom);
        System.out.println("Son salaire est "+ salaire);
        System.out.println("Son catégorie est "+ categorie);
        System.out.println(TRAVAILLE);
    }

    public static void main(String[] args){

        //Ajout des nouvelles personnes 
        Scanner membreEmployer= new Scanner(System.in);
        System.out.println("Entrer les nom de l'employer");
        String unNom=membreEmployer.nextLine();
        System.out.println("Entrer les Salaire des personne");
        float unSalaire=membreEmployer.nextFloat();
        System.out.println("entrer son categorie");
        char unCategorie=membreEmployer.next().charAt(0);
        System.out.println("Entrer son travaille");
        //Ajout des date actuel
        Date dateActuel= new Date();
        Date notreDate= new Date();
        SimpleDateFormat dt= new SimpleDateFormat("E yyyy.mm.dd 'at' hh.mm.ss a zzz");
        
        
        //Mise en place des personne
        Caractere employer= new Caractere(unNom);
        employer.sonSalaireActuel(unSalaire);
        employer.sonCategorie(unCategorie);
        System.out.println("Notre date actuel"+dateActuel);
        System.out.println("Current date"+dt.format(notreDate));
        boolean  typeNom= unNom instanceof String;

        //Affichage 
        employer.presentationPersonne();
        System.out.println(typeNom);

    }
}
