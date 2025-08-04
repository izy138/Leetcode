class Solution {
    public int lengthOfLastWord(String s) {

        // you take a string with words seperated by spaces,
        // you want the last word, so you start the index at the end.
        // you check the array.length - 1 if its a character, if its not move the index left 1,
        // check if its a character, it is = then you add a counter,
        // you contineu moving to the left until you hit a space.
        // then return the counter

        // "hello world"
        int counter = 0;
        int index = s.length() - 1; //index is 10 = 'd'

        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            counter++;
        }
        return counter;
    }
}
