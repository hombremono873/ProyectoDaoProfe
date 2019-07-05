package dao;
import modelo.Empleado;

import java.util.List;

public interface EmpleadoDao {
    public void guardarEmpleado(Empleado empleado);
    public Empleado consultarEmpleadoPorIdentificacion(String id);
    public List<Empleado> consultarEmpleados();
}
