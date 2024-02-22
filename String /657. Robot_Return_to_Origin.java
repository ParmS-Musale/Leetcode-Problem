class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'U') {
                y += 1;
            } else if (move == 'D') {
                y -= 1;
            } else if (move == 'R') {
                x += 1;
            } else if (move == 'L') {
                x -= 1;
            }
        }

        return (x == 0 && y == 0);
    }
}


// Example 1:

// Input: moves = "UD"
// Output: true
// Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
// Example 2:

// Input: moves = "LL"
// Output: false
// Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
