package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksConfig;

import java.util.Arrays;
import java.util.List;

public class LinuxUtilities implements OSUtilities {
  private final Environment env;
  public LinuxUtilities(Environment env) {
    this.env = env;
  }

  @Override
  public List<String> getCliExecutableCommand(List<String> cmd) {
    String cmdToString = String.join(" ", cmd);
    return Arrays.asList("/bin/bash", "-c", cmdToString);
  }

  @Override
  public String getDatabricksCliPath() {
    return OSUtils.findExecutable(env.getPath(), "databricks");
  }
}
