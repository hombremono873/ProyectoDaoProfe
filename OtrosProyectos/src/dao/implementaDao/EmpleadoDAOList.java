package dao.implementaDao;

import dao.EmpleadoDao;
import modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAOList  implements EmpleadoDao {
    public List<Empleado> empleadosBD;
    public EmpleadoDAOList(){
        empleadosBD = new ArrayList<>();
    }
    @Override
    public void guardarEmpleado(Empleado empleado) {
           empleadosBD.add(empleado);
    }

    @Override
    public Empleado consultarEmpleadoPorIdentificacion(String id) {
          for(Empleado e:empleadosBD){
              if(id.equals(e.getIdentificacion())){
                  return e;
              }
          }
          return null;
    }

    @Override
    public List<Empleado> consultarEmpleados() {
        return empleadosBD;
    }
}
