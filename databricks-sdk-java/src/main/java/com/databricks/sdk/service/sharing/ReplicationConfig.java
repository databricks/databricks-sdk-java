// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Configuration for Delta Sharing replication on a share. When enabled, the share's data is copied
 * into each recipient's region so recipients can query the share locally.
 */
@Generated
public class ReplicationConfig {
  /** Whether replication is enabled for the share. */
  @JsonProperty("enabled")
  private Boolean enabled;

  public ReplicationConfig setEnabled(Boolean enabled) {
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
    ReplicationConfig that = (ReplicationConfig) o;
    return Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(ReplicationConfig.class).add("enabled", enabled).toString();
  }
}
