// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PagerdutyConfig {
  /** [Input-Only] Integration key for PagerDuty. */
  @JsonProperty("integration_key")
  private String integrationKey;

  /** [Output-Only] Whether integration key is set. */
  @JsonProperty("integration_key_set")
  private Boolean integrationKeySet;

  public PagerdutyConfig setIntegrationKey(String integrationKey) {
    this.integrationKey = integrationKey;
    return this;
  }

  public String getIntegrationKey() {
    return integrationKey;
  }

  public PagerdutyConfig setIntegrationKeySet(Boolean integrationKeySet) {
    this.integrationKeySet = integrationKeySet;
    return this;
  }

  public Boolean getIntegrationKeySet() {
    return integrationKeySet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PagerdutyConfig that = (PagerdutyConfig) o;
    return Objects.equals(integrationKey, that.integrationKey)
        && Objects.equals(integrationKeySet, that.integrationKeySet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationKey, integrationKeySet);
  }

  @Override
  public String toString() {
    return new ToStringer(PagerdutyConfig.class)
        .add("integrationKey", integrationKey)
        .add("integrationKeySet", integrationKeySet)
        .toString();
  }
}
