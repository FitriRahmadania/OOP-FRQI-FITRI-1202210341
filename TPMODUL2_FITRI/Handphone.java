package TPMODUL2_FITRI;

public class Handphone extends Perangkat {
    protected Boolean fingerprint;
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    @Override
    public void informasi(){
        System.out.println("Handphone ini memiliki tipe penyimpanan " + drive + " dengan kapasitas ram "+ ram + " GB dan processor dengan kecepatan " + processor + " Ghz. ");
    }
    public void telpon(int nohp){
        System.out.println("Handphone sedang melakukan panggilan dengan 08118881188");
    }
    public void kirimsms(int nohp){
        System.out.println("Handphone sedang mengirim pesan kepada 08119991199");
    }
    public void kirimsms2(int nohp1, int nohp2){
        System.out.println("Handphone sedang mengirimkan pesan kepada 08119991199 dan 08118881188");
    }
}
