package algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex + 1 < 1) {
            return list;
        }
        List<Integer> pre = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            list.clear();
            list.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                int num = pre.get(j) + pre.get(j + 1);
                list.add(num);
            }
            list.add(1);
            pre.clear();
            pre.addAll(list);
        }
        return list;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> res = solution.getRow(3);
        System.out.println("列表的结果:" + res);
    }
}
