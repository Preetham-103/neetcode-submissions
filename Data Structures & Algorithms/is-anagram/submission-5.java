class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);

        String sorted1 = new String(string1);
        String sorted2 = new String(string2);

        if(!sorted1.equals(sorted2)) return false;
        return true;
    }
}
