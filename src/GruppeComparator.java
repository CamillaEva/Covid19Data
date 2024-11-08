import java.util.Comparator;

public class GruppeComparator implements Comparator<Covid19Data> {


    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        int result = o1.getAldersgruppe().compareToIgnoreCase(o2.getAldersgruppe());
        return result !=0 ? result : o1.getRegion().compareToIgnoreCase(o2.getRegion());
    }
}