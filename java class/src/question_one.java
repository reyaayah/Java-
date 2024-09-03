public class question_one {
    public static void main(String[] args ) throws Exception{
        System.out.println(a2(new int[]{1}));
        System.out.println(a2(new int[]{1,2}));
        System.out.println(a2(new int[]{1,2,3}));
        System.out.println(a2(new int[]{1,2,3,4}));
        System.out.println(a2(new int[]{1,2,3,4,5}));
        System.out.println(a2(new int[]{1,2,7}));
        System.out.println(a2(new int[]{1,2,5}));
    }
    static int a2(int[] a){
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sumEven+=a[i];
            }
            else{
                sumOdd+=a[i];
            } 
        }
        return sumOdd-sumEven;
    }
}
