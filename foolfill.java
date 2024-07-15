public class foolfill {
        static int[][] image ={{1,1,1},{1,1,0},{1,0,1}};
        static int sr = 1;
        static int sc = 1;
        static int color = 2;
    public static void helper(int [][] image,int sr,int sc,int color,boolean vis[][]){//O(m*n)
        if(sr < 0 || sc< 0 || sr>= image.length || sc>= image[0].length || vis[sr][sc] || image[sr][sc] == 0){
            return;
        }
        
        if(image[sr][sc] == 1){
            vis[sr][sc] = true; 
            image[sr][sc] = color;
        }
        //left
        helper(image,sr,sc-1,color,vis);
        //right
        helper(image,sr,sc+1,color,vis);
        //up
        helper(image,sr-1,sc,color,vis);
        //down
        helper(image,sr+1,sc,color,vis);
        return;
        
    }
    public static void floodFill(int[][] image,int sr,int sc,int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis);
        return;
    }
    public static void main(String[] args) {
        floodFill(image,sr,sc,color);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+" ");
        }
        System.out.println();
        }
    }
}
