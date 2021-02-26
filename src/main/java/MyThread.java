class MyThread extends Thread {

    public MyThread() {
    }



    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2500);
                System.out.println("Я - " + getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
