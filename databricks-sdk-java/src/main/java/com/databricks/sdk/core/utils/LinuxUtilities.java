package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksConfig;

import java.util.Arrays;
import java.util.List;

public class LinuxUtilities implements OSUtilities {
  private final DatabricksConfig config;
  public LinuxUtilities(DatabricksConfig config) {
    this.config = config;
  }

  @Override
  public List<String> getCliExecutableCommand(List<String> cmd) {
    String cmdToString = String.join(" ", cmd);
    return Arrays.asList("/bin/bash", "-c", cmdToString);
  }

  @Override
  public String getDatabricksCliPath() {
    return OSUtils.findExecutable(config, "databricks");
  }
}
