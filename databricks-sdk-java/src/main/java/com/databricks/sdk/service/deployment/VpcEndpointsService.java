// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import javax.annotation.Generated;
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
@Generated("databricks-sdk-generator")
public interface VpcEndpointsService {
	/**
     * Create VPC endpoint configuration.
     * 
     * Creates a VPC endpoint configuration, which represents a [VPC endpoint]
     * object in AWS used to communicate privately with Databricks over [AWS
     * PrivateLink].
     * 
     * **Important**: When you register a VPC endpoint to the Databricks
     * workspace VPC endpoint service for any workspace, **in this release
     * Databricks enables front-end (web application and REST API) access from
     * the source network of the VPC endpoint to all workspaces in that AWS
     * region in your Databricks account if the workspaces have any PrivateLink
     * connections in their workspace configuration**. If you have questions
     * about this behavior, contact your Databricks representative.
     * 
     * Within AWS, your VPC endpoint stays in `pendingAcceptance` state until
     * you register it in a VPC endpoint configuration through the Account API.
     * After you register the VPC endpoint configuration, the Databricks
     * [endpoint service] automatically accepts the VPC endpoint and it
     * eventually transitions to the `available` state.
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform and your Databricks account is enabled for PrivateLink
     * (Public Preview). Contact your Databricks representative to enable your
     * account for PrivateLink.
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
     * This operation is available only if your account is on the E2 version of
     * the platform and your Databricks account is enabled for PrivateLink
     * (Public Preview). Contact your Databricks representative to enable your
     * account for PrivateLink.
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
     * This operation is available only if your account is on the E2 version of
     * the platform and your Databricks account is enabled for PrivateLink
     * (Public Preview). Contact your Databricks representative to enable your
     * account for PrivateLink.
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
     * This operation is available only if your account is on the E2 version of
     * the platform and your Databricks account is enabled for PrivateLink
     * (Public Preview). Contact your Databricks representative to enable your
     * account for PrivateLink.
     * 
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    List<VpcEndpoint> list();
    
}