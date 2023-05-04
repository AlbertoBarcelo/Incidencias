import java.util.ArrayList;

public class Main {

    public void Programa_principal(){

        ArrayList<Incidencias> incidencias = new ArrayList<>();
        incidencias.add(new Incidencias("Pendiente", 105, "No tiene acceso a internet"));
        incidencias.add(new Incidencias("Resuelto", 14, "No arranca", "El equipo no estaba enchufado"));
        incidencias.add(new Incidencias("Resuelto", 5, "La pantalla se ve rosa", "Cambio del cable VGA"));
        incidencias.add(new Incidencias("Pendiente", 237, "Hace un ruido extraño"));
        incidencias.add(new Incidencias("Pendiente", 111, "Se queda colgado al abrir 3 ventanas"));



        int contadorPendientes=0;
        for (Incidencias incidencia : incidencias){
            System.out.println("Puesto:"+ incidencia.getPuesto()+ "-Incidencia" +incidencia.getCodigo()+  "-"+ incidencia.getDescripcion()+ "-"+incidencia.getEstado());
            if (incidencia.getEstado().equals("Pendiente")){
                contadorPendientes++;
            }

        }
        System.out.println("Incidencias pendientes: " + contadorPendientes);
    }



    public static void main(String[] args) {
        Main start = new Main();
        start.Programa_principal();
    }
}

