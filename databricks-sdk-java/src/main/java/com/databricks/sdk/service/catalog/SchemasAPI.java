// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A schema (also called a database) is the second layer of Unity Catalog’s three-level namespace. A
 * schema organizes tables, views and functions. To access (or list) a table or view in a schema,
 * users must have the USE_SCHEMA data permission on the schema and its parent catalog, and they
 * must have the SELECT permission on the table or view.
 */
@Generated
public class SchemasAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SchemasAPI.class);

  private final SchemasService impl;

  /** Regular-use constructor */
  public SchemasAPI(ApiClient apiClient) {
    impl = new SchemasImpl(apiClient);
  }

  /** Constructor for mocks */
  public SchemasAPI(SchemasService mock) {
    impl = mock;
  }

  public SchemaInfo create(String name, String catalogName) {
    return create(new CreateSchema().setName(name).setCatalogName(catalogName));
  }

  /**
   * Create a schema.
   *
   * <p>Creates a new schema for catalog in the Metatastore. The caller must be a metastore admin,
   * or have the **CREATE_SCHEMA** privilege in the parent catalog.
   */
  public SchemaInfo create(CreateSchema request) {
    return impl.create(request);
  }

  public void delete(String fullName) {
    delete(new DeleteSchemaRequest().setFullName(fullName));
  }

  /**
   * Delete a schema.
   *
   * <p>Deletes the specified schema from the parent catalog. The caller must be the owner of the
   * schema or an owner of the parent catalog.
   */
  public void delete(DeleteSchemaRequest request) {
    impl.delete(request);
  }

  public SchemaInfo get(String fullName) {
    return get(new GetSchemaRequest().setFullName(fullName));
  }

  /**
   * Get a schema.
   *
   * <p>Gets the specified schema within the metastore. The caller must be a metastore admin, the
   * owner of the schema, or a user that has the **USE_SCHEMA** privilege on the schema.
   */
  public SchemaInfo get(GetSchemaRequest request) {
    return impl.get(request);
  }

  public Iterable<SchemaInfo> list(String catalogName) {
    return list(new ListSchemasRequest().setCatalogName(catalogName));
  }

  /**
   * List schemas.
   *
   * <p>Gets an array of schemas for a catalog in the metastore. If the caller is the metastore
   * admin or the owner of the parent catalog, all schemas for the catalog will be retrieved.
   * Otherwise, only schemas owned by the caller (or for which the caller has the **USE_SCHEMA**
   * privilege) will be retrieved. There is no guarantee of a specific ordering of the elements in
   * the array.
   */
  public Iterable<SchemaInfo> list(ListSchemasRequest request) {
    return impl.list(request).getSchemas();
  }

  public SchemaInfo update(String fullName) {
    return update(new UpdateSchema().setFullName(fullName));
  }

  /**
   * Update a schema.
   *
   * <p>Updates a schema for a catalog. The caller must be the owner of the schema or a metastore
   * admin. If the caller is a metastore admin, only the __owner__ field can be changed in the
   * update. If the __name__ field must be updated, the caller must be a metastore admin or have the
   * **CREATE_SCHEMA** privilege on the parent catalog.
   */
  public SchemaInfo update(UpdateSchema request) {
    return impl.update(request);
  }

  public SchemasService impl() {
    return impl;
  }
}
