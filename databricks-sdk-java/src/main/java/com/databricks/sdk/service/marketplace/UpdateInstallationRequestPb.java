// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateInstallationRequestPb {
  @JsonProperty("installation")
  private InstallationDetail installation;

  @JsonIgnore private String installationId;

  @JsonIgnore private String listingId;

  @JsonProperty("rotate_token")
  private Boolean rotateToken;

  public UpdateInstallationRequestPb setInstallation(InstallationDetail installation) {
    this.installation = installation;
    return this;
  }

  public InstallationDetail getInstallation() {
    return installation;
  }

  public UpdateInstallationRequestPb setInstallationId(String installationId) {
    this.installationId = installationId;
    return this;
  }

  public String getInstallationId() {
    return installationId;
  }

  public UpdateInstallationRequestPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public UpdateInstallationRequestPb setRotateToken(Boolean rotateToken) {
    this.rotateToken = rotateToken;
    return this;
  }

  public Boolean getRotateToken() {
    return rotateToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInstallationRequestPb that = (UpdateInstallationRequestPb) o;
    return Objects.equals(installation, that.installation)
        && Objects.equals(installationId, that.installationId)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(rotateToken, that.rotateToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installation, installationId, listingId, rotateToken);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInstallationRequestPb.class)
        .add("installation", installation)
        .add("installationId", installationId)
        .add("listingId", listingId)
        .add("rotateToken", rotateToken)
        .toString();
  }
}
