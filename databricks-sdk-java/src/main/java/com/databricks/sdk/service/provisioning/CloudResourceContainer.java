// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The general workspace configurations that are specific to cloud providers.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CloudResourceContainer {
  /** The general workspace configurations that are specific to Google Cloud. */
  @JsonProperty("gcp")
  private CustomerFacingGcpCloudResourceContainer gcp;

  /**
   * <p>Setter for the field <code>gcp</code>.</p>
   *
   * @param gcp a {@link com.databricks.sdk.service.provisioning.CustomerFacingGcpCloudResourceContainer} object
   * @return a {@link com.databricks.sdk.service.provisioning.CloudResourceContainer} object
   */
  public CloudResourceContainer setGcp(CustomerFacingGcpCloudResourceContainer gcp) {
    this.gcp = gcp;
    return this;
  }

  /**
   * <p>Getter for the field <code>gcp</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.CustomerFacingGcpCloudResourceContainer} object
   */
  public CustomerFacingGcpCloudResourceContainer getGcp() {
    return gcp;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudResourceContainer that = (CloudResourceContainer) o;
    return Objects.equals(gcp, that.gcp);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(gcp);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CloudResourceContainer.class).add("gcp", gcp).toString();
  }
}
