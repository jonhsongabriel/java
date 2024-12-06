package Personne;

public class Identiter {

    //Identiter des personne
    String nom;
    String prenom;
    int age;
    String adresse;
    String contact;
    int matricule;

    /*
     * @setter nom
     * @settr prenom
     * @settr age
     * @settr adresse
     * @settr contact
     * @settr matricule
     */

     public void setNom(String nom){
        this.nom=nom;
     }
    
     public void setPrenom(String prenom){
        this.prenom=prenom;
     }
    
     public void setAge(int age){
        this.age=age;
     }

     public void setAdresse(String adresse){
        this.adresse=adresse;
     }
    
     public void setContact(String contact){
        this.contact=contact;
     }
    
     public void setMatricule(int matricule){
        this.matricule=matricule;
     }
    

     /*
      * @retour des information
      *Contact des personne
      */
      

      public void identiterInscrit(){
        System.out.println("Personne identiter inscrit");
        System.out.println(this.nom);
        System.out.println(this.prenom);
        System.out.println(this.age);
        System.out.println(this.adresse);
        System.out.println(this.contact);
        System.out.println(this.matricule);
      }
}



