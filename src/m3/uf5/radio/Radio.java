package m3.uf5.radio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Radio implements Iterable<Emissora> {
    // freqüència, l’especialitat i el nom de l’emissora.
    private List<Emissora> emissores = new ArrayList<Emissora>();

    public void afegirEmissora(Emissora e){
        emissores.add(e);
    }

    @Override
    public Iterator iterator() {
        return emissores.iterator();
    }
}
