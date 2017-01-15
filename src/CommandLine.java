import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;


/**
 * Accepts arguments from the command line.
 */



public class CommandLine {


    @Parameter
    private List<String> parameters = new ArrayList<String>();

    @Parameter(names = "-help", description = "List possible commands.")
    private String help = "-help List possible commands.";


    public void welcomeMessage() {
        System.out.println("Welcome to Tyler's Library App! Type \"help\" for list of commands");
    }
}