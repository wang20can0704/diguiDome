package diguidome;

public class jiecheng {
    public static void main(String[] args) {

        System.out.println(jc(5));
    }

    public static int jc(int n){
        if (n==1){
            return 1;
        }else {
            int i = n * jc(n - 1);
            return i;
        }
    }
}
