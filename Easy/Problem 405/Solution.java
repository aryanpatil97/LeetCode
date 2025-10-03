public class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (num != 0 && count++ < 8) {
            sb.append(hex[num & 0xf]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
