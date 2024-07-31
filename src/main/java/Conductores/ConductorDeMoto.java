package Conductores;

public class ConductorDeMoto extends Conductor {
    public ConductorDeMoto(String nombre, String licencia, int vencimiento) {
        super(nombre, licencia, vencimiento);
    }
    @Override
    public void mostrar_informacion(){
        System.out.println(" Informacion del Coductor Moto: Su nombre es "+ getNombre() + ", su licencia: " + getLicencia() + " y fecha venicimiento " + getVencimiento());
    }
}
