import java.util.Arrays;

class Solution {
    public static String convert(String s, int numRows) {

        String[] str = new String[numRows];
        Arrays.fill(str, "");

        boolean flag=false;
        int i = 0;
        if (numRows == 1) {
            return s;
        }
        for (char c : s.toCharArray()) {
            str[i] += c+"";
            if(i==0 || i==numRows-1){
                flag=!flag;
            }
            if(flag){
                i+=1;
            }
            else {
                i-=1;
            }
        }
        StringBuilder res= new StringBuilder();
        for(String ss: str){
            res.append(ss);
        }


        return String.valueOf(res);
    }

    public static void main(String[] args) {


        System.out.println(Solution.convert("PAYPALISHIRING", 3));
    }
}
