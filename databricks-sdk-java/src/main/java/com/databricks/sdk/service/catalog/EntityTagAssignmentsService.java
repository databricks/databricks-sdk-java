// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Tags are attributes that include keys and optional values that you can use to organize and
 * categorize entities in Unity Catalog. Entity tagging is currently supported on catalogs, schemas,
 * tables (including views), columns, volumes. With these APIs, users can create, update, delete,
 * and list tag assignments across Unity Catalog entities
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EntityTagAssignmentsService {
  /**
   * Creates a tag assignment for an Unity Catalog entity.
   *
   * <p>To add tags to Unity Catalog entities, you must own the entity or have the following
   * privileges: - **APPLY TAG** on the entity - **USE SCHEMA** on the entity's parent schema -
   * **USE CATALOG** on the entity's parent catalog
   *
   * <p>To add a governed tag to Unity Catalog entities, you must also have the **ASSIGN** or
   * **MANAGE** permission on the tag policy. See [Manage tag policy permissions].
   *
   * <p>[Manage tag policy permissions]:
   * https://docs.databricks.com/aws/en/admin/tag-policies/manage-permissions
   */
  EntityTagAssignment create(CreateEntityTagAssignmentRequest createEntityTagAssignmentRequest);

  /**
   * Deletes a tag assignment for an Unity Catalog entity by its key.
   *
   * <p>To delete tags from Unity Catalog entities, you must own the entity or have the following
   * privileges: - **APPLY TAG** on the entity - **USE_SCHEMA** on the entity's parent schema -
   * **USE_CATALOG** on the entity's parent catalog
   *
   * <p>To delete a governed tag from Unity Catalog entities, you must also have the **ASSIGN** or
   * **MANAGE** permission on the tag policy. See [Manage tag policy permissions].
   *
   * <p>[Manage tag policy permissions]:
   * https://docs.databricks.com/aws/en/admin/tag-policies/manage-permissions
   */
  void delete(DeleteEntityTagAssignmentRequest deleteEntityTagAssignmentRequest);

  /** Gets a tag assignment for an Unity Catalog entity by tag key. */
  EntityTagAssignment get(GetEntityTagAssignmentRequest getEntityTagAssignmentRequest);

  /**
   * List tag assignments for an Unity Catalog entity
   *
   * <p>PAGINATION BEHAVIOR: The API is by default paginated, a page may contain zero results while
   * still providing a next_page_token. Clients must continue reading pages until next_page_token is
   * absent, which is the only indication that the end of results has been reached.
   */
  ListEntityTagAssignmentsResponse list(
      ListEntityTagAssignmentsRequest listEntityTagAssignmentsRequest);

  /**
   * Updates an existing tag assignment for an Unity Catalog entity.
   *
   * <p>To update tags to Unity Catalog entities, you must own the entity or have the following
   * privileges: - **APPLY TAG** on the entity - **USE SCHEMA** on the entity's parent schema -
   * **USE CATALOG** on the entity's parent catalog
   *
   * <p>To update a governed tag to Unity Catalog entities, you must also have the **ASSIGN** or
   * **MANAGE** permission on the tag policy. See [Manage tag policy permissions].
   *
   * <p>[Manage tag policy permissions]:
   * https://docs.databricks.com/aws/en/admin/tag-policies/manage-permissions
   */
  EntityTagAssignment update(UpdateEntityTagAssignmentRequest updateEntityTagAssignmentRequest);
}
