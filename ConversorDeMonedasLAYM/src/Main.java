import java.io.IOException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ConsultaAPI consulta = new ConsultaAPI();
        var salir = false;

        try {

            while (!salir) {

                System.out.println("Sea bienvenido/a al Conversor de Moneda =]");

                System.out.println("""
                    ****************************************
                    1) Dolar =>> Peso mexicano
                    2) Peso mexicano =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir
                    ****************************************
                    Elija una opción válida: 
                    """);
                int opcion = Integer.parseInt(new Scanner(System.in).nextLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "USD";
                        var monedaDestino = "MXN";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);
                    }
                    case 2 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "MXN";
                        var monedaDestino = "USD";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 3 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "USD";
                        var monedaDestino = "BRL";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 4 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "BRL";
                        var monedaDestino = "USD";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 5 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "USD";
                        var monedaDestino = "COP";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 6 -> {
                        System.out.print("Ingresa el valor que deseas convertir: ");
                        var cantidad = Double.parseDouble(new Scanner(System.in).nextLine());
                        var monedaBase = "COP";
                        var monedaDestino = "USD";
                        Moneda moneda = consulta.conversorMoneda(monedaBase, monedaDestino, cantidad);
                        System.out.println("El valor de " + cantidad + moneda);

                    }
                    case 7 -> {
                        System.out.print("Finalizando el Conversor  de Monedas. " +
                                "Muchas gracias por usar nuestros servicios");
                        salir = true; //salimos del ciclo while
                    }
                    default -> System.out.println("Opcion invalida: " + opcion);
                }


                System.out.println();
            }

        } catch (NumberFormatException e) {
            System.out.println("Numero no encontrado " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando el programa");
        }
    }
}