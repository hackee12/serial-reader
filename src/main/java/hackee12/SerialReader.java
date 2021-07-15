package hackee12;

import java.util.List;

public interface SerialReader<E> {

    boolean hasNextEntry();

    E getNextEntry();

    List<E> getAllEntries();
}
