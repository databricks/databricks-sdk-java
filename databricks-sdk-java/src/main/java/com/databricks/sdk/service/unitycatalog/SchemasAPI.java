// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * A schema (also called a database) is the second layer of Unity Catalog’s
 * three-level namespace. A schema organizes tables, views and functions. To
 * access (or list) a table or view in a schema, users must have the USE_SCHEMA
 * data permission on the schema and its parent catalog, and they must have the
 * SELECT permission on the table or view.
 */
@Generated("databricks-sdk-generator")
public class SchemasAPI implements SchemasService {
    private final ApiClient apiClient;

    public SchemasAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a schema.
     * 
     * Creates a new schema for catalog in the Metatastore. The caller must be a
     * metastore admin, or have the **CREATE_SCHEMA** privilege in the parent
     * catalog.
     */
    @Override
    public SchemaInfo create(CreateSchema request) {
        String path = "/api/2.1/unity-catalog/schemas";
        return apiClient.POST(path, request, SchemaInfo.class);
    }
    
	/**
     * Delete a schema.
     * 
     * Deletes the specified schema from the parent catalog. The caller must be
     * the owner of the schema or an owner of the parent catalog.
     */
    @Override
    public void delete(DeleteSchemaRequest request) {
        String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a schema.
     * 
     * Gets the specified schema within the metastore. The caller must be a
     * metastore admin, the owner of the schema, or a user that has the
     * **USE_SCHEMA** privilege on the schema.
     */
    @Override
    public SchemaInfo get(GetSchemaRequest request) {
        String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
        return apiClient.GET(path, request, SchemaInfo.class);
    }
    
	/**
     * List schemas.
     * 
     * Gets an array of schemas for a catalog in the metastore. If the caller is
     * the metastore admin or the owner of the parent catalog, all schemas for
     * the catalog will be retrieved. Otherwise, only schemas owned by the
     * caller (or for which the caller has the **USE_SCHEMA** privilege) will be
     * retrieved. There is no guarantee of a specific ordering of the elements
     * in the array.
     */
    @Override
    public ListSchemasResponse list(ListSchemasRequest request) {
        String path = "/api/2.1/unity-catalog/schemas";
        return apiClient.GET(path, request, ListSchemasResponse.class);
    }
    
	/**
     * Update a schema.
     * 
     * Updates a schema for a catalog. The caller must be the owner of the
     * schema or a metastore admin. If the caller is a metastore admin, only the
     * __owner__ field can be changed in the update. If the __name__ field must
     * be updated, the caller must be a metastore admin or have the
     * **CREATE_SCHEMA** privilege on the parent catalog.
     */
    @Override
    public SchemaInfo update(UpdateSchema request) {
        String path = String.format("/api/2.1/unity-catalog/schemas/%s", request.getFullName());
        return apiClient.PATCH(path, request, SchemaInfo.class);
    }
    
}