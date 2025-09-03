import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String> {

    private List<String> mensagens;

    private static LogSimples instance;

    private LogSimples() {
        mensagens = new LinkedList<>();
    }

    public static void log(String m) {
        String logM = LocalDate.now().toString() + " : " + m;
        instance.mensagens.add(logM);
    }

    public static LogSimples getInstance() {
        if (instance == null) {
            instance = new LogSimples();
        }
        return instance;
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
