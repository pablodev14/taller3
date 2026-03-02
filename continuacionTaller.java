import java.util.Scanner;

public class continuacionTaller {
    public static void main(String[] args) {

        double x = 0.0;
        double z = 0.0;
        double resultado1 = 0.0;
        double resultado2 = 0.0;

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double d = 0.0;

        int ecuacion = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola usuario, en este programa podrá escoger 2 valores para dos variables X y Z, con las cuales podrá escoger " +
        "Entre 2 opciones distintas de ecuaciones para resolverlas");
            
        System.out.println("Perfecto, ahora, ingrese: 1 Para escoger la ecuacion uno | 2 para escoger la ecuacion dos | 3 Para salir del sistema:");
        ecuacion = sc.nextInt();
        sc.nextLine();

        if (ecuacion == 1) {

            System.out.println("Ingrese el valor para x: ");
            x = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese el valor para z: ");
            z = sc.nextDouble();
            sc.nextLine();
            
            resultado1 = ((3*x)/(1+(3*x)/(3*z*z+2)))/(1/((1/(1+z))+3*x*x+2*z+3));

            System.out.println("El resultado y de la ecuacion 1 es igual a: " + resultado1);

        } else if (ecuacion == 2) {

            System.out.println("Ingrese el valor para x: ");
            x = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese el valor para z: ");
            z = sc.nextDouble();
            sc.nextLine();

            a = ((x*x+3*z+2) / (2 + (1 / (1+2*z))));
            b = (2 / (1+(3*x*x*x)+3*z+2));
            c = 1 / (1 + 3 * x);
            d = ((3*x+1)/(2*z) + (3/1+(5/z))); 

            resultado2 = a + (b / 1 / (c + d));
            System.out.println("El resultado y de la ecuacion 2 es igual a: " + resultado2);

        } else if (ecuacion == 3) {

            System.out.println("Saliendo del sistema....");

        } else{

            System.out.println("Opción no valida, porfavor vuelva a intentarlo");

        }
    }
}