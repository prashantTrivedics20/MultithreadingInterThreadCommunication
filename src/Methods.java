class Methods extends Thread {
    int total=0;
     public  void run()
    {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}
class Test
{
    public static void main(String[] args) throws InterruptedException {
        Methods obj=new Methods();

        obj.start();
        //System.out.println("Total earnings: "+ obj.total+" rs");
        synchronized (obj)
        {
            obj.wait(10);
            System.out.println("Total earnings: "+ obj.total+" rs");
        }

    }
    }
