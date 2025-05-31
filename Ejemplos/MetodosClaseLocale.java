package Ejemplos;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Calendar;


public class MetodosClaseLocale {

    public static void main(String[] args){

        Locale locIt = new Locale("it");
        Locale locSV = new Locale("es", "SV");
        Locale locJA = new Locale("ja");
        Locale locCH = new Locale("zh");

        //crear una fecha
        Calendar fecha = Calendar.getInstance();

        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIt);
        DateFormat dfSV = DateFormat.getDateInstance(DateFormat.FULL, locSV);
        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
        DateFormat dfCH = DateFormat.getDateInstance(DateFormat.FULL, locCH);

        System.out.println("Italiano: " + dfIT.format(fecha.getTime()));
        System.out.println("Salvadoreño: " +  dfSV.format(fecha.getTime()));
        System.out.println("Japones: "+ dfJA.format(fecha.getTime()));
        System.out.println("Chino: " + dfCH.format(fecha.getTime()));

    }

}
