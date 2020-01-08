package Aut1;

public class Tableau {

    public static void main(String[] args){

        //Declaration
        int[] array_of_int;
        int rgb[][][];

        //initialisation
        array_of_int = new int[42];
        array_of_int[0] = 3;
        array_of_int[5] = 10;

        rgb = new int[256][256][256];

        int[] primes = {1,2,3,5,7,7+7};

        //Utilisation
        int lenght = array_of_int.length;
        int integer = array_of_int[0];

        //Affichage des valeurs
        System.out.println(lenght);
        System.out.println(integer);
        System.out.println(primes);
        for (int e : primes){
            System.out.println(e);
        }
        System.out.println(rgb);
        System.out.println(array_of_int[5]);
        System.out.println(array_of_int);
    }
}
