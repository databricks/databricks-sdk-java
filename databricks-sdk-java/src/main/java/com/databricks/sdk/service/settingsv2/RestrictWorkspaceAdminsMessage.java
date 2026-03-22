// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RestrictWorkspaceAdminsMessage {
  /**
   * When true, workspace admins cannot create governance tags. ALLOW_ALL status does not override
   * this; they are independent.
   */
  @JsonProperty("disable_gov_tag_creation")
  private Boolean disableGovTagCreation;

  /** */
  @JsonProperty("status")
  private RestrictWorkspaceAdminsMessageStatus status;

  public RestrictWorkspaceAdminsMessage setDisableGovTagCreation(Boolean disableGovTagCreation) {
    this.disableGovTagCreation = disableGovTagCreation;
    return this;
  }

  public Boolean getDisableGovTagCreation() {
    return disableGovTagCreation;
  }

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
    return Objects.equals(disableGovTagCreation, that.disableGovTagCreation)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableGovTagCreation, status);
  }

  @Override
  public String toString() {
    return new ToStringer(RestrictWorkspaceAdminsMessage.class)
        .add("disableGovTagCreation", disableGovTagCreation)
        .add("status", status)
        .toString();
  }
}
