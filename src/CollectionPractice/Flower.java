package CollectionPractice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Flow;

public class Flower {

    // Create the FLower class, that has instance variables species, are and Set as a flowers
    String names;
    int  barcodeNumber;
    HashSet<Flower> flowerList;

    // Create one constructor with two argument constructor
    public Flower(String names, int barcodeNumber){
        this.names=names;
        this.barcodeNumber=barcodeNumber;
        flowerList=new HashSet<>();
    }
    // Create one method to add flowers to Set collection with flowers name and barcodeNumber
    public void addFlower(String name, int barcodeNumber){
        flowerList.add(new Flower(name, barcodeNumber));

        flowerList.add(new Flower("red rose", 23233));
        flowerList.add(new Flower("white rose", 34334));
        flowerList.add(new Flower("blue rose", 33433));
        flowerList.add(new Flower("pink rose", 45545));
    }
    public int findFlower(String name){
        for(Flower fl: flowerList){
            if(fl.names.equalsIgnoreCase(name)){
                return fl.barcodeNumber;
            }
        }
        System.out.println("this flower is not availbale");
        return 0;
    }
        // Create one method to find the flowers from the set.(findFlower) This method will take one parameter

    public String findFlower(int barcodeNumber){
        for(Flower fl: flowerList){
            if(fl.barcodeNumber==barcodeNumber){
                return fl.names;
            }
        }
        System.out.println("this flower is not available");
        return null;
    }
    // Create one method to remove the flower from the set and with flower name
    public void removeFlower( String name){
        ArrayList<Flower> flowersList=new ArrayList<>(flowerList);
        for(int i=0; i<flowersList.size();i++){
            if(flowersList.get(i).names.equalsIgnoreCase(name)){
                flowerList.remove(flowersList.get(i));
            }
        }
        flowerList=new HashSet<>(flowersList);
    }
    // Create one method to print all the flower name from the Set.

    public void printAllFlower(){
        for(Flower fl: flowerList){

            System.out.println(fl.names);
        }
    }

}
