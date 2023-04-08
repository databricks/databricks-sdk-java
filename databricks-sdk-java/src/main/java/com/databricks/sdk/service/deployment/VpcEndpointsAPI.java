// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/**
 * These APIs manage VPC endpoint configurations for this account. This object registers an AWS VPC
 * endpoint in your Databricks account so your workspace can use it with AWS PrivateLink. Your VPC
 * endpoint connects to one of two VPC endpoint services -- one for workspace (both for front-end
 * connection and for back-end connection to REST APIs) and one for the back-end secure cluster
 * connectivity relay from the data plane. Your account must be enabled for PrivateLink to use these
 * APIs. Before configuring PrivateLink, it is important to read the [Databricks article about
 * PrivateLink].
 *
 * <p>[Databricks article about PrivateLink]:
 * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
 */
public class VpcEndpointsAPI {
  private final VpcEndpointsService impl;

  /** Regular-use constructor */
  public VpcEndpointsAPI(ApiClient apiClient) {
    impl = new VpcEndpointsImpl(apiClient);
  }

  /** Constructor for mocks */
  public VpcEndpointsAPI(VpcEndpointsService mock) {
    impl = mock;
  }

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
   */
  public VpcEndpoint create(CreateVpcEndpointRequest request) {
    return impl.create(request);
  }

  /**
   * Delete VPC endpoint configuration.
   *
   * <p>Deletes a VPC endpoint configuration, which represents an [AWS VPC endpoint] that can
   * communicate privately with Databricks over [AWS PrivateLink].
   *
   * <p>Upon deleting a VPC endpoint configuration, the VPC endpoint in AWS changes its state from
   * `accepted` to `rejected`, which means that it is no longer usable from your VPC.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [AWS VPC endpoint]:
   * https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html [Databricks article about
   * PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  public void delete(DeleteVpcEndpointRequest request) {
    impl.delete(request);
  }

  /**
   * Get a VPC endpoint configuration.
   *
   * <p>Gets a VPC endpoint configuration, which represents a [VPC endpoint] object in AWS used to
   * communicate privately with Databricks over [AWS PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [VPC endpoint]:
   * https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html
   */
  public VpcEndpoint get(GetVpcEndpointRequest request) {
    return impl.get(request);
  }

  /**
   * Get all VPC endpoint configurations.
   *
   * <p>Gets a list of all VPC endpoints for an account, specified by ID.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[Databricks article about PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  public List<VpcEndpoint> list() {
    return impl.list();
  }

  public VpcEndpointsService impl() {
    return impl;
  }
}
