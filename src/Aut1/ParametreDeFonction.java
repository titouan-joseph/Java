package Aut1;

public class ParametreDeFonction {

    static void faireBasculerBoolean(boolean bool) {
        bool = !bool;
    }

    static void faireBasculerInterrupteur(Interrupteur i){
        i.basculer();
    }

    public static void main(String[] args){

        boolean unBool = true;
        Interrupteur i = new Interrupteur();
        faireBasculerBoolean(unBool);
        faireBasculerInterrupteur(i);
        System.out.println("Value of un Bool (doit etre false) : " + unBool);
        System.out.println("Value of i (doit etre true): " + i.estEnMarche);

    }
}
