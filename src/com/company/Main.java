package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int triplet_count = 0;
        int i , j , k, total;

        int[] array = new int[3];
        int[] b = new int[array.length];
        int[][] value = new int[3][3];
        int[][] multi_array = new int[(array.length)][(array.length)];

        // array input

        System.out.println("enter the elements : ");

        for (j = 0 ; j < array.length ; j++){
            array[j] = scanner.nextInt();
        }

        //copying one array to another

        for(i=0;i<array.length;++i){

            b[i]=array[i];
        }

        for (i=0;i<array.length -1 ;i++){

            for(j=1;j<b.length;j++){

                value[i][j] = array[i]*b[j];
            }
        }

        for (i=0;i<array.length;i++){

            for(j=0;j<b.length;j++){

                System.out.println(""+value[i][j]);
            }
        }

        for (i = 0 ; i<array.length ; i++){

            for(j =0 ; j<array.length; j++){

                if(array[j] == value[0][i]){

                    triplet_count = triplet_count +1;
                }
            }
        }

        for (i = 0 ; i<array.length ; i++){

            for(j =0 ; j<array.length; j++){

                if(array[j] == value[1][i]){

                    triplet_count = triplet_count +1;
                }
            }
        }

        System.out.println("trplet count = "+triplet_count);
    }
}
