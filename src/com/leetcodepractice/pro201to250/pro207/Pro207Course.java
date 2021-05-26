package com.leetcodepractice.pro201to250.pro207;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kou
 * @date: 2021/5/25 16:38
 * @Description: 课程表
 */
public class Pro207Course {
    private int[] marked;
    private List<List<Integer>> adj;
    boolean isCycle = false;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //构造邻接表表示图
        adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        marked = new int[numCourses];

        //添加边
        for (int[] course : prerequisites) {    //course[1]存放的是第二列的数值
            adj.get(course[1]).add(course[0]);  //prerequisites[i].length == 2
        }

        for (int v = 0; v < numCourses && !isCycle; v++) {
            if (marked[v] == 0) {
                dfs(v);
            }
        }

        return !isCycle;
    }

    /**
     * 深度优先搜索
     *
     * @param v 一个顶点
     */
    private void dfs(int v) {
        marked[v] = 1;

        for (int w : adj.get(v)) {
            if (marked[w] == 0) {
                dfs(w);
                if (isCycle) {    //该图有环
                    return;
                }
            } else if (marked[w] == 1) {
                isCycle = true;
                return;
            }
        }
        marked[v] = 2;
    }

}
