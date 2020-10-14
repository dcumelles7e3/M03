package m3.uf5.iteradors;

import java.util.Iterator;

public class ProvaRadio {

    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.afegirEmissora(new Emissora(95.6, "Rock","ROCK FM"));
        radio.afegirEmissora(new Emissora(105.7, "Electro","Maximeta"));
        radio.afegirEmissora(new Emissora(82.9, "Classica","Bethoven FTW"));
        radio.afegirEmissora(new Emissora(115.1, "Flamenco","GitanOLE"));
        radio.afegirEmissora(new Emissora(100.5, "Classica","CristalRoto"));

        for(Emissora e: radio) {
            System.out.println(e);
        }


//        Iterator<Emissora> it = radio.iterator();
//        while(it.hasnext()){
//            System.out.println(it.next());
//        }



    }
}
