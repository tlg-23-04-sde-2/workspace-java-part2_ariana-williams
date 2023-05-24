/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package src.com.javatunes.thread;

// TODO: extend the Thread class
public class MessagePrinter implements Runnable {
    private static String message;
    private static int id = 0;
    private long interval;
    private int count = 10;

    public MessagePrinter(String message) {
        this.message = message;
    }

    public MessagePrinter(String message, int interval) {
        this(message);
        this.interval = interval;
    }

    public MessagePrinter(String message, int count, int interval) {
        this(message, interval);
        this.count = count;
    }

    /**
     * TODO: implement run() as follows:
     * It should loop 10 times, printing the 'message' field to stdout,
     * then pausing for some interval (in millis) that you choose.
     * <p>
     * Use a try/catch to call Thread.sleep(interval) for the pause.
     * The sleep() method throws InterruptedException, which you need to catch.
     * You can either leave the catch block empty, or print the exception to stdout.
     */
    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException ignored) {
                ignored.printStackTrace();
            }
        }
    }

}