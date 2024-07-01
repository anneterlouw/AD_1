import Instance.*;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new Reader();
        Instance instance = reader.readInstanceFiles("data/instances-2/instance1.txt");
    }
}
