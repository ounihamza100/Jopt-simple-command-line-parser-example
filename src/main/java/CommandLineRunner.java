import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

/**
 * @author Hamza Ouni
 */
public class CommandLineRunner {

    public static void main(String[] args) {

        System.out.println("******  Short and Long options  **********\n");
        OptionParser parser = new OptionParser();
        parser.accepts("d");
        OptionSpec<String> longOption = parser.accepts("fruit").withOptionalArg();
        OptionSet options = parser.parse("-d", "--fruit=apple");
        System.out.println("Has short option? " + options.has("d"));
        System.out.println("Has long option? " + options.has(longOption) + ": " + options.valueOf(longOption));

        System.out.println("\n******  Mandatory and Optional Arguments  **********\n");

        parser = new OptionParser();
        OptionSpec<String> clusterOption = parser
                .accepts("cluster", "cluster name").withRequiredArg();
        try {
            parser.parse("--cluster");
        } catch (Exception e) {
            System.out.println(e);
        }
        options = parser.parse("--cluster=xyz");
        System.out.println("cluster=" + options.valueOf(clusterOption));

        System.out.println("\n******  Cluster Arguments  **********\n");

        parser = new OptionParser();
        parser.accepts("a");
        parser.accepts("b");
        parser.accepts("c");
        options = parser.parse("-abc");
        System.out.println(options.has("a"));
        System.out.println(options.has("b"));
        System.out.println(options.has("c"));
    }
}
