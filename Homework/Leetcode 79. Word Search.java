class Solution {
    boolean check(int i, int j, String word, int idx, char[][] board){
        if(idx == word.length()) return true;
        if(i-1 != -1 && board[i-1][j] == word.charAt(idx)){
            board[i-1][j] = '.';
            if(check(i-1, j, word, idx+1, board)) return true;
            board[i-1][j] = word.charAt(idx);
        }
        if(j-1 != -1 && board[i][j-1] == word.charAt(idx)){
            board[i][j-1] = '.';
            if(check(i, j-1, word, idx+1, board)) return true;
            board[i][j-1] = word.charAt(idx);
        }
        if(i+1 != board.length && board[i+1][j] == word.charAt(idx)){
            board[i+1][j] = '.';
            if(check(i+1, j, word, idx+1, board)) return true;
            board[i+1][j] = word.charAt(idx);
        }
        if(j+1 != board[i].length && board[i][j+1] == word.charAt(idx)){
            board[i][j+1] = '.';
            if(check(i, j+1, word, idx+1, board)) return true;
            board[i][j+1] = word.charAt(idx);
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean flag = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    board[i][j] = '.';
                    flag = check(i, j, word, 1, board);
                    board[i][j] = word.charAt(0);
                    if(flag == true) return true;
                }
            }
        }
        return false;
    }
}