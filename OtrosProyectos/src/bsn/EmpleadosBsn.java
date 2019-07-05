package bsn;

import dao.implementaDao.EmpleadoDAOList;
import modelo.Empleado;
/*Esta clase contiene logica del negocio y conexion con el dao
*Con esta clase se interactua con la vista
* Para este caso se trabaja con consola
 */
public class EmpleadosBsn {
    private EmpleadoDAOList empleadoDAO;
    public EmpleadosBsn(){
        empleadoDAO = new EmpleadoDAOList();
    }

    public void guardarEmpleado(Empleado empleado){
        //todo validar reglas de negocio
        //todo aplicar lógica de casos de uso
        System.out.println("Estoy en la logica del negocio bsn voiy a guardar los datos");
        empleadoDAO.guardarEmpleado(empleado);
    }
}
