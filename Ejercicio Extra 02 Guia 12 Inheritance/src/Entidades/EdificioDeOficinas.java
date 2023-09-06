package Entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EdificioDeOficinas extends Edificio {

    protected Integer numeroOficinas, cantPersonasPorOficina, numeroDePisos;
}
