// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.util.List;
import java.util.Map;

/**
 * These APIs manage VPC endpoint configurations for this account. This object
 * registers an AWS VPC endpoint in your Databricks account so your workspace
 * can use it with AWS PrivateLink. Your VPC endpoint connects to one of two VPC
 * endpoint services -- one for workspace (both for front-end connection and for
 * back-end connection to REST APIs) and one for the back-end secure cluster
 * connectivity relay from the data plane. Your account must be enabled for
 * PrivateLink to use these APIs. Before configuring PrivateLink, it is
 * important to read the [Databricks article about PrivateLink].
 * 
 * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface VpcEndpointsService {
	/**
     * Create VPC endpoint configuration.
     * 
     * Creates a VPC endpoint configuration, which represents a [VPC endpoint]
     * object in AWS used to communicate privately with Databricks over [AWS
     * PrivateLink].
     * 
     * After you create the VPC endpoint configuration, the Databricks [endpoint
     * service] automatically accepts the VPC endpoint.
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     * [VPC endpoint]: https://docs.aws.amazon.com/vpc/latest/privatelink/vpc-endpoints.html
     * [endpoint service]: https://docs.aws.amazon.com/vpc/latest/privatelink/privatelink-share-your-services.html
     */
    VpcEndpoint create(CreateVpcEndpointRequest createVpcEndpointRequest);
    
	/**
     * Delete VPC endpoint configuration.
     * 
     * Deletes a VPC endpoint configuration, which represents an [AWS VPC
     * endpoint] that can communicate privately with Databricks over [AWS
     * PrivateLink].
     * 
     * Upon deleting a VPC endpoint configuration, the VPC endpoint in AWS
     * changes its state from `accepted` to `rejected`, which means that it is
     * no longer usable from your VPC.
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink
     * [AWS VPC endpoint]: https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    void delete(DeleteVpcEndpointRequest deleteVpcEndpointRequest);
    
	/**
     * Get a VPC endpoint configuration.
     * 
     * Gets a VPC endpoint configuration, which represents a [VPC endpoint]
     * object in AWS used to communicate privately with Databricks over [AWS
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink
     * [VPC endpoint]: https://docs.aws.amazon.com/vpc/latest/privatelink/concepts.html
     */
    VpcEndpoint get(GetVpcEndpointRequest getVpcEndpointRequest);
    
	/**
     * Get all VPC endpoint configurations.
     * 
     * Gets a list of all VPC endpoints for an account, specified by ID.
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    List<VpcEndpoint> list();
    
}