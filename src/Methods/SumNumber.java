package Methods;

public class SumNumber {

    public int sum(int [] arr){
        int result=0;
        for(int i=0; i<arr.length;i++){
            if (arr[i]>3 && arr[i]<7){
                result+=arr[i];
        }
    }
        return result;
}

    public static void main(String[] args) {

        SumNumber nm=new SumNumber();

        int [] nums={1,2,4,6,7,8,4,3,6,4,10,11};

        System.out.println(nm.sum(nums));
    }


    }