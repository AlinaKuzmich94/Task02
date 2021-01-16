package by.htp.Task03.zad2;

//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
    	int count=0;
    	 int i = 0, j = 0;
    	 int n = 6;
        int [] array = new int[n];
        
        for ( j =0; j<array.length; j++) {
			if (array[j] == 0) {
				count++;
			}	
		}
        int [] indexes = new int[count];
        
        for ( j =0; j<array.length; j++) {
        	if(array[i]==0) {
        		indexes[j]=i;
        	}
        	 for(i=0;i<indexes.length;i++)
             {
                 System.out.println(indexes[i]+" ");
             }
        }
        
     
    }

}