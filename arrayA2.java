public class arrayA2 {
    public static void Find(int numbers[],int key){
        int result=-1;
        for(int i=0;i<numbers.length;i++){
            if(key==numbers[i]){
                result=i;
                break;
            }
        }
        System.out.println("result:" +result);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        int key=3;
        Find(numbers,key);
    }
}
