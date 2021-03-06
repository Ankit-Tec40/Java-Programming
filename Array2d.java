public class Array2d {
    public static void main(String[] args) {
        int [][] flats;
        flats=new int[2][3];
        flats[0][0]=2;
        flats[0][1]=8;
        flats[0][2]=7;
        flats[1][0]=3;
        flats[1][1]=4;
        flats[1][2]=7;
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
    
}
