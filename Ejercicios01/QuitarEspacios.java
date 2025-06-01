package Ejercicios01;

public class QuitarEspacios {

    public static void main(String[] args) {

        String textoConEspacios = "   Hola,   ¿cómo estás?   hoy?  ";

        String textoSinEspacios = textoConEspacios.replaceAll("\\s+", " ").trim();

        System.out.println("Texto original: '" + textoConEspacios + "'");
        System.out.println("Texto sin espacios: '" + textoSinEspacios + "'");
        
    }

}
