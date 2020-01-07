import java.text.DecimalFormat;

public class SoalNo3{
  public static void main(String[] args) {
    DecimalFormat dec = new DecimalFormat();

    double gajiPokok = 4600897;
    int anak = 4;
    double persen= gajiPokok/100;

    double tunjanganSuami = persen*10;
    double tunjanganAnak = anak * (persen*2);
    double bruto = gajiPokok+tunjanganSuami+tunjanganAnak;
    double iuranPensiun = persen*4;
    double netto = bruto - iuranPensiun;

    System.out.println();
    System.out.println("PENGHASILAN BRUTO PER BULAN = Rp. " + dec.format(bruto));
    System.out.println("PENGHASILAN NETTO PER BULAN = Rp. " + dec.format(netto));
    System.out.println();

  }
}
