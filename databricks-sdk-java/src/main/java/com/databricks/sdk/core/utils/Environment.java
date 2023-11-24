package com.databricks.sdk.core.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Environment {
  private final Map<String, String> env;
  private final List<String> path;
  private final String systemName;

  public Environment(Map<String, String> map, String[] path, String systemName) {
    this(map, Arrays.asList(path), systemName);
  }

  public Environment(Map<String, String> map, List<String> path, String systemName) {
    this.env = map;
    this.path = path;
    this.systemName = systemName;
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

  public String getSystemName() {
    return systemName;
  }
}
