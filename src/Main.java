public class Main {
    //EJERCICIO 1 - Estructura if
    public static void main(String[] args) {
        int numeroif = -23; //Variable Ejercicio 1
        if (numeroif > 1) {
            System.out.println("El numero es positivo");
        } else {
            if (numeroif < 0)
                System.out.println("El numero es negativo");
        }
    }


    //EJERCICIO 2 - Estructura While

    public static void main2(String[] args) {
        int numeroWhile = 0;  //Variable Ejercicio 2

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El numero es :" + numeroWhile);

        }
    }
    //EJERCICIO 3 - Estructura Do While
    public static void main3(String[] args) {
        int numeroWhile = 2;  //Variable Ejercicio 3

        do {
            numeroWhile++;
            System.out.println("El numero es :" + numeroWhile);
        }while (numeroWhile < 3);

    }
    //EJERCICIO 4 - Estructura For

    public static void main4(String[] args) {
        int numeroFor = 0;  //Variable Ejercicio 4

            for (int i = 0 ; numeroFor <= 3 ; numeroFor++ ){
                System.out.println("numeroFor se incremento en  " +numeroFor +" veces ");
            }
        }
    //EJERCICIO 5 - Estructura Case
    public static void main5(String[] args) {
        var estacion ="Verano";  //Variable Ejercicio 4
        switch (estacion){
            case "Primavera": System.out.print("Estamos en la estacion Primavera");
                break;
            case "Otonio": System.out.print("Estamos en la estacion Otonio");
                break;
            case "Invierno": System.out.print("Estamos en la estacion Invierno");
                break;
            case "Verano": System.out.print("Estamos en la estacion Verano");
                break;
            default:
                System.out.print("No es una Estacion");
        }
    }
}




