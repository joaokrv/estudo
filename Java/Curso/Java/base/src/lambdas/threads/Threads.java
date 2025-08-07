package lambdas.threads;

public class Threads {
    public static void main(String[] args) {

        // Processamento em paralelo

        Runnable tarefa1 = new Trabalho1();
        Runnable tarefa2 = new Trabalho1() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i ++){
                    System.out.println("Task #0"+i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }
                }
            }
        };

        Runnable tarefa3 = Threads::tarefa3;

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);
        Thread t3 = new Thread(tarefa3);

        t1.start();
        t2.start();
        t3.start();
    }

    static void tarefa3() {
        for (int i = 0; i < 10; i ++){
            System.out.println("Mission #0"+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

}
