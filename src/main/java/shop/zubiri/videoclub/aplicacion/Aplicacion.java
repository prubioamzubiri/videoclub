package shop.zubiri.videoclub.aplicacion;



import lombok.AllArgsConstructor;
import shop.zubiri.videoclub.persistencia.IPersistencia;

@AllArgsConstructor
public class Aplicacion<T> implements IAplicacion<T> {

    IPersistencia<T> persistencia;

    @Override
    public boolean guardar(T t) {
        
        try{
            return persistencia.guardar(t);
        }
        catch(Exception e){
            return false;
        }
        
    }


    @Override
    public T buscar(Object id) {
        
        return persistencia.obtener(id);
    }

    @Override
    public T buscarPorNombre(String name) {
        return null;
    }

    @Override
    public boolean eliminar(Object id) {
        
        T t = persistencia.obtener(id);

        if(t == null)
        {
            return false;
        }
        else{
            return persistencia.eliminar(t);
        }
    }

    @Override
    public java.util.List<T> obtenerTodos() {
        return null;
    }

    @Override
    public T actualizar(T t) {
        
        if(persistencia.actualizar(t))
        {
            return t;
        }
        return null;
    }
    
}
