package Servicios;

import Entidades.Edificio;

abstract class EdificioService {

    abstract Double calcularSuperficie(Edificio edi);

    abstract Double calcularVolumen(Edificio edi);
}
