// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * An external location is an object that combines a cloud storage path with a
 * storage credential that authorizes access to the cloud storage path. Each
 * external location is subject to Unity Catalog access-control policies that
 * control which users and groups can access the credential. If a user does not
 * have access to an external location in Unity Catalog, the request fails and
 * Unity Catalog does not attempt to authenticate to your cloud tenant on the
 * user’s behalf.
 * 
 * Databricks recommends using external locations rather than using storage
 * credentials directly.
 * 
 * To create external locations, you must be a metastore admin or a user with
 * the **CREATE_EXTERNAL_LOCATION** privilege.
 */
public class ExternalLocationsAPI {
    private final ExternalLocationsService impl;

    /** Regular-use constructor */
    public ExternalLocationsAPI(ApiClient apiClient) {
        impl = new ExternalLocationsImpl(apiClient);
    }

    /** Constructor for mocks */
    public ExternalLocationsAPI(ExternalLocationsService mock) {
        impl = mock;
    }
	
	/**
     * Create an external location.
     * 
     * Creates a new external location entry in the metastore. The caller must
     * be a metastore admin or have the **CREATE_EXTERNAL_LOCATION** privilege
     * on both the metastore and the associated storage credential.
     */
    public ExternalLocationInfo create(CreateExternalLocation request) {
        return impl.create(request);
    }
    
	/**
     * Delete an external location.
     * 
     * Deletes the specified external location from the metastore. The caller
     * must be the owner of the external location.
     */
    public void delete(DeleteExternalLocationRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get an external location.
     * 
     * Gets an external location from the metastore. The caller must be either a
     * metastore admin, the owner of the external location, or a user that has
     * some privilege on the external location.
     */
    public ExternalLocationInfo get(GetExternalLocationRequest request) {
        return impl.get(request);
    }
    
	/**
     * List external locations.
     * 
     * Gets an array of external locations (__ExternalLocationInfo__ objects)
     * from the metastore. The caller must be a metastore admin, the owner of
     * the external location, or a user that has some privilege on the external
     * location. There is no guarantee of a specific ordering of the elements in
     * the array.
     */
    public ListExternalLocationsResponse list() {
        return impl.list();
    }
    
	/**
     * Update an external location.
     * 
     * Updates an external location in the metastore. The caller must be the
     * owner of the external location, or be a metastore admin. In the second
     * case, the admin can only update the name of the external location.
     */
    public ExternalLocationInfo update(UpdateExternalLocation request) {
        return impl.update(request);
    }
    
    public ExternalLocationsService impl() {
        return impl;
    }
}