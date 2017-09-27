public class Main {

    public static void main(String[] args) {
        System.out.println((1.0)-(0.1)-(0.1)-(0.1)-(0.1)-(0.1));

        System.out.println((1.0)-(0.9));

        System.out.println("-----------------NY OPGAVE---------------------------");

        int number1 = 1;
        int number2 = 2;

        double average = (number1 + number2)/2; //hvis man forventer et kommatal som resultat, skal man altid dividere med et kommatal,
        //for at fortælle compileren, at det altså er en 'double' funktion, den skal bruge.

        System.out.println(average);
    }
}
