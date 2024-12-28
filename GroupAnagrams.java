class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        String tmp = "";
        for(int i = 0; i < strs.length; i++){
            char[] tmp_arr = strs[i].toCharArray();
            Arrays.sort(tmp_arr);
            tmp = new String(tmp_arr);
            if(hm.get(tmp) == null){
                ArrayList<String> tmp_list = new ArrayList<String>();
                tmp_list.add(strs[i]);
                hm.put(tmp, tmp_list); 
            }
            else{
                hm.get(tmp).add(strs[i]);
            }
        }
        List<List<String>> final_list = new ArrayList<List<String>>();
        for(List<String> s: hm.values()){
            final_list.add(s);
        }
        return final_list;
    }
}
