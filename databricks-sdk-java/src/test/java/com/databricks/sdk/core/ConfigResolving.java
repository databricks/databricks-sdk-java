package com.databricks.sdk.core;

import com.databricks.sdk.core.utils.Environment;

import java.util.Map;
import java.util.function.Supplier;

public interface ConfigResolving {

  default void resolveConfig(DatabricksConfig config, Supplier<Map<String, String>> envGetter) {
    Environment env = new Environment(envGetter.get(), envGetter.get().get("PATH"));
    config.resolve(env);
  }
}
