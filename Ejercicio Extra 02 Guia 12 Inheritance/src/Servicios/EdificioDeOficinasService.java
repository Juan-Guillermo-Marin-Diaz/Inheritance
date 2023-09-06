package Servicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;

public class EdificioDeOficinasService extends EdificioService {

    EdificioDeOficinas eO; // = new EdificioDeOficinas();

    public Edificio crearEdificio () {

        eO = new EdificioDeOficinas();

       //double alto = 30;
        //double ancho = 20;
        //double largo = 20;

        eO.setAlto(30.0);
        eO.setAncho(30.0);
        eO.setLargo(30.0);

        eO.setNumeroDePisos(5);
        eO.setNumeroOficinas(5);
        eO.setCantPersonasPorOficina(5);

        return eO;

    }


    @Override
    Double calcularSuperficie(Edificio edi) {

        double superficie = (edi.getLargo() * edi.getAncho());

        return superficie;
    }

    @Override
    Double calcularVolumen(Edificio edi) {

        double volumen = (edi.getAlto() * edi.getAncho() * edi.getLargo());

        return volumen;
    }

    public void datosEdificio(EdificioDeOficinas edi) {

        System.out.println(calcularSuperficie(edi));
        System.out.println(calcularVolumen(edi));
        System.out.println(cantPersonasEdificio(edi));
        System.out.println(cantPersonasPorPiso(edi));

    }

    public int cantPersonasPorPiso(EdificioDeOficinas edi) {

        int cantPerPorPiso = (edi.getNumeroOficinas() * edi.getCantPersonasPorOficina());

        return cantPerPorPiso;
    }

    public int cantPersonasEdificio(EdificioDeOficinas edi) {

        int cantPerEdif = (edi.getNumeroDePisos() * cantPersonasPorPiso(edi));

        return cantPerEdif;
    }
}
