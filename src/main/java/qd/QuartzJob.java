package qd;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenguangjian on  0016.
 */
public class QuartzJob {
    private static int counter = 0;
    public void work1() {

        SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd:HH:mm:ss]");
        String now = sdf.format(new Date());
        System.out.println(now + " " + "Quartz的任务调度！！！work1启用……" + counter++);
    }

    public void work2() {
        SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd:HH:mm:ss]");
        String now = sdf.format(new Date());
        System.out.println(now + " " + "Quartz的任务调度！！！work2启用……"+ counter++);
    }
}
