public class NQUEENSwithoutAttack {
    public static void main(String[] args) {
        char [][]board=new char[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0); 
    }
   public static void nQueens(char board[][],int row) {
    if(row==board.length){
        printBoard(board);
        return;
    }
    for(int j=0;j<board.length;j++){
        board[row][j]='Q';
        nQueens(board,row+1);
        board[row][j]='x';
    }
   }

   public static void printBoard(char board[][]) {
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
           System.out.print( board[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("------CB-----");
   }

}
