package com.databricks.sdk.client;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Objects;

class ConfigAttributeAccessor {
  private ConfigAttribute configAttribute;
  private Field field;

  /**
   * <p>Constructor for ConfigAttributeAccessor.</p>
   *
   * @param configAttribute a {@link com.databricks.sdk.client.ConfigAttribute} object
   * @param field a {@link java.lang.reflect.Field} object
   */
  public ConfigAttributeAccessor(ConfigAttribute configAttribute, Field field) {
    this.configAttribute = configAttribute;
    this.field = field;
  }

  /**
   * <p>getName.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return configAttribute.value();
  }

  /**
   * <p>getEnvVariable.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEnvVariable() {
    return configAttribute.env();
  }

  /**
   * <p>isSensitive.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean isSensitive() {
    return configAttribute.sensitive();
  }

  /**
   * <p>getEnv.</p>
   *
   * @param getEnv a {@link java.util.Map} object
   * @return a {@link java.lang.String} object
   */
  public String getEnv(Map<String, String> getEnv) {
    if (configAttribute.env().isEmpty()) {
      return "";
    }
    return getEnv.get(configAttribute.env());
  }

  /**
   * <p>setValueOnConfig.</p>
   *
   * @param cfg a {@link com.databricks.sdk.client.DatabricksConfig} object
   * @param value a {@link java.lang.String} object
   * @throws java.lang.IllegalAccessException if any.
   */
  public void setValueOnConfig(DatabricksConfig cfg, String value) throws IllegalAccessException {
    field.setAccessible(true);
    if (field.getType() == String.class) {
      field.set(cfg, value);
    } else if (field.getType() == int.class) {
      field.set(cfg, Integer.parseInt(value));
    } else if (field.getType() == boolean.class) {
      field.set(cfg, Boolean.parseBoolean(value));
    }
    field.setAccessible(false);
  }

  /**
   * <p>getValueFromConfig.</p>
   *
   * @param cfg a {@link com.databricks.sdk.client.DatabricksConfig} object
   * @return a {@link java.lang.Object} object
   * @throws java.lang.IllegalAccessException if any.
   */
  public Object getValueFromConfig(DatabricksConfig cfg) throws IllegalAccessException {
    field.setAccessible(true);
    Object value = field.get(cfg);
    field.setAccessible(false);
    return value;
  }

  /**
   * <p>getAuthType.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAuthType() {
    return configAttribute.auth();
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    String repr = configAttribute.value();
    if (!Objects.equals(configAttribute.env(), "")) {
      repr += "(env: " + configAttribute.env() + ")";
    }
    return repr;
  }

  /**
   * <p>getAsString.</p>
   *
   * @param value a {@link java.lang.Object} object
   * @return a {@link java.lang.String} object
   */
  public String getAsString(Object value) {
    String valueToString = value.toString();
    return valueToString;
  }
}
