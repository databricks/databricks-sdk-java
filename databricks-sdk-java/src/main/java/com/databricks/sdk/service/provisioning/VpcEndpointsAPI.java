// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage VPC endpoint configurations for this account.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class VpcEndpointsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(VpcEndpointsAPI.class);

  private final VpcEndpointsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public VpcEndpointsAPI(ApiClient apiClient) {
    impl = new VpcEndpointsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.provisioning.VpcEndpointsService} object
   */
  public VpcEndpointsAPI(VpcEndpointsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param vpcEndpointName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint create(String vpcEndpointName) {
    return create(new CreateVpcEndpointRequest().setVpcEndpointName(vpcEndpointName));
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
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.CreateVpcEndpointRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint create(CreateVpcEndpointRequest request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param vpcEndpointId a {@link java.lang.String} object
   */
  public void delete(String vpcEndpointId) {
    delete(new DeleteVpcEndpointRequest().setVpcEndpointId(vpcEndpointId));
  }

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
   * @param request a {@link com.databricks.sdk.service.provisioning.DeleteVpcEndpointRequest} object
   */
  public void delete(DeleteVpcEndpointRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param vpcEndpointId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
   */
  public VpcEndpoint get(String vpcEndpointId) {
    return get(new GetVpcEndpointRequest().setVpcEndpointId(vpcEndpointId));
  }

  /**
   * Get a VPC endpoint configuration.
   *
   * <p>Gets a VPC endpoint configuration, which represents a [VPC endpoint] object in AWS used to
   * communicate privately with Databricks over [AWS PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink [VPC endpoint]:
   * https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.GetVpcEndpointRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpoint} object
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
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<VpcEndpoint> list() {
    return impl.list();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.VpcEndpointsService} object
   */
  public VpcEndpointsService impl() {
    return impl;
  }
}
