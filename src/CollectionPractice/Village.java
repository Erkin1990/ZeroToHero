package CollectionPractice;

public class Village {

    private String name, villageID;
    private int population;
    private int totalArea;
    public Village(String name, int population, String villageID, int totalArea){
        // this.name=name;
        // this.population=population;
        // this.totalArea=totalArea;
        // this.villageID=villageID;
    }
    public Village(String name, String villageId, int population, int totalArea) {
    }
    public void villageInfo(){
        System.out.println(getName()+ " "+ getVillageID() + " "+ getPopulation()+ " "+ getTotalArea());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getVillageID(){
        return villageID;
    }
    public void setVillageID(String villageID){
        this.villageID=villageID;
    }
    public int getPopulation(){
        return  population;
    }
    public void setPopulation(int population){
        this.population=population;
    }
    public int getTotalArea(){
        return totalArea;
    }
    public void setTotalArea(int totalArea){
        this.totalArea=totalArea;
    }
}





