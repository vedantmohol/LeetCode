class Solution {
    public static boolean exist(char[][] board, String word) {
        for (int i=0 ; i< board.length ; i++)
        {
            for (int j=0 ; j<board[i].length ; j++)
            {
                    if(checkNext(board,i,j,word,0))
                    {
                        return true;
                    }
            }
        }
        return false;
    }
    
    public static boolean checkNext(char board[][],int i,int j,String word,int idx)
    {
        if(idx == word.length())
        {
            return true;
        }

        if(i<0 || i>= board.length || j<0 || j>=board[i].length || board[i][j]!=word.charAt(idx))
        {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';

        boolean found = checkNext(board,i+1,j,word,idx+1) || checkNext(board,i-1,j,word,idx+1) || checkNext(board,i,j+1,word,idx+1) || checkNext(board,i,j-1,word,idx+1);
       board[i][j] = temp;
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.nextLine();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char board[][] = new char[n1][n2];
        for (int i=0 ; i<n1 ; i++)
        {
            String rowInput = sc.next();
            for (int j=0 ; j<n2 ; j++)
            {
                board[i][j] = rowInput.charAt(j);
            }
        }
        boolean result = exist(board,word);
        System.out.println(result);
    }
}