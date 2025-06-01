package Ejercicios01;

public class SustituyaPorMayusculas {

    public static void main(String[] args){
        String texto = "hola mundo, bienvenido a la programación en Java";
        
        String textoCambiado = texto.replace("h", "H");
        textoCambiado = textoCambiado.replace(" b", " B");
        System.out.println(textoCambiado); 



    }

}
