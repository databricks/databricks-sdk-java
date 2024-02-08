// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RestrictWorkspaceAdminsMessage {
  /** */
  @JsonProperty("status")
  private RestrictWorkspaceAdminsMessageStatus status;

  public RestrictWorkspaceAdminsMessage setStatus(RestrictWorkspaceAdminsMessageStatus status) {
    this.status = status;
    return this;
  }

  public RestrictWorkspaceAdminsMessageStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestrictWorkspaceAdminsMessage that = (RestrictWorkspaceAdminsMessage) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(RestrictWorkspaceAdminsMessage.class).add("status", status).toString();
  }
}
