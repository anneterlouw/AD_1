package Instance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Reader {
    public Instance readInstanceFiles(String fileName) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileReader(fileName))){
            int nbItems = scanner.nextInt();
            int capacity = scanner.nextInt();
            int[] itemValues = new int[nbItems];
            for (int i=0;i<nbItems;i++){
                itemValues[i] = scanner.nextInt();
            }
            int[] itemWeights = new int[nbItems];
            for (int i=0;i<nbItems;i++){
                itemWeights[i] = scanner.nextInt();
            }
            return new Instance(nbItems,capacity,itemValues,itemWeights);
        }
    }
}
