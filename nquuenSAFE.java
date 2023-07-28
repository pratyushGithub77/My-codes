public class nquuenSAFE {

    public static int count=0;
    public static void main(String[] args) {
        char [][]board=new char[4][4];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0); 
    }
   public static void nQueens(char board[][],int row) {
    
    if(row==board.length){
        count++;
        printBoard(board,count);
        return;
    }
    for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)==true){board[row][j]='Q';
        nQueens(board,row+1);
        board[row][j]='x';
     }
    }
   }

   private static boolean isSafe(char board[][],int row, int col) {
    //upwards
    for(int i=row-1; i>=0; i--){
        if(board[i][col]=='Q'){
            return false;
        }   
    }
    //diagonal left
    for(int i=row-1, j=col-1;i>=0&& j>=0; i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }   
    }
        //diagonal right
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }     
        }
    return true;
   }

   public static void printBoard(char board[][], int count) {
    System.out.println(count);
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
           System.out.print( board[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("------CB-----");
   }

}
