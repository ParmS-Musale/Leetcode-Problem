class Solution {
    public double[] convertTemperature(double celsius) {
        double answer[] = new double[2];

        double Kelvin = celsius + 273.15 ;
        double Fahrenheit = celsius * 1.80 + 32.00;

        answer[0] = Kelvin ;
        answer[1] = Fahrenheit ;

        return answer ;
    }
}

// Example 1:

// Input: celsius = 36.50
// Output: [309.65000,97.70000]
// Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
// Example 2:

// Input: celsius = 122.11
// Output: [395.26000,251.79800]
// Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.
 
