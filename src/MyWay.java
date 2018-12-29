/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1320100069
 */
import java.util.*;
public class MyWay {

    /**
     * @param args the command line arguments
     */
    //static int sum;
    static int [][]a;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner B=new Scanner(System.in);
        a=new int[3][3];
        System.out.println("Give Inputs");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=B.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        
        System.out.println("Sum : "+Movement(a,0,0));
        

        
    }
    public static int Movement(int a[][],int i,int j)
    {
        
        if(i==2&&j==2)
        {
            return a[i][j];
        }
        else if(i==2) //if pointer comes to edge of row then it will add all the collumns
        {
            return a[i][j]+Movement(a,i,j+1);
        }
        else if(j==2) //if pointer comes to edge of collumns then it will add all the row
        {
            return a[i][j]+Movement(a,i+1,j);
        }
        int n1=a[i][j]+Movement(a,i,j+1);
        int n2=a[i][j]+Movement(a,i+1,j);
        if(n1>n2)
        {
            return n1;
        }
        return n2;

    }

    
}

