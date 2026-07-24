// created by ali_h at 2026-07-24 15:46

package others;

import java.util.Scanner;

public class ArrayDemo {

    private int[] arr;
    private int size;

    public ArrayDemo(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int element) {
        if (size >= arr.length) {
            System.out.println("Array is full!");
            return;
        }
        arr[size] = element;
        size++;
    }

    public void printArray() {
        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public int search(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Element deleted successfully.");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDemo array = new ArrayDemo(10);

        System.out.println("== Array Data Structure Demo ===");

        // Insert some elements
        array.insert(5);
        array.insert(12);
        array.insert(7);
        array.insert(23);
        array.insert(23);
        array.insert(45);

        array.printArray();

        System.out.println("Current size: " + array.getSize());

        // Search example
        System.out.print("Enter number to search: ");
        int searchNum = scanner.nextInt();
        int result = array.search(searchNum);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found!");
        }

        // Delete Example
        System.out.print("Enter index to delete: ");
        int deleteIndex = scanner.nextInt();
        array.delete(deleteIndex);

        array.printArray();
        scanner.close();
    }
}
