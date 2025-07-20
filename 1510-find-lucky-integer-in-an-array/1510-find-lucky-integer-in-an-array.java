class Solution {
    public int findLucky(int[] arr) {

        //you have an array of integers.
        //you want to find the number wuth the highest value, and is lucky.
        // a lucky integer is a number that appears as frequently as its value.
        // ex. 3 3 3, the int 3 appears 3 times.

        // use a hash table to keep track of frequency of numbers.
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x: arr) {  //go through each int in the array
            freq.put(x, freq.getOrDefault(x, 0) + 1); //find the frequency of all
        }

        int largest= -1;
        //go through each entry in the map
        for (Map.Entry<Integer,Integer> e : freq.entrySet()){
            int value = e.getKey(); //the int value
            int count = e.getValue();  // the int frequency
            if (value == count && value > largest) {
                largest = value;
            }
        }
        return largest;
    }
}
