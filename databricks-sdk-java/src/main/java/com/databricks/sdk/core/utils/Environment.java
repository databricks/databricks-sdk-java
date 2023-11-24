package com.databricks.sdk.core.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Environment {
  private final Map<String, String> env;
  private final List<String> path;

  public Environment(Map<String, String> map, String[] path) {
    this(map, Arrays.asList(path));
  }

  public Environment(Map<String, String> map, List<String> path) {
    this.env = map;
    this.path = path;
  }

  public String get(String key) {
    return env.get(key);
  }

  public Map<String, String> getEnv() {
    return env;
  }

  public List<String> getPath() {
    return path;
  }
}
