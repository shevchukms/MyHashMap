import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHashMapTest {
    @Before
    public void setUp() throws Exception {
    }
    @Test   public void testMapMap() {
        MyHashMap<String, Integer> map = new MyHashMap<String, Integer>();
        map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 1);
        assertEquals(map.get("Lars").getValue(), 1);
        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), i);
        }
      //  assertEquals(map.size(), 101);
       // assertEquals(map.get("51").getValue(), 51);
    }

}