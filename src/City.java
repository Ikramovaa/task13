public class City {
    private String name;
    private long population;
    private double area;
    private String language;
    private  String majorOfCity;
    private String []districk={"Alai","Anar","Kelechek","Vostok"};

    public City(String name,long population,double area,String language,String majorOfCity,String []districk) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.language = language;
        this.majorOfCity = majorOfCity;
        this.districk = districk;
    }

    public City() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double setArea() {
        return area;
    }

    public String setLanguage() {
        return language;
    }

    public void setMajorOfCity(String majorOfCity) {
        this.majorOfCity = majorOfCity;
    }

    public void setDistrick(String[] districk) {
        this.districk = districk;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public double getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    public String getMajorOfCity() {
        return majorOfCity;
    }

    public String[] getDistrick() {
        return districk;
    }
}
