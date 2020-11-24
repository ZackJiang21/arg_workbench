package NC121;

import java.util.*;

/**
 * Created by ZackJiang on 2020/10/31.
 */
public class NC121 {
    public static ArrayList<String> Permutation(String str) {
        Set<String> retSet = new HashSet<String>();
        StringBuilder sb = new StringBuilder(str);
        recur(0, sb, retSet);
        ArrayList<String> result = new ArrayList<String>(retSet);
        Collections.sort(result);
        return result;
    }

    /**
     *
     * @param pos
     * @param sb
     * @param ret
     */
    private static void recur(int pos, StringBuilder sb, Set<String> ret) {
        if (pos + 1 == sb.length()) {
            ret.add(sb.toString());
            return;
        }

        for (int i = pos; i < sb.length(); i++) {
            swap(sb, pos, i);
            recur(pos + 1, sb, ret);
            swap(sb, i, pos);
        }
    }

    /**
     * 交换x和y位置的字符
     * @param sb
     * @param x
     * @param y
     */
    private static void swap(StringBuilder sb, int x, int y) {
        char temp = sb.charAt(x);
        sb.setCharAt(x, sb.charAt(y));
        sb.setCharAt(y, temp);
    }

    public static void main(String[] args) {
        String test = "abc";
        System.out.print(Permutation(test));
    }

}
