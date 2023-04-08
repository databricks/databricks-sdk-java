// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

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
public class TableConstraintsAPI {
    private final TableConstraintsService impl;

    /** Regular-use constructor */
    public TableConstraintsAPI(ApiClient apiClient) {
        impl = new TableConstraintsImpl(apiClient);
    }

    /** Constructor for mocks */
    public TableConstraintsAPI(TableConstraintsService mock) {
        impl = mock;
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
    public TableConstraint create(CreateTableConstraint request) {
        return impl.create(request);
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
    public void delete(DeleteTableConstraintRequest request) {
        impl.delete(request);
    }
    
    public TableConstraintsService impl() {
        return impl;
    }
}