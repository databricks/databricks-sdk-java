// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete VPC endpoint configuration
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteVpcEndpointRequest {
  /** Databricks VPC endpoint ID. */
  private String vpcEndpointId;

  /**
   * <p>Setter for the field <code>vpcEndpointId</code>.</p>
   *
   * @param vpcEndpointId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.DeleteVpcEndpointRequest} object
   */
  public DeleteVpcEndpointRequest setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  /**
   * <p>Getter for the field <code>vpcEndpointId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteVpcEndpointRequest that = (DeleteVpcEndpointRequest) o;
    return Objects.equals(vpcEndpointId, that.vpcEndpointId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(vpcEndpointId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteVpcEndpointRequest.class)
        .add("vpcEndpointId", vpcEndpointId)
        .toString();
  }
}
