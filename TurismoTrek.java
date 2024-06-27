package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine();
        // Solicitar contraseña
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
        // Mostrar menú de opciones
        System.out.println("Seleccione una opción:");
        System.out.println("1. Volcán Villarrica");
        System.out.println("2. Cerro Ñielol");
        System.out.println("3. Ojos del Caburgua");
        System.out.println("4. Parque Nacional Huerquehue");
        // Leer opción del usuario
        int opcion = scanner.nextInt();
        // Variables para almacenar las coordenadas geográficas, logros y recompensas
        double latitud = 0;
        double longitud = 0;
        String lugar = "";
        String[] logros = new String[4];
        String recompensa = "";
        // Evaluar la opción con un switch
        switch (opcion) {
            case 1:
                lugar = "Volcán Villarrica";
                latitud = -39.4202;
                longitud = -71.9366;
                logros = new String[]{
                        "Primer vistazo al volcán",
                        "Ascendiendo por la ladera",
                        "Cerca de la cima",
                        "¡Llegaste al cráter!"
                };
                recompensa = "Has ganado un descuento en tu siguiente compra en McDonald's";
                System.out.println("Has seleccionado Volcán Villarrica.");
                break;
            case 2:
                lugar = "Cerro Ñielol";
                latitud = -38.7359;
                longitud = -72.5903;
                logros = new String[]{
                        "Inicio del ascenso",
                        "A mitad del camino",
                        "A punto de llegar",
                        "¡Cima alcanzada!"
                };
                recompensa = "Has ganado un descuento en kfc";
                System.out.println("Has seleccionado Cerro Ñielol.");
                break;
            case 3:
                lugar = "Ojos del Caburgua";
                latitud = -39.2607;
                longitud = -71.8427;
                logros = new String[]{
                        "Primera cascada",
                        "Segundo salto",
                        "Tercera cascada",
                        "¡Todas las cascadas vistas!"
                };
                recompensa = "Has ganado una taza representativa";
                System.out.println("Has seleccionado Ojos del Caburgua.");
                break;
            case 4:
                lugar = "Parque Nacional Huerquehue";
                latitud = -39.1212;
                longitud = -71.6533;
                logros = new String[]{
                        "Entrada al parque",
                        "Exploración inicial",
                        "Ruta avanzada",
                        "¡Descubrimiento completo!"
                };
                recompensa = "Has ganado un iman para el refrigerador";
                System.out.println("Has seleccionado Parque Nacional Huerquehue.");
                break;
            default:
                System.out.println("Opción no válida.");
                scanner.close();
                return;
        }
        // Mostrar la localización geográfica específica
        System.out.printf("Localización de %s: Latitud: %.6f, Longitud: %.6f\n", lugar, latitud, longitud);
        // Simular carga de barra de progreso con logros
        System.out.print("Cargando");
        for (int i = 0; i < 4; i++) {
            Thread.sleep(1000); // Esperar 1 segundo para cada 25%
            System.out.print(".");
            System.out.println(" " + logros[i] + " - Completado (" + (i + 1) * 25 + "%)");
        }
        System.out.println();
        // Mostrar mensaje de recompensa
        System.out.println("¡Tu recompensa está lista!");
        System.out.println(recompensa);
        // Cerrar el scanner
        scanner.close();
    }
}
