import java.util.*;

class P2{
    int i,j,e,s;
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Upper Limit: ");
        e = sc.nextInt();
    }
    void ss(){
        for(i=1; i<=e; i++){
            s = 0;

            for(j=1; j<i; j++){
                if(i % j == 0){
                    s += j;
                }
            }
            if(s == i){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        P2 o = new P2();
        o.main();
        o.ss();
    }
}