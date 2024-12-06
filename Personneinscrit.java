public class Personneinscrit {
    String nom;
    String prenom;
    public  Personneinscrit(String nom, String prenom){
        this.nom =nom;
        this.prenom=prenom;
    }

    public String getNom() {
        return "Nom : "+nom;
    }
    public String getPrenom(){
        return "Prenom :  "+ prenom;
    }


    public static  void main(String[] args){
        Personneinscrit fullname1= new Personneinscrit("jonhson "," mbelo");
        Personneinscrit fullname2 = new Personneinscrit("berger ", " Almand ");
        System.out.println("Nom et Prenom : "+ fullname1.nom + fullname1.prenom);
        System.out.println(fullname1.getNom());
        System.out.println(fullname1.getPrenom());
        System.out.println("Nom et Prenom : "+ fullname2.nom + fullname2.prenom);
        System.out.println(fullname2.getNom());
        System.out.println(fullname2.getPrenom());
        ;
    }
}
