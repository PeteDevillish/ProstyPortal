public class ProstyPortal {

    int [] polaPolozenia;
    int iloscTrafien =0;

    void setPolaPolozenia(int [] ppol){
        polaPolozenia = ppol;
    }

    String sprawdz(String stringPole){
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudlo";

        for(int pole : polaPolozenia){
            if (strzal == pole) {
                wynik = "trafiony";
                iloscTrafien++;
                polaPolozenia[strzal] = -1;
                break;
            }
        }

        if(iloscTrafien == polaPolozenia.length){
            wynik = "zatopiony";
        }

        System.out.println(wynik);

        return wynik;
    }





}
