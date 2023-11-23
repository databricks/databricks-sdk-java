package com.databricks.sdk.core.utils;

import java.util.List;

public interface OSUtilities {
    /**
     * Returns a list of strings representing an executable command for the current operating system,
     * based on the given list of command tokens.
     *
     * @param cmd a list of strings representing the command to be executed.
     * @return a List of strings representing the executable command for the current operating system.
     *     On Windows, the command will be wrapped in "cmd.exe /c" and on other operating systems, it
     *     will be wrapped in "/bin/bash -c".
     */
    List<String> getCliExecutableCommand(List<String> cmd);

    /**
     * Returns the file name of the Databricks CLI for the given OS.
     * @return
     */
    String getDatabricksCliFileName();
}
