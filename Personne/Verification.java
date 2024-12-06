package Personne;
import java.util.Scanner;

class Controle
 {   
    private int nbr1=45;
    private int nbr2=45;


    public int chiffreAffaire(int chiffre1, int chiffre2)
    {
        int valeurEntrer;
         if (chiffre1<chiffre2)
          
                valeurEntrer=chiffre2;
          else
               valeurEntrer=chiffre1;
            return valeurEntrer;
          }


      public int chiffreNomValide(int vl1, int vl2)
      {
        int vlf;
        if(vl1<vl2)
          vlf=vl1;
         else
            vlf=vl2;
            return vlf; 
      } 
      
      Controle(int nbr1, int nbr2)
      {
        this();
        this.nbr1=nbr1;
        this.nbr2=nbr2;
      }


       Controle() {
        //TODO Auto-generated constructor stub
        System.out.println(("Les deux valeur sont "+ nbr1+" "+nbr2));
      }

      public void alorOn(){
        System.out.println("On a alors raison de prendre cette partie");
      }

      public void choixActuel()
      {
        int nbr1=10;
        int nbr2=40;

        System.out.println(nbr1+" et "+ nbr2);
        System.out.println(this.nbr1+" " +this.nbr2);

      }


      

      
    }



public class Verification{

  static void methodeStatique()
  {
    System.out.println("Je suis une methode statique qui accessible directement");
  }
  public static void triageAfficehe(double pointplace){
    if(pointplace==0.0)
    {
      System.out.println("Maivais");
    }
    else if(pointplace<=10)
    {
      System.out.println("Moyenne");
    }
    else
    {
      System.out.println("Vous avez gaigner la moyenne "+ pointplace);
    }
}
  public static void main(String args[]){
         Scanner valeur = new Scanner(System.in);
         System.out.println("Entrer le valeur avant");
         int valeur1=valeur.nextInt();
         System.out.println("Entrer les valeur aprees ");
         int valeur2=valeur.nextInt();
         Controle sonValeur= new Controle();
         int valeurValider=sonValeur.chiffreAffaire(valeur1, valeur2);
         int valeurNom=sonValeur.chiffreAffaire(valeur2, valeurValider);
         System.out.println("Le valeur validée est : "+ valeurValider);
         System.out.println("Le valeur nom validée est : "+ valeurNom);

         Controle obet1= new Controle();
         obet1.choixActuel();
         Controle objet2= new Controle(1000,55666);
         objet2.choixActuel();
         methodeStatique();
         triageAfficehe(12.444);
  }

}
