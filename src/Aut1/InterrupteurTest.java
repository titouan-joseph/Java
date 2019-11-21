public class InterrupteurTest {

    public static void main(String[] args){
        Interrupteur unInterrupteur;
        unInterrupteur = new Interrupteur();

        System.out.println("Changement de la variable estEnMarche dirrectement (True)");
        unInterrupteur.estEnMarche = true;
        System.out.println("est sur ON ? " + unInterrupteur.estEnMarche);
        System.out.println("Changement de l'etat par la methode basculer (True -> False)");
        unInterrupteur.basculer();
        System.out.println("est sur ON ? " + unInterrupteur.estEnMarche);
    }
}
