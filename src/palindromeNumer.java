class Solution {
    public boolean isPalindrome(int x) {
        
        boolean verification = false;

        String normal = Integer.toString(x);
        String reversed = "";

        for(int i = normal.length()-1; i >= 0; i--){
            reversed += normal.charAt(i);
        }

        if(normal.equals(reversed)){
            verification = true;
        }

        return verification;

    }
}
