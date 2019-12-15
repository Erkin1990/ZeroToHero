package CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class City {

    private String name,capital;
    static Set<Village> villageSet=new HashSet<>();
    public static Set<Village> addVillage(String name, int population, String villageId, int totalArea){
        Village village=new Village ( name, villageId, population, totalArea );
        village.setName(name);
        village.setVillageID(villageId);
        village.setPopulation(population);
        village.setTotalArea(totalArea);
        villageSet.add(village);
        return villageSet;
    }
    static public String findName(String name){
        for(Village v:villageSet){
            if(v.getName().equalsIgnoreCase(name)){
                String info=""+v.getName()+" "+v.getVillageID()+" "+v.getPopulation()+" "+v.getTotalArea();
                return info;
            }
        }
        return null;
    }
    public static String findId(String villageId){
        for(Village v:villageSet){
            if(v.getVillageID().equalsIgnoreCase(villageId)){
                String info=""+v.getName()+" "+v.getVillageID()+" "+v.getPopulation()+" "+v.getTotalArea();
                return info;
            }
        }
        return null;
    }
    static public boolean remove(String villageId){
        for(Village v:villageSet){
            if(v.getVillageID().equalsIgnoreCase(villageId)){
                villageSet.remove(v);
                return true;
            }
        }
        return false;
    }
    static public void printAll(){
        for(Village v:villageSet){
            System.out.println(v.getName() +" "+ v.getVillageID() +" "+ v.getPopulation() +" "+ v.getTotalArea());        }
    }
    static public Long sum(){
        Long sum= 0L;
        for (Village v:villageSet){
            sum=sum+v.getPopulation();
        }
        return sum;
    }
    public static void main(String[] args) {
        Set village1=addVillage("Mountains",5,"1A567B4",900);
        Set village2=addVillage("KakDela",9,"2B176A3",600);
        printAll();
        System.out.println(findName("Mountains"));
        System.out.println(findId("2B176A3"));
        System.out.println(sum());
    }
}


