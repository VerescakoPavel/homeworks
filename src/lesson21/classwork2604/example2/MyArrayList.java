package lesson21.classwork2604.example2;

public class MyArrayList {
    private String[] array;
    private int size;

    public MyArrayList(int initialSize) {
        size = initialSize;
        array = new String[size];

    }

    public int getSize() {
        return size;
    }

    public MyArrayList() {
        this(0);
    }

    public String get(int index) {
        return array[index];
    }

    public void set(int index, String val) {
        array[index] = val;
    }

    public int indexOf(String val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(val)) {
                return i;
            }


        }
        return -1;
    }

    public boolean contains(String value) {
        return indexOf(value) != -1;
    }

    public void resize(int newSize) {


        String[] temp = new String[newSize];
        int minSize = (Math.min(size, newSize));
        for (int i = 0; i < minSize; i++) {
            array[i] = temp[i];
        }
        array = temp;
        size = newSize;
    }

    public void add(String value) {
        if (size + 1 > array.length) {
            resize(size + 1);
            array[size - 1] = value;
        }
        else {
            array[size - 1] = value;
            size++;
        }
    }
    public void remove(int index) {
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
}