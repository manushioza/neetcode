class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        s = new String (s_arr);
        t = new String (t_arr);

        return s.equals(t);
    }
}
