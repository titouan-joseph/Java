package TD1;

import java.util.ArrayList;


public class GroupeEtudiant {

    private ArrayList<Etudiant> listEtu = new ArrayList<Etudiant>();

    public String toString(){
        return listEtu.toString();
    }

    public void ajout(Etudiant e){
        listEtu.add(e);
    }

    public ArrayList<Etudiant> recheche(String nom){
        ArrayList<Etudiant> nameFind = new ArrayList<Etudiant>();

//        for(int i = 0; i < listEtu.size(); i++) {
//            if (listEtu.get(i).aCeNom(nom)) {
//                nameFind.add(listEtu.get(i));
//            }
//        }

        for(Etudiant e : listEtu){
            if(e.aCeNom(nom)){
                nameFind.add(e);
            }
        }
        return nameFind;
    }
}
