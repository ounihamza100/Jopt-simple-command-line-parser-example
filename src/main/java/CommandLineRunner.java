import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

/**
 * @author Hamza Ouni
 */
public class CommandLineRunner {

    public static void main(String[] args) {

        System.out.println("******  Short and Long options  **********");
        OptionParser parser = new OptionParser();
        parser.accepts("d");
        OptionSpec<String> longOption = parser.accepts("fruit").withOptionalArg();
        OptionSet options = parser.parse("-d", "--fruit=apple");
        System.out.println("Has short option? " + options.has("d"));
        System.out.println("Has long option? " + options.has(longOption) + ": " + options.valueOf(longOption));
    }
}
