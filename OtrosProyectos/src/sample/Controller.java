package sample;

import bsn.EmpleadosBsn;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import modelo.Empleado;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import bsn.EmpleadosBsn;
public class Controller implements Initializable{
    @FXML
    private JFXTextField txtIdentificacion;
    @FXML
    private JFXTextField txtNombres;
    @FXML
    private JFXTextField txtApellidos;
    @FXML
    private JFXTextField txtCargo;
    @FXML   JFXButton  btnSalvarDatos;
    private EmpleadosBsn empleadoBsn;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
         empleadoBsn = new EmpleadosBsn();
    }
    public void salvarInfo(ActionEvent event){
        String identificacion = txtIdentificacion.getText();
        String nombres = txtNombres.getText().toString();
        String apellidos = txtApellidos.getText();
        String cargo = txtCargo.getText();
        //Se instancia el empleado
        Empleado empleado= new Empleado(identificacion, nombres, apellidos, cargo);
        empleadoBsn.guardarEmpleado(empleado);
        System.out.println("Lo encontre "+empleado.getNombres());
    }
}
