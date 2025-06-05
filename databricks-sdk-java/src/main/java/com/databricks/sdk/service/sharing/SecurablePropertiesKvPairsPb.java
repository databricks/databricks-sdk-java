// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * An object with __properties__ containing map of key-value properties attached to the securable.
 */
@Generated
class SecurablePropertiesKvPairsPb {
  @JsonProperty("properties")
  private Map<String, String> properties;

  public SecurablePropertiesKvPairsPb setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecurablePropertiesKvPairsPb that = (SecurablePropertiesKvPairsPb) o;
    return Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties);
  }

  @Override
  public String toString() {
    return new ToStringer(SecurablePropertiesKvPairsPb.class)
        .add("properties", properties)
        .toString();
  }
}
