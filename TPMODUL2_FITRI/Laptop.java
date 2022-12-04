package TPMODUL2_FITRI;

public class Laptop extends Perangkat {
    protected Boolean webcam;
    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @Override
    public void informasi(){
        System.out.println("Laptop ini memiliki tipe penyimpanan " + drive + " dengan kapasitas ram "+ ram + " GB dan processor dengan kecepatan " + processor + " Ghz. ");
    }

    public void bukagamenya(String gamenyaapa){
        System.out.println("Laptop membuka aplikasi game Final Fantasy");
    }
    public void ngirimemail(String emailnyaapa){
        System.out.println("Laptop mengirim email kepada inumakitoge@jjk.com");
    }
    public void ngirimemail2(String emailsatu, String emaildua){
        System.out.println("Laptop menirim email kepada inumakitoge@jjk.com dan megumifushiguro@jjk.com");
    }
}
