package com.databricks.sdk.client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OSUtils {

  // Return the executable command based on OS and tokenize them
  static List<String> getCliExecutableCommand(List<String> cmd) {
    if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
      return Stream.concat(Arrays.asList("cmd.exe", "/c").stream(), cmd.stream())
          .collect(Collectors.toList());
    } else {
      return Stream.concat(Arrays.asList("/bin/bash", "-c").stream(), cmd.stream())
          .collect(Collectors.toList());
    }
  }
}
