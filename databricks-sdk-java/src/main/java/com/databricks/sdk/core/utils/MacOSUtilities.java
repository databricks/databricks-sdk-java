package com.databricks.sdk.core.utils;

import com.databricks.sdk.support.InternalApi;
import java.util.Arrays;
import java.util.List;

/** MacOS specific utilities. */
@InternalApi
public class MacOSUtilities implements OSUtilities {
  private final Environment env;

  public MacOSUtilities(Environment env) {
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
