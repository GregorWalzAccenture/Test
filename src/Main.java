import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        List<String> list = new ArrayList<>() {};

        for (String a : list) {}
        List<String> list2 = new ArrayList<>();
        List<Object123> object123List = new ArrayList<>();
        Map<Integer, Object123> map = new Map<Integer, Object123>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object123 get(Object key) {
                return null;
            }

            @Override
            public Object123 put(Integer key, Object123 value) {
                return null;
            }

            @Override
            public Object123 remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Integer, ? extends Object123> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Integer> keySet() {
                return null;
            }

            @Override
            public Collection<Object123> values() {
                return null;
            }

            @Override
            public Set<Entry<Integer, Object123>> entrySet() {
                return null;
            }
        };
        int a;
        int b;
        a = b = 5;
        if (a == b) {
            System.out.printf("");
            {
                {
                    {
                    }
                }
            }

            b = a++ + ++a + a++;
            /*System.out.println(b);
            System.out.println(a);*/
            Object123 obj1 = new Object123(a);
            obj1.m=9;
            obj1.n=9;

            Object123 obj2 = new Object123(a);
            System.out.println("Object 1");
            System.out.println(obj1.m);
            System.out.println(obj1.n);
            System.out.println("Object 2");
            System.out.println(obj2.m);
            System.out.println(obj2.n);
            System.out.println(obj1 instanceof Object123);



        }
    }
}
