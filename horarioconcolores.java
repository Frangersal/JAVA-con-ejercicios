public class horarioconcolores {
    public static void main(String[] args) {
        // Códigos ANSI de colores
        final String RESET   = "\u001B[0m";
        final String BOLD    = "\u001B[1m";
        final String ROJO    = "\u001B[31m";
        final String VERDE   = "\u001B[32m";
        final String AMARILLO= "\u001B[33m";
        final String AZUL    = "\u001B[34m";
        final String MAGENTA = "\u001B[35m";
        final String CYAN    = "\u001B[36m";
        final String BLANCO  = "\u001B[37m";
        final String GRIS    = "\u001B[90m";
        final String FONDO_AZUL = "\u001B[44m";

        System.out.println(BOLD + FONDO_AZUL + BLANCO + "===== HORARIO DE CLASES =====" + RESET);
        System.out.println();

        // Cabecera
        System.out.println(
            BOLD + CYAN     + "Hora         " + RESET + "| " +
            BOLD + AMARILLO + "Lunes        " + RESET + "| " +
            BOLD + AMARILLO + "Martes       " + RESET + "| " +
            BOLD + AMARILLO + "Miercoles    " + RESET + "| " +
            BOLD + AMARILLO + "Jueves       " + RESET + "| " +
            BOLD + AMARILLO + "Viernes      " + RESET
        );
        System.out.println(GRIS + "-------------|--------------|--------------|--------------|--------------|--------------" + RESET);

        // Filas del horario
        System.out.println(
            CYAN + "08:00-09:00  " + RESET + "| " +
            AZUL     + "Matematicas  " + RESET + "| " +
            VERDE    + "Lengua       " + RESET + "| " +
            AZUL     + "Matematicas  " + RESET + "| " +
            VERDE    + "Lengua       " + RESET + "| " +
            MAGENTA  + "Ingles       " + RESET
        );
        System.out.println(
            CYAN + "09:00-10:00  " + RESET + "| " +
            ROJO     + "Fisica       " + RESET + "| " +
            AMARILLO + "Historia     " + RESET + "| " +
            VERDE    + "Quimica      " + RESET + "| " +
            VERDE    + "Biologia     " + RESET + "| " +
            AZUL     + "Matematicas  " + RESET
        );
        System.out.println(
            CYAN + "10:00-11:00  " + RESET + "| " +
            MAGENTA  + "Ingles       " + RESET + "| " +
            AZUL     + "Matematicas  " + RESET + "| " +
            MAGENTA  + "Ingles       " + RESET + "| " +
            ROJO     + "Fisica       " + RESET + "| " +
            AMARILLO + "Historia     " + RESET
        );
        System.out.println(
            CYAN + "11:00-11:30  " + RESET + "| " +
            BOLD + AMARILLO + "--- RECREO --- RECREO --- RECREO --- RECREO --- RECREO ---" + RESET
        );
        System.out.println(
            CYAN + "11:30-12:30  " + RESET + "| " +
            CYAN + "Programacion " + RESET + "| " +
            CYAN + "Programacion " + RESET + "| " +
            CYAN + "Programacion " + RESET + "| " +
            CYAN + "Programacion " + RESET + "| " +
            CYAN + "Programacion " + RESET
        );
        System.out.println(
            CYAN + "12:30-13:30  " + RESET + "| " +
            ROJO     + "Educ. Fisica " + RESET + "| " +
            MAGENTA  + "Arte         " + RESET + "| " +
            ROJO     + "Educ. Fisica " + RESET + "| " +
            MAGENTA  + "Musica       " + RESET + "| " +
            AMARILLO + "Filosofia    " + RESET
        );
        System.out.println(
            CYAN + "13:30-14:30  " + RESET + "| " +
            VERDE    + "Tutoria      " + RESET + "| " +
            VERDE    + "Quimica      " + RESET + "| " +
            AMARILLO + "Historia     " + RESET + "| " +
            AMARILLO + "Geografia    " + RESET + "| " +
            VERDE    + "Laboratorio  " + RESET
        );
    }
}
