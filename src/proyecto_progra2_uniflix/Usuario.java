/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_progra2_uniflix;

import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Usuario {
   private String correo;
   private String Contrasena;
   private int date;//Cambiar a Tipo Date.
    private ArrayList<Pelicula>Peliculas=new ArrayList();
     private ArrayList<Serie>S_Preferidas=new ArrayList();
     private String Forma_Pago;

    public Usuario(String correo, String Contrasena, int date, String Forma_Pago) {
        this.correo = correo;
        this.Contrasena = Contrasena;
        this.date = date;
        this.Forma_Pago = Forma_Pago;
    }

    public Usuario() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> Peliculas) {
        this.Peliculas = Peliculas;
    }

    public ArrayList<Serie> getS_Preferidas() {
        return S_Preferidas;
    }

    public void setS_Preferidas(ArrayList<Serie> S_Preferidas) {
        this.S_Preferidas = S_Preferidas;
    }

    public String getForma_Pago() {
        return Forma_Pago;
    }

    public void setForma_Pago(String Forma_Pago) {
        this.Forma_Pago = Forma_Pago;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", Contrasena=" + Contrasena + ", date=" + date + ", Peliculas=" + Peliculas + ", S_Preferidas=" + S_Preferidas + ", Forma_Pago=" + Forma_Pago + '}';
    }
     
    
    
    
}
