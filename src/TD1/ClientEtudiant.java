package TD1;

public class ClientEtudiant {

    public static void main(String[] args){

        Etudiant e1 = new Etudiant(1, "paul", "toto");
        Etudiant e2 = new Etudiant(2, "jean", "tata");
        Etudiant e3 = new Etudiant(3, "pierre", "titi");
        Etudiant e4 = new Etudiant(3, "jambon", "toto");
        Etudiant e5 = new Etudiant(3, "jean", "bon");

        GroupeEtudiant gp = new GroupeEtudiant();

        gp.ajout(e1);
        gp.ajout(e2);
        gp.ajout(e3);
        gp.ajout(e4);
        gp.ajout(e5);

        System.out.println(gp);
        System.out.println(gp.recheche("toto"));

    }
}
