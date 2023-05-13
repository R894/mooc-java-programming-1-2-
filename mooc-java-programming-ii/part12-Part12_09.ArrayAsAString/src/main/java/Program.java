
public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
    public static String arrayAsString(int[][] array){
        String s= "";
        for(int i=0; i<array.length; i++){
            for(int g=0; g< array[i].length; g++){
                s+= array[i][g];
            }
            s+= "\n";
        }
        return s;
    }
}
