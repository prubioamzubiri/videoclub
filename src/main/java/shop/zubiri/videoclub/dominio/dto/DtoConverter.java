package shop.zubiri.videoclub.dominio.dto;

import shop.zubiri.videoclub.dominio.Inventario;
import shop.zubiri.videoclub.dominio.InventarioDto;

public class DtoConverter {

    public static InventarioDto convertirInventario(Inventario inventario, String nombrePelicula) {
        return InventarioDto.builder()
                .id(String.valueOf(inventario.getId()))
                .nombrePelicula("Pelicula " + nombrePelicula)
                .cantidad(inventario.getCantidad())
                .build();
    }
    
}
