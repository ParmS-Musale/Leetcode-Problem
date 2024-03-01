class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                absent++;
                if (absent >= 2) {
                    return false;
                }
                // Reset late count when 'A' is encountered
                late = 0;
            } else if (ch == 'L') {
                late++;
                if (late >= 3) {
                    return false;
                }
            } else {
                // Reset late count when character is not 'L'
                late = 0;
            }
        }
        return true;
    }
}


// Example 1:

// Input: s = "PPALLP"
// Output: true
// Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.
// Example 2:

// Input: s = "PPALLL"
// Output: false
// Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
