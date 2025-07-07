// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The general workspace configurations that are specific to cloud providers. */
@Generated
public class CloudResourceContainer {
  /** */
  @JsonProperty("gcp")
  private CustomerFacingGcpCloudResourceContainer gcp;

  public CloudResourceContainer setGcp(CustomerFacingGcpCloudResourceContainer gcp) {
    this.gcp = gcp;
    return this;
  }

  public CustomerFacingGcpCloudResourceContainer getGcp() {
    return gcp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudResourceContainer that = (CloudResourceContainer) o;
    return Objects.equals(gcp, that.gcp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcp);
  }

  @Override
  public String toString() {
    return new ToStringer(CloudResourceContainer.class).add("gcp", gcp).toString();
  }
}
