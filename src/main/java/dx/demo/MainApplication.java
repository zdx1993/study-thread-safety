package dx.demo;

public class MainApplication {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            Count count = new Count();

            public void run() {
                count.count();
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}
