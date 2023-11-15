class MethodOverloading {
    public static void main(String args[]) {

        MethodOverloading m = new MethodOverloading();
        System.out.println(m.sum(12,8));
        System.out.println(m.sum(12,12.6f));

    }

    int sum(int a,int c) {
        return a+c;

    }
    float sum(float b,float t)
    {
        return b+t;
    }
}