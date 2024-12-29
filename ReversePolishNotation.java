class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        int output = 0;
        int n1 = 0;
        int n2 = 0;

        for(int i = 0; i < tokens.length; i++){
            switch (tokens[i]){
                case "+":
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n1 + n2);
                    break;
                case "-":
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n2 - n1);
                    break;
                case "*":
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n1 * n2);
                    break;
                case "/":
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n2 / n1);
                    break;
                default:
                    st.push(Integer.parseInt(tokens[i]));

            }
                    
        }
        return st.pop();
    }
}
