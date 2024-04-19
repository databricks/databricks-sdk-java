package com.databricks.sdk.core;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Objects;

class ConfigAttributeAccessor {
  private final ConfigAttribute configAttribute;
  private final Field field;

  private final String configFileAttribute;

  public ConfigAttributeAccessor(ConfigAttribute configAttribute, Field field) {
    this.configAttribute = configAttribute;
    this.field = field;
    this.configFileAttribute = toSnakeCase(field.getName());
  }

  public String getName() {
    return configFileAttribute;
  }

  public String getEnvVariable() {
    return configAttribute.env();
  }

  public Boolean isSensitive() {
    return configAttribute.sensitive();
  }

  public String getEnv(Map<String, String> getEnv) {
    if (configAttribute.env().isEmpty()) {
      return "";
    }
    return getEnv.get(configAttribute.env());
  }

  public void setValueOnConfig(DatabricksConfig cfg, String value) throws IllegalAccessException {
    // Synchronize on field across all methods which alter its accessibility to ensure
    // multi threaded access of these objects (e.g. in the example of concurrent creation of
    // workspace clients or config resolution) are safe
    synchronized (field) {
      field.setAccessible(true);
      if (field.getType() == String.class) {
        field.set(cfg, value);
      } else if (field.getType() == int.class) {
        field.set(cfg, Integer.parseInt(value));
      } else if (field.getType() == boolean.class) {
        field.set(cfg, Boolean.parseBoolean(value));
      } else if (field.getType() == ProxyConfig.ProxyAuthType.class) {
        if (value != null) {
          field.set(cfg, ProxyConfig.ProxyAuthType.valueOf(value));
        }
      }
      field.setAccessible(false);
    }
  }

  public Object getValueFromConfig(DatabricksConfig cfg) throws IllegalAccessException {
    synchronized (field) {
      field.setAccessible(true);
      Object value = field.get(cfg);
      field.setAccessible(false);
      return value;
    }
  }

  public String getAuthType() {
    return configAttribute.auth();
  }

  @Override
  public String toString() {
    String repr = configFileAttribute;
    if (!Objects.equals(configAttribute.env(), "")) {
      repr += "(env: " + configAttribute.env() + ")";
    }
    return repr;
  }

  public String getAsString(Object value) {
    return value.toString();
  }

  private String toSnakeCase(String name) {
    StringBuilder snakeCase = new StringBuilder();
    for (int i = 0; i < name.length(); i++) {
      char c = name.charAt(i);
      if (Character.isUpperCase(c)) {
        snakeCase.append("_").append(Character.toLowerCase(c));
      } else {
        snakeCase.append(c);
      }
    }
    return snakeCase.toString().toLowerCase();
  }
}
