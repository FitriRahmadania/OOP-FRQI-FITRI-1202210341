package MODUL2_FITRI;

public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan memiliki kapasitas kursi sejumlah "+ jumlahKursi + " dengan ongkos perjalanan sebesar Rp. "+ biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan berlayar dengan " + layar +" layar");

    }
   public void berlabuh(){
        System.out.println("Transportasi Air berlabuh di pelabuhan tanpa  menggunakan jangkar");
   }
   public void berlabuh(int jangkar){
    System.out.println("Transportasi Air berlabuh di pelabuhan dengan " + jangkar + " jangkar");

   }
}
