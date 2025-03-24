/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;
import java.util.*;
/**
 *
 * @author gerob
 */
public class Administrador {
    
    
    
    private final ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    
    private final ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
    
    
    

       
    public void agregarEmpleado (Empleado empleado){
        listaEmpleados.add(empleado);
                
    }
    
    public void agregarDepartamento (Departamento departamento)  {
        
        listaDepartamentos.add(departamento);
  
    }
    
    
    
    
    public Empleado mostrarEmpleados (long id){
        

        for (int i = 0 ; i<this.listaEmpleados.size(); i++){
            Empleado emp=this.listaEmpleados.get(i);
            
            if (emp.getId()==id) {
                return emp; 
            }
            
        }
        return null ;
       
    }
    
    /// Modificar Empleado

    public Empleado modificarEmpleado (long id, Empleado empleado) {
        int index=this.buscarIndice(id);
        
        if (index>=0) {
            return this.listaEmpleados.set(index, empleado);
        }
        else {
            return null; 
        }
        
    }
    
    
    /// Eliminar Empleado
    
    public Empleado eliminarEmpleado (long id, Empleado empleado){
        int index=this.buscarIndice(id);
        if (index>=0) {
            return this.listaEmpleados.remove(index);
            
        }else {
            return null;
        }
        
        
    }
    
    public String mostrarEmpleado (){
        String empleados="";
        for (int i = 0; i < this.listaEmpleados.size(); i++) {
            Empleado emp =this.listaEmpleados.get(i);
            empleados+=emp.toString()+"\n";
            
        }
        
        return empleados;
    }
    
    
    


    
    private int buscarIndice (long id){
        for (int i = 0; i < this.listaEmpleados.size(); i++) {
            Empleado emp=this.listaEmpleados.get(i);
            
            if (emp.getId()==id) {
                return i;
            }
        }
        return -1;
        
        
    }
    
   
    
    

        
    public void mostrarDepartamentos (){
        

        if (listaDepartamentos.isEmpty()) {
            
            System.out.println("No hay departamentos registrados");


        }
        
        System.out.println("\n Lista de departamentos: ");
        
        for (Departamento departamento : listaDepartamentos) {
            departamento.mostrarInfo();
            
        }


        }    
        
    
    

    
  

            
        
        
    
    
    
}
