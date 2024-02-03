# Juego-Pistolero

# Importación Random.
// Se utiliza la importación Random de la biblioteca java.util para que se genere tiempos aleatorios.
import java.util.Random; 
# Importación Scanner.
// Se utiliza la importación Scanner de la biblioteca java.util para leer la entrada por consola.
import java.util.Scanner; 

# Esta es la clase principal la he llamada "Juego".
public class Juego { 

# El método main.
// Punto de entrada del programa.
    public static void main(String[] args) { 

 # Mensaje de bienvenida.       
        System.out.println("¿Quién será el pistolero más rápido del oeste?"); 
// Todos los mensaje con System.out.println se muestran por consola.

 # Tiempo de 2 segundos. 
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
// Todos los comandos de tiempo hacen que el programa quede en espera hasta que finalice el tiempo ajustado y que en espera el resto del programa.
// Hay muchos ejemplos en este código.

# Mensaje con las instrucciones del juego.    
        System.out.println("Para ganar, después de la señal ¡DISPARAR! vuestras teclas debereís pulsar");
        System.out.println("Una vez se ha disparado, a la tecla enter tendrás que dar. Así sabrás quién armado iba de verdad");
# Tiempo de 4 segundos.    
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Mensaje para jugador 1.
        System.out.println("Jugador 1 para disparar la tecla (a) tienes que pulsar");
# Tiempo de 1,5 segundos.
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Mensaje para jugador 2.
        System.out.println("Jugador 2 para disparar la tecla (ñ) tienes que pulsar");
# Tiempo de 3 segundos.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Mensajes con las reglas del juego.
        System.out.println("- No se puede accionar la tecla antes de que se muestre el texto ¡DISPARA!");
        System.out.println("- Con un solo disparo certero el jugador ganará.");
        System.out.println("- ¡Que gané el más rápido! ;)");

# Todos los mensajes anteriores se imprimen por consola y se muestran gracias al comando (System.out.println).

# Tiempo de 3 segundos.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Comienzo del juego.
// Es una instrucción que se muestra por consola al igual que el resto mensajes.
        System.out.println("Presiona enter para comenzar el juego."); 
# Comando esperarComienzo.
// El juego no comienza hasta que se pulse la tecla enter.
        esperarComienzo(); 
# Mensaje de que empieza el juego.
        System.out.println("El duelo ha comenzado"); 

# Tiempo Random.
// Este es igual que un esperar, pero en este caso el tiempo que se espera es aleatorio gracias al comando random y la variable tiempoAleatorio.
        Random random = new Random();
        int tiempoAleatorio = random.nextInt(7000) + 2000;
        try {
            Thread.sleep(tiempoAleatorio);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

# Mensaje del texto "¡DISPARA!".
        System.out.println("¡DISPARA!"); 

# Variable anador.
// La variable ganador espera la respuesta de los jugadores.
        char ganador = esperarRespuesta(); 
# Elección de ganador.
// Mediante estas condiciones se determina el ganador según la primera tecla presionada y se imprime el resultado.
        if (ganador == 'a') {
            System.out.println("¡Ha ganado el Jugador 1!");
        } else if (ganador == 'ñ') {
            System.out.println("¡Ha ganado el Jugador 2!");
        } else {
            System.out.println("Respuesta no válida. El juego ha terminado sin ganador.");
        } 
    }

# Función esperarComienzo.
// Con esta función hace esperar a los jugadores hasta que se presione la tecla enter.
    private static void esperarComienzo() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().equals("")) {
        }
    } 

# Función esperarRespuesta.
// Con esta función devuelve la tecla del jugador más rápido y la convirte en minúscula para que no haya errores.
    private static char esperarRespuesta() {
        Scanner scanner = new Scanner(System.in);
        char tecla = scanner.next().charAt(0);
        return Character.toLowerCase(tecla);
    } 
}
# FIN.
