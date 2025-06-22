// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  public VpcEndpoint create(String vpcEndpointName) {
    return create(new CreateVpcEndpointRequest().setVpcEndpointName(vpcEndpointName));
  }

  /**
   * Creates a VPC endpoint configuration, which represents a [VPC endpoint] object in AWS used to
   * communicate privately with Databricks over [AWS PrivateLink].
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

  public void delete(String vpcEndpointId) {
    delete(new DeleteVpcEndpointRequest().setVpcEndpointId(vpcEndpointId));
  }

  /**
   * Deletes a VPC endpoint configuration, which represents an [AWS VPC endpoint] that can
   * communicate privately with Databricks over [AWS PrivateLink].
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

  public VpcEndpoint get(String vpcEndpointId) {
    return get(new GetVpcEndpointRequest().setVpcEndpointId(vpcEndpointId));
  }

  /**
   * Gets a VPC endpoint configuration, which represents a [VPC endpoint] object in AWS used to
   * communicate privately with Databricks over [AWS PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [VPC endpoint]:
   * https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html
   */
  public VpcEndpoint get(GetVpcEndpointRequest request) {
    return impl.get(request);
  }

  /**
   * Gets a list of all VPC endpoints for an account, specified by ID.
   *
   * <p>Before configuring PrivateLink, read the [Databricks article about PrivateLink].
   *
   * <p>[Databricks article about PrivateLink]:
   * https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
   */
  public Iterable<VpcEndpoint> list() {
    return impl.list();
  }

  public VpcEndpointsService impl() {
    return impl;
  }
}
