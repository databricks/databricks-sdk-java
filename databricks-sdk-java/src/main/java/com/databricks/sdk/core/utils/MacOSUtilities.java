package com.databricks.sdk.core.utils;

import java.util.Arrays;
import java.util.List;

public class MacOSUtilities implements OSUtilities {
  @Override
  public List<String> getCliExecutableCommand(List<String> cmd) {
    String cmdToString = String.join(" ", cmd);
    return Arrays.asList("/bin/bash", "-c", cmdToString);
  }

  @Override
  public String getDatabricksCliPath() {
    return OSUtils.findExecutable("databricks");
  }
}
