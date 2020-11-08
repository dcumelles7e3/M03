package m3.uf5.simexamen.EX1;

public class ProvaPoligon {

    /**
     * @author Dídac Cumelles
     */
    public static void main(String[] args) {
        ElMeuPoligon poligon = new ElMeuPoligon();
        poligon.afegirPunt(new Punt2D(1,3));
        poligon.afegirPunt(new Punt2D(2,5));
        poligon.afegirPunt(new Punt2D(2,4));
        poligon.afegirPunt(new Punt2D(4,1));
        //S'ordenen sols per Y gràcies al comparator
        poligon.printar();
        poligon.printarMesGran();
    }
}
