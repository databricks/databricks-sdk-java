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
 * Primary key and foreign key constraints encode relationships between fields
 * in tables.
 * 
 * Primary and foreign keys are informational only and are not enforced. Foreign
 * keys must reference a primary key in another table. This primary key is the
 * parent constraint of the foreign key and the table this primary key is on is
 * the parent table of the foreign key. Similarly, the foreign key is the child
 * constraint of its referenced primary key; the table of the foreign key is the
 * child table of the primary key.
 * 
 * You can declare primary keys and foreign keys as part of the table
 * specification during table creation. You can also add or drop constraints on
 * existing tables.
 */
@Generated("databricks-sdk-generator")
public class TableConstraintsAPI implements TableConstraintsService {
    private final ApiClient apiClient;

    public TableConstraintsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a table constraint.
     * 
     * Creates a new table constraint.
     * 
     * For the table constraint creation to succeed, the user must satisfy both
     * of these conditions: - the user must have the **USE_CATALOG** privilege
     * on the table's parent catalog, the **USE_SCHEMA** privilege on the
     * table's parent schema, and be the owner of the table. - if the new
     * constraint is a __ForeignKeyConstraint__, the user must have the
     * **USE_CATALOG** privilege on the referenced parent table's catalog, the
     * **USE_SCHEMA** privilege on the referenced parent table's schema, and be
     * the owner of the referenced parent table.
     */
    @Override
    public TableConstraint create(CreateTableConstraint request) {
        String path = "/api/2.1/unity-catalog/constraints";
        return apiClient.POST(path, request, TableConstraint.class);
    }
    
	/**
     * Delete a table constraint.
     * 
     * Deletes a table constraint.
     * 
     * For the table constraint deletion to succeed, the user must satisfy both
     * of these conditions: - the user must have the **USE_CATALOG** privilege
     * on the table's parent catalog, the **USE_SCHEMA** privilege on the
     * table's parent schema, and be the owner of the table. - if __cascade__
     * argument is **true**, the user must have the following permissions on all
     * of the child tables: the **USE_CATALOG** privilege on the table's
     * catalog, the **USE_SCHEMA** privilege on the table's schema, and be the
     * owner of the table.
     */
    @Override
    public void delete(DeleteTableConstraintRequest request) {
        String path = String.format("/api/2.1/unity-catalog/constraints/%s", request.getFullName());
        apiClient.DELETE(path, request, Void.class);
    }
    
}