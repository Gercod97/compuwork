/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;



/**
 *
 * @author gerob
 */
public class Departamento {
    
    private String nombreDepartamento;
    private String [] listaEmpleados;
    
    public Departamento (String nombreDepartamento, String [] listaEmpleados){
        this.nombreDepartamento=nombreDepartamento;
        this.listaEmpleados=listaEmpleados;
    }        
    
    public Departamento (String nombreDepartamento) {
        this.nombreDepartamento=nombreDepartamento;
        
        
    }
    
    public Departamento (){
        
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(String[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    public void mostrarInfo() {
        System.out.println("\nNombre: " + nombreDepartamento );
    }
    
    
    
}