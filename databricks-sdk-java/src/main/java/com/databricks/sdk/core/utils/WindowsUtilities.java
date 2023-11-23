package com.databricks.sdk.core.utils;

import java.util.Arrays;
import java.util.List;

public class WindowsUtilities implements OSUtilities {
    @Override
    public List<String> getCliExecutableCommand(List<String> cmd) {
        String cmdToString = String.join(" ", cmd);
        return Arrays.asList("cmd.exe", "/c", cmdToString);
    }

    @Override
    public String getDatabricksCliFileName() {
        return "databricks.exe";
    }
}
