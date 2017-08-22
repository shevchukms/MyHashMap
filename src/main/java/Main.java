public class Main {

    public static void main(String[] args) {
        MyHashMap tmhm = new MyHashMap();

        System.out.println("============== Adding Element ===================");
        Student e1 = new Student(100, "Misha");
        tmhm.put(e1, "dept1");


        // duplicate
        System.out
                .println("============== Adding Duplicate ===================");
        Student e1_dup = new Student(100, "Niranjan");
        tmhm.put(e1_dup, "dept12");
        // the above value "dept12" should replace the old value "dept1"
        MyEntry e = tmhm.get(e1_dup);
        System.out.println("GET element - " + e.getKey() + "::" + e.getValue());

        System.out
                .println("============== Adding Elements ===================");
        Student e2 = new Student(102, "Sravan");
        tmhm.put(e2, "dept3");

        Student e3 = new Student(104, "Ananth");
        tmhm.put(e3, "dept2");

        Student e4 = new Student(106, "Rakesh");
        tmhm.put(e4, "dept5");

        Student e5 = new Student(108, "Shashi");
        tmhm.put(e5, "dept2");

        // collision with e2
        System.out
                .println("============== Adding Collisions ===================");
        Student e2_collision = new Student(112, "Chandu");
        tmhm.put(e2_collision, "dept16");
        e = tmhm.get(e2_collision);
        System.out.println("GET element - " + e.getKey() + "::" + e.getValue());

        // collision with e3
        Student e3_collision = new Student(114, "Santhosh");
        tmhm.put(e3_collision, "dept9");
        e = tmhm.get(e3_collision);
        System.out.println("GET element - " + e.getKey() + "::" + e.getValue());

        System.out
                .println("============== Adding Duplicate in Collision ===================");
        Student e3_collision_dupe = new Student(124, "Santhosh");
        tmhm.put(e3_collision_dupe, "dept91");
        e = tmhm.get(e3_collision_dupe);
        System.out.println("GET element - " + e.getKey() + "::" + e.getValue());


        System.out.println( tmhm.get(e3_collision_dupe).value);

    }


}

