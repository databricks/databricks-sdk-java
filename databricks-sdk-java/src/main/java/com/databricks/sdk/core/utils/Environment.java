package com.databricks.sdk.core.utils;

import java.util.Map;

public class Environment {
  private final Map<String, String> env;
  private final String path;
  public Environment(Map<String, String> map, String path) {
    this.env = map;
    this.path = path;
  }

  public String get(String key) {
    return env.get(key);
  }

  public Map<String, String> getEnv() {
    return env;
  }

  public String getPath() {
    return path;
  }
}
