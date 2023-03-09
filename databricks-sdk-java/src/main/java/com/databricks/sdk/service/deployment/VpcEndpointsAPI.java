// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

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
 */
public class VpcEndpointsAPI implements VpcEndpointsService {
    private final ApiClient apiClient;

    public VpcEndpointsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
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
    @Override
    public VpcEndpoint create(CreateVpcEndpointRequest request) {
        String path = String.format("/api/2.0/accounts//vpc-endpoints");
        return apiClient.POST(path, request, VpcEndpoint.class);
    }
    
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
    @Override
    public void delete(DeleteVpcEndpointRequest request) {
        String path = String.format("/api/2.0/accounts//vpc-endpoints/%s", request.getVpcEndpointId());
        apiClient.DELETE(path, request, Void.class);
    }
    
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
    @Override
    public VpcEndpoint get(GetVpcEndpointRequest request) {
        String path = String.format("/api/2.0/accounts//vpc-endpoints/%s", request.getVpcEndpointId());
        return apiClient.GET(path, request, VpcEndpoint.class);
    }
    
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
    @Override
    public List<VpcEndpoint> list() {
        String path = String.format("/api/2.0/accounts//vpc-endpoints");
        return apiClient.GET(path, List.class);
    }
    
}