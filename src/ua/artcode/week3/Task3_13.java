package ua.artcode.week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Serhii Fursenko on 09.06.16.
 */
public class Task3_13 {

    public static class SeaWarGame {

        private int[][] field;
        private Random rand = new Random();
        private int[][] boat = new int[3][2];

        public SeaWarGame(int X, int Y) {

            field = new int[X][Y];
            this.boat = genBoat();

            for (int i = 0; i < boat.length; i++) {

                field[boat[i][0]][boat[i][1]] = 1;
            }


        }

        private int[][] genBoat() {

            int[][] tempBoat = Arrays.copyOf(this.boat, this.boat.length);

            tempBoat[0][0] = rand.nextInt(field.length);
            tempBoat[0][1] = rand.nextInt(field[0].length);

            switch (rand.nextInt(2)) {

                case 0:
                    tempBoat[1][0] = tempBoat[2][0] = tempBoat[0][0];
                    if (tempBoat[0][0] < field.length - tempBoat.length) {
                        tempBoat[1][1] = tempBoat[0][1] + 1;
                        tempBoat[2][1] = tempBoat[1][1] + 1;
                    } else {
                        tempBoat[1][1] = tempBoat[0][1] - 1;
                        tempBoat[2][1] = tempBoat[1][1] - 1;
                    }
                    break;

                case 1:
                    tempBoat[1][1] = tempBoat[2][1] = tempBoat[0][1];
                    if (tempBoat[0][0] < field[0].length - tempBoat.length) {
                        tempBoat[1][0] = tempBoat[0][0] + 1;
                        tempBoat[2][0] = tempBoat[1][0] + 1;
                    } else {
                        tempBoat[1][0] = tempBoat[0][0] - 1;
                        tempBoat[2][0] = tempBoat[1][0] - 1;
                    }
                    break;
            }

            return tempBoat;
        }

        public void printField() {
            MatrixUtils.printMatrix(this.field);
        }

        public void shoot(int x, int y) {
            if (field[x][y] == 1) {
                System.out.println("Yeah! You hit!");
                System.out.println();
                field[x][y] = 8;
                return;

            } else if (field[x][y] == 0) {
                String hint = y > boat[0][0] ? "You missed!\n HINT: try to the left" : "You missed!\n" +
                        " HINT: try to the right";
                System.out.println(hint);
                System.out.println("### If you have same hints - try shoot upper or lower ###");
                System.out.println();
                return;

            } else {
                System.out.println("You already shooted here");
                System.out.println();
                return;
            }
        }

        public boolean haveBoats() {

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {

                    if (field[i][j] == 1) {
                        return true;
                    }
                }
            }
            return false;
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SeaWarGame game = new SeaWarGame(5, 5);
        game.printField();

        do {

            System.out.println("Input coordinates to shoot");
            game.shoot(scanner.nextInt() - 1, scanner.nextInt() - 1);

        } while (game.haveBoats());

        System.out.println("You win!!!");


    }
}
