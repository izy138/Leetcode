class Solution {
    public int romanToInt(String s) {

        //create a map for each Roman character to its integer value.
        //iterate through the string from left to right.
        //compare the value of the current symbol with the value of the next symbol
        // if the current value is greater than or equal to next value, add to total
        // if the current value is less than the next value, subtract it (cases: IV, IX etc)
        //add the value of the last symbol.

        //make a hash map for each character and value
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //iterate through the string
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            if (map.get(a) < map.get(b)) { // IV
                    result -= map.get(a); // result is -1
            }else{
                result += map.get(a); //
            }
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }
}