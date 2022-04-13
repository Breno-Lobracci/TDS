/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricacelular;

import java.util.ArrayList;

/**
 *
 * @author francisleide
 */
public class Celular {
    private String marca;
    private String modelo;
    private float tamanho;
    private int pxCamera;
    private Bateria bateria;
    private ArrayList<Programa> programas;
            
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getPxCamera() {
        return pxCamera;
    }

    public void setPxCamera(int pxCamera) {
        this.pxCamera = pxCamera;
    }
    
    public String getBateria(){
        return this.bateria.getModelo() + " - " +this.bateria.getMarca();
    }
    public void setBateria(Bateria bateria){
        this.bateria = bateria;
    }
    
    public ArrayList<Programa> getProgramas(){
        return this.programas;
    } 
    public void setProgramas(ArrayList<Programa> programas){
        this.programas = programas;
    }
    
    
}
