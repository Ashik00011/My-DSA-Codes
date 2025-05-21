public class ThreadExample extends Thread {

    public void run() {
        for (int i=1; i<6;i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
            ThreadExample te = new ThreadExample();
        ThreadExample te1 = new ThreadExample();

        te.start();
        te1.start();


    }
    }

