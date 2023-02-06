public class Main {
    public static void main(String[] args) {
        City osh=new City("Osh",122000,182,"Kyrgyz","Almaz Mambetov",new String[]{"Alai","Anar","Kelechek","Vostok"});
       for (String dis: osh.getDistrick())
        System.out.println(dis);
    }
}