
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i=0; i<number;i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i=0; i<number;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int origsize = size;
        for(int i=1; i<=origsize; i++){
            size--;
            printSpaces(size);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int saveme = height;
        int origsize = height;
        for(int i=1; i<=origsize; i++){
            height--;
            printSpaces(height);
            if(i==1){
                printStars(i);
            }else{
                printStars(i*2-1);
            }
        }
        for(int i=0; i<2; i++){
            printSpaces(saveme-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
