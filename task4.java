package homework.homework_java_2;

public class task4 {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println("Validete:" + isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        if (board.length != 9) return false;
        for (int i = 0; i < board.length; i++) {
            if (board[i].length != 9) return false;
        }

        for (int i = 0; i < board.length; i++) {  // y
            for (int j = 0; j < board.length - 1; j++) {  // x
                if (board[i][j] != '.') {
                    for (int j2 = j + 1; j2 < board.length; j2++) {  // validate row
                        if ((board[i][j] == board[i][j2]) && (board[i][j2] != '.')) return false;
                    }
                }
            }
            for (int j = 0; j < board.length - 1; j++) {  // swaped i,j coordinates to validate columns (saved one for_loop)
                if (board[j][i] != '.') {
                    for (int j2 = j + 1; j2 < board.length; j2++) {  // validate row
                        if ((board[j][i] == board[j2][i]) && (board[j2][i] != '.')) return false;
                    }
                }
            }
        }

        for (int i = 0; i < board.length / 3; i++) {  // multipliers to move squares 3x3
            for (int j = 0; j < board.length / 3; j++) {
                for (int i2 = i*3; i2 < i*3 + 3; i2++) {  // first part of pair to compair
                    for (int j2 = j*3; j2 < j*3 + 3; j2++) {
                        if (board[i][j] != '.'){
                            for (int i3 = i*3; i3 < i*3 + 3; i3++) {  // second part of pair to compair
                                for (int j3 = j*3; j3 < j*3 + 3; j3++) {
                                    if((i2 != i3) && 
                                    (j2 != j3) && 
                                    (board[i3][j3] != '.') && 
                                    (board[i2][j2] == board[i3][j3])) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
