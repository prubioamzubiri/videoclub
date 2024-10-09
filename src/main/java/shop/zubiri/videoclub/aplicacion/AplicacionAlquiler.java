package shop.zubiri.videoclub.aplicacion;

import shop.zubiri.videoclub.dominio.Alquiler;
import shop.zubiri.videoclub.persistencia.IPersistencia;


public class AplicacionAlquiler extends Aplicacion<Alquiler>{

    public AplicacionAlquiler(IPersistencia<Alquiler> persistencia) {
        super(persistencia);
    }
    
}
