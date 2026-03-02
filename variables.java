public class variables{
    public static void main(String[] args) {

        //Declaración e inicialización de 20 variables

        byte edad = 18;
        short anio = 2026;
        int poblacion = 1000000;
        long distancia = 123456789L; //El "L" se debe poner a todas las variables de tipo Long porque si no, el codigo no compila 
        float estatura = 1.75f; //El "f" se debe poner a todas las variables de tipo float, si no, el codigo no compila
        double peso = 68.5;
        char inicial = 'E'; //char es un tipo de dato que almacena un solo caracter
        boolean esEstudiante = true;
        String nombre = "Ema";
        String ciudad = "Medellin"; 
        int numero1 = 10;
        int numero2 = 20;
        double promedio = 0.0;
        float temperatura = 25.5f;
        long sumaLarga = 0L;
        boolean mayorDeEdad = false;
        char genero = 'M';
        int codigo = 1234;
        byte nivel = 5;
        double salario = 1500.50;
        
        // Reasignaciones

        // Usando valores de otras variables
        promedio = (numero1 + numero2) / 2.0;
        sumaLarga = poblacion + distancia;
        mayorDeEdad = edad >= 18;
        salario = salario + promedio;
        codigo = codigo + nivel;

        // Hard coded (datos quemados)
        nombre = "Carlos";
        ciudad = "Bogota";
        nivel = 10;
        codigo = 4321;
        genero = 'F';
        edad = 20;
        anio = 2027;
        peso = 50.0;
        inicial = 'J';
        esEstudiante = false;
        temperatura = 32.1f;


        // Mostrar resultados despues de la reasignación
        System.out.println("Edad: " + edad);
        System.out.println("El año es: " + anio);
        System.out.println("Poblacion: " + poblacion);
        System.out.println("distancia: " + distancia);
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
        System.out.println("Inicial: " + inicial);
        System.out.println("Estudiante: " + esEstudiante);
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Suma larga: " + sumaLarga);
        System.out.println("Mayor de edad: " + mayorDeEdad);
        System.out.println("Genero: " + genero);
        System.out.println("codigo: " + codigo);
        System.out.println("nivel: " + nivel);
        System.out.println("Salario actualizado: " + salario);
            
    }
}