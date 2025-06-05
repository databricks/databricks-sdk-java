// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EndpointStatePb {
  @JsonProperty("config_update")
  private EndpointStateConfigUpdate configUpdate;

  @JsonProperty("ready")
  private EndpointStateReady ready;

  public EndpointStatePb setConfigUpdate(EndpointStateConfigUpdate configUpdate) {
    this.configUpdate = configUpdate;
    return this;
  }

  public EndpointStateConfigUpdate getConfigUpdate() {
    return configUpdate;
  }

  public EndpointStatePb setReady(EndpointStateReady ready) {
    this.ready = ready;
    return this;
  }

  public EndpointStateReady getReady() {
    return ready;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointStatePb that = (EndpointStatePb) o;
    return Objects.equals(configUpdate, that.configUpdate) && Objects.equals(ready, that.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configUpdate, ready);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointStatePb.class)
        .add("configUpdate", configUpdate)
        .add("ready", ready)
        .toString();
  }
}
