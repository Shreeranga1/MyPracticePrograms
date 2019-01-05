public class threadPriority {
    public static void main(String[] args) {
         thread t=new thread();
         t.setPriority(10);
         t.start();
         for (int i=0;i<20;i++)
             System.out.println("main thread");
    }
}
