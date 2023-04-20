// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

/**
 * A schema (also called a database) is the second layer of Unity Catalog’s three-level namespace. A
 * schema organizes tables, views and functions. To access (or list) a table or view in a schema,
 * users must have the USE_SCHEMA data permission on the schema and its parent catalog, and they
 * must have the SELECT permission on the table or view.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface SchemasService {
  /**
   * Create a schema.
   *
   * <p>Creates a new schema for catalog in the Metatastore. The caller must be a metastore admin,
   * or have the **CREATE_SCHEMA** privilege in the parent catalog.
   */
  SchemaInfo create(CreateSchema createSchema);

  /**
   * Delete a schema.
   *
   * <p>Deletes the specified schema from the parent catalog. The caller must be the owner of the
   * schema or an owner of the parent catalog.
   */
  void delete(DeleteSchemaRequest deleteSchemaRequest);

  /**
   * Get a schema.
   *
   * <p>Gets the specified schema within the metastore. The caller must be a metastore admin, the
   * owner of the schema, or a user that has the **USE_SCHEMA** privilege on the schema.
   */
  SchemaInfo get(GetSchemaRequest getSchemaRequest);

  /**
   * List schemas.
   *
   * <p>Gets an array of schemas for a catalog in the metastore. If the caller is the metastore
   * admin or the owner of the parent catalog, all schemas for the catalog will be retrieved.
   * Otherwise, only schemas owned by the caller (or for which the caller has the **USE_SCHEMA**
   * privilege) will be retrieved. There is no guarantee of a specific ordering of the elements in
   * the array.
   */
  ListSchemasResponse list(ListSchemasRequest listSchemasRequest);

  /**
   * Update a schema.
   *
   * <p>Updates a schema for a catalog. The caller must be the owner of the schema or a metastore
   * admin. If the caller is a metastore admin, only the __owner__ field can be changed in the
   * update. If the __name__ field must be updated, the caller must be a metastore admin or have the
   * **CREATE_SCHEMA** privilege on the parent catalog.
   */
  SchemaInfo update(UpdateSchema updateSchema);
}
