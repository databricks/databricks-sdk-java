// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusters;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Instance Profiles API allows admins to add, list, and remove instance
 * profiles that users can launch clusters with. Regular users can list the
 * instance profiles available to them. See [Secure access to S3 buckets] using
 * instance profiles for more information.
 * 
 * [Secure access to S3 buckets]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/instance-profiles.html
 */
@Generated("databricks-sdk-generator")
public class InstanceProfilesAPI implements InstanceProfilesService {
    private final ApiClient apiClient;

    public InstanceProfilesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Register an instance profile.
     * 
     * In the UI, you can select the instance profile when launching clusters.
     * This API is only available to admin users.
     */
    @Override
    public void add(AddInstanceProfile request) {
        String path = "/api/2.0/instance-profiles/add";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Edit an instance profile.
     * 
     * The only supported field to change is the optional IAM role ARN
     * associated with the instance profile. It is required to specify the IAM
     * role ARN if both of the following are true:
     * 
     * * Your role name and instance profile name do not match. The name is the
     * part after the last slash in each ARN. * You want to use the instance
     * profile with [Databricks SQL Serverless].
     * 
     * To understand where these fields are in the AWS console, see [Enable
     * serverless SQL warehouses].
     * 
     * This API is only available to admin users.
     * 
     * [Databricks SQL Serverless]: https://docs.databricks.com/sql/admin/serverless.html
     * [Enable serverless SQL warehouses]: https://docs.databricks.com/sql/admin/serverless.html
     */
    @Override
    public void edit(InstanceProfile request) {
        String path = "/api/2.0/instance-profiles/edit";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * List available instance profiles.
     * 
     * List the instance profiles that the calling user can use to launch a
     * cluster.
     * 
     * This API is available to all users.
     */
    @Override
    public ListInstanceProfilesResponse list() {
        String path = "/api/2.0/instance-profiles/list";
        return apiClient.GET(path, ListInstanceProfilesResponse.class);
    }
    
	/**
     * Remove the instance profile.
     * 
     * Remove the instance profile with the provided ARN. Existing clusters with
     * this instance profile will continue to function.
     * 
     * This API is only accessible to admin users.
     */
    @Override
    public void remove(RemoveInstanceProfile request) {
        String path = "/api/2.0/instance-profiles/remove";
        apiClient.POST(path, request, Void.class);
    }
    
}