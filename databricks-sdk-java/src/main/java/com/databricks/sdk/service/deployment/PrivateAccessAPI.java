// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage private access settings for this account. A private access
 * settings object specifies how your workspace is accessed using AWS
 * PrivateLink. Each workspace that has any PrivateLink connections must include
 * the ID for a private access settings object is in its workspace configuration
 * object. Your account must be enabled for PrivateLink to use these APIs.
 * Before configuring PrivateLink, it is important to read the [Databricks
 * article about PrivateLink].
 * 
 * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
 */
public class PrivateAccessAPI {
    private final PrivateAccessService impl;

    /** Regular-use constructor */
    public PrivateAccessAPI(ApiClient apiClient) {
        impl = new PrivateAccessImpl(apiClient);
    }

    /** Constructor for mocks */
    public PrivateAccessAPI(PrivateAccessService mock) {
        impl = mock;
    }
	
	/**
     * Create private access settings.
     * 
     * Creates a private access settings object, which specifies how your
     * workspace is accessed over [AWS PrivateLink]. To use AWS PrivateLink, a
     * workspace must have a private access settings object referenced by ID in
     * the workspace's `private_access_settings_id` property.
     * 
     * You can share one private access settings with multiple workspaces in a
     * single account. However, private access settings are specific to AWS
     * regions, so only workspaces in the same AWS region can use a given
     * private access settings object.
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    public PrivateAccessSettings create(UpsertPrivateAccessSettingsRequest request) {
        return impl.create(request);
    }
    
	/**
     * Delete a private access settings object.
     * 
     * Deletes a private access settings object, which determines how your
     * workspace is accessed over [AWS PrivateLink].
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    public void delete(DeletePrivateAccesRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get a private access settings object.
     * 
     * Gets a private access settings object, which specifies how your workspace
     * is accessed over [AWS PrivateLink].
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    public PrivateAccessSettings get(GetPrivateAccesRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get all private access settings objects.
     * 
     * Gets a list of all private access settings objects for an account,
     * specified by ID.
     */
    public List<PrivateAccessSettings> list() {
        return impl.list();
    }
    
	/**
     * Replace private access settings.
     * 
     * Updates an existing private access settings object, which specifies how
     * your workspace is accessed over [AWS PrivateLink]. To use AWS
     * PrivateLink, a workspace must have a private access settings object
     * referenced by ID in the workspace's `private_access_settings_id`
     * property.
     * 
     * This operation completely overwrites your existing private access
     * settings object attached to your workspaces. All workspaces attached to
     * the private access settings are affected by any change. If
     * `public_access_enabled`, `private_access_level`, or
     * `allowed_vpc_endpoint_ids` are updated, effects of these changes might
     * take several minutes to propagate to the workspace API.
     * 
     * You can share one private access settings object with multiple workspaces
     * in a single account. However, private access settings are specific to AWS
     * regions, so only workspaces in the same AWS region can use a given
     * private access settings object.
     * 
     * Before configuring PrivateLink, read the [Databricks article about
     * PrivateLink].
     * 
     * [AWS PrivateLink]: https://aws.amazon.com/privatelink
     * [Databricks article about PrivateLink]: https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html
     */
    public void replace(UpsertPrivateAccessSettingsRequest request) {
        impl.replace(request);
    }
    
    public PrivateAccessService impl() {
        return impl;
    }
}