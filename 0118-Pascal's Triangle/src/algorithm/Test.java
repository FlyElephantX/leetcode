package algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows < 1) {
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        for (int i = 1; i < numRows; i ++) {
            List<Integer> pre = lists.get(i - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                int num = pre.get(j) + pre.get(j + 1);
                cur.add(num);
            }
            cur.add(1);
            lists.add(cur);
        }
        return lists;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.generate(5);
        System.out.println("列表的结果:" + lists);
    }
}
