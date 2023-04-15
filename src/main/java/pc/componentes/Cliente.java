/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.componentes;

/**
 * Se crea un obejto Cliente con sus metodos y atributos
 * @author lucas
 */
public class Cliente {

    private String nombre;
    private String telefono;
    private String email;
    private String id;

    /**
     * Constructor principal donde se crea al Cliente
     * @param nombre
     * @param telefono
     * @param email
     * @param id 
     */
    
    public Cliente(String nombre, String telefono, String email, String id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Metodo que muestra por pantalla todos los elementos que componen al cliente
     * @return los datos del Cliente
     */
    @Override
    public String toString(){
        return "Soy el cliente con ID: " + id + "me llamo " + nombre + " mi email es " + email + "y mi numero de telefono es " + telefono;
    }
    
    
    /**
     * Metodo que permite cambiar el telefono del cliente aunque sea exactamente igual
     * @param telefono
     * @return el telefono se ha cambiado correctamente
     */
    
    public String cambiarTelefono (String telefono){
        this.telefono = telefono;
        return "El telefono ha sido cambiado";
    }
    
    /**
     * Metodo que permite cambiar el email del cliente
     * @param email
     * @return 
     */
    public String cambiarEmail(String email){
        this.email = email;
        return "El email se ha cambiado correctamente";
    }
    
    
}
