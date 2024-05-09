/**
 * An entry in the hash table. Stores a key and a corresponding value
 */
public class HashEntry {
    private int key;
    private Object value;

    /**
     * Constructor for class HashEntry
     *
     * @param key   key
     * @param value corresponding value
     */
    public HashEntry(int key, Object value) {
        this.key = key;
        this.value = value;
    }


    /**
     * Returns the key stored in the entry
     * @return key
     */
    public int getKey() {
        return key;
    }

    /**
     * Returns the value stored in the entry
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * String representation of the HashEntry in the form (key, value, deleted)
     * @return String representation of the HashEntry
     */
    @Override
    public String toString() {
        return "(" + key + ", " + value.toString() + ")";
    }

}
