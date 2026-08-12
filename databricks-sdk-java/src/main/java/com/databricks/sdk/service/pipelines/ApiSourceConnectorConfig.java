// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** Top-level configuration for API Source connectors with arbitrary configuration. */
@Generated
public class ApiSourceConnectorConfig {
  /** Arbitrary key-value configuration values for the API Source connector. */
  @JsonProperty("configs")
  private Map<String, String> configs;

  public ApiSourceConnectorConfig setConfigs(Map<String, String> configs) {
    this.configs = configs;
    return this;
  }

  public Map<String, String> getConfigs() {
    return configs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiSourceConnectorConfig that = (ApiSourceConnectorConfig) o;
    return Objects.equals(configs, that.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configs);
  }

  @Override
  public String toString() {
    return new ToStringer(ApiSourceConnectorConfig.class).add("configs", configs).toString();
  }
}
