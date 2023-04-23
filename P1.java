class P1{
    int a = 123456;
    void Count(){
        int count = 0;
        int c = 0;
        do{
            a /= 10;
            c +=1;
        }while (a !=0);
        System.out.println(c);
    }
    public static void main(String args[]){
        P1 o = new P1();
        o.Count();
    }
}