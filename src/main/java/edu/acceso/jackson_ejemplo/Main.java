package edu.acceso.jackson_ejemplo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        Path ruta = Path.of(System.getProperty("user.dir"), "src", "main", "resources", "grupos.json");
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<ArrayList<Grupo>> GrupoLista =  new TypeReference<ArrayList<Grupo>>(){};

        ArrayList<Grupo> grupos = null;

        try (
            InputStream st = Files.newInputStream(ruta);
            InputStreamReader sr = new InputStreamReader(st);
        ) {
            grupos = mapper.readValue(sr, GrupoLista);
        }
        catch(IOException err) {
            err.printStackTrace();
        }

        System.out.println(grupos);
        System.out.println(grupos.get(0).getMiembros());
    }
}