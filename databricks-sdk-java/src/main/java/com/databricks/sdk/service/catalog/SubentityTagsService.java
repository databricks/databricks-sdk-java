// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Tags are attributes containing keys and values that can be applied to different entities in Unity
 * Catalog. Tags are useful for organizing and categorizing different entities within a metastore.
 * SubentityTags are attached to Unity Catalog subentities.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SubentityTagsService {
  /**
   * Get tags for a subentity.
   *
   * <p>Gets tag assignments for a subentity associated with a securable entity. Eg. column of a
   * table The caller must be either the owner of the securable, or a metastore admin, or have at
   * least USE / SELECT privilege on the associated securable.
   */
  TagSubentityAssignmentsList list(ListSubentityTagsRequest listSubentityTagsRequest);

  /**
   * Update tags for a subentity.
   *
   * <p>Update tag assignments for a subentity associated with a securable entity. The caller must
   * be either the owner of the securable, or a metastore admin, or have at least USE / SELECT and
   * APPLY_TAG privilege on the associated securable.
   */
  TagSubentityAssignmentsList update(UpdateTags updateTags);
}
