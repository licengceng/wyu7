package Sep_17;

/**
 * @author LWQ
 * @title: ThreadPoolTask
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1718:52
 */
public class ThreadPoolTask implements Runnable{
    private Object attachData;

    ThreadPoolTask(Object tasks) {
        this.attachData = tasks;
    }

    public void run() {
        try {
            System.out.println("开始执行任务：" + attachData + "任务，使用的线程池，线程名称：" + Thread.currentThread().getName());
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        attachData = null;
    }
}
