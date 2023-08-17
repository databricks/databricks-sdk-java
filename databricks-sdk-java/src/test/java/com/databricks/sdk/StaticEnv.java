package com.databricks.sdk;

import com.databricks.sdk.core.utils.TestOSUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class StaticEnv implements Supplier<Map<String, String>> {
  private static String prefixPath = System.getProperty("user.dir") + TestOSUtils.getTestDir();
  private final Map<String, String> env = new HashMap<>();

  public StaticEnv with(String key, String value) {
    if (key.equals("PATH")) {
      value = prefixPath + value;
    }
    env.put(key, value);
    return this;
  }

  public static String getPrefixPath() {
    return prefixPath;
  }

  @Override
  public Map<String, String> get() {
    return env;
  }
}
