package com.databricks.sdk.core;

import com.databricks.sdk.core.utils.Environment;
import java.util.Map;
import java.util.function.Supplier;

public interface ConfigResolving {

  default void resolveConfig(DatabricksConfig config, Supplier<Map<String, String>> envGetter) {
    String[] path = envGetter.get().get("PATH").split(":");
    Environment env = new Environment(envGetter.get(), path);
    config.resolve(env);
  }
}
