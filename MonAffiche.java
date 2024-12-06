public class TestAffiche {
    enum AffichageReponse{VERBE,SUJET,NOMBRE,SOMME}
    AffichageReponse size;
}
public class MonAffiche {
    public static void main(String[] args){
       TestAffiche testMot= new TestAffiche();
       testMot.size=TestAffiche.AffichageReponse.NOMBRE;
       System.out.println(testMot.size);
    }
   
}