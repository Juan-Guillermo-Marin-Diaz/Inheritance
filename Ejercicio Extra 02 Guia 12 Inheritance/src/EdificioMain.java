import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Servicios.EdificioDeOficinasService;

import java.util.ArrayList;

public class EdificioMain {

    public static void main(String[] args) {

        EdificioDeOficinasService eos = new EdificioDeOficinasService();


        ArrayList<Edificio> edificios = new ArrayList<>();

        edificios.add(eos.crearEdificio());
        edificios.add(eos.crearEdificio());

        for (Edificio edif : edificios) {

            eos.datosEdificio();

        }
    }
}
