import java.util.*;
public class disjointset {
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];
    public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
        }
    }
    public static int find(int x){//O(4K) or O(4) or O(1)
        if(x == par[x]){
            return x;
        }
        return find(par[x]);
    }
    public static void union(int a,int b){//O(4K) where k is const or O(4) mathamatically or O(1) code
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA] = parB;
        }else {
            par[parB] = parA;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
    }
}