package Personne;

public class Ajout {
    public static void main(String args[])
    {
        Identiter notrepersonne= new Identiter();
        notrepersonne.setNom("Jonhson");
        notrepersonne.setPrenom("Mbelo");
        notrepersonne.setAge(30);
        notrepersonne.setAdresse("Antananarivo");
        notrepersonne.setContact("03265698589");
        notrepersonne.setMatricule(1212);
        notrepersonne.identiterInscrit();
    }
}
