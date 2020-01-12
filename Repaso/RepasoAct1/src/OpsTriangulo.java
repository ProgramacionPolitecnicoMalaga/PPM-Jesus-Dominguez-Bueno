import java.util.Scanner;

public class OpsTriangulo {
    int opcion1 = 1;
    int opcion2 = 1;
    double cateto1 = 0;
    double cateto2 = 0;
    double hipotenusa = 0;
    double area = 0;
    String unidad = "mm";
    Scanner lectorTeclado = new Scanner(System.in);

    public void firstMenu () {
        System.out.println("¿Qué unidad vas a utilizar?\n" +
                           "1. mm\n" +
                           "2. cm\n" +
                           "3. m\n" +
                           "Intruduzca una opción:");

        if (lectorTeclado.hasNextInt()){
            opcion1 = lectorTeclado.nextInt();
        } else {
            lectorTeclado.next();
            opcion1 = 1;
            System.out.println("La opción elegida no es válida. Se va a operar en mm.");
        }

        if (opcion1 == 1) unidad = "mm";
        else if (opcion1 == 2) unidad = "cm";
        else if (opcion1 == 3) unidad = "m";
    }

    public void secondMenu () {
        System.out.println("\n\n==============================================" +
                           "\n1. Calcular la hipotenusa e un triángulo a partir de sus catetos." +
                           "\n2. Calcular un cateto de un triángulo a partir de un cateto y la hipotenusa" +
                           "\n3. Calcular el área de un triángulo a partir de un cateto y la hipotenusa." +
                           "\n4. Calcular el área de un triángulo a partir de dos catetos." +
                           "\nElige una opción:");

        if (lectorTeclado.hasNextInt()){
            opcion2 = lectorTeclado.nextInt();
        } else {
            opcion2 = 1;
            System.out.println("Operación no válida, Crack.");
        }
    }

    public void calculateOps (){
        if (opcion2 == 1) {
            getCateto1();
            getCateto2();
            hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
            System.out.println("Tachán! La hipotenusa es: " + hipotenusa + unidad +
                               "\n\nLA CENCIA");
        } else if (opcion2 == 2) {
            getCateto1();
            getHipotenusa();
            cateto2 = Math.sqrt(Math.pow(cateto1,2) + Math.pow(hipotenusa,2));
            System.out.println("Tachán! La hipotenusa es: " + cateto2 + unidad +
                               "\n\nLA CENCIA");
        } else if (opcion2 == 3) {
            getCateto1();
            getHipotenusa();
            area = (cateto1 * hipotenusa) / 2;
            System.out.println("Tachán! La hipotenusa es: " + area + unidad + "2" +
                               "\n\nLA CENCIA");

        } else if (opcion2 == 4) {
            getCateto1();
            getCateto2();
            getArea2Cat();
            System.out.println("Tachán! La hipotenusa es: " + area + unidad + "2" +
                               "\n\nLA CENCIA");
        } else {
            System.out.println("Operación inválida prro.");
        }
    }

    public void getCateto1() {
        System.out.println("Introduzca el pnche cateto:");
        cateto1 = lectorTeclado.nextDouble();
    }

    public void getCateto2() {
        System.out.println("Introduzca el otro pnche cateto:");
        cateto2 = lectorTeclado.nextDouble();
    }

    public void getHipotenusa() {
        System.out.println("Introduzca la pnche hipotenusa:");
        hipotenusa = lectorTeclado.nextDouble();
    }

    public void getArea2Cat () {
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));;
        area = (cateto1 * hipotenusa) / 2;
    }
}
