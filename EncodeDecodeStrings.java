class Solution {

    public String encode(List<String> strs) {
        String str = "";

        for(int i = 0; i < strs.size(); i ++){
            str += strs.get(i).length() + "-" + (strs.get(i)).toString();
        }
        return str;
    }

    public List<String> decode(String str) {
         List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '-') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
    
}
