public class Q1ratmaze {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        System.out.println(gridWays(0, 0, n, m));
    }

    public static int gridWays(int i,int j,int n , int m) {
        if(i==n-1 && j==m-1){
            return 1;
        }
        //boundry base condn
        else if(i>=n-1 || j>=m|| i<0 ||j<0){
            return 0;
        }

        int up= gridWays(i-1,j,n,m);
        int right= gridWays(i,j+1,n,m);
        int left= gridWays(i,j-1,n,m);
        int down= gridWays(i+1,j,n,m);

        return up+down+right+left;
    }

}
