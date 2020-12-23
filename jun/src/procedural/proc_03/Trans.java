package procedural.proc_03;

import java.io.InputStream;
import java.io.Serializable;

public class Trans implements Serializable {

        public String name;
        public int age;
        public int weight;

        transient public InputStream in = System.in;

}
