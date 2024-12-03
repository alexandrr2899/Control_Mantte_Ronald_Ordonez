/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_mante;

/**
 *
 * @author alexanderordonez
 */
public class Maquina {
    
    private String nombre;
    private String categoria;
    private int voltaje;
    private int motor;
    private String estado;
    private String codigoMaquina;
    
    
    public Maquina(String nombre, String categoria, int voltaje, int motor, String estado, String codigoMaquina){
    
        this.nombre = nombre;
        this.categoria = categoria;
        this.voltaje = voltaje;
        this.motor = motor;
        this.estado = estado;
        this.codigoMaquina = codigoMaquina;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoMaquina() {
        return codigoMaquina;
    }

    public void setCodigoMaquina(String codigoMaquina) {
        this.codigoMaquina = codigoMaquina;
    }
    
    
    
}
