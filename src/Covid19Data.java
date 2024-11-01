public class Covid19Data {

    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;


    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "Covid 19 data.{" +
                "region: " + region +
                ", aldersgruppe: '" + aldersgruppe + '\'' +
                ", bekræftede tilfælde: '" + bekræftedeTilfælde + '\'' +
                ", døde: " + døde +
                ", indlagte på intensiv afdeling: '" + indlagtePåIntensiv + '\'' +
                ", indlagte: '" + indlagte + '\'' +
                ", dato: '" + dato + '\'' +
                '}';
    }
}





