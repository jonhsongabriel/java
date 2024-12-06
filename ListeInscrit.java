import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ListeInscrit {
    public static void main(String[] args) 
    {
        List <Integer> listePersonne=Arrays.asList(100,200,400,500,600,700,800,100);
        List <String> listepoint=Arrays.asList("Rasoa","Randria","Rakoto","Patrick");
        List <Float>  point = Arrays.asList(100f,200f,300f,400f,500f,600f,700f,800f,900f,1000f);
        for(Integer x :listePersonne)
        {
            for(String y : listepoint)
                {
                    for(Float z : point){
                        System.out.println(y +" "+ x + " " +z);
                    }
                    
                }
            
        }

        Inscrit [] actuel= {
                            new Inscrit("Jonhson", 1), 
                            new Inscrit("Merry", 2),
                            new Inscrit("Gabriel", 3),
                            new Inscrit("Solofonarindra", 4)
                        };
        for(Inscrit membre: actuel){
            System.out.println(membre);
        }                
        
    }
}


/**
 * Inscrit
 */ 
class Inscrit {
    String classeName;
    int groupeName;

    public Inscrit(String classeNom, int groupe)
    {
        this.classeName=classeNom;
        this.groupeName=groupe;
    }
    @Override
     public String toString()
     {
        return this.classeName+" "+this.groupeName;
     }
}