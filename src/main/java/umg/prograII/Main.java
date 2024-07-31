package umg.prograII;


import Conductores.Conductor;
import Conductores.ConductorDeCoche;
import Conductores.ConductorDeMoto;
import biblioteca.Vehiculo;
import biblioteca.Coche;
import biblioteca.Moto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conductor ConCarro = new ConductorDeCoche( " Justurrufino Barrios ", " McLovin ", 2039);
        ConCarro.mostrar_informacion();

        Conductor ConMoto = new ConductorDeMoto( " Jean Claude Van Dam ", " Chayane ",2046);
        ConMoto.mostrar_informacion();

        Vehiculo Carro = new Coche("Toyota", " Hilux ", 2030, 10 );
        Carro.mostrardetalles();

        Vehiculo Moto = new Moto("Suzuki", "Gixxer sf", 2032, false);


    }

}