package gopaljilab.dsa.string;

public class MinOperationToGetAlternative {
    public int minOperations(String s) {
        int opsCount = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i)!= s.charAt(i+1)){
                if (s.charAt(i) == '0')
                    s = s.replace('0', '1');
                else
                    s = s.replace('1', '0');
                opsCount++;
            }

        }
        return opsCount;
    }
}
