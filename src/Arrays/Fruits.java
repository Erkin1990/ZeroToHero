package Arrays;

public class Fruits {

    public static void main(String[] args) {

        String[] fruit1={"banana", "apple", "orange"};
        String[] fruit2={"carrot", "tomato", "apple", "potato"};

        for(int i=0; i<fruit1.length; i++){
            boolean found=false;
            for(int i2=0; i2<fruit2.length; i2++){
                if(fruit1[i] == fruit2[i2]){
                    System.out.println(fruit1[i]+" is in there");
                    found=true;
                }
            }
            if(found==false){
                System.out.println(fruit1[i]+" is not on there");
            }
        }
    }
}
