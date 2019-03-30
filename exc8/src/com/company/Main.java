package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a[][] = new String[3][3];
        int[] xR = new int[3];
        int[] xC = new int[3];
        int[] xD = new int[2];

        int[] yR = new int[3];
        int[] yC = new int[3];
        int[] yD = new int[2];

        int win = 0;

        Arrays.fill(xR, 0);
        Arrays.fill(xC, 0);
        Arrays.fill(xD, 0);

        Arrays.fill(yR, 0);
        Arrays.fill(yC, 0);
        Arrays.fill(yD, 0);

        int r, c;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                a[i][j] = " ";
            }
        }
        System.out.println(" 0.0 | 0.1 | 0.2 ");
        System.out.println("-----|-----|-----");
        System.out.println(" 1.0 | 1.1 | 1.2 ");
        System.out.println("-----|-----|-----");
        System.out.println(" 2.0 | 2.1 | 2.2 ");


        System.out.println("Starts X :");
        int k = 1;
        while(win == 0) {
            if (k == 1) {
                System.out.println(a[0][0] + "|" + a[0][1] + "|" + a[0][2]);
                System.out.println("-|-|-");
                System.out.println(a[1][0] + "|" + a[1][1] + "|" + a[1][2]);
                System.out.println("-|-|-");
                System.out.println(a[2][0] + "|" + a[2][1] + "|" + a[2][2]);
                System.out.println("Where you want to put your char ? pata th grammh kai th sthlh :");
                Scanner n = new Scanner(System.in);

                r = n.nextInt();
                c = n.nextInt();
                if (a[r][c] == " ") {
                    a[r][c] = "X";
                    k = 2;

                    xR[r] += 1;
                    if (xR[r] == 3) {
                        win = 1;
                    }

                    xC[c] += 1;
                    if (xC[c] == 3) {
                        win = 1;
                    }

                    if (r == c) {
                        xD[0] += 1;
                        if (xD[0] == 3) {
                            win = 1;
                        }
                        if (r == 1) {
                            xD[1] += 1;
                            if (xD[1] == 3) {
                                win = 1;
                            }
                        }
                    } else if (r == 2 && c == 0){
                        xD[1] += 1;
                        if (xD[1] == 3) {
                            win = 1;
                        }
                    } else if (r == 0 && c == 2) {
                        xD[1] += 1;
                        if (xD[1] == 3) {
                            win = 1;
                        }
                    }

                } else {
                    System.out.println("give another place is already useable  ");

                }

            } else if (k == 2) {

                System.out.println(a[0][0] + "|" + a[0][1] + "|" + a[0][2]);
                System.out.println("-|-|-");
                System.out.println(a[1][0] + "|" + a[1][1] + "|" + a[1][2]);
                System.out.println("-|-|-");
                System.out.println(a[2][0] + "|" + a[2][1] + "|" + a[2][2]);
                System.out.println("Where you want to put your char ? pata th grammh kai th sthlh :");
                Scanner n = new Scanner(System.in);
                r = n.nextInt();
                c = n.nextInt();
                if (a[r][c] == " ") {
                    a[r][c] = "O";
                    k = 1;

                    yR[r] += 1;
                    if (yR[r] == 3) {
                        win = 2;
                        
                    }

                    yC[c] += 1;
                    if (yC[c] == 3) {
                        win = 2;
                        
                    }

                    if (r == c) {
                        yD[0] += 1;
                        if (yD[0] == 3) {
                            win = 2;
                            
                        }
                        if (r == 1) {
                            yD[1] += 1;
                            if (yD[1] == 3) {
                                win = 2;
                                
                            }
                        }
                    } else if (r == 2 && c == 0){
                        yD[1] += 1;
                        if (yD[1] == 3) {
                            win = 2;
                            
                        }
                    } else if (r == 0 && c == 2) {
                        yD[1] += 1;
                        if (yD[1] == 3) {
                            win = 2;
                            
                        }
                    }
                } else {
                    System.out.println("give another place is already useable  ");

                }

            }
        }
        System.out.println(a[0][0] + "|" + a[0][1] + "|" + a[0][2]);
        System.out.println("-|-|-");
        System.out.println(a[1][0] + "|" + a[1][1] + "|" + a[1][2]);
        System.out.println("-|-|-");
        System.out.println(a[2][0] + "|" + a[2][1] + "|" + a[2][2]);
        if (win==1){
            System.out.println("WINNER IS X !!!");
        }else if(win==2){
            System.out.println("WINNER IS O !!!");
        }else {
            System.out.println("DRAW!!!");
        }


    }

}
