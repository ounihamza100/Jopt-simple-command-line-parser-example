package cli;

import cli.options.OptionHelp;

import java.util.Collection;
import java.util.Collections;

/**
 * @author Hamza Ouni
 */
public abstract class AbstractCommand implements Command {

    private final String name;

    private final String description;

    /**
     * Create a new {@link AbstractCommand} instance.
     * @param name the name of the command
     * @param description the command description
     */
    protected AbstractCommand(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return this.name;
    }


    public String getDescription() {
        return this.description;
    }


    public String getUsageHelp() {
        return null;
    }


    public String getHelp() {
        return null;
    }


    public Collection<OptionHelp> getOptionsHelp() {
        return Collections.emptyList();
    }


    public Collection<HelpExample> getExamples() {
        return null;
    }

}
