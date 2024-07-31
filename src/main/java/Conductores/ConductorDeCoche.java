package Conductores;

public class ConductorDeCoche extends Conductor {
    public ConductorDeCoche(String nombre, String licencia, int vencimiento) {
        super(nombre,licencia, vencimiento);
    }
    @Override
    public void mostrar_informacion(){
        System.out.println(" Informacion del Coductor Coche: Su nombre es "+getNombre() + ", su licencia : " + getLicencia() + " y fecha vencimiento "+ getVencimiento());
    }
}