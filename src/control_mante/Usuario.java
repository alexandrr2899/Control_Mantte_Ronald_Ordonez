
package control_mante;

/**
 *
 * @author alexanderordonez
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String correo;
    private String user;
    private String password;
    private String cargo;

    public Usuario(String nombre, String apellido, String id, String telefono, String correo, String user, String password, String cargo){
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.user = user;
        this.password = password;
        this.cargo = cargo;

    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getcargo() {
        return cargo;
    }

    public void setcargo(String Cargo) {
        this.cargo = Cargo;
    }

    
    
    
}
