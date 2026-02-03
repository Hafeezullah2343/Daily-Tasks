/**
 * Custom dynamic array implementation similar to ArrayList.
 */
public class CustomArray {

    private int[] data;
    private int size;

    public CustomArray() {
        data = new int[5];
        size = 0;
    }

    /* ================= ADD ================= */

    public void add(int element) {
        ensureCapacity();
        data[size++] = element;
    }

    /* ================= INSERT ================= */

    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        ensureCapacity();

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    /* ================= DELETE ================= */

    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    /* ================= UPDATE ================= */

    public void update(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        data[index] = element;
    }

    /* ================= SEARCH ================= */

    // Linear search (works on unsorted array)
    public int linearSearch(int element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Binary search (array must be sorted)
    public int binarySearch(int element) {
        int start = 0, end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (data[mid] == element) return mid;
            else if (element < data[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    /* ================= SORT ================= */

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < size - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    /* ================= REVERSE ================= */

    public void reverse() {
        int left = 0, right = size - 1;

        while (left < right) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
    }

    /* ================= UTILITY ================= */

    private void ensureCapacity() {
        if (size == data.length) {
            int[] newArray = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newArray[i] = data[i];
            }
            data = newArray;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("]");
    }

    /* ================= MAIN ================= */

    public static void main(String[] args) {
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        array.display();

        array.insert(1, 100);
        array.display();

        array.delete(2);
        array.display();

        array.update(1, 999);
        array.display();

        array.sort();
        array.display();

        array.reverse();
        array.display();

        System.out.println("Search 30: " + array.linearSearch(30));
        System.out.println("Size: " + array.size());
    }
}
