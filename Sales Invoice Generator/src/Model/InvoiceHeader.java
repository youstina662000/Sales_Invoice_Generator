package Model;

import java.util.Date;

public class InvoiceHeader {
    String invoiceNaumber;
    String customerName;
     String invoiceDate;
     InvoiceLine [] IL =new InvoiceLine [100] ;

    public InvoiceHeader(String []x) {
        invoiceNaumber=x[0];
        customerName=x[1];
         invoiceDate=x[2];


    }


}
