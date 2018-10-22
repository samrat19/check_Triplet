package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Test case : ");

        int test_case = scanner.nextInt();

        int[] count = new int[test_case];
        
        for(int terms =0 ; terms < test_case ; terms++){

            count[terms] = count();
        }

        for(int terms =0 ; terms < test_case ; terms++){

            System.out.println("case "+ (terms+1) + " " + " : " + count[terms]);
        }

    }

    private static int count() {

        Scanner scanner = new Scanner(System.in);
        int triplet_count = 0;
        int i , j;

        System.out.println("No of Elements : ");
        int elements = scanner.nextInt();

        int[] array = new int[elements];
        int[] b = new int[array.length];
        int[][] value = new int[array.length][array.length];

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

        for (i = 0 ; i<array.length ; i++){

            for(j =0 ; j<array.length; j++){

                if(array[j] == value[0][i]){

                    // it is printing the matched elements

                    System.out.println("" + value[0][i]);
                    triplet_count = triplet_count +1;
                }
            }
        }

        for (i = 0 ; i<array.length ; i++){

            for(j =0 ; j<array.length; j++){

                if(array[j] == value[1][i]){

                    // it is printing the matched elements

                    System.out.println("" + value[1][i]);
                    triplet_count = triplet_count +1;
                }
            }
        }

        return  triplet_count ;
    }
}
