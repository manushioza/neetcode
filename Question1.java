/* Part 1:
You are given a string representing application IDs in the following format:


Each application ID is prefixed by its length (number of characters in the ID).
The format is: lengthOfApplicationId + APPLICATION_ID + ... + 0 (ends with a 0).
Example:
Input: 10A13414124218B124564356434567430
Output: ["A134141242", "B12456435643456743"]


Part 2:
Filter the application IDs obtained from Part 1 to return only the "whitelisted" application IDs.


Example:
Input: 10A13414124218B124564356434567430, ["A134141242"]
Output: ["A134141242"]

*/

import java.util.*;

class Question1{

    public static void main(String args[]) {
        List<String> ans = part1("10A13414124218B124564356434567430");
        List<String> whitelist = ["A134141242"];
    System.out.println("Part 1 Answer: " + ans);
    System.out.println("Part 2 Answer: " + part2(ans, whitelist));
  }


   public static List<String> part1(String encodedString){
      List<String> applicationIds = new ArrayList<>();
        int i = 0;

        while (i < encodedString.length()) {
            // Check for the end character '0'
            if (encodedString.charAt(i) == '0') {
                break;
            }

            // Extract the length of the application ID (2 characters)
            int length = Integer.parseInt(encodedString.substring(i, i + 2));
            i += 2;

            // Extract the application ID
            String applicationId = encodedString.substring(i, i + length);
            applicationIds.add(applicationId);
            i += length;
        }

        return applicationIds;
    }

    public List<String> part2 whitelistedIds(List<String> applicationIds, List<String> whitelisted){
        List<String> filteredIds = new ArrayList<>();
        for (String appId : applicationIds) {
            if (whitelist.contains(appId)) {
                filteredIds.add(appId);
            }
        }
        return filteredIds;
    }

    

}