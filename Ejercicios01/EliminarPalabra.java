package Ejercicios01;

public class EliminarPalabra {

    public static void main(String[] args) {

        String texto = "Hola mundo, bienvenido a la programación Java";
        
        String textoModificado = texto.replace("Java", "");
        
        System.out.println(textoModificado);
    }

}
