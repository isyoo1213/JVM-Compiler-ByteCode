package main.sourcecode.search.exhaustiveSearch.permutationSearch;

public class Ps1UsingSwap {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int r = 2; //뽑을 개수

        Permutation per = new Permutation();
        per.permutation(a, 0, r);

        System.out.println("총 개수 = " + per.count);

    }

    static class Permutation{
        public int count; //순열 경우의 수

        public Permutation() {
            this.count = 0;
        }

        public void permutation(int[] a, int depth, int r) {
            if (depth == r) {
                for (int i = 0; i < r; i++) {
                    System.out.print(a[i]);
                }
                System.out.println();
                count++;
                return;
            }

            for (int i = depth; i < a.length; i++) {
                swap(a, depth, i);
                permutation(a, depth + 1, r);
                swap(a, depth, i); //다음 loop 진행을 위해 변경된 배열을 swap 이전 상태로 복귀
            }
        }

        public void swap(int[] a, int index1, int index2) {
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
    }
}
