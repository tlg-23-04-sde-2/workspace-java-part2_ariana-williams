/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package src.com.javatunes.thread;

public class MessagePrinterClient {

    public static void main(String[] args) {

        Runnable printer1 = new MessagePrinter("roses are red", 10, 3000);
        Thread thr1 = new Thread(printer1, "message printer-1");
        thr1.start();

        Runnable printer2 = new MessagePrinter("violets are blue", 100, 200);
        Thread thr2 = new Thread(printer2, "message printer-2");
        thr2.start();

        Runnable printer3 = new MessagePrinter("sugar is sweet");
        Thread thr3 = new Thread(printer3, "message printer-3");
        thr3.start();

        Runnable printer4 = new MessagePrinter("and so are you", 16, 2000);
        Thread thr4 = new Thread(printer4, "message printer-4");
        thr4.start();
    }
}