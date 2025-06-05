// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateInstallationResponsePb {
  @JsonProperty("installation")
  private InstallationDetail installation;

  public UpdateInstallationResponsePb setInstallation(InstallationDetail installation) {
    this.installation = installation;
    return this;
  }

  public InstallationDetail getInstallation() {
    return installation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInstallationResponsePb that = (UpdateInstallationResponsePb) o;
    return Objects.equals(installation, that.installation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installation);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInstallationResponsePb.class)
        .add("installation", installation)
        .toString();
  }
}
