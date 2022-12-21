# ejerciciovuelos
ejercicio final de colecciones de java.

Dada la siguiente tabla de llegadas de vuelos, se pide lo siguiente:

Vuelo;Origen;Destino;Fecha llegada;Hora llegada;Num pasajeros
AAL 933;New York;Santiago;2021-08-29;5:39;62
LAT 755;Sao Paulo;Santiago;2021-08-31;4:45;47
SKU 621;Rio De Janeiro;Santiago;2021-08-30;16:00;52
DAL 147;Atlanta;Santiago;2021-08-29;13:22;59
AVA 241;Bogota;Santiago;2021-08-31;14:05;25
AMX 10;Mexico City;Santiago;2021-08-31;5:20;29
IBE 6833;Londres;Santiago;2021-08-30;8:45;55
LAT 2479;Frankfurt;Santiago;2021-08-29;7:41;51
SKU 803;Lima;Santiago;2021-08-30;10:35;48
LAT 533;Los Ángeles;Santiago;2021-08-29;9:14;59
LAT 1447;Guayaquil;Santiago;2021-08-31;8:33;31
CMP 111;Panama City;Santiago;2021-08-31;15:15;29
LAT 705;Madrid;Santiago;2021-08-30;8:14;47
AAL 957;Miami;Santiago;2021-08-29;22:53;60
ARG 5091;Buenos Aires;Santiago;2021-08-31;9:57;32
LAT 1283;Cancún;Santiago;2021-08-31;4:00;35
LAT 579;Barcelona;Santiago;2021-08-29;7:45;61
AAL 945;Dallas-Fort Worth;Santiago;2021-08-30;7:12;58
LAT 501;París;Santiago;2021-08-29;18:29;49
LAT 405;Montevideo;Santiago;2021-08-30;15:45;39


Una lista de objetos List del tipo Vuelo que mantenga el mismo orden de registro de la tabla.

La clase Vuelo debe contener los atributos nombre (string), origen (string), destino (string), fecha de llegada que incluya fecha y hora (java.util.Date) y cantidad de pasajeros.

Se pide ordenar por llagada de forma ascendente, obtener el ultimo vuelo en llegar y también se pide el vuelo que tiene menor número de pasajeros.

Como recurso se adjunta la tabla en Excel.

El resultado final debería ser, similar a:

... listado ordenado por fecha llegada ascendente ...
El último vuelo en llegar es CMP 111: Panama City, aterriza el Tue Aug 31 15:15:00 2021
El vuelo con menor número de pasajeros es AVA 241: Bogota, con 25 pasajeros.
