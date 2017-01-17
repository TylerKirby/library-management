import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;


/**
 * Accepts arguments from the command line.
 */



public class Settings {

    @Parameter
    private List<String> parameters = new ArrayList<String>();

    @Parameter(names = {"-help", "-h"}, description = "List possible commands.")
    private String help = "-help List possible commands.";

    @Parameter(names = {"-addBook", "-a"}, description = "Add book.")
    private String addBook;

}