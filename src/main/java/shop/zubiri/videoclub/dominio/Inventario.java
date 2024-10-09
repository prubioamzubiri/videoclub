package shop.zubiri.videoclub.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inventario {

    @Id
    private int id;
    private int idPelicula;
    private int cantidad;

    
}
