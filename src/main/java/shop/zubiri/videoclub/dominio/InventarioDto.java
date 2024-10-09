package shop.zubiri.videoclub.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventarioDto {

    private String id;
    private String nombrePelicula;
    private int cantidad;
    
}
