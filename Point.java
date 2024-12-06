public class Point {
    
    public static void main(String args[])
    {
        int[] matricule={10,11,12,13,14,6,18,19,20};
        for(int i=0;i<matricule.length;i++)
            {
                System.out.println("les matricules inscrit sont :" + matricule[i]);
                
            }

        int numero;
        int gradeclasse;
        
        for(numero=1;numero<=10;numero++)
        {
            System.out.print("numero sur la classe "+ numero +"est :");
            for(gradeclasse=1;gradeclasse<=10;gradeclasse++)
            {
                System.out.print(numero*gradeclasse + " ");
            }
            System.out.println();
        }
    

    int pavione, numeropavion;
    for(pavione=1;pavione<=10;pavione++)
    {
        System.out.print("numero de "+pavione+" ");

        for(numeropavion=0;numeropavion<=10;numeropavion++)
        {
            System.out.print(pavione*numeropavion+" ");
        }
    }
    }
}
