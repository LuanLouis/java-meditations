package concurrent.v6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/**
 * Created by DT on 16/4/6.
 */
public class SerialExecutor implements Executor {

    private Queue<Runnable> runnables = new ArrayDeque<Runnable>();

    final Executor executor;

    private Runnable active;


    public SerialExecutor(Executor executor) {
        this.executor = executor;
    }


    public void execute(final Runnable command) {

        runnables.offer(new Runnable() {
            public void run() {

                try{
                    command.run();
                }
                finally {
                    scheduleNext();
                }
            }
        });

        if (active == null){
            scheduleNext();
        }


    }

    private void scheduleNext(){
            if ((active = runnables.poll()) !=null)
            {
                execute(active);
            }
    }




}
