package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] == 'X') {
                    result = true;
                    break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
                rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                if (monoHorizontal(board, 5)) {
                    if (monoVertical(board, 5)) {
                        result = true;
                        break;
                    }
                  }
                }
            }
        }
        return result;
    }
}
