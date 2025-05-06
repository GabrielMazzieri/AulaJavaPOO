package com.senai.aula07_mvc.crud_usuario.model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OperadorDAO {

    private List<Operador> operadores;
    private final String FILE_PATH = "operadores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private List<Operador> carregar(){
        try (fileReader reader = new FileReader(FILE_PATH)){
            type listType = new TypeToken<ArrayList<Operador>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e){
            return new ArrayList<>();
        }
    }
}
