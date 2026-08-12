// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** Options for API Source connectors with arbitrary configuration. */
@Generated
public class ApiSourceConnectorOptions {
  /** Arbitrary key-value configuration options for the API Source connector. */
  @JsonProperty("options")
  private Map<String, String> options;

  public ApiSourceConnectorOptions setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiSourceConnectorOptions that = (ApiSourceConnectorOptions) o;
    return Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    return new ToStringer(ApiSourceConnectorOptions.class).add("options", options).toString();
  }
}
