/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_mante;

/**
 *
 * @author alexanderordonez
 */
public class Tarea {
    
    private String nombreTarea;
    private String tipoMantenimiento;
    private String maquina;
    private String fecha;
    private String estadoTarea;
    private String responsable;
    
    public Tarea(String nombreTarea, String tipoMantenimiento, String maquina, String fecha, String estadoTarea, String responsable){
        this.nombreTarea = nombreTarea;
        this.tipoMantenimiento = tipoMantenimiento;
        this.maquina = maquina;
        this.fecha = fecha;
        this.estadoTarea = estadoTarea;
        this.responsable = responsable;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(String estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    
    
}
