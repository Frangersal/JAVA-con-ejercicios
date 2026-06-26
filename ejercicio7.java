public class ejercicio7 {
    public static void main(String[] args) {
        char letra1 = 'h';
        char letra2 = 'o';
        char letra3 = 'l';
        char letra4 = 'a';
        String palabra1 = " Mundo";
        String palabra2 = "!";

        // Mostramos las variables juntas en la misma línea con un solo println
        // Empezamos con una cadena vacía "" para forzar la concatenación de texto
        // y evitar que Java sume los valores numéricos de los caracteres (su valor ASCII)
        System.out.println("" + letra1 + letra2 + letra3 + letra4 + palabra1 + palabra2);
    }
}
