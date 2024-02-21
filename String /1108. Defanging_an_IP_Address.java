class Solution {
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();
        
        for ( int i= 0 ; i<address.length(); i++){
            char ch = address.charAt(i);
            if(ch != '.'){
                sb.append (ch) ;
            }else{
                sb.append ("[.]") ;
            }
        }
        return sb.toString();
    }
}


// Example 1:

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:

// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"
