//import com.google.gson.Gson;

import java.util.Scanner;

public class Prototype {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();

        //Gson gson = new Gson();
        String tipoDeMoneda = ("USD");
        Moneda moneda = consulta.buscarTipoMoneda(tipoDeMoneda);

        System.out.println(moneda);
        System.out.println(moneda.base_code());
        System.out.println(moneda.conversion_rates());
        System.out.println(moneda.conversion_rates().get("AED"));
        System.out.println(moneda.conversion_rates().get("USD"));

        System.out.print("Ingrese cantidad de dinero a convertir: ");
        double dinero = scan.nextDouble();
        double monedaConvertida = (dinero*moneda.conversion_rates().get("USD")) * moneda.conversion_rates().get("AED");

        System.out.println(monedaConvertida);

        scan.close();
    }
}