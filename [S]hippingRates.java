import java.util.HashMap;
public class ShippingRates {
  public static void main(String args[]) {
     System.out.println("Shipping Rate from US to CA is: " + shippingRate("US,UK,UPS,5:US,CA,FedEx,3:CA,UK,DHL,7", "US", "CA"));
      
  }


    public static int shippingRate(String s, String from, String to){
        HashMap<String, HashMap<String, Integer>> hm = new HashMap<String, HashMap<String, Integer>>();
        String[] s_arr = s.split("[:,]");

        for(int i = 0; i < s_arr.length; i += 4){
            HashMap<String, Integer> tempHM = new HashMap<String,Integer>();
            tempHM.put(s_arr[i + 1], Integer.parseInt(s_arr[i + 3]));
            hm.put(s_arr[i], tempHM);
        }

        return hm.get(from).get(to);


    }


    

}