public class question_two {
    public static void main(String[] args) {
        System.out.println(a1(new int[]{1,2,3,4}));
        System.out.println(a1(new int[]{4,3,2,6}));
        System.out.println(a1(new int[]{1}));
        System.out.println(a1(new int[]{}));
    }
    static int a1(int[]a){
        if(a==null||a.length<2){
            return -1;
        }
        int max1=-1;
        int max2=-1;
        for(int num:a){
            if(num>max1){
                max2=max1;
                max1=num;
            }
            else if (num>max2 && num!=max1) {
                max2=num;
                
            }
        }
        return max2==-1?-1:max2;
    }
}
