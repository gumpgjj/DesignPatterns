package com.megamind.structural.facade;

/**
 * Created by megamind
 * on 2014/4/21.
 * on 10:24
 * Good Life One Day
 */
public class Computer extends Operate {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    @Override
    public void startup() {
        super.startup();
        cpu.startup();
        memory.startup();
        disk.startup();
    }

    @Override
    public void shutdown() {
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        super.shutdown();
    }
}
