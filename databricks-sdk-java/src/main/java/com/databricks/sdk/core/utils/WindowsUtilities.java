package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksConfig;

import java.util.Arrays;
import java.util.List;

public class WindowsUtilities implements OSUtilities {
  private final Environment env;
  public WindowsUtilities(Environment env) {
    this.env = env;
  }

  @Override
  public List<String> getCliExecutableCommand(List<String> cmd) {
    String cmdToString = String.join(" ", cmd);
    return Arrays.asList("cmd.exe", "/c", cmdToString);
  }

  @Override
  public String getDatabricksCliPath() {
    String path = OSUtils.findExecutable(env.getPath(), "databricks");
    if (path == null) {
      path = OSUtils.findExecutable(env.getPath(), "databricks.exe");
    }
    return path;
  }
}
