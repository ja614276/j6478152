import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Scanner;

public class ClaseA {

    public static void bienvenida() {
        System.out.println("****************************************\n" +
                "\n" +
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
        double dinero;
        double monedaConvertida;
        boolean salir = false;
        ClaseA.bienvenida();
        do {
            ClaseA.menu();
            System.out.print("Por favor, seleccione una opción: ");
            int menuOpcion = scan.nextInt();
            String tipoDeMoneda;
            // Movemos la declaración aquí


            switch (menuOpcion) {
                case 1:
                    tipoDeMoneda = "USD";
                    Moneda moneda = consulta.buscarTipoMoneda(tipoDeMoneda); // Siempre comenzamos con USD
                    String jsonString = moneda.toJsonString();
                    JsonParser parser = new JsonParser();
                    JsonObject jsonObject = parser.parse(jsonString).getAsJsonObject();
                    JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
                    double precioUSD = conversionRates.get("USD").getAsDouble();
                    double precioBRL = conversionRates.get("BRL").getAsDouble();
                    double precioARS = conversionRates.get("ARS").getAsDouble();
                    double precioCOP = conversionRates.get("COP").getAsDouble();
                    System.out.print("Ingrese la cantidad en dólares a convertir: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * precioUSD) * precioARS;
                    System.out.println(dinero + " USD equivale a " + monedaConvertida + " ARS.");
                    break;
                case 2:
                    tipoDeMoneda = "ARS";
                    Moneda moneda2 = consulta.buscarTipoMoneda(tipoDeMoneda); // Siempre comenzamos con USD
                    String jsonString2 = moneda2.toJsonString();
                    JsonParser parser2 = new JsonParser();
                    JsonObject jsonObject2 = parser2.parse(jsonString2).getAsJsonObject();
                    JsonObject conversionRates2 = jsonObject2.getAsJsonObject("conversion_rates");
                    double precioUSD2 = conversionRates2.get("USD").getAsDouble();
                    double precioBRL2 = conversionRates2.get("BRL").getAsDouble();
                    double precioARS2 = conversionRates2.get("ARS").getAsDouble();
                    double precioCOP2 = conversionRates2.get("COP").getAsDouble();
                    System.out.print("Ingrese la cantidad en pesos argentinos: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * precioARS2) * precioUSD2;
                    System.out.println(dinero + " ARS equivale a " + monedaConvertida + " USD.");
                    break;
                case 3:
                    tipoDeMoneda = "USD";
                    Moneda moneda3 = consulta.buscarTipoMoneda(tipoDeMoneda); // Siempre comenzamos con USD
                    String jsonString3 = moneda3.toJsonString();
                    JsonParser parser3 = new JsonParser();
                    JsonObject jsonObject3 = parser3.parse(jsonString3).getAsJsonObject();
                    JsonObject conversionRates3 = jsonObject3.getAsJsonObject("conversion_rates");
                    double precioUSD3 = conversionRates3.get("USD").getAsDouble();
                    double precioBRL3 = conversionRates3.get("BRL").getAsDouble();
                    double precioARS3 = conversionRates3.get("ARS").getAsDouble();
                    double precioCOP3 = conversionRates3.get("COP").getAsDouble();
                    System.out.print("Ingrese la cantidad en dólares: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * precioUSD3) * precioBRL3;
                    System.out.println(dinero + " USD equivale a " + monedaConvertida + " BRL.");
                    break;
                case 4:
                    tipoDeMoneda = "BRL";
                    Moneda moneda4 = consulta.buscarTipoMoneda(tipoDeMoneda); // Siempre comenzamos con USD
                    String jsonString4 = moneda4.toJsonString();
                    JsonParser parser4 = new JsonParser();
                    JsonObject jsonObject4 = parser4.parse(jsonString4).getAsJsonObject();
                    JsonObject conversionRates4 = jsonObject4.getAsJsonObject("conversion_rates");
                    double precioUSD4 = conversionRates4.get("USD").getAsDouble();
                    double precioBRL4 = conversionRates4.get("BRL").getAsDouble();
                    double precioARS4 = conversionRates4.get("ARS").getAsDouble();
                    double precioCOP4 = conversionRates4.get("COP").getAsDouble();
                    System.out.print("Ingrese la cantidad en reales brasileños: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * precioBRL4) * precioUSD4;
                    System.out.println(dinero + " BRL equivale a " + monedaConvertida + " USD.");
                    break;
                case 5:
                    tipoDeMoneda = "USD";
                    Moneda moneda5 = consulta.buscarTipoMoneda(tipoDeMoneda); // Siempre comenzamos con USD
                    String jsonString5 = moneda5.toJsonString();
                    JsonParser parser5 = new JsonParser();
                    JsonObject jsonObject5 = parser5.parse(jsonString5).getAsJsonObject();
                    JsonObject conversionRates5 = jsonObject5.getAsJsonObject("conversion_rates");
                    double precioUSD5 = conversionRates5.get("USD").getAsDouble();
                    double precioBRL5 = conversionRates5.get("BRL").getAsDouble();
                    double precioARS5 = conversionRates5.get("ARS").getAsDouble();
                    double precioCOP5 = conversionRates5.get("COP").getAsDouble();
                    System.out.print("Ingrese la cantidad en dólares: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * precioUSD5) * precioCOP5;
                    System.out.println(dinero + " USD equivale a " + monedaConvertida + " COP.");
                    break;
                case 6:
                    tipoDeMoneda = "COP";
                    Moneda moneda6 = consulta.buscarTipoMoneda(tipoDeMoneda); // Siempre comenzamos con USD
                    String jsonString6 = moneda6.toJsonString();
                    JsonParser parser6 = new JsonParser();
                    JsonObject jsonObject6 = parser6.parse(jsonString6).getAsJsonObject();
                    JsonObject conversionRates6 = jsonObject6.getAsJsonObject("conversion_rates");
                    double precioUSD6 = conversionRates6.get("USD").getAsDouble();
                    double precioBRL6 = conversionRates6.get("BRL").getAsDouble();
                    double precioARS6 = conversionRates6.get("ARS").getAsDouble();
                    double precioCOP6 = conversionRates6.get("COP").getAsDouble();
                    System.out.print("Ingrese la cantidad en pesos colombianos: ");
                    dinero = scan.nextDouble();
                    monedaConvertida = (dinero * precioBRL6) * precioUSD6;
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
