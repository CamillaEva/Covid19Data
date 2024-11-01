import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileHandler fileHandler = new FileHandler();

        ArrayList<Covid19Data> covid19Data = fileHandler.loadAllData();


        for (Covid19Data covid19Data2 : covid19Data){
            System.out.println(covid19Data2);
        }
        }
    }
