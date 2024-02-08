package InterviewCodes.Logical;

public class CheckSubset {
        static boolean checkSubset(int a1[], int a2[], int m, int n) {
            int i=0;
            int j=0;
            for (i = 0; i < n; i++) {

                for (j = 0; j < m; j++)
                    if (a2[i] == a1[j])
                        break;
                if (j == m)
                    return false;
            }
            return true;
        }
        public static void main(String[] args) {
            int[] a1 = { 10, 70, 60, 40, 30 };
            int[] a2 = { 10 };
            int m = a1.length;
            int n = a2.length;

            if (checkSubset(a1, a2, m, n))
                System.out.println("yes");
             else
                System.out.println("no");
        }
    }