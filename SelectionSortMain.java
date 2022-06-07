import Model.SelectionSort;

public class SelectionSortMain {

    public static void main(String[] args) {
        String[] namaAcak = { "shinta", "jevri", "olif", "surya", "dani", "winda" };

        System.out.println("Data asli :");

        for (int i = 0; i < namaAcak.length; i++) {
            System.out.print(namaAcak[i] + ",");
        }
        System.out.println("");

        SelectionSort seleksi = new SelectionSort();
        seleksi.setData(namaAcak);
        seleksi.pengurutanData();
        seleksi.cetakData();
    }
}