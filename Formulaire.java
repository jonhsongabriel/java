import java.util.Scanner;
public class Formulaire {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("entrer votre nom");
        String namepersonne=scanner.nextLine();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("entrer votre prenom");
        String prenompersonne=scanner1.nextLine();
        Scanner scanner2= new Scanner(System.in);
        System.out.println("entrer votre adresse");
        String adressepersonne=scanner2.nextLine();
        Scanner scanner3= new Scanner(System.in);
        System.out.println("entrer votre telephone");
        String contactpersonne=scanner3.nextLine();
        Scanner scanner4= new Scanner(System.in);
        System.out.println("entrer votre ville");
        String villepersonne=scanner4.nextLine();
        System.out.println("Mon nom est " + namepersonne);
        System.out.println("Mon nom est " + prenompersonne);
        System.out.println("Mon nom est " + adressepersonne);
        System.out.println("Mon nom est " + contactpersonne);
        System.out.println("Mon nom est " + villepersonne);
    }
}
