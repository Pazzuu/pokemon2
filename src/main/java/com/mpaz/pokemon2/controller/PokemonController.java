package com.mpaz.pokemon2.controller;

import com.mpaz.pokemon2.model.Pokemon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class PokemonController{

    //1. Inyeccion de componentes definidos en el FXML
    @FXML private  TableView<Pokemon> tableView;
    @FXML private  TableColumn<Pokemon, Integer> colId;
    @FXML private  TableColumn<Pokemon, String> colNombre;
    @FXML private  TableColumn<Pokemon, String> colTipo;

    @FXML private TextField txtId;
    @FXML private TextField txtNombre;
    @FXML private TextField txtTipo;

    //2. Lista reactiva con los datos de origen
    private final ObservableList listaPokemon = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resource){
        //A. Cargar los datos
        listaPokemon.addAll(
                new Pokemon(1, "bulbasaur", "planta" ),
            new Pokemon(1, "charmander", "fuego" ),
            new Pokemon(1, "squirtle", "agua" ),
            new Pokemon(1, "pikachu", "electrico" )
        );
        //B. Enlazar las columnas con los properties del modelo
        colId.setCellValueFactory(cell-> cell.getValue().idProperty().asObject());
        colNombre.setCellValueFactory(cell-> cell.getValue().nombreProperty());
        colTipo.setCellValueFactory(cell->cell.getValue().tipoProperty());

        //C. Permitir la edicion en vivo de la columna nombre
        tableView.setEditable(true);
        colNombre.setCellFactory(TextFieldTableCell.forTableColumn());
        colNombre.setOnEditCommit(event -> {
            Pokemon p = event.getRowValue();
            p.setNombre(event.getNewValue());
        });

        //D. Asignar todo a la lista reactiva
        tableView.setItems(listaPokemon);

    }


    @FXML
    private void onGuardarClick(){

    }

    @FXML
    private void onEliminarClick(){

    }



}
