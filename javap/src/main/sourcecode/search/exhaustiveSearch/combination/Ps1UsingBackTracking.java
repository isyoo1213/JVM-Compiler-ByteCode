package main.sourcecode.search.exhaustiveSearch.combination;

/**
 * DFS와 BackTracking의 차이
 * DFS 중, 더 이상 탐색할 필요가 없는 것을 쳐내는 것이 BackTracking
 * 여기에서는 for 루프를 진행하면서 이전 index는 돌지 않는 것이 BackTracking의 핵심
 * cf) 순열의 DFS의 경우, for 루프를 진행하면서, 서로 다른 순서를 위해 모든 인덱스를 다시 탐색하는 것이 차이점
 * *** 즉, bruteForce의 한 방법론으로 '깊이'를 가장 먼저 탐색하는 DFS 기법을 사용하면서, 탐색이 불필요한 부분을 쳐내는 BackTracking이 적용된 개념
 */
public class Ps1UsingBackTracking {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int r = 3; //뽑을 개수

        Permutation permutation = new Permutation();
        permutation.permutation(a, 0, r, new boolean[a.length], new int[r], 0);

        System.out.println("총 개수");
        System.out.println(permutation.count);
    }

    static class Permutation {
        public int count;

        public Permutation() {
            this.count = 0;
        }

        public void permutation(int[] a, int depth, int r, boolean[] visited, int[] craft, int point) {
            if (depth == r) {
                for (int i = 0; i < craft.length; i++) {
                    System.out.print(craft[i]);
                    System.out.print(" ");
                }
                System.out.println("");
                count++;
                return;
            }

            for (int i = point; i < a.length; i++) {
                if (visited[i] == false) {
                    visited[i] = true;
                    craft[depth] = a[i];
                    permutation(a, depth + 1, r, visited, craft, i + 1);

                    //다음 i에서의 회전을 위한 visited/craft 리셋
                    visited[i] = false;
                    craft[depth] = 0;
                }
            }
        }
    }

}
