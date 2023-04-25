package com.databricks.sdk.client;

import java.util.Map;
import java.util.function.Supplier;

public interface ConfigResolving {
    default DatabricksConfig resolvedConfig(Supplier<Map<String, String>> envGetter) {
        return new DatabricksConfig().resolve(envGetter);
    }
}
