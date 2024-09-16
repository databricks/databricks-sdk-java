// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Uninstall from a listing */
@Generated
public class DeleteInstallationRequest {
  /** */
  @JsonIgnore private String installationId;

  /** */
  @JsonIgnore private String listingId;

  public DeleteInstallationRequest setInstallationId(String installationId) {
    this.installationId = installationId;
    return this;
  }

  public String getInstallationId() {
    return installationId;
  }

  public DeleteInstallationRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteInstallationRequest that = (DeleteInstallationRequest) o;
    return Objects.equals(installationId, that.installationId)
        && Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installationId, listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteInstallationRequest.class)
        .add("installationId", installationId)
        .add("listingId", listingId)
        .toString();
  }
}
