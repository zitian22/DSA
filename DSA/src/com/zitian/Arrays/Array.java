package com.zitian.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];

    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }
    
    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;

    }
    
    public int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (items[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int max() {
        int max = items[0];
        for (int i = 1; i < count; i++)
            if (items[i] > max)
                max = items[i];

        return max;
    }

    public Array intersect(Array compareArray) {
        Array intersection = new Array(count);

        for (int i = 0; i < count; i++) {
            int current = items[i];
            if (compareArray.indexOf(current) != -1)
                if (intersection.indexOf(current) == -1)
                    intersection.insert(current);
        }

        return intersection;
    }

    public void reverse() {
        int[] reverseArray = new int[count];
        for (int i = 0; i < count; i++)
            reverseArray[i] = items[count - 1 - i];

        items = reverseArray;
    }
    
    public void insertAt(int item, int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        }
        for (int i = count++; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = item;
        //count++;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
    
}
