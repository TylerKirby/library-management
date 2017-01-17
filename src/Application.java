import com.beust.jcommander.JCommander;

/**
 * Created by Tyler on 1/15/17.
 */
public class Application {

    public static void main(String[] args) {
        Settings settings  = new Settings();
        new JCommander(settings, args);
        System.out.println(args);
    }

}
