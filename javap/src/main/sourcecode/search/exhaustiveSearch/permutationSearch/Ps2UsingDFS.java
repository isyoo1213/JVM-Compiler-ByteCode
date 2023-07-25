package main.sourcecode.search.exhaustiveSearch.permutationSearch;

public class Ps2UsingDFS {

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int r = 2;
        //4개중 2개 뽑아 나열
        Permutation permutation = new Permutation();
        permutation.permutation(a, 0 ,r, new boolean[a.length], new int[r]);

        System.out.print("총 개수: ");
        System.out.println(permutation.count);
    }

    static class Permutation{
        public int count; //순열 경우의 수

        public Permutation() {
            this.count = 0;
        }

        public void permutation(int[] a, int depth, int r, boolean[] visited, int[] craft) {
            if (depth == r) { //depth 와 r이 같아지면 출력
                for (int i = 0; i < craft.length; i++) {
                    System.out.print(craft[i]);
                    System.out.print(" ");
                }
                System.out.println("");
                count++;
                return;
            }

            for (int i = 0; i < a.length; i++) {
                if (visited[i] == false) {//visite가 false이면 아직 안들어간 숫자, true이면 이미 들어간 숫자이다
                    visited[i] = true;
                    craft[depth] = a[i];
                    this.permutation(a, depth + 1, r, visited, craft);//재귀함수 들어갈때 depth+1
                    visited[i] = false; //복구
                    craft[depth] = 0; //복구
                }
            }
        }
    }
}
