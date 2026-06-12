// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage VPC endpoint configurations for this account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface VpcEndpointsService {
  /**
   * Creates a VPC endpoint configuration, which represents a <a
   * href="https://docs.aws.amazon.com/vpc/latest/privatelink/vpc-endpoints.html">VPC endpoint</a>
   * object in AWS used to communicate privately with Databricks over <a
   * href="https://aws.amazon.com/privatelink">AWS PrivateLink</a>.
   *
   * <p>After you create the VPC endpoint configuration, the Databricks <a
   * href="https://docs.aws.amazon.com/vpc/latest/privatelink/privatelink-share-your-services.html">endpoint
   * service</a> automatically accepts the VPC endpoint.
   *
   * <p>Before configuring PrivateLink, read the <a
   * href="https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html">Databricks
   * article about PrivateLink</a>.
   */
  VpcEndpoint create(CreateVpcEndpointRequest createVpcEndpointRequest);

  /**
   * Deletes a Databricks VPC endpoint configuration. You cannot delete a VPC endpoint configuration
   * that is associated with any workspace.
   */
  VpcEndpoint delete(DeleteVpcEndpointRequest deleteVpcEndpointRequest);

  /**
   * Gets a VPC endpoint configuration, which represents a <a
   * href="https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html">VPC endpoint</a> object
   * in AWS used to communicate privately with Databricks over <a
   * href="https://aws.amazon.com/privatelink">AWS PrivateLink</a>.
   */
  VpcEndpoint get(GetVpcEndpointRequest getVpcEndpointRequest);

  /** Lists Databricks VPC endpoint configurations for an account. */
  Collection<VpcEndpoint> list();
}
