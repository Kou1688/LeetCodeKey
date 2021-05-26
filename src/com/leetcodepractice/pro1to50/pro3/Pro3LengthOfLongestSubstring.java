package com.leetcodepractice.pro1to50.pro3;

import java.util.HashMap;
import java.util.Map;

public class Pro3LengthOfLongestSubstring {
    /**
     * 无重复字符的最长字串
     *
     * @param s 查找字符串
     * @return 返回在字符串s中的最长无重复字符子串长度
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();  //建立散列表,存放字符串的字符及其下标
        int sLength = s.length();
        int result = 0;

        //遍历字符串
        for (int start = 0, end = 0; end < sLength; end++) {
            char target = s.charAt(end);
            if (map.containsKey(target)) {
                //+1因为我们移动start指针后[start,end]区间内不能有重复值,所以应当将start放在重复值的后一个位置上
                start = Math.max(map.get(target) + 1, start);
            }
            result = Math.max(end - start + 1, result);    //end-start+1表示当前以遍历不重复的子串长度
            map.put(target, end);    //将当前遍历字符,字符下表存入map中
        }

        return result;
    }
}
