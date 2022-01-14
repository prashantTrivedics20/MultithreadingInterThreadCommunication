 class DaemonThreadDemo extends Thread {
    public void run()
    {
//        if(Thread.currentThread().isDaemon())
//        {
//            System.out.println("daemon thread");
//        }
//        else
//        {
//            System.out.println("child thread");
//        }
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Daemon thread");
    }
}
class Test1
{
    public static void main(String[] args) {
        System.out.println("Main thread");
        DaemonThreadDemo obj=new DaemonThreadDemo();
        obj.setDaemon(true);
        obj.start();
    }
}
