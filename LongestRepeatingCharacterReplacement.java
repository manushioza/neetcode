class Solution {
    public int characterReplacement(String s, int k) {
        int max_length = 0;
        int left_pointer = 0;
        int current_length = 0;
        int most_freq_char = 0;
        //Create HM of all chars with count of how many chars in string
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        //For loop -> RP at index 0
        for(int right_pointer = 0; right_pointer < s.length(); right_pointer++){
            
            //Add char to hash map -> add one to count
            hm.put(s.charAt(right_pointer), hm.getOrDefault(s.charAt(right_pointer), 0) + 1);
            
            //Calculate the length of substring
            current_length = (right_pointer - left_pointer) + 1;
            
            //Get the count of the most freq char in HM
            most_freq_char = Math.max(most_freq_char, hm.get(s.charAt(right_pointer)));

            //While the # of subs is greater than k, 
            while((current_length - most_freq_char) > k ){
                //Subtract count from hm
                hm.put(s.charAt(left_pointer), hm.get(s.charAt(left_pointer)) - 1);
                //Move left pointer up
                left_pointer++;
                //Recal currnt length
                current_length = (right_pointer - left_pointer) + 1;
            }
            //Determing max length 
            max_length = Math.max(max_length, current_length);
            //Loop
        }

        return max_length;
    }

}
