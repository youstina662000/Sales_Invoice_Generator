package Model;

import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.stream.Stream;


public class ModelOperation {

    public void readFile() throws IOException {
        FileReader h = new FileReader("InvoiceHeader.csv");
        FileReader l = new FileReader("InvoiceLine.csv");
        InvoiceHeader arr[] = new InvoiceHeader[100];
        BufferedReader bf;
        String[] a=new String[50];
        String[] b;
        String[] c ;
        Scanner sc;
        String st;



        sc = new Scanner(h);
        sc.useDelimiter("  ,  ");
        bf = new BufferedReader(l);
       for (int i=0;(st= bf.readLine())!=null;i++)
       {
           a[i]=st;
       }

       bf.close();
        while (sc.hasNextLine()) {

            b = sc.nextLine().split(",", 3);
            System.out.println("invoice number : " + b[0]);
            System.out.println("{  " + b[1] + "  " + b[2]);
            int i =0;
            while (a[i]!=null){
                c=a[i].split(",",4);
                if (Integer.parseInt(c[0]) == Integer.parseInt(b[0]))
                    System.out.println(c[1] + " , " + c[2] + " , " + c[3]);
                i++;
            }

            System.out.println("}");
            System.out.println();
        }
        sc.close();
    }

        public void writeFile (String s) throws IOException {
            FileWriter f = new FileWriter("InvoiceHeader.csv",true);
            BufferedWriter bw = new BufferedWriter(f);
            bw.append(s);
            bw.close();


        }

    }
