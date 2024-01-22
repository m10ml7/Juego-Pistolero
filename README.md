# Juego-Pistolero

# Se utiliza la importación Random de la biblioteca java.util para que se genere un tiempo aleatorios.
import java.util.Random; 
# Se utiliza la importación Scanner de la biblioteca java.util para leer la entrada por consola.
import java.util.Scanner; 

# Esta es la clase principal la he llamado "Juego".
public class Juego { 

# El método main es el punto de entrada del programa.
    public static void main(String[] args) { 

 # Mensaje de bienvenida que se muestra por consola.       
        System.out.println("¿Quién será el pistolero más rápido del oeste?"); 
 # Este es un comando que hace esperar 2 segundos en concreto, hasta que continue el resto del programa.       
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Instrucciones del juego.    
        System.out.println("Para ganar, después de la señal ¡DISPARAR! vuestras teclas debereís pulsar");
        System.out.println("Una vez se ha disparado, a la tecla enter tendrás que dar. Así sabrás quién armado iba de verdad");
# Espera de 4 segundos    
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Mensaje para jugador 1.
        System.out.println("Jugador 1 para disparar la tecla (a) tienes que pulsar");
# Espera de 1,5 segundos.
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Mensaje para jugador 2.
        System.out.println("Jugador 2 para disparar la tecla (ñ) tienes que pulsar");
# Espera de 3 segundos.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Reglas del juego.
# Los mensajes anteriores se imprimen por consola. Estos mensajes son las instrucciones del funcionamiento y reglas del juego.
# Todos los mensajes anteriores se muestran gracias al comando (System.out.println).
        System.out.println("- No se puede accionar la tecla antes de que se muestre el texto ¡DISPARA!");
        System.out.println("- Con un solo disparo certero el jugador ganará.");
        System.out.println("- ¡Que gané el más rápido! ;)");
# Espera de 3 segundos.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
# Instrucción para el comienzo del juego , que se muestra por consola al igual que los demás mensajes.
        System.out.println("Presiona enter para comenzar el juego."); 
# Con este comando el juego no comienza hasta pulsar la tecla enter.
        esperarComienzo(); 
# Empieza el juego :).
        System.out.println("El duelo ha comenzado"); 

# Este es igual que un esperar, pero en este caso el tiempo que se espera es aleatorio gracias al comando random y la variable tiempoAleatorio.
        Random random = new Random();
        int tiempoAleatorio = random.nextInt(7000) + 2000;
        try {
            Thread.sleep(tiempoAleatorio);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

# Texto "¡DISPARA!". Sinónimo a reacción.
        System.out.println("¡DISPARA!"); 
# La variable ganador espera la respuesta de los jugadores.
        char ganador = esperarRespuesta(); 

# Mediante estas condiciones se determina el ganador según la primera tecla presionada y se imprime el resultado.
        if (ganador == 'a') {
            System.out.println("¡Ha ganado el Jugador 1!");
        } else if (ganador == 'ñ') {
            System.out.println("¡Ha ganado el Jugador 2!");
        } else {
            System.out.println("Respuesta no válida. El juego ha terminado sin ganador.");
        } 
    }

# Con esta función hace esperar a los jugadores hasta que se presione la tecla enter.
    private static void esperarComienzo() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().equals("")) {
        }
    } 

# Con esta función devuelve la tecla del jugador más rápido y la convirte en minúscula para que no haya errores.
    private static char esperarRespuesta() {
        Scanner scanner = new Scanner(System.in);
        char tecla = scanner.next().charAt(0);
        return Character.toLowerCase(tecla);
    } 
}
# FIN.
