

public class HashTable {

    String[] hashTable;
    int size;

    HashTable(int size) {

        this.size = size;
        hashTable = new String[size];

    }

    int hash(int key) {
        return Math.abs(key) % size;
    }

    public void insert(int key, String value) {
        int hash = hash(key);
        hashTable[hash] = value;
    }

    public  String get(int key) {
        int hash = hash(key);
        return hashTable[hash];
    }

    public void delete(int key) {
        int hash = hash(key);
        hashTable[hash] = null;
    }


    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.insert(1,"Ali");
        hashTable.insert(2,"Usman");

        System.out.println(hashTable.get(2));
        System.out.println(hashTable.hash(2));
    }
}