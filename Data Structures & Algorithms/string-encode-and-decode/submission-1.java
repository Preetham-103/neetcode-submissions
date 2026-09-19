class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String str : strs){
            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
        int i=0;
        while(i < str.length()) {
            int j=i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            String word = str.substring(start,start+length);
            decode.add(word);
            i = start + length;
        }
        return decode;
    }
}
