import java.util.Scanner;
class Affiche{
    public int Affiche(int numbre1, int numbre2){
          return numbre1+numbre2;
    }
    
    public static void main(String[] args) {
        String sujet, verbe;
        Scanner mot= new Scanner(System.in);

        //Conjugaison des verbes 

         System.out.println("Entrer le sujet des verbes ");
          sujet=mot.nextLine();
         System.out.println("Entrer les verbe verbes suivant le Sujet");
           verbe=mot.nextLine();
           
         //Somme des deux nombre
         Scanner nombre=new Scanner(System.in);
         System.out.println("Entrer les nombre numero un");
          int nbr1=nombre.nextInt();
         System.out.println("Entrer les dexieme nombre "); 
          int nbr2=nombre.nextInt();   
          
          //Affichage des la réponse des function
        Affiche somme= new Affiche();
        int repomse=somme.Affiche(nbr1,nbr2);
        System.out.println("Les sujet avec son verbe "+sujet +" "+ verbe);
        System.out.println("Les somme des deux nombres est "+repomse);
    }
}

