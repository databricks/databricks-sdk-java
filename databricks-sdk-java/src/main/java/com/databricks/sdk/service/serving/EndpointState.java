// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EndpointState {
  /**
   * The state of an endpoint's config update. This informs the user if the pending_config is in
   * progress, if the update failed, or if there is no update in progress. Note that if the
   * endpoint's config_update state value is IN_PROGRESS, another update can not be made until the
   * update completes or fails."
   */
  @JsonProperty("config_update")
  private EndpointStateConfigUpdate configUpdate;

  /**
   * The state of an endpoint, indicating whether or not the endpoint is queryable. An endpoint is
   * READY if all of the served models in its active configuration are ready. If any of the actively
   * served models are in a non-ready state, the endpoint state will be NOT_READY.
   */
  @JsonProperty("ready")
  private EndpointStateReady ready;

  public EndpointState setConfigUpdate(EndpointStateConfigUpdate configUpdate) {
    this.configUpdate = configUpdate;
    return this;
  }

  public EndpointStateConfigUpdate getConfigUpdate() {
    return configUpdate;
  }

  public EndpointState setReady(EndpointStateReady ready) {
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
    EndpointState that = (EndpointState) o;
    return Objects.equals(configUpdate, that.configUpdate) && Objects.equals(ready, that.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configUpdate, ready);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointState.class)
        .add("configUpdate", configUpdate)
        .add("ready", ready)
        .toString();
  }
}
