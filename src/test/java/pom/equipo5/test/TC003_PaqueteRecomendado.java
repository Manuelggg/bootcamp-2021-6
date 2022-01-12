package pom.equipo5.test;

import org.junit.Test;
import pom.equipo5.base.TestBaseE5;
import pom.equipo5.pages.PagePaquetes;
import pom.equipo5.pages.VFHomePageE5;

public class TC003_PaqueteRecomendado extends TestBaseE5 {

    protected PagePaquetes paginapaquetes;
    protected VFHomePageE5 paginahome;

    @Test
    public void Test(){
        paginahome = new VFHomePageE5(driver);
        paginahome.abrirHome();
        paginapaquetes = new PagePaquetes(driver);
        paginapaquetes.TipoPaquetes();
        paginapaquetes.IngresoOrigen2();
        paginapaquetes.IngresaDestino2();
        paginapaquetes.FechaIda2();
        paginapaquetes.SiguienteMes2();
        paginapaquetes.IngresarFechaIda2();
        paginapaquetes.IngresarFechaVuelta2();
        paginapaquetes.AplicarFecha2();
        paginapaquetes.CasillaHabitacioneAdulto();
        paginapaquetes.CasillaHabitacionMenores();
        paginapaquetes.EdadMenores();
        paginapaquetes.AplicarEdad();
        paginapaquetes.ClickBuscar2();
        paginapaquetes.FiltrarAerolinea();
        paginapaquetes.FiltrarEquipaje();
        paginapaquetes.FiltroOrdenar();
        paginapaquetes.ObtenerText();


    }

}
