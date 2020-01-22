package reflexivite.jeux;

import Aut1.Interrupteur;
import fr.insalyon.tc.framework.JeuCombinatoire;

public class Nim implements JeuCombinatoire {

    private int nbBaton = 15;

    @Override
    public boolean estFini() {
        return (nbBaton == 0);
    }

    @Override
    public boolean joueUnCoup(String unCoup) {
        int nbcoup = Integer.parseInt(unCoup);


        if (nbcoup < 4 && nbBaton >0 && nbcoup <= nbBaton){
            nbBaton -= nbcoup;
            return true;
        }else {
            return false;
        }

    }

    @Override
    public String toString(){
        return Integer.toString(nbBaton);
    }
}
