package Aut1;

public class Arguments {

    public static void main(String[] args){

        if (args.length == 0){
            System.out.println("Aucun arguments");
        } else {
            for(String e : args){
                System.out.println(e);
            }
        }
    }
}
