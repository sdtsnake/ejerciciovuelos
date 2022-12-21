package work.oscarramos;

import work.oscarramos.modelos.Vuelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

public class OrdenaVuelos {
    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo("AAL933","New York","Santiago",LocalDate.parse("2021-08-29"),LocalTime.parse("05:39:00"),62));
        vuelos.add(new Vuelo("LAT755","Sao Paulo","Santiago",LocalDate.parse("2021-08-31"),LocalTime.parse("04:45:00"),47));
        vuelos.add(new Vuelo("SKU621","Rio De Janeiro","Santiago",LocalDate.parse("2021-08-30"),LocalTime.parse("16:00:00"),52));
        vuelos.add(new Vuelo("DAL147","Atlanta","Santiago",LocalDate.parse("2021-08-29"),LocalTime.parse("13:22:00"),59));
        vuelos.add(new Vuelo("AVA241","Bogota","Santiago",LocalDate.parse("2021-08-31"),LocalTime.parse("14:05:00"),25));
        vuelos.add(new Vuelo("AMX10","Mexico City","Santiago",LocalDate.parse("2021-08-31"),LocalTime.parse("05:20:00"),29));
        vuelos.add(new Vuelo("IBE683","Londres","Santiago",LocalDate.parse("2021-08-30"),LocalTime.parse("08:45:00"),55));
        vuelos.add(new Vuelo("LAT247","Frankfurt","Santiago",LocalDate.parse("2021-08-29"),LocalTime.parse("07:41:00"),51));
        vuelos.add(new Vuelo("SKU803","Lima","Santiago",LocalDate.parse("2021-08-30"),LocalTime.parse("10:35:00"),48));
        vuelos.add(new Vuelo("LAT533","Los Ángeles","Santiago",LocalDate.parse("2021-08-29"),LocalTime.parse("09:14:00"),59));
        vuelos.add(new Vuelo("LAT144","Guayaquil","Santiago",LocalDate.parse("2021-08-31"),LocalTime.parse("08:33:00"),31));
        vuelos.add(new Vuelo("CMP111","Panama City","Santiago",LocalDate.parse("2021-08-31"),LocalTime.parse("15:15:00"),29));
        vuelos.add(new Vuelo("LAT705","Madrid","Santiago",LocalDate.parse("2021-08-30"),LocalTime.parse("08:14:00"),47));
        vuelos.add(new Vuelo("AAL957","Miami","Santiago",LocalDate.parse("2021-08-29"),LocalTime.parse("22:53:00"),60));
        vuelos.add(new Vuelo("ARG509","Buenos Aires","Santiago",LocalDate.parse("2021-08-31"),LocalTime.parse("09:57:00"),32));
        vuelos.add(new Vuelo("LAT128","Cancún","Santiago",LocalDate.parse("2021-08-31"),LocalTime.parse("04:00:00"),35));
        vuelos.add(new Vuelo("LAT579","Barcelona","Santiago",LocalDate.parse("2021-08-29"),LocalTime.parse("07:45:00"),61));
        vuelos.add(new Vuelo("AAL945","Dallas-FortWorth","Santiago",LocalDate.parse("2021-08-30"),LocalTime.parse("07:12:00"),58));
        vuelos.add(new Vuelo("LAT501","París","Santiago",LocalDate.parse("2021-08-29"),LocalTime.parse("18:29:00"),49));
        vuelos.add(new Vuelo("LAT405","Montevideo","Santiago",LocalDate.parse("2021-08-30"),LocalTime.parse("15:45:00"),39));

        SimpleDateFormat df = new SimpleDateFormat(" E, MMM dd yyyy");
        SimpleDateFormat dfu = new SimpleDateFormat(" E, MMM dd ");

        System.out.println("Listado por fecha de llegada");
        vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada).thenComparing(Vuelo::getHoraLlegada));
        vuelos.forEach(v -> {
            Date fecha =  Date.from (v.getFechaLlegada().atStartOfDay(ZoneId.systemDefault()).toInstant());
            System.out.println("Vuelo " + v.getCodigo() + " de " + v.getOrigien() + ", aterriza el dia " + df.format(fecha) + " a las " + v.getHoraLlegada() );
        });

        Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);

        Date fecha =  Date.from (ultimoVuelo.getFechaLlegada().atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("El ultimo vuelo en llegar es " + ultimoVuelo.getCodigo() + ": " + ultimoVuelo.getOrigien() + " aterriza el " + dfu.format(fecha));

        vuelos.sort(Comparator.comparing(Vuelo::getNumeroPasajero));

        Vuelo menorPasajeros = vuelos.get(0);

        System.out.println("El vuelo con menor numero de pasajeros es " + menorPasajeros.getCodigo() + ": " + menorPasajeros.getOrigien() + ", con " + menorPasajeros.getNumeroPasajero() + " pasajeros");
    }
}
