package Conductores;

public class Conductor {
    private String nombre;
    private String licencia;
    private int vencimiento;
    public Conductor(String nombre, String licencia, int vencimiento){
        this.nombre = nombre;
        this.licencia = licencia;
        this.vencimiento = vencimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getLicencia() {
        return licencia;
    }
    public int getVencimiento() {
        return vencimiento;
    }
    public void mostrar_informacion(){
        System.out.println(nombre + " esta usando su vehiculo");
    }

}
