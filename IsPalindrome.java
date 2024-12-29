class Solution {
    public boolean isPalindrome(String s) {
        boolean b = true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = String.join("",s.split(" ")).toLowerCase();
        System.out.println(s);
        int word_length = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(word_length - i)){
                b = true;
            }
            else{
                b = false;
                break;
            }

        }
        return b;
    }
}
