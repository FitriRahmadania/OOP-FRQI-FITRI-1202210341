package TPMODUL2_FITRI;

public class Perangkat{
    protected String drive;
    protected Integer ram;
    protected Float processor;
    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi(){
        System.out.println("Perangkat ini memiliki tipe penyimpanan " + drive + " dengan kapasitas ram "+ ram + " GB dan processor dengan kecepatan " + processor + " Ghz. ");
    }
}