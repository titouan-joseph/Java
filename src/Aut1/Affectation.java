package Aut1;

public class Affectation {

    public static void main(String[] args){

        boolean b1 = false;
        System.out.println("b1 = b2");
        boolean b2 = b1;
        System.out.println("b1 : "+ b1);
        System.out.println("b2 : "+b2);
        System.out.println("b2 = !b2");
        b2 = !b2;
        System.out.println("b1 : "+ b1);
        System.out.println("b2 : "+b2);

        System.out.println("------------------------");

        Interrupteur i1 = new Interrupteur();
        System.out.println("i2 = i1");
        Interrupteur i2 = i1;
        System.out.println("i1 : " + i1.estEnMarche);
        System.out.println("i2 : " + i2.estEnMarche);
        System.out.println("i2.basculer()");
        i2.basculer();
        System.out.println("i1 : " + i1.estEnMarche);
        System.out.println("i2 : " + i2.estEnMarche);
        System.out.println("change value i1");
        i1.estEnMarche = false;
        System.out.println("i1 : " + i1.estEnMarche);
        System.out.println("i2 : " + i2.estEnMarche);
    }

}
