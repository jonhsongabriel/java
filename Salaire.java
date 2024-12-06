public class Salaire {
    public static void main(String args[])
    {
        int grisSalaire[]={1000,1500,1800,1900};
        int partage[]={5,10,20,30,40,50};
        int compteAnnuel[]={1,2,3,4,5,6,7,8,9};
        int index=0;
        int annuel=1000;
        int parametrage=10;
        int compteur=10;
        int jetton=13;

        while (annuel<1005)
         {
          System.out.print("Son salair est "+ annuel);
          annuel++;
          System.out.print("\n");    
        }

        while (index<4) 
        {
          System.out.print("Les gris de salaire dans nos entreprise "+grisSalaire[index]);   
          index ++;
          System.out.print("\n");
        }
     
        do{
            System.out.print("Notre parametrage est " +parametrage);
            parametrage++;
            System.out.print("\n");
        }while(parametrage<100);

        do{
            System.out.print("Notre gris de salaire "+partage[index]);
            index++;
            System.out.print("\n");
        }while (index<4) ;
            
        
        while (compteur<20) 
        {
            if(compteur==16)
            {
                break;
            }
            System.out.print("notre compteur est "+compteur);
            compteur++;
            System.out.print("\n");
        }

        for (int tableCompteur=0; tableCompteur<compteAnnuel.length; tableCompteur++)
        {
            if(compteAnnuel[tableCompteur]==9)
            {
                break;
            }
            System.out.print("Notre compte annuel "+compteAnnuel[tableCompteur]);
            tableCompteur++;
            System.out.print("\n");
        }

        do{
            jetton++;
            if(jetton<23)
            {
                continue;
            }
            System.out.print("nos jetton "+jetton);
            System.out.print("\n");
        }while(jetton<60);
    }
}
