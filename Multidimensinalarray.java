public class Multidimensinalarray {

    // 2 4 5
    // 1 8 9
    // 3 7 8

    public static void main(String[] args) {

        int arr[][] = {{2,4,5}, {1,8,9}, {3,7,8}};

        int min=arr[0][0];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                
                if (arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println(min);



        
    }

}
