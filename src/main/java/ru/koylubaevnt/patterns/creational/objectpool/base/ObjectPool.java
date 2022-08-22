package ru.koylubaevnt.patterns.creational.objectpool.base;

import java.util.LinkedList;
import java.util.Queue;

public class ObjectPool {

    private Queue<Resource> resources = new LinkedList<>();

    private static ObjectPool instance;

    private ObjectPool() { }

    public static ObjectPool getInstance() {
        if (instance == null) {
            instance = new ObjectPool();
        }
        return instance;
    }

    public Resource acquire() {
        if (resources.isEmpty()) {
            System.out.println("Creating new.");
            return new Resource();
        } else {
            System.out.println("Reusing existing.");
            return resources.poll();
        }
    }

    public void release(Resource resource) {
        resources.offer(resource);
    }
}
