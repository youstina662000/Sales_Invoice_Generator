package Controller;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("press 1 to read files and 2 to write into the files");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        ModelOperation mo = new ModelOperation();


        switch (x){
            case 2:try {


                System.out.println("Please enter the details of the Invoice(Number,Date,Name) separated by (,) " );
                String s =sc.next();
                mo.writeFile(s);


            }
            catch (IOException e){
                e.printStackTrace();
            }
                break;



            case 1:
                try{
                    mo.readFile();

                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            default: System.out.println("you didn`t choose an action");break;
        } }
}
