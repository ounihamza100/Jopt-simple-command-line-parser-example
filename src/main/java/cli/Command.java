package cli;

import cli.options.OptionHelp;

import java.util.Collection;

/**
 * A single command that can be run from the CLI.
 *
 * @author Hamza Ouni
 */
public interface Command {

    /**
     * Returns the name of the command.
     * @return the command's name
     */
    String getName();

    /**
     * Returns a description of the command.
     * @return the command's description
     */
    String getDescription();

    /**
     * Returns usage help for the command. This should be a simple one-line string
     * describing basic usage. e.g. '[options] &lt;file&gt;'. Do not include the name of
     * the command in this string.
     * @return the command's usage help
     */
    String getUsageHelp();

    /**
     * Gets full help text for the command, e.g. a longer description and one line per
     * option.
     * @return the command's help text
     */
    String getHelp();

    /**
     * Return some examples for the command.
     * @return the command's examples
     */
    Collection<HelpExample> getExamples();

    /**
     * Returns help for each supported option.
     * @return help for each of the command's options
     */
    Collection<OptionHelp> getOptionsHelp();

    /**
     * Run the command.
     * @param args command arguments (this will not include the command itself)
     * @return the outcome of the command
     * @throws Exception if the command fails
     */
    ExitStatus run(String... args) throws Exception;

}
