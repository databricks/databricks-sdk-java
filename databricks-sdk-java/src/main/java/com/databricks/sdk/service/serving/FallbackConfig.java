// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FallbackConfig {
  /**
   * Whether to enable traffic fallback. When a served entity in the serving endpoint returns
   * specific error codes (e.g. 500), the request will automatically be round-robin attempted with
   * other served entities in the same endpoint, following the order of served entity list, until a
   * successful response is returned. If all attempts fail, return the last response with the error
   * code.
   */
  @JsonProperty("enabled")
  private Boolean enabled;

  public FallbackConfig setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FallbackConfig that = (FallbackConfig) o;
    return Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(FallbackConfig.class).add("enabled", enabled).toString();
  }
}
