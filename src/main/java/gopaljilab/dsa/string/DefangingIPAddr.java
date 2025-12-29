package gopaljilab.dsa.string;

public class DefangingIPAddr {
    public static String defangIPAddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.'){
                result.append("[").append(address.charAt(i)).append("]");
            }else
                result.append(address.charAt(i));
        }
        return result.toString();
    }
}
