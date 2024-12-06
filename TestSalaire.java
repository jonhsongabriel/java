public class TestSalaire {
    public static void main(String[] args) {

        //Test des salaire 
        long  a;
        String b;
        a=10000;
        b=(a==40000)? "Bonne salire": "Mauvais salaire";
        System.out.println("Valeur de votre argent: "+b );

        b=(a==10000)?"Bonne salire": "Mauvais salaire";
        System.out.println("Valeur de votre argent: "+b );
        
        //Teste des nom des persdonne
        String nom="Personne";
        String prenom;

        prenom=(nom=="Jonhson")? "moi":"je";
        System.out.println("Mon nom est "+prenom );
        prenom=(nom=="Personne")?"moi":"je";
        System.out.println("Mon nom est "+prenom );

        //Teste des ton, salaire 
       if(a<10000)
       {
        System.out.println("Vous devrais y etre encore aller à l'ecole");
       }
       else
       {
        System.out.println("Votre effort qui reste pour votre salaire");
       }


       //Teste des ton experiance
       int experience=5;
       if(experience==0)
       {
        System.out.println("Vas checher du stage ");
       }
       else if(experience<=5)
       {
        System.out.println("Continue votre stage");
       }
       else if (experience==5) 
       {
        System.out.println("Vous etiez pres pour etre embaucher directement");;
       }
       else
       {
        System.out.println("Vous etiez deja metriser des choses");
       }

       //Test des catégorie
       char grade ='D';
       switch (grade) {
        case 'A':
            System.out.println("Debutant");
            break;
       
        case 'B':
            System.out.println("Intermediare");
            break;
           
        case 'C':
            System.out.println("Expert");
            break;
            
        case 'D':
             System.out.println("Tres expert");    
             break;

        default:
           System.out.println("Autre holdes");
                 
       }
       System.out.println("Votre grade est "+grade);
    }
}
