// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/** These APIs manage VPC endpoint configurations for this account. */
@Generated
public class VpcEndpointsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(VpcEndpointsAPI.class);

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
  public VpcEndpoint create(CreateVpcEndpointRequest request) {
    return impl.create(request);
  }

  public VpcEndpoint delete(String vpcEndpointId) {
    return delete(new DeleteVpcEndpointRequest().setVpcEndpointId(vpcEndpointId));
  }

  /**
   * Deletes a Databricks VPC endpoint configuration. You cannot delete a VPC endpoint configuration
   * that is associated with any workspace.
   */
  public VpcEndpoint delete(DeleteVpcEndpointRequest request) {
    return impl.delete(request);
  }

  public VpcEndpoint get(String vpcEndpointId) {
    return get(new GetVpcEndpointRequest().setVpcEndpointId(vpcEndpointId));
  }

  /**
   * Gets a VPC endpoint configuration, which represents a <a
   * href="https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html">VPC endpoint</a> object
   * in AWS used to communicate privately with Databricks over <a
   * href="https://aws.amazon.com/privatelink">AWS PrivateLink</a>.
   */
  public VpcEndpoint get(GetVpcEndpointRequest request) {
    return impl.get(request);
  }

  /** Lists Databricks VPC endpoint configurations for an account. */
  public Iterable<VpcEndpoint> list() {
    return impl.list();
  }

  public VpcEndpointsService impl() {
    return impl;
  }
}
