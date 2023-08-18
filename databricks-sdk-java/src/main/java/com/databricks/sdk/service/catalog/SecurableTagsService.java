// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Tags are attributes containing keys and values that can be applied to different entities in Unity
 * Catalog. Tags are useful for organizing and categorizing different entities within a metastore.
 * SecurableTags are attached to Unity Catalog securable entities.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SecurableTagsService {
  /**
   * Get tags for a securable.
   *
   * <p>Gets tag assignments for an entity. The caller must be either the owner of the securable, or
   * a metastore admin, or have at least USE / SELECT privilege on the associated securable.
   */
  TagSecurableAssignmentsList list(ListSecurableTagsRequest listSecurableTagsRequest);

  /**
   * Update tags for a securable.
   *
   * <p>Update tag assignments for an entity The caller must be either the owner of the securable,
   * or a metastore admin, or have at least USE / SELECT and APPLY_TAG privilege on the associated
   * securable.
   */
  TagSecurableAssignmentsList update(UpdateTags updateTags);
}
