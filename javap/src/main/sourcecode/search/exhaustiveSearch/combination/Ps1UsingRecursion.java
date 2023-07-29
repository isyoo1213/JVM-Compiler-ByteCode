package main.sourcecode.search.exhaustiveSearch.combination;

public class Ps1UsingRecursion {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int r = 3; //뽑아야 할 개수

        Permutation permutation = new Permutation();
        permutation.permutation(a, 0, r, new boolean[a.length], new int[r]);

        System.out.println("총 개수");
        System.out.println(permutation.count);
    }

    static class Permutation {
        public int count;

        public Permutation() {
           this.count = 0;
        }

        public void permutation(int[] a, int depth, int r, boolean[] visited, int[] craft) {
            //종료 return 기준
            //1. r개를 모두 뽑았을 경우
            //2. 더 이상 뽑을 것이 없을 경우
            if (r == 0) { //r개 중 뽑을 때 마다 1씩 감소하는 형태
                for (int i = 0; i < craft.length; i++) {
                    System.out.print(craft[i]);
                    System.out.print("");
                }
                System.out.println("");
                count++;
                return;
            }
            if (depth == a.length) {
                return;
            }
            visited[depth] = true;
            craft[craft.length - r] = a[depth];
            permutation(a, depth + 1, r - 1, visited, craft);

            visited[depth] = false;
            permutation(a, depth + 1, r, visited, craft);
        }
    }
}
