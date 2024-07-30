import java.util.*;
public class word {
    public static void print(String str){
        System.out.print(str+" ");
        return;
    }
    public static void Word1(int i){
        String str = new String();
        switch (i) {
            case 0:str="zero";
            print(str);
            break;
            case 1:str="one";
            print(str);
            break;
            case 2:str="two";
            print(str);
            break;
            case 3:str="three";
            print(str);
            break;
            case 4:str="four";
            print(str);
            break;
            case 5:str="five";
            print(str);
            break;
            case 6:str="six";
            print(str);
            break;
            case 7:str="seven";
            print(str);
            break;
            case 8:str="eight";
            print(str);
            break;
            case 9:str="nine";
            print(str);
            break;
            default:System.out.println("Enter only integers!");
                break;
        }
        return;
    }
    public static void main(String Args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of digits:");
        int n=sc.nextInt();
        System.out.println("Enter a no.:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Expension in words");
        for (int j : arr) {
            Word1(j);
        }
        return;
        
    }
}
