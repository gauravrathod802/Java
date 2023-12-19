package InterviewCodes.Array;
//https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(accounts));
    }
        static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
            for (int i = 0; i <accounts.length ; i++) {
                int sum=0;
                for (int j = 0; j < accounts[i].length; j++) {
                    sum=sum+accounts[i][j];     //6
                }
                if(sum>max){   //6>
                    max=sum;    //6
                }
            }
            return max;
        }

}

