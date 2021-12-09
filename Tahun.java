import java.util.Scanner;

interface KelasTahun
{
    public void pilihanTahun();
}

class Tahun2020 implements KelasTahun
{
    public void pilihanTahun()
    {
        System.out.println("Hari libur di tahun 2020 ada 22 hari");
    }

}

class Tahun2019 implements KelasTahun
{
    public void pilihanTahun()
    {
        System.out.println("Hari libur di tahun 2019 ada 17 hari");
    }

}

class Tahun2018 implements KelasTahun
{
    public void pilihanTahun()
    {
        System.out.println("Hari libur di tahun 2018 ada 24 hari");
    }

}

public class Tahun {
    private KelasTahun kelas;
    
        public void setKelasTahun(KelasTahun kelas) {
            this.kelas = kelas;
        }
    
        public KelasTahun getKelasTahun() {
            return this.kelas;
        }

        public void pilihanTahun() {
            kelas.pilihanTahun();
        }
}