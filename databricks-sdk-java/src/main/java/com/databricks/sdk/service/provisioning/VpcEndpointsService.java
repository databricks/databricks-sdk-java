// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import java.util.Collection;

/**
 * These APIs manage VPC endpoint configurations for this account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface VpcEndpointsService {
  /**
   * Create VPC endpoint configuration.
   *
   * <p>Creates a VPC endpoint configuration, which represents a [VPC endpoint] object in AWS used
   * to communicate privately with Databricks over [AWS PrivateLink].
   *
   * <p>After you create the VPC endpoint configuration, the Databricks [endpoint service]
   * automatically accepts the VPC endpoint.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html [VPC
   * endpoint]: https://docs.aws.amazon.com/vpc/latest/privatelink/vpc-endpoints.html [endpoint
   * service]:
   * https://docs.aws.amazon.com/vpc/latest/privatelink/privatelink-share-your-services.html
   *
   * @param createVpcEndpointRequest a {@link com.databricks.sdk.service.provisioning.CreateVpcEndpointRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  VpcEndpoint create(CreateVpcEndpointRequest createVpcEndpointRequest);

  /**
   * Delete VPC endpoint configuration.
   *
   * <p>Deletes a VPC endpoint configuration, which represents an [AWS VPC endpoint] that can
   * communicate privately with Databricks over [AWS PrivateLink].
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [AWS VPC endpoint]:
   * https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   *
   * @param deleteVpcEndpointRequest a {@link com.databricks.sdk.service.provisioning.DeleteVpcEndpointRequest} object
   */
  void delete(DeleteVpcEndpointRequest deleteVpcEndpointRequest);

  /**
   * Get a VPC endpoint configuration.
   *
   * <p>Gets a VPC endpoint configuration, which represents a [VPC endpoint] object in AWS used to
   * communicate privately with Databricks over [AWS PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [VPC endpoint]:
   * https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html
   *
   * @param getVpcEndpointRequest a {@link com.databricks.sdk.service.provisioning.GetVpcEndpointRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  VpcEndpoint get(GetVpcEndpointRequest getVpcEndpointRequest);

  /**
   * Get all VPC endpoint configurations.
   *
   * <p>Gets a list of all VPC endpoints for an account, specified by ID.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[Databricks article about PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   *
   * @return a {@link java.util.Collection} object
   */
  Collection<VpcEndpoint> list();
}
