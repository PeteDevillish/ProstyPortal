public class Main {

    public static void main(String[] args) {


        int iloscRuchow = 0;

        PomocnikGry pomocnik = new PomocnikGry();

        ProstyPortal testy = new ProstyPortal();


        int random = (int) Math.random() * 5;

        int[] polozenie = {random, random + 1, random + 2};

        testy.setPolaPolozenia(polozenie);

        boolean czyIstnieje = true;

        while (czyIstnieje == true) {
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbę");

            String wynik = testy.sprawdz(pole);


            iloscRuchow++;

            if (wynik.equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println(iloscRuchow + " ruchów");
            }
        }
    }
}


