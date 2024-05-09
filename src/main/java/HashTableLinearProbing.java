// Implements a hash table using closed hashing, linear probing
public class HashTableLinearProbing {
        private HashEntry[] table; // hash table
        private int maxSize; // the maximum number of elements in the table


        public HashTableLinearProbing(int maxSize) {
            table = new HashEntry[maxSize];
            this.maxSize = maxSize;
        }

    /** Efficiently insert a (key, value) pair into the table
     * using closed hashing, linear probing.
     *
     * @param key  key
     * @param value value
     */
    public void put(int key, Object value) {
        int hashIndex =  key % maxSize; // the index where the key hashes
        // FILL IN CODE:
        // if the key is in the table, just replace the value
        // Otherwise:
        // if the index is available, insert there
        // otherwise, search for the available index using linear probing

    }

    // Other methods such as containsKey and get are not shown (and you do not need to write them for the exam).
    // Assume that there is no deletion.

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxSize; i++ ) {
            if (table[i] != null) {
                sb.append(i + ": ");
                sb.append("(" + table[i].getKey() + ", "  + table[i].getValue() + ")");
                sb.append(System.lineSeparator());
            }
            else {
                sb.append(i + ": ");
                sb.append("null");
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HashTableLinearProbing table = new HashTableLinearProbing(7);
        table.put(5, "value for key 5");
        table.put(1, "value for key 1");
        table.put(8, "value for key 8");
        table.put(2, "value for key 2");
        table.put(0, "value for key 0");
        table.put(15, "value for key 15");
        System.out.println(table);

        /* Expected:
        0: (0, value for key 0)
        1: (1, value for key 1)
        2: (8, value for key 8)
        3: (2, value for key 2)
        4: (15, value for key 15)
        5: (5, value for key 5)
        6: null
         */
    }

}
