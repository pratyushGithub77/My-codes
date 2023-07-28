public class nightMove {
    public static int n = 6;
    public static int board[][] = new int[n][n];

    public static void main(String[] args) {
        solveKT();

    }

    private static void printsol(int board[][]) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(board[i][j]+ "   |   "); 
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int x,int y,int board[][]) {
        return(x>=0&&x<n&&y>=0&&y<n&&board[x][y] == 0);

    }

    public static boolean solveKT() {
        int xmove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int ymove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        // start
        board[0][0] = 0;
        if (!solveutilKT(0, 0, 1, xmove, ymove, board)) {
            System.out.println("no soln");
            return false;
        } else {
            printsol(board);
        }
        return true;
    }

    public static boolean solveutilKT(int x, int y, int moveIth,int xmove[], int ymove[], int board[][] ) {
        int next_x,  next_y;
        if (moveIth==n*n){
            return true;
        }
        for (int k=0; k<8;k++){
            next_x=x+xmove[k];
            next_y=y+ymove[k];
            if(isSafe(next_x,next_y,board)){
                board[next_x][next_y]=moveIth;
                if(solveutilKT(next_x,next_y,moveIth+1,xmove,ymove,board)){
                    return true;
                }
                else{
                    board[next_x][next_y]=0;

                }
            }
        }
     return false;   
 }
}
