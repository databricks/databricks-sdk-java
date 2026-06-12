// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

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
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TableConstraintsService {
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
  TableConstraint create(CreateTableConstraint createTableConstraint);

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
  void delete(DeleteTableConstraintRequest deleteTableConstraintRequest);
}
