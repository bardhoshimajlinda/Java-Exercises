package JavaAdvanceCoding;
import java.util.HashSet;
import java.util.Set;

/* Implement the SDAHashSet<E> class that will implement the HashSet<E> logic. It should support methods:
  • add
  • remove
  • size
  • contains
  • clear */
public class Exercise5 {
    public static void main(String[] args) {
        SDAHashSet<String> set = new SDAHashSet<>();
        set.add("Wendy");
        set.add("Jane");
        set.add("Bob");
        System.out.println(set.size());
        set.remove("Jane");
        System.out.println(set.size());
        System.out.println(set.contains("Jon"));
        set.clear();
        System.out.println(set.size());
    }

    static class SDAHashSet<E> {
        private Set<E> data = new HashSet<>();

        public int size() {
            return data.size();
        }

        public boolean contains(E e) {
            return data.contains(e);
        }

        public boolean add(E e) {
            return data.add(e);
        }

        public boolean remove(E e) {
            return data.remove(e);
        }

        public void clear() {
            data.clear();
        }
    }
}
