// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

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
 * the CREATE_EXTERNAL_LOCATION privilege.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface ExternalLocationsService {
	/**
     * Create an external location.
     * 
     * Creates a new External Location entry in the Metastore. The caller must
     * be a Metastore admin or have the CREATE_EXTERNAL_LOCATION privilege on
     * both the Metastore and the associated storage credential.
     */
    ExternalLocationInfo create(CreateExternalLocation createExternalLocation);
    
	/**
     * Delete an external location.
     * 
     * Deletes the specified external location from the Metastore. The caller
     * must be the owner of the external location.
     */
    void delete(DeleteExternalLocationRequest deleteExternalLocationRequest);
    
	/**
     * Get an external location.
     * 
     * Gets an external location from the Metastore. The caller must be either a
     * Metastore admin, the owner of the external location, or has some
     * privilege on the external location.
     */
    ExternalLocationInfo get(GetExternalLocationRequest getExternalLocationRequest);
    
	/**
     * List external locations.
     * 
     * Gets an array of External Locations (ExternalLocationInfo objects) from
     * the Metastore. The caller must be a Metastore admin, is the owner of the
     * external location, or has some privilege on the external location.
     */
    ListExternalLocationsResponse list();
    
	/**
     * Update an external location.
     * 
     * Updates an external location in the Metastore. The caller must be the
     * owner of the external location, or be a Metastore admin. In the second
     * case, the admin can only update the name of the external location.
     */
    ExternalLocationInfo update(UpdateExternalLocation updateExternalLocation);
    
}