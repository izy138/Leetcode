class Solution {
    public boolean isValid(String s) {
        // use a stack to add the parentheses
        Map<Character,Character> match=new HashMap<>();
        match.put(')','(');
        match.put(']','[');
        match.put('}','{');

        Deque<Character> stack =new ArrayDeque<>();
        //LIFO

        //Example: ({[ ]})
        for(char c:s.toCharArray()){
            //checks if each c is in the map value: ( { [ and pushes to the stack
            if(match.containsValue(c)){
                stack.push(c);

            } else {
                //else it is a closing bracket ] } )
                //current stack is [ '[', '{', '(' ]
                // first check if stack is empty OR
                // using LIFO, .pop() will pop '[' and checks if it is NOT a match to c
                // in this case ] is next so it will be a match to the last pop [
                    // matching.get(']') == '['
                if(stack.isEmpty() || stack.pop() != match.get(c)){
                    return false;
                }
            }
        }
        //if every open bracket found a closing bracket the stack will be empty.
        return stack.isEmpty();
    }
}
