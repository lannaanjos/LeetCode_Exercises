import java.util.HashMap;
import java.util.Map;

class Solution{
    public int romanToInteger(String rNumber){
        Map<Character, Integer> rAssociation = new HashMap<>();

        rAssociation.put('I', 1);
        rAssociation.put('V', 5);
        rAssociation.put('X', 10);
        rAssociation.put('L', 50);
        rAssociation.put('C', 100);
        rAssociation.put('D', 500);
        rAssociation.put('M', 1000);
        
        int r = rAssociation.get(rNumber.charAt(rNumber.length()-1));

        for(int i = rNumber.length()-2; i>=0;i--){
            if(rAssociation.get(rNumber.charAt(i)) < rAssociation.get(rNumber.charAt(i+1))){
                r -= rAssociation.get(rNumber.charAt(i));
            } else {
                r += rAssociation.get(rNumber.charAt(i));
            }
        }

        return r;
    }
}

