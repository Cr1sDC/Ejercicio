package lucho;

import java.text.SimpleDateFormat;

/**
 *
 * @author Cris Abusleme
 * @version 21-09-2023
 */
public class Si {
    private int codigo,asistGente,precio;
    private SimpleDateFormat fecha,horaI,horaF;
    private String tipoEvento,ubicacion;
    private char entrete;

    public Si() {
    }

    public Si(int codigo, int asistGente, int precio, SimpleDateFormat fecha, SimpleDateFormat horaI, SimpleDateFormat horaF, String tipoEvento, String ubicacion, char entrete) {
        this.codigo = codigo;
        this.asistGente = asistGente;
        this.precio = precio;
        this.fecha = fecha;
        this.horaI = horaI;
        this.horaF = horaF;
        this.tipoEvento = tipoEvento;
        this.ubicacion = ubicacion;
        this.entrete = entrete;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAsistGente() {
        return asistGente;
    }

    public void setAsistGente(int asistGente) {
        this.asistGente = asistGente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public SimpleDateFormat getFecha() {
        return fecha;
    }

    public void setFecha(SimpleDateFormat fecha) {
        this.fecha = fecha;
    }

    public SimpleDateFormat getHoraI() {
        return horaI;
    }

    public void setHoraI(SimpleDateFormat horaI) {
        this.horaI = horaI;
    }

    public SimpleDateFormat getHoraF() {
        return horaF;
    }

    public void setHoraF(SimpleDateFormat horaF) {
        this.horaF = horaF;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public char getEntrete() {
        return entrete;
    }

    public void setEntrete(char entrete) {
        this.entrete = entrete;
    }

    @Override
    public String toString() {
        return "Si{" + "codigo=" + codigo + ", asistGente=" + asistGente + ", precio=" + precio + ", fecha=" + fecha + ", horaI=" + horaI + ", horaF=" + horaF + ", tipoEvento=" + tipoEvento + ", ubicacion=" + ubicacion + ", entrete=" + entrete + '}';
    }
    
    public int acumuladorCodigo(int codigo){
        return this.codigo++;
    }
    
}
