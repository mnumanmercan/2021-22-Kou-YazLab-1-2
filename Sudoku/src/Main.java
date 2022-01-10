import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main implements Runnable{
    private static final int SIZE = 9;

    @Override
    public void run() {
        int[][] board1 = {
                {0,0,5,7,0,0,0,2,0},
                {4,9,0,0,6,0,0,1,0},
                {0,0,7,0,0,4,9,0,6},
                {0,0,6,0,0,0,0,0,8},
                {0,7,0,0,0,0,0,9,0},
                {2,0,0,0,0,0,3,0,0},
                {5,0,8,9,0,0,7,0,0},
                {0,1,0,0,3,0,0,8,5},
                {0,2,0,0,0,5,6,0,0}
        };
        int[][] board2 = {
                {0,0,9,6,0,0,0,2,0},
                {1,4,0,0,5,0,0,3,0},
                {0,0,2,0,0,1,7,0,8},
                {0,0,3,0,0,0,0,0,2},
                {0,5,0,0,0,0,0,6,0},
                {4,0,0,0,0,0,5,0,0},
                {6,0,5,8,0,0,2,0,0},
                {0,1,0,0,7,0,0,8,6},
                {0,2,0,0,0,4,3,0,0}
        };
        int[][] board3 = {
                {0,0,8,5,0,0,0,2,0},
                {6,2,0,0,4,0,0,5,0},
                {0,0,7,0,0,8,9,0,3},
                {0,0,6,0,0,0,0,0,2},
                {0,5,0,0,0,0,0,4,0},
                {8,0,0,0,0,0,3,0,0},
                {1,0,5,9,0,0,2,0,0},
                {0,3,0,0,6,0,0,7,1},
                {0,6,0,0,0,3,5,0,0}
        };

        int[][] board4 = {
                {0,5,8,9,0,3,0,6,0},
                {9,6,0,0,2,0,0,5,0},
                {0,0,2,0,0,8,1,0,9},
                {0,0,1,0,0,0,0,0,6},
                {0,8,0,0,0,0,0,2,0},
                {7,0,0,0,0,0,5,0,0},
                {2,0,6,7,0,0,4,0,0},
                {0,3,0,0,9,0,0,7,8},
                {0,9,0,0,0,4,2,0,0}
        };


        int[][] boardMid = {
                {7,4,0,0,0,0,6,0,5},
                {0,8,5,0,0,0,0,1,0},
                {6,0,0,0,1,0,0,2,0},
                {0,0,0,4,0,6,0,0,0},
                {0,0,6,0,5,0,2,0,0},
                {0,0,0,2,0,8,0,0,0},
                {4,2,0,0,3,0,0,0,8},
                {0,5,0,0,0,0,9,6,0},
                {9,0,3,0,0,0,0,0,2}
        };
        long startTime = System.currentTimeMillis();
        long sure = 0;
        System.out.println("--------Board 1---------");
        sudokuYazdir(board1);

        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board 2---------");
        sudokuYazdir(board2);

        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board 3---------");
        sudokuYazdir(board3);

        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board 4---------");
        sudokuYazdir(board4);


        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board mid---------");
        sudokuYazdir(boardMid);

        try {
            if (sudokuCoz(board1)) {
                System.out.println("Sudoku -1- basari ile cozuldu!");
                long sure1 = System.currentTimeMillis();
                sure = sure1 - startTime;
                System.out.println("Board 1 icin gecen sure : " + (float)sure/60000 + " dk");
            }
            else {
                System.out.println("Sudoku 1 cozulemedi!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            if (sudokuCoz(board2)) {
                System.out.println("Sudoku -2- basari ile cozuldu!");
                long sure2 = System.currentTimeMillis();
                sure = sure2 - startTime;
                System.out.println("Board 2 icin gecen sure : " + (float)sure/60000 + " dk");
            }
            else {
                System.out.println("Sudoku 2 cozulemedi!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            if (sudokuCoz(board3)) {
                System.out.println("Sudoku -3- basari ile cozuldu!");
                long sure3 = System.currentTimeMillis();
                sure = sure3 - startTime;
                System.out.println("Board 3 icin gecen sure : " + (float)sure/60000 + " dk");
            }
            else {
                System.out.println("Sudoku 3 cozulemedi!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            if (sudokuCoz(board4)) {
                System.out.println("Sudoku -4- basari ile cozuldu!");
                long sure4 = System.currentTimeMillis();
                sure = sure4 - startTime;
                System.out.println("Board 4 icin gecen sure : " + (float)sure/60000 + " dk");
            }
            else {
                System.out.println("Sudoku 4 cozulemedi!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            if (sudokuCoz(boardMid)){
                System.out.println("Sudoku -mid- basari ile cozuldu!");
                long sureMid = System.currentTimeMillis();
                sure = sureMid - startTime;
                System.out.println("Board mid icin gecen sure : " + (float)sure/60000 + " dk");
            }
            else {
                System.out.println("Sudoku mid cozulemedi!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------Board 1---------");
        sudokuYazdir(board1);

        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board 2---------");
        sudokuYazdir(board2);

        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board 3---------");
        sudokuYazdir(board3);

        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board 4---------");
        sudokuYazdir(board4);


        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("--------Board mid---------");
        sudokuYazdir(boardMid);

        long endTime = System.currentTimeMillis();
        sure = endTime - startTime;
        double seconds = (double)sure/1000;
        float min = (float)seconds/60;
        System.out.println("Cozumde gecen sure : " + min + " dk");
    }


    public static void thread10(){
        Main cozdur = new Main();
        Thread t1 = new Thread(cozdur);
        Thread t2 = new Thread(cozdur);
        Thread t3 = new Thread(cozdur);
        Thread t4 = new Thread(cozdur);
        Thread t5 = new Thread(cozdur);
        Thread t6 = new Thread(cozdur);
        Thread t7 = new Thread(cozdur);
        Thread t8 = new Thread(cozdur);
        Thread t9 = new Thread(cozdur);
        Thread t10 = new Thread(cozdur);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
    public static void main(String[] args) throws InterruptedException {
        Main coz = new Main();

        Thread t1 = new Thread(coz);
        Thread t2 = new Thread(coz);
        Thread t3 = new Thread(coz);
        Thread t4 = new Thread(coz);
        Thread t5 = new Thread(coz);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }


    private static void sudokuYazdir(int[][] sudokuPzl) {
        for (int row = 0; row < SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("----------------------");
            }
            for (int col = 0; col < SIZE; col++) {
                System.out.print(" ");
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| ");
                }
                if(sudokuPzl[row][col]==0){
                    System.out.print("*");
                }else{
                    System.out.print(sudokuPzl[row][col]);
                }

            }
            System.out.println();
        }
    }


    private static boolean satirKontrol(int[][] sudokuPzl, int sayi, int row){
        for (int i = 0; i < SIZE; i++) {
            if (sudokuPzl[row][i] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean sutunKontrol(int[][] sudokuPzl, int sayi, int col){
        for (int i = 0; i < SIZE; i++) {
            if (sudokuPzl[i][col] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean localBoxKontrol(int[][] sudokuPzl, int sayi, int row, int col){

        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (sudokuPzl[i][j] == sayi) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sudokuKontrol(int[][] sudokuPzl, int sayi, int row, int column) throws InterruptedException {
        File dosya = new File("sudoku.txt");
        final boolean[] kontrol = {false};
        if (!satirKontrol(sudokuPzl, sayi, row) && !sutunKontrol(sudokuPzl, sayi, column) && !localBoxKontrol(sudokuPzl, sayi, row, column)){
            kontrol[0] = true;
        }
        try {
            String veri = "Thread deger : " + sayi + " - " + kontrol[0] + "\n";
            FileWriter yaz = new FileWriter(dosya,true);

            // System.out.println("Thread calisiyor :" + sayi + " - " + kontrol[0]);
            BufferedWriter bufferedWriter = new BufferedWriter(yaz);
            bufferedWriter.write(veri);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return kontrol[0];
    }

    private static boolean sudokuCoz(int[][] sudokuPzl) throws InterruptedException {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (sudokuPzl[row][col] == 0) {
                    for (int sayi = 1; sayi <= SIZE; sayi++) {
                        if (sudokuKontrol(sudokuPzl, sayi, row, col)) {
                            sudokuPzl[row][col] = sayi;

                            if (sudokuCoz(sudokuPzl)) {
                                return true;
                            }
                            else {
                                sudokuPzl[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


}