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
public class Serie {
     private int id;
   private String Nombre;
   private int N_Temporadas;
   private int Categoria;
   private ArrayList<String> Idiomas=new ArrayList();
   private ArrayList<String> subtitulos=new ArrayList();
   private int Duracion;//CAMBIAR A FECHA Y HORA 
   private int Rating;
  private ArrayList<String> Comentarios=new ArrayList();
  private String Productora;
  private String Director;
  private ArrayList<String> Actores=new ArrayList();

    public Serie() {
    }

    @Override
    public String toString() {
        return "Serie{" + "id=" + id + ", Nombre=" + Nombre + ", N_Temporadas=" + N_Temporadas + ", Categoria=" + Categoria + ", Idiomas=" + Idiomas + ", subtitulos=" + subtitulos + ", Duracion=" + Duracion + ", Rating=" + Rating + ", Comentarios=" + Comentarios + ", Productora=" + Productora + ", Director=" + Director + ", Actores=" + Actores + '}';
    }

    public Serie(int id, String Nombre, int N_Temporadas, int Categoria, int Duracion, int Rating, String Productora, String Director) {
        this.id = id;
        this.Nombre = Nombre;
        this.N_Temporadas = N_Temporadas;
        this.Categoria = Categoria;
        this.Duracion = Duracion;
        this.Rating = Rating;
        this.Productora = Productora;
        this.Director = Director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getN_Temporadas() {
        return N_Temporadas;
    }

    public void setN_Temporadas(int N_Temporadas) {
        this.N_Temporadas = N_Temporadas;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public ArrayList<String> getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(ArrayList<String> Idiomas) {
        this.Idiomas = Idiomas;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public ArrayList<String> getComentarios() {
        return Comentarios;
    }

    public void setComentarios(ArrayList<String> Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getProductora() {
        return Productora;
    }

    public void setProductora(String Productora) {
        this.Productora = Productora;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public ArrayList<String> getActores() {
        return Actores;
    }

    public void setActores(ArrayList<String> Actores) {
        this.Actores = Actores;
    }

}
