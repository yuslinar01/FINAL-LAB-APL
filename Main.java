import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("Select what you want to know :");
		System.out.println("1. Year\n2. Year Adapter");
        System.out.println("Your Choose :");
		int option = Main.in.nextInt();

		switch(option) {
			case 1 :
				new Main().year();
				break;

			case 2:
				new Main().YearAdapter(); 
				break;
		}
	}

    void year(){
        // Penggunaan Strategy pattern
        System.out.println("Select the yea : tahun2020 atau tahun2019 atau tahun2018");
        scanner = new Scanner(System.in);
        String pilih = scanner.nextLine();

        Tahun tipe = new Tahun();
        System.out.println("Selected Type : " + pilih);

        if("tahun2020".equalsIgnoreCase(pilih))
        {
            tipe.setKelasTahun(new Tahun2020());
        }
        else if("tahun2019".equalsIgnoreCase(pilih))
        {
            tipe.setKelasTahun(new Tahun2019());
        }
        else if("tahun2018".equalsIgnoreCase(pilih))
        {
            tipe.setKelasTahun(new Tahun2018());
        }

        tipe.pilihanTahun();
    }

    void YearAdapter(){
        //penggunaan Adapter Pattern
        Year adapter = new Abad();
        YearAdapter yeartoabad = new YearAdapter(adapter);
        System.out.println( yeartoabad.getTahun());

        Year adapter1 = new Triwulan();
        YearAdapter yeartotriwulan = new YearAdapter(adapter1);
        System.out.println( yeartotriwulan.getTahun());
    }
}