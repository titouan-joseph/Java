package reflexivite.jeux;

import fr.insalyon.tc.framework.JeuCombinatoire;
import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class EnsembleDeJeux implements JeuCombinatoire{

    private ArrayList<JeuCombinatoire> jeux = new ArrayList<JeuCombinatoire>();

    public EnsembleDeJeux() {
        String nomRepertoire = System.getProperty(".class");
        String ext = ".class";

        File repertoire = new File(nomRepertoire);

        for (String nom : repertoire.list()) {
            if (nom.toLowerCase().endsWith(ext) &&
                    !(nom.equals(this.getClass().getName() + ext))) {
                String nomClass = nom.substring(0, nom.length() - ext.length());
                System.out.println(nomClass);

                try {
                    Class<?> laClasse = Class.forName(nomClass);
                    JeuCombinatoire jeu = (JeuCombinatoire) laClasse.newInstance();
                    System.out.println("Ajouter jeu" + laClasse.getName());
                    jeux.add(jeu);
                } catch (ClassNotFoundException e) {
                    System.err.println("Warning: Classe '" + nomClass + "' non Toruvee");
                } catch (InstantiationException e) {
                    System.err.println("Warning: Classe '" + nomClass + "' non instanciable");
                } catch (IllegalAccessException e) {
                    System.err.println("Warning: Classe '" + nomClass + "' non utilisable");
                }
            }
        }
    }
    @Override
    public boolean estFini() {
        int c =0 ;
        for(JeuCombinatoire jeu: jeux){
            if(jeu.estFini()){
                c++;
            }
        }
        return (c == jeux.size());
    }

    @Override
    public boolean joueUnCoup(String unCoup) {
        String[] msg = unCoup.split(":");
        if (msg.length == 2){
            int num = Integer.parseInt(msg[0]);
            return (jeux.get(num).joueUnCoup(msg[1]));
        }else{
            return false;
        }
    }


    @Override
    public String toString(){
        String res = "";
        int c =0;
        for(JeuCombinatoire jeu : jeux){
            res += ">> Position du jeu #" + c +"\n";
            res += jeu.toString();
            res += "\n";
            c++;
        }
        return res;
    }
}
