// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  public TableConstraint create(String fullNameArg, TableConstraint constraint) {
    return create(
        new CreateTableConstraint().setFullNameArg(fullNameArg).setConstraint(constraint));
  }

  /**
   * Creates a new table constraint.
   *
   * <p>For the table constraint creation to succeed, the user must satisfy both of these
   * conditions: - the user must have the **USE_CATALOG** privilege on the table's parent catalog,
   * the **USE_SCHEMA** privilege on the table's parent schema, and be the owner of the table. - if
   * the new constraint is a __ForeignKeyConstraint__, the user must have the **USE_CATALOG**
   * privilege on the referenced parent table's catalog, the **USE_SCHEMA** privilege on the
   * referenced parent table's schema, and be the owner of the referenced parent table.
   */
  public TableConstraint create(CreateTableConstraint request) {
    return impl.create(request);
  }

  public void delete(String fullName, String constraintName, boolean cascade) {
    delete(
        new DeleteTableConstraintRequest()
            .setFullName(fullName)
            .setConstraintName(constraintName)
            .setCascade(cascade));
  }

  /**
   * Deletes a table constraint.
   *
   * <p>For the table constraint deletion to succeed, the user must satisfy both of these
   * conditions: - the user must have the **USE_CATALOG** privilege on the table's parent catalog,
   * the **USE_SCHEMA** privilege on the table's parent schema, and be the owner of the table. - if
   * __cascade__ argument is **true**, the user must have the following permissions on all of the
   * child tables: the **USE_CATALOG** privilege on the table's catalog, the **USE_SCHEMA**
   * privilege on the table's schema, and be the owner of the table.
   */
  public void delete(DeleteTableConstraintRequest request) {
    impl.delete(request);
  }

  public TableConstraintsService impl() {
    return impl;
  }
}
