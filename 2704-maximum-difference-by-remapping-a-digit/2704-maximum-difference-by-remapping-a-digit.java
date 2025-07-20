class Solution {
    public int minMaxDifference(int num) {
        String str= Integer.toString(num);
        String temp = str;
        int position = 0;

        // 9 9 9 2 9
        //stops at position 4
        //iterates through each character in the string until the end, until it hits a 9.
        while(position < str.length() && str.charAt(position) == '9'){
            position++;
        }
        if(position < str.length()){
            str = str.replace(str.charAt(position), '9'); //changed the 2 to a 9 = 99999
            System.out.println("Maximum value: \t\t" + str);
        }
        temp = temp.replace(temp.charAt(0), '0'); //turns every occurrence of the number found in charAt(0) to 0.
        System.out.println("Minimum value: \t\t" + temp);

        return Integer.parseInt(str) - Integer.parseInt(temp);
    }
}
