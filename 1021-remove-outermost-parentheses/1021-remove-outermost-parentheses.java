class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (open > 0) result.append(c); // skip outer '('
                open++;
            } else {
                open--;
                if (open > 0) result.append(c); // skip outer ')'
            }
        }
        return result.toString();
    }
}
