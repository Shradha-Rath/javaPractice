//Reverse a character array char c[] = {'a','n','a','n','d'}

class Reverse {
    public static void main(String args[]) {
        char c[] = {'a', 'n', 'a', 'n', 'd'};
        for (int i = 4; i >=0 && i< c.length; i--) {
            char reverse = c[i];
            System.out.println(reverse);
        }

    }
}

//i=4,3,2,1,0,-1
//reverse= d, n,a,n,a