class MultiThreadExample extends Thread {

    String taskName;

    MultiThreadExample(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + ": " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        MultiThreadExample t1 = new MultiThreadExample("Task 1");
        MultiThreadExample t2 = new MultiThreadExample("Task 2");

        t1.start();
        t2.start();
    }
}