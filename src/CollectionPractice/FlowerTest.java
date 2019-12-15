package CollectionPractice;

public class FlowerTest {

    public static void main(String[] args) {

        Flower rose=new Flower("ROSE", 111);

        rose.addFlower("Red Rose", 124453);
        rose.addFlower("Blue Rose", 1232323);
        rose.addFlower("Yellow Rose", 1223212);

        int redFlowerBarcode=rose.findFlower("Red Rose");
        System.out.println(redFlowerBarcode);

        String flowerName=rose.findFlower(125553);
        System.out.println(flowerName);
        System.out.println("This is the list of flowers");
        rose.printAllFlower();

        rose.removeFlower("Blue rose");
        System.out.println("This is afte r removing the flower");
        rose.printAllFlower();

    }
}
