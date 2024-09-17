import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO complete this psvm main method to replicate the timing experiment from adts.py.
        //      Note: this will be client code of the various other classes needing to be written.
        MultiSet[] multisets = {new TreeMultiSet()};

        // Profile each multiset for various sizes
        int[] sizes = {500, 1000, 2000, 4000};
        for (MultiSet multiset : multisets) {
            for (int size : sizes) {
                profileMultiSet(multiset, size);
            }
        }
    }
}