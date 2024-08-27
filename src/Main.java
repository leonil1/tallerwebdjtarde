import model.Persona;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Persona> datos = new ArrayList<>();
        datos.add(new Persona(1l, "Leonil","chipana", "huamani", "9854785"));
        datos.add(new Persona(2l, "jesus","chipana", "huamani", "9854785"));
        datos.add(new Persona(3l, "karla","chipana", "huamani", "9854785"));
        datos.add(new Persona(4l, "Maria","chipana", "huamani", "9854785"));

        for (Persona dato : datos){
            System.out.println(dato.getId() + dato.getName());
        }
    }
}