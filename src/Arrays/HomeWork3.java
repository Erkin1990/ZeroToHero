package Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        int[] nums1={1, 2, 3, 4};

        // length vs length
        boolean result=false;
        label: for(int i=0; i<nums1.length; i++){
            if(nums1[i]==1){
                for(int i2=0;i2<nums1.length;i2++){
                    if(nums1[i2]==2){
                        result=true;
                        break label;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
