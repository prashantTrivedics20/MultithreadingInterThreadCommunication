class Mythread56 extends Thread{
    public static Thread obj; //created Static variable of Thread type
    public void run()
    {
        try {
            // MYthread56 will wait until Main thread complete its execution
            obj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("in Mythread56");
        }
    }
}
 class JoinDemo {
    public static void main(String[] args) {
        // Accessing Mythread56 static variable obj to initialize it with current thread
        Mythread56.obj = Thread.currentThread();
        Mythread56 t1 = new Mythread56();
        t1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("in main thread");
        }

    }
}