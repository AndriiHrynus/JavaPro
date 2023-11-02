package org.example.work8;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        try {
           int rez=  doCalc(new String[][]{{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}});
            System.out.println(rez);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            int rez=  doCalc(new String[][]{{"1","2","3","4"},{"a","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}});
            System.out.println(rez);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int doCalc(String array[][]) throws ArraySizeException, ArrayDataException {
        if(array.length!=4) throw new ArraySizeException("must 4x4");
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length!=4) throw new ArraySizeException("must 4x4");
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum+=Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex){
                    throw new ArrayDataException ("Incorrect data "+i+" "+j);
                }
            }
        }
        return sum;
    }
}
