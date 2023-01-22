class Solution {
    public List<String> findWords(char[][] board, String[] words) {

        Set<String> result = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(result.contains(word)) continue;
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board[0].length; k++) {
                    char ch = word.charAt(0);
                    if (ch == board[j][k] && dfs(board, word, j, k, 0)) {
                        result.add(word);
                    }
                }
            }
        }
        return new LinkedList<>(result);
    }

    private boolean dfs(char[][] board, String word, int i, int j, int w) {

        if (w == word.length()) {
            return true;
        }

        if (isPossible(board, i, j, word.charAt(w))) {
            char temp = board[i][j];
            board[i][j] = 'A';
            if (dfs(board, word, i, j + 1, w + 1)) {
                board[i][j] = temp;
                return true;
            }
            if (dfs(board, word, i, j - 1, w + 1)) {
                board[i][j] = temp;
                return true;
            }
            if (dfs(board, word, i + 1, j, w + 1)) {
                board[i][j] = temp;
                return true;
            }
            if (dfs(board, word, i - 1, j, w + 1)) {
                board[i][j] = temp;
                return true;
            }
            board[i][j] = temp;
        }

        return false;
    }

    private boolean isPossible(char[][] board, int i, int j, char ch) {
        return i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == ch;
    }
}
