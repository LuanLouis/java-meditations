package concurrent.v6;

import java.util.concurrent.Executor;

/**
 * 直接在当前线程中执行Task, 即一个需要被完成的代码段
 *
 * Created by DT on 16/4/6.
 */
public class DirectExecutor implements Executor {



    public void execute(final Runnable command) {

        command.run();


    }
}
