package task_2192;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int n = 8;
        int[][] edges = {{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}};
        List<List<Integer>> ans = getAncestors(8, edges);
        for (var list: ans){
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
    public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> answers = new ArrayList<>();
        List<List<Integer>> ancestors = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            answers.add(new ArrayList<>());
            ancestors.add(new ArrayList<>());
        }
        //[[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]]
        //[[],[],[],[0,1],[0,2],[0,1,3],[0,1,2,3,4],[0,1,2,3]]
        for(int[] edge: edges){
            answers.get(edge[0]).add(edge[1]);
        }
        for (int j = 0; j < answers.size(); j++) {
            boolean[] visited = new boolean[n];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(j);
            while (!queue.isEmpty()){
                int ind = queue.poll();
                for (Integer node: answers.get(ind)){
                    if(!visited[node]){
                        visited[node] = true;
                        ancestors.get(node).add(j);
                        queue.add(node);
                    }
                }
            }
        }
        for (List<Integer> list : ancestors) {
            list.sort(Integer::compareTo);
        }

        return ancestors;
    }
}