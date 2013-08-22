package org.nuprocess.internal;

import java.util.concurrent.CyclicBarrier;

public interface IEventProcessor<T extends BasePosixProcess> extends Runnable
{
    boolean checkAndSetRunning();

    CyclicBarrier getSpawnBarrier();

    void registerProcess(T process);

    void requeueRead(int stdin);

    boolean process();
}
