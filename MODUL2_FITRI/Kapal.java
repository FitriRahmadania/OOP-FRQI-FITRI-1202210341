package MODUL2_FITRI;

public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal memiliki kapasitas kursi sejumlah "+ jumlahKursi + " dengan ongkos perjalanan sebesar Rp. "+ biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal berlayar dengan menggunakan " + mesin +" dengan kecepatan yang tidak stabil");

    }
   public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis kapal berlayar dengan menggunakan "+ mesin + " dengan kecepatan " + kecepatan +"Knot");

   }
   public void berlabuh(){
    System.out.println("Transportasi Air berlabuh di pelabuhan");
   }
}
