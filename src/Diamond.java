class Diamond {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {

            for (int j =1 ; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


// * * *
//  * *
//   *














//i= 1,2,3,4
//j=3,2,1,0/3,2,1/3,2
//k=1,2/1,2,3/1,2,3,4
//pattern
//   *
//__* *
//_* * *


//   *
//  * *
// * * *
//* * * *
// * * *
//  * *
//   *