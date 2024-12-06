public class Confiramtion {
    String message1="Vous etiez bien inscrit";
    String message2;
    public static void main(String[] args){
      Confiramtion reponse1= new Confiramtion();
      Confiramtion reponse2=new Confiramtion();
      reponse2.message2="Votre inscription pas finis";


      System.out.println(reponse1.message1);
      System.out.println(reponse2.message2);
    }
}
