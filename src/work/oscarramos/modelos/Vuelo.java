package work.oscarramos.modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo implements Comparable<Vuelo> {
    private String codigo;
    private String origien;
    private String destino;
    private LocalDate fechaLlegada;
    private LocalTime horaLlegada;
    private Integer numeroPasajero;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigien() {
        return origien;
    }

    public void setOrigien(String origien) {
        this.origien = origien;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Integer getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(Integer numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public Vuelo(String codigo, String origien, String destino, LocalDate fechaLlegada, LocalTime horaLlegada, Integer numeroPasajero) {
        this.codigo = codigo;
        this.origien = origien;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.numeroPasajero = numeroPasajero;
    }

    @Override
    public String toString() {
        return "Vuelo : " + codigo + " origien : " + origien + " destino : " + destino + " Fecha llegada : " + fechaLlegada + " Hora llegada : " + horaLlegada + " Numero pasajero : " + numeroPasajero;

    }

    @Override
    public int compareTo(Vuelo v) {
        if(v.horaLlegada ==null){
            return 0;
        }
        return this.horaLlegada.compareTo(v.horaLlegada);
    }
}
