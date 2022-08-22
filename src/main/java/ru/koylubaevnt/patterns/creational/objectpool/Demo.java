package ru.koylubaevnt.patterns.creational.objectpool;

import ru.koylubaevnt.patterns.creational.objectpool.base.ObjectPool;
import ru.koylubaevnt.patterns.creational.objectpool.base.Resource;

public class Demo {

    public static void main(String[] args) {
        ObjectPool objectPool = ObjectPool.getInstance();
        for (int i = 0; i < 10; i++) {
            Resource resource = new Resource();
            resource.setValue(i);
            objectPool.release(resource);
        }

        for (int i = 0; i < 20; i++) {
            Resource resource = objectPool.acquire();
            System.out.println(i + ": " + resource);
            objectPool.release(resource);
        }
    }
}
