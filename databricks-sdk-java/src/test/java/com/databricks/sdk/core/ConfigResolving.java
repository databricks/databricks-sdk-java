package com.databricks.sdk.core;

import com.databricks.sdk.core.utils.Environment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public interface ConfigResolving {

  default void resolveConfig(DatabricksConfig config, Supplier<Map<String, String>> envGetter) {
    String pathStr = envGetter.get().get("PATH");
    List<String> path = new ArrayList<>();
    if (pathStr != null) {
      path.addAll(Arrays.asList(pathStr.split(":")));
    }
    Environment env = new Environment(envGetter.get(), path, System.getProperty("os.name"));
    config.resolve(env);
  }
}
