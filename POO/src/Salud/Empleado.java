package Salud;

public class Empleado extends Persona {
    private String Cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String Departamento;

    public Empleado(String tipoDoc, int documento, String nombre, int edad, String sexo,String Cargo,int valorHora,int horasTrabajadas,String Departamento){
    super (tipoDoc,documento,nombre,edad,sexo);
    this.Cargo=Cargo;
    this.valorHora=valorHora;
    this.horasTrabajadas=horasTrabajadas;
    this.Departamento=Departamento;
    }
    
    public String getCargo() {
        return Cargo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String getDepartamento() {
        return Departamento;
    }
    

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public void mostrarEmpleado(){
        System.out.println("tipo documento: "+getTipoDoc()+"\ndocumento: "+getDocumento()+"\nnombre: "+getNombre()+"\ncargo: "+Cargo+"\nhoras trabajadas: "+horasTrabajadas+"\nvalor por hora: "+valorHora+"\ndepartamento: "+Departamento);
    }

    public void calcularHonorarios() {
        double ValorHon;
        double reteica=0.966;
        ValorHon=valorHora+horasTrabajadas/reteica;
        System.out.println("el valor de los honorarios es de: "+ValorHon);

    }
}
