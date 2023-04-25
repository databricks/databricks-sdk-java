package com.databricks.sdk.client;

import java.util.Map;
import java.util.function.Supplier;

public interface ConfigResolving {

  default DatabricksConfig getNewConfig() {
    return new DatabricksConfig();
  }

  default void resolveConfig(DatabricksConfig config, Supplier<Map<String, String>> envGetter) {
    config.resolve(envGetter);
  }
}
