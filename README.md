# Juego-Pistolero

import java.util.Random; 
# Se utiliza la importación Random de la biblioteca java.util para que se genere un tiempo aleatorios.
import java.util.Scanner; 
# Se utiliza la importación Scanner de la biblioteca java.util para leer la entrada por consola.

public class Juego { 
# Esta es la clase principal la he llamado "Juego".
    public static void main(String[] args) { 
# El método main es el punto de entrada del programa.

        System.out.println("¿Quién será el pistolero más rápido del oeste?"); 
# Mensaje de bienvenida que se muestra por consola.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Este es un comando que hace esperar 2 segundos en concreto, hasta que continue el resto del programa.
        System.out.println("Para ganar, después de la señal ¡DISPARAR! vuestras teclas debereís pulsar");
        System.out.println("Una vez se ha disparado, a la tecla enter tendrás que dar. Así sabrás quién armado iba de verdad");
# Instrucciones del juego.
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Espera de 4 segundos
        System.out.println("Jugador 1 para disparar la tecla (a) tienes que pulsar");
# Mensaje para jugador 1.
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Espera de 1,5 segundos.
        System.out.println("Jugador 2 para disparar la tecla (ñ) tienes que pulsar");
# Mensaje para jugador 2.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Espera de 3 segundos.
        System.out.println("- No se puede accionar la tecla antes de que se muestre el texto ¡DISPARA!");
        System.out.println("- Con un solo disparo certero el jugador ganará.");
        System.out.println("- ¡Que gané el más rápido! ;)");
# Reglas del juego.
# Los mensajes anteriores se imprimen por consola. Estos mensajes son las instrucciones del funcionamiento y reglas del juego.
# Todos los mensajes anteriores se muestran gracias al comando (System.out.println).
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Espera de 3 segundos.
        System.out.println("Presiona enter para comenzar el juego."); 
# Instrucción para el comienzo del juego , que se muestra por consola al igual que los demás mensajes.
        esperarComienzo(); 
# Con este comando el juego no comienza hasta pulsar la tecla enter.
        System.out.println("El duelo ha comenzado"); 
# Empieza el juego :).

        Random random = new Random();
        int tiempoAleatorio = random.nextInt(7000) + 2000;
        try {
            Thread.sleep(tiempoAleatorio);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Este es igual que un esperar, pero en este caso el tiempo que se espera es aleatorio gracias al comando random y la variable tiempoAleatorio.

        System.out.println("¡DISPARA!"); 
# Texto "¡DISPARA!". Sinónimo a reacción.
        char ganador = esperarRespuesta(); 
# La variable ganador espera la respuesta de los jugadores.

        if (ganador == 'a') {
            System.out.println("¡Ha ganado el Jugador 1!");
        } else if (ganador == 'ñ') {
            System.out.println("¡Ha ganado el Jugador 2!");
        } else {
            System.out.println("Respuesta no válida. El juego ha terminado sin ganador.");
        } 
    }
# Mediante estas condiciones se determina el ganador según la primera tecla presionada y se imprime el resultado.

    private static void esperarComienzo() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().equals("")) {
        }
    } 
# Con esta función hace esperar a los jugadores hasta que se presione la tecla enter.

    private static char esperarRespuesta() {
        Scanner scanner = new Scanner(System.in);
        char tecla = scanner.next().charAt(0);
        return Character.toLowerCase(tecla);
    } //Con esta función devuelve la tecla del jugador más rápido y la convirte en minúscula para que no haya errores.
}
