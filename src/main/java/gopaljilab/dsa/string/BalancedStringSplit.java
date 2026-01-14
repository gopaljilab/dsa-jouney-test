package gopaljilab.dsa.string;

public class BalancedStringSplit {
    public boolean balancedStringSplit(String s) {
        int countR = 0;
        int countL = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L') countL++;
            else countR++;
        }
        return countR == countL;
    }
}
