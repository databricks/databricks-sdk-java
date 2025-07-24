// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Entity Tag Assignments provide a unified interface for managing tag assignments on Unity Catalog
 * entities.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EntityTagAssignmentsService {
  /** Create an tag assignment for an Unity Catalog entity. */
  EntityTagAssignment create(CreateEntityTagAssignmentRequest createEntityTagAssignmentRequest);

  /** Delete a tag assignment for an Unity Catalog entity. */
  void delete(DeleteEntityTagAssignmentRequest deleteEntityTagAssignmentRequest);

  /** Get a tag assignment for an Unity Catalog entity. */
  EntityTagAssignment get(GetEntityTagAssignmentRequest getEntityTagAssignmentRequest);

  /** List tag assignments for an Unity Catalog entity */
  ListEntityTagAssignmentsResponse list(
      ListEntityTagAssignmentsRequest listEntityTagAssignmentsRequest);

  /** Update a tag assignment for an Unity Catalog entity */
  EntityTagAssignment update(UpdateEntityTagAssignmentRequest updateEntityTagAssignmentRequest);
}
