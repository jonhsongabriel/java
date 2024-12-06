package Personne;


interface Contrat{};
public class Cdi implements Contrat {
    
}
 class Personnel extends Cdi{
    public static void main(String args[]){
        Cdi travaille= new Cdi();
        Personnel action =new Personnel();
        System.out.println(travaille instanceof Contrat);
        System.out.println(action instanceof Cdi);
        System.out.println(action instanceof Contrat);

    }
}
