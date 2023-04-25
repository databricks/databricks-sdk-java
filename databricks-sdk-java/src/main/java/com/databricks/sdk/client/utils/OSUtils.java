package com.databricks.sdk.client.utils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface OSUtils {

  default String getOS() {
    if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
      return "win";
    } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
      return "mac";
    }
    return "linux";
  }

  // Return the executable command based on OS and tokenize them
  default List<String> getCliExecutableCommand(List<String> cmd) {
    if (getOS().equals("win")) {
      return Stream.concat(Stream.of("cmd.exe", "/c"), cmd.stream())
          .collect(Collectors.toList());
    } else {
      return Stream.concat(Stream.of("/bin/bash", "-c"), cmd.stream())
          .collect(Collectors.toList());
    }
  }




}
