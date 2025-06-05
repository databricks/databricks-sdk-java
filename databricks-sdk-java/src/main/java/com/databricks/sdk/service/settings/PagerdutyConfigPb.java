// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PagerdutyConfigPb {
  @JsonProperty("integration_key")
  private String integrationKey;

  @JsonProperty("integration_key_set")
  private Boolean integrationKeySet;

  public PagerdutyConfigPb setIntegrationKey(String integrationKey) {
    this.integrationKey = integrationKey;
    return this;
  }

  public String getIntegrationKey() {
    return integrationKey;
  }

  public PagerdutyConfigPb setIntegrationKeySet(Boolean integrationKeySet) {
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
    PagerdutyConfigPb that = (PagerdutyConfigPb) o;
    return Objects.equals(integrationKey, that.integrationKey)
        && Objects.equals(integrationKeySet, that.integrationKeySet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationKey, integrationKeySet);
  }

  @Override
  public String toString() {
    return new ToStringer(PagerdutyConfigPb.class)
        .add("integrationKey", integrationKey)
        .add("integrationKeySet", integrationKeySet)
        .toString();
  }
}
