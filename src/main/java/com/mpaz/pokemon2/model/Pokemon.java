package com.mpaz.pokemon2.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Pokemon {

    private final IntegerProperty id;
    private final StringProperty nombre;
    private final StringProperty tipo;

    public Pokemon(int id, String nombre, String tipo){
        this.id = new SimpleIntegerProperty(id);
        this.nombre = new SimpleStringProperty(nombre);
        this.tipo = new SimpleStringProperty(tipo);
    }

    //Property Getters (Para JavaFX y TableView)


    public IntegerProperty idProperty() {
        return id;
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public StringProperty tipoProperty() {
        return tipo;
    }

    //Getters y Setters clasicos
    public int getID(){
        return id.get();
    }

    public String getNombre(){
        return nombre.get();
    }

    public void setNombre(String nombre){
        this.nombre.set(nombre);
    }

    public String getTipo(){
        return tipo.get();
    }

    public void setTipo(String tipo){
        this.tipo.set(tipo);
    }



}
