package shop.zubiri.videoclub.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inventario {

    @Id
    @GeneratedValue
    private int id;
    private int idPelicula;
    private int cantidad;

    
}
