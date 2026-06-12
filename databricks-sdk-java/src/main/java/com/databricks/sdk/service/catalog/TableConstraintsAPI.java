// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/**
 * Primary key and foreign key constraints encode relationships between fields in tables.
 *
 * <p>Primary and foreign keys are informational only and are not enforced. Foreign keys must
 * reference a primary key in another table. This primary key is the parent constraint of the
 * foreign key and the table this primary key is on is the parent table of the foreign key.
 * Similarly, the foreign key is the child constraint of its referenced primary key; the table of
 * the foreign key is the child table of the primary key.
 *
 * <p>You can declare primary keys and foreign keys as part of the table specification during table
 * creation. You can also add or drop constraints on existing tables.
 */
@Generated
public class TableConstraintsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TableConstraintsAPI.class);

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
   * Creates a new table constraint.
   *
   * <p>For the table constraint creation to succeed, the user must satisfy both of these
   * conditions:
   *
   * <ul>
   *   <li>the user must have the <b>USE_CATALOG</b> privilege on the table's parent catalog, the
   *       <b>USE_SCHEMA</b> privilege on the table's parent schema, and be the owner of the table.
   *   <li>if the new constraint is a <b>ForeignKeyConstraint</b>, the user must have the
   *       <b>USE_CATALOG</b> privilege on the referenced parent table's catalog, the
   *       <b>USE_SCHEMA</b> privilege on the referenced parent table's schema, and be the owner of
   *       the referenced parent table.
   * </ul>
   */
  public TableConstraint create(CreateTableConstraint request) {
    return impl.create(request);
  }

  public void delete(String fullName) {
    delete(new DeleteTableConstraintRequest().setFullName(fullName));
  }

  /**
   * Deletes a table constraint.
   *
   * <p>For the table constraint deletion to succeed, the user must satisfy both of these
   * conditions:
   *
   * <ul>
   *   <li>the user must have the <b>USE_CATALOG</b> privilege on the table's parent catalog, the
   *       <b>USE_SCHEMA</b> privilege on the table's parent schema, and be the owner of the table.
   *   <li>if <b>cascade</b> argument is <b>true</b>, the user must have the following permissions
   *       on all of the child tables: the <b>USE_CATALOG</b> privilege on the table's catalog, the
   *       <b>USE_SCHEMA</b> privilege on the table's schema, and be the owner of the table.
   * </ul>
   */
  public void delete(DeleteTableConstraintRequest request) {
    impl.delete(request);
  }

  public TableConstraintsService impl() {
    return impl;
  }
}
