public class YearAdapter implements Year {
    Year y;

    public YearAdapter(Year y) {
        this.y = y ;
    }

    @Override
    public String getTahun() {
        String getFirstFile = y.getTahun();
        return getFirstFile+" 2 tahun";
    }
}
