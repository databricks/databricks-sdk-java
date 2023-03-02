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
 * Functions implement User-Defined Functions (UDFs) in Unity Catalog.
 * 
 * The function implementation can be any SQL expression or Query, and it can be
 * invoked wherever a table reference is allowed in a query. In Unity Catalog, a
 * function resides at the same level as a table, so it can be referenced with
 * the form __catalog_name__.__schema_name__.__function_name__.
 */
@Generated("databricks-sdk-generator")
public class FunctionsAPI implements FunctionsService {
    private final ApiClient apiClient;

    public FunctionsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a function.
     * 
     * Creates a new function
     * 
     * The user must have the following permissions in order for the function to
     * be created: - **USE_CATALOG** on the function's parent catalog -
     * **USE_SCHEMA** and **CREATE_FUNCTION** on the function's parent schema
     */
    @Override
    public FunctionInfo create(CreateFunction request) {
        String path = "/api/2.1/unity-catalog/functions";
        return apiClient.POST(path, request, FunctionInfo.class);
    }
    
	/**
     * Delete a function.
     * 
     * Deletes the function that matches the supplied name. For the deletion to
     * succeed, the user must satisfy one of the following conditions: - Is the
     * owner of the function's parent catalog - Is the owner of the function's
     * parent schema and have the **USE_CATALOG** privilege on its parent
     * catalog - Is the owner of the function itself and have both the
     * **USE_CATALOG** privilege on its parent catalog and the **USE_SCHEMA**
     * privilege on its parent schema
     */
    @Override
    public void delete(DeleteFunctionRequest request) {
        String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a function.
     * 
     * Gets a function from within a parent catalog and schema. For the fetch to
     * succeed, the user must satisfy one of the following requirements: - Is a
     * metastore admin - Is an owner of the function's parent catalog - Have the
     * **USE_CATALOG** privilege on the function's parent catalog and be the
     * owner of the function - Have the **USE_CATALOG** privilege on the
     * function's parent catalog, the **USE_SCHEMA** privilege on the function's
     * parent schema, and the **EXECUTE** privilege on the function itself
     */
    @Override
    public FunctionInfo get(GetFunctionRequest request) {
        String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
        return apiClient.GET(path, request, FunctionInfo.class);
    }
    
	/**
     * List functions.
     * 
     * List functions within the specified parent catalog and schema. If the
     * user is a metastore admin, all functions are returned in the output list.
     * Otherwise, the user must have the **USE_CATALOG** privilege on the
     * catalog and the **USE_SCHEMA** privilege on the schema, and the output
     * list contains only functions for which either the user has the
     * **EXECUTE** privilege or the user is the owner. There is no guarantee of
     * a specific ordering of the elements in the array.
     */
    @Override
    public ListFunctionsResponse list(ListFunctionsRequest request) {
        String path = "/api/2.1/unity-catalog/functions";
        return apiClient.GET(path, request, ListFunctionsResponse.class);
    }
    
	/**
     * Update a function.
     * 
     * Updates the function that matches the supplied name. Only the owner of
     * the function can be updated. If the user is not a metastore admin, the
     * user must be a member of the group that is the new function owner. - Is a
     * metastore admin - Is the owner of the function's parent catalog - Is the
     * owner of the function's parent schema and has the **USE_CATALOG**
     * privilege on its parent catalog - Is the owner of the function itself and
     * has the **USE_CATALOG** privilege on its parent catalog as well as the
     * **USE_SCHEMA** privilege on the function's parent schema.
     */
    @Override
    public FunctionInfo update(UpdateFunction request) {
        String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
        return apiClient.PATCH(path, request, FunctionInfo.class);
    }
    
}