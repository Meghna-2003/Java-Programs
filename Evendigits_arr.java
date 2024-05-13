public class Evendigits_arr {
    public static void main(String[] args) {
        int[] arr = {56,789,1,5,745,203856};
        int ans = findNumbers(arr);
        System.out.println(ans);


    }
    static int findNumbers(int[] arr)
    {
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            while(arr[i]!=0)
            {
                c=c+1;
                arr[i]=arr[i]/10;
            }
            if(c%2==0)
            k=k+1;
        }
        return k;
    }
    
}
