// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>EndpointState class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>configUpdate</code>.</p>
   *
   * @param configUpdate a {@link com.databricks.sdk.service.serving.EndpointStateConfigUpdate} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointState} object
   */
  public EndpointState setConfigUpdate(EndpointStateConfigUpdate configUpdate) {
    this.configUpdate = configUpdate;
    return this;
  }

  /**
   * <p>Getter for the field <code>configUpdate</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.EndpointStateConfigUpdate} object
   */
  public EndpointStateConfigUpdate getConfigUpdate() {
    return configUpdate;
  }

  /**
   * <p>Setter for the field <code>ready</code>.</p>
   *
   * @param ready a {@link com.databricks.sdk.service.serving.EndpointStateReady} object
   * @return a {@link com.databricks.sdk.service.serving.EndpointState} object
   */
  public EndpointState setReady(EndpointStateReady ready) {
    this.ready = ready;
    return this;
  }

  /**
   * <p>Getter for the field <code>ready</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.EndpointStateReady} object
   */
  public EndpointStateReady getReady() {
    return ready;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointState that = (EndpointState) o;
    return Objects.equals(configUpdate, that.configUpdate) && Objects.equals(ready, that.ready);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(configUpdate, ready);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EndpointState.class)
        .add("configUpdate", configUpdate)
        .add("ready", ready)
        .toString();
  }
}
