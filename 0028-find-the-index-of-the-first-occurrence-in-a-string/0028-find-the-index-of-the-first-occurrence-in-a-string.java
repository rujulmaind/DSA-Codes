public class Solution {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad")); // 0
        System.out.println(strStr("leetcode", "leeto")); // -1
    }
}
