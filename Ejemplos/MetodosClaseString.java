package Ejemplos;

public class MetodosClaseString {

    public static void main(String[] args) {

        String cad = "Me gusta mucho programar";

        char caracter = cad.charAt(23);
        char[] caracteres = new char[4];
        int c = 0;

        for (int i = 1; i < cad.length(); i++) {

            if (i % 5 == 0) {
                caracteres[c] = cad.charAt(i);
                c++;
            }
        }

        System.out.println(caracter);
        System.out.println(caracteres);

        String cad1 = "Me gusta mucho el cafe ";
        String cad2 = "Porque me quita el sueño";

        System.out.println(cad1.compareTo(cad2)); // Compara lexicográficamente
        System.out.println(cad1.concat(cad2)); // Concatena dos cadenas

        String array2String = String.copyValueOf(caracteres);
        System.out.println(array2String); // Convierte un array de caracteres a String

        boolean ew = cad1.endsWith(" ");
        System.out.println(ew); // Verifica si la cadena termina con un espacio

        String cad3 = "Hola Mundo";
        String cad4 = "hola mundo";

        System.out.println(cad3.equals(cad4)); // Compara dos cadenas para igualdad
        System.out.println(cad3.equalsIgnoreCase(cad4)); // Compara dos cadenas ignorando mayúsculas y minúsculas

        byte[] bytesCad = new byte[cad3.length()];
        bytesCad = cad3.getBytes(); // Convierte una cadena a un array de bytes

        for(int i = 0; i < bytesCad.length; i++) {
            System.out.print(bytesCad[i] + " "); // Imprime los bytes de la cadena
        }

        
        System.out.println("");
        int pos1 = cad4.indexOf(" ", 5); // Encuentra la posición del primer espacio después del índice 5
        System.out.println(pos1); // Imprime la posición del espacio encontrado

        int pos2 = cad.lastIndexOf(" ");  // Encuentra la posición del último espacio en la cadena
        System.out.println(pos2); // Imprime la posición del último espacio encontrado

        int pos3 = cad.lastIndexOf("a", 15); // Encuentra la posición de la última 'a' antes del índice 15
        System.out.println(pos3); // Imprime la posición de la última 'a' encontrada

        boolean match = cad.matches(".*[gusta].*"); // Verifica si la cadena contiene la palabra "programar"
        System.out.println(match); // Imprime el resultado de la verificación

        String juego = "ya kama maca";
        String cambio = cad.replace('a', 'o'); // Reemplaza todas las 'a' por 'o' en la cadena
        System.out.println(cambio); // Imprime la cadena modificada

        String juego1 = "samba katara katamba katakara katakamba katara kata";
        String conE = juego1.replace('a', 'e'); // Reemplaza todas las 'a' por 'e' en la cadena
        String conI = juego1.replace("a", "i"); // Reemplaza todas las "a" por "i" en la cadena
        String conO = juego1.replace("a", "o"); // Reemplaza todas las "a" por "o" en la cadena
        String conU = juego1.replace("a", "u"); // Reemplaza todas las "a" por "u" en la cadena 

        System.out.println(juego1); // Imprime la cadena original
        System.out.println(conE); // Imprime la cadena con 'e'
        System.out.println(conI); // Imprime la cadena con 'i'
        System.out.println(conO); // Imprime la cadena con 'o'
        System.out.println(conU); // Imprime la cadena con 'u'


        String textoOriginal = "  Hola Mundo Cruel  ";
        String textoParaReemplazar = "Mundo";
        String textoDeReemplazo = "Planeta";
        String prefijo = "  Ho";
        int indiceInicioSubcadena = 5;
        int indiceFinSubcadena = 10;


        System.out.println("------------------------------------------------------------------------------------");
        // replaceAll(String regex, String replacement): Reemplaza todas las ocurrencias
        // de la expresión regular con la cadena de reemplazo.
        String textoReemplazado = textoOriginal.replaceAll(textoParaReemplazar, textoDeReemplazo);
        System.out.println("replaceAll: " + textoReemplazado); // Salida: Hola Planeta Cruel

        // startsWith(String prefix): Verifica si la cadena comienza con el prefijo especificado.
        boolean comienzaCon = textoOriginal.startsWith(prefijo.trim()); // trim() para ignorar espacios al inicio
        System.out.println("startsWith '" + prefijo.trim() + "': " + comienzaCon); // Salida: true

        // substring(int beginIndex): Devuelve una subcadena que comienza en el índice especificado
        // y se extiende hasta el final de esta cadena.
        String subcadenaDesdeInicio = textoOriginal.substring(indiceInicioSubcadena);
        System.out.println("substring desde " + indiceInicioSubcadena + ": " + subcadenaDesdeInicio); // Salida: Mundo Cruel

        // substring(int beginIndex, int endIndex): Devuelve una subcadena que comienza en el
        // índice beginIndex y se extiende hasta el carácter en el índice endIndex - 1.
        String subcadenaConFin = textoOriginal.substring(indiceInicioSubcadena, indiceFinSubcadena);
        System.out.println("substring desde " + indiceInicioSubcadena + " hasta " + indiceFinSubcadena + ": " + subcadenaConFin); // Salida: Mundo

        // toCharArray(): Convierte esta cadena en una nueva matriz de caracteres.
        char[] arregloDeCaracteres = textoOriginal.toCharArray();
        System.out.print("toCharArray: ");
        for (char caracterer2 : arregloDeCaracteres) {
            System.out.print(caracter + " ");
        }
        System.out.println(); // Salida:   H o l a   M u n d o   C r u e l

        // toLowerCase(): Convierte todos los caracteres de esta cadena a minúsculas.
        String textoEnMinusculas = textoOriginal.toLowerCase();
        System.out.println("toLowerCase: " + textoEnMinusculas); // Salida:   hola mundo cruel

        // toUpperCase(): Convierte todos los caracteres de esta cadena a mayúsculas.
        String textoEnMayusculas = textoOriginal.toUpperCase();
        System.out.println("toUpperCase: " + textoEnMayusculas); // Salida:   HOLA MUNDO CRUEL

        // trim(): Devuelve una cadena cuyo valor es esta cadena, con todos los espacios
        // en blanco iniciales y finales eliminados.
        String textoSinEspaciosExtremos = textoOriginal.trim();
        System.out.println("trim: \"" + textoSinEspaciosExtremos + "\""); // Salida: "Hola Mundo Cruel"
    
    
    }

}
