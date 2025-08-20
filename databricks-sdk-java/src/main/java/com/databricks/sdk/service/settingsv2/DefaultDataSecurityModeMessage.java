// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Changes the behaviour of Jobs service when creating job clusters.
 *
 * <p>Before this setting is introduced, all workspaces with metastore attached had behaviour
 * matching SINGLE_USER setting.
 *
 * <p>See: - go/defaultdatasecuritymode - go/defaultdatasecuritymode/setting - go/datasecuritymode
 */
@Generated
public class DefaultDataSecurityModeMessage {
  /** */
  @JsonProperty("status")
  private DefaultDataSecurityModeMessageStatus status;

  public DefaultDataSecurityModeMessage setStatus(DefaultDataSecurityModeMessageStatus status) {
    this.status = status;
    return this;
  }

  public DefaultDataSecurityModeMessageStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultDataSecurityModeMessage that = (DefaultDataSecurityModeMessage) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultDataSecurityModeMessage.class).add("status", status).toString();
  }
}
