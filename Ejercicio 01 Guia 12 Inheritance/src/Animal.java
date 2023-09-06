import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Animal {

    protected String nombre, alimento, raza;
    protected Double edad;

    public Animal animales() {


    }
}
