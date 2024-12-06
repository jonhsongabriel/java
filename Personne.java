public class Personne
{
    public String name;
    public  String firstname;
    public String asdresse;
    public int age;
    public boolean sexe;
    static int time=12;
    static int annéenaissance;

     static  void salutation(String name)
     {
         System.out.println("Bonjour "+name +"!");
     }

     static  void aurevoir(String name)
     {
         System.out.println("Aurevoir "+ name +"!");
     }

     static  int agepersonne(int annéenaissance)
     {
         return (2024 - annéenaissance);
     }

     static  int composition(int x,int y, int z)
     {
         return (x*y)+(x*z)+(y*z);
     }

     public  static void main(String[] args){

          if (time<15)
          {
              salutation("Jonhson ");
          }
          if (time>12)
          {
              aurevoir("jonhson");
          }

         int valeur=composition(12,36,47);
                 if(valeur<100)
                 {
                     System.out.println("Vous avez une valeur pas beaucoup "+ valeur);
                 }else
                 {
                     System.out.println("Voutre valeur est suffusante "+ valeur);
                 }

       System.out.println("vous etiez "+ agepersonne(1994) + "ans");
     }
}
