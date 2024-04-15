import java.util.Scanner;

public class ClaseA {

    public static void bienvenida() {
        System.out.println("****************************************\n" +
                "\n"+
                "Bienvenido al conversor de monedas.\n");
    }

    public static void menu() {
        System.out.println(
                "****************************************\n" +
                        "1) Dolar --> Peso argentino\n" +
                        "2) Peso argentino --> Dolar\n" +
                        "3) Dolar --> Real brasileño\n" +
                        "4) Real brasileño --> Dolar\n" +
                        "5) Dolar --> Peso colombiano\n" +
                        "6) Peso colombiano --> Dolar\n" +
                        "7) Salir\n" +
                        "****************************************\n"
        );
    }

    public static void run() {
        Scanner scan = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();
        String tipoDeMoneda = ("");
        Moneda moneda = consulta.buscarTipoMoneda(tipoDeMoneda);
        double dinero;
        double monedaConvertida;
        boolean salir = false;
        ClaseA.bienvenida();
        do {
            ClaseA.menu();
            System.out.print("Por favor, seleccione una opción: ");
            int menuOpcion = scan.nextInt();

            switch (menuOpcion) {
                case 1:
                    System.out.print("Ingrese la cantidad en dolares a convertir: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * moneda.conversion_rates().get("USD")) * moneda.conversion_rates().get("ARS");
                    System.out.println(dinero + " USD equivale a " + monedaConvertida + " ARS.");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad en pesos argentinos: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * moneda.conversion_rates().get("ARS")) * moneda.conversion_rates().get("USD");
                    System.out.println(dinero + " ARS equivale a " + monedaConvertida + " USD.");
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad en dólares: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * moneda.conversion_rates().get("USD")) * moneda.conversion_rates().get("BRL");
                    System.out.println(dinero + " USD equivale a " + monedaConvertida + " BRL.");
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad en reales brasileños: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * moneda.conversion_rates().get("BRL")) * moneda.conversion_rates().get("USD");
                    System.out.println(dinero + " BRL equivale a " + monedaConvertida + " USD.");
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad en dólares: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * moneda.conversion_rates().get("USD")) * moneda.conversion_rates().get("COP");
                    System.out.println(dinero + " USD equivale a " + monedaConvertida + " COP.");
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad en pesos colombianos: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * moneda.conversion_rates().get("COP")) * moneda.conversion_rates().get("USD");
                    System.out.println(dinero + " COP equivale a " + monedaConvertida + " USD.");
                    break;
                case 7:
                    System.out.println("Saliendo del conversor de monedas. ¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
            ClaseA.salto();
        } while (!salir);
        scan.close();
    }

    public static void salto() {
        System.out.println("");
    }

}
