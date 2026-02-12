import java.util.HashMap;
import java.util.Map;

class MapSum {

    // Trie Node
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int sum = 0;   // sum of all keys passing this prefix
    }

    private TrieNode root;
    private Map<String, Integer> map;  // store existing key values

    public MapSum() {
        root = new TrieNode();
        map = new HashMap<>();
    }

    // Insert key with value
    public void insert(String key, int val) {

        // Get old value (0 if not exists)
        int oldValue = map.getOrDefault(key, 0);

        // Calculate difference
        int diff = val - oldValue;

        // Update map
        map.put(key, val);

        TrieNode current = root;

        for (char c : key.toCharArray()) {
            int index = c - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];

            // Update prefix sum using diff
            current.sum += diff;
        }
    }

    // Return sum of all keys with given prefix
    public int sum(String prefix) {

        TrieNode current = root;

        for (char c : prefix.toCharArray()) {
            int index = c - 'a';

            if (current.children[index] == null) {
                return 0;  // prefix not found
            }

            current = current.children[index];
        }

        return current.sum;
    }

    // Test
    public static void main(String[] args) {

        MapSum mapSum = new MapSum();

        mapSum.insert("apple", 3);
        mapSum.insert("app", 2);

        System.out.println(mapSum.sum("ap"));   // 5

        mapSum.insert("apple", 10);

        System.out.println(mapSum.sum("ap"));   // 12
    }
}
