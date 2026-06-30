// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Controls which external collaboration platforms (Slack, Microsoft Teams) can connect to a
 * workspace. Defaults to ALLOW_ALL.
 */
@Generated
public class CollaborationPlatformConnectivityMessage {
  /** */
  @JsonProperty("connectivity")
  private CollaborationPlatformConnectivityMessageConnectivity connectivity;

  public CollaborationPlatformConnectivityMessage setConnectivity(
      CollaborationPlatformConnectivityMessageConnectivity connectivity) {
    this.connectivity = connectivity;
    return this;
  }

  public CollaborationPlatformConnectivityMessageConnectivity getConnectivity() {
    return connectivity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollaborationPlatformConnectivityMessage that = (CollaborationPlatformConnectivityMessage) o;
    return Objects.equals(connectivity, that.connectivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivity);
  }

  @Override
  public String toString() {
    return new ToStringer(CollaborationPlatformConnectivityMessage.class)
        .add("connectivity", connectivity)
        .toString();
  }
}
