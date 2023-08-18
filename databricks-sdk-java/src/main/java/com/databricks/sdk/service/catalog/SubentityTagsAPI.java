// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tags are attributes containing keys and values that can be applied to different entities in Unity
 * Catalog. Tags are useful for organizing and categorizing different entities within a metastore.
 * SubentityTags are attached to Unity Catalog subentities.
 */
@Generated
public class SubentityTagsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SubentityTagsAPI.class);

  private final SubentityTagsService impl;

  /** Regular-use constructor */
  public SubentityTagsAPI(ApiClient apiClient) {
    impl = new SubentityTagsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SubentityTagsAPI(SubentityTagsService mock) {
    impl = mock;
  }

  public Iterable<TagsSubentityAssignment> list(
      ListSecurableType securableType, String fullName, String subentityName) {
    return list(
        new ListSubentityTagsRequest()
            .setSecurableType(securableType)
            .setFullName(fullName)
            .setSubentityName(subentityName));
  }

  /**
   * Get tags for a subentity.
   *
   * <p>Gets tag assignments for a subentity associated with a securable entity. Eg. column of a
   * table The caller must be either the owner of the securable, or a metastore admin, or have at
   * least USE / SELECT privilege on the associated securable.
   */
  public Iterable<TagsSubentityAssignment> list(ListSubentityTagsRequest request) {
    return impl.list(request).getTagAssignments();
  }

  public TagSubentityAssignmentsList update(
      TagChanges changes,
      UpdateSecurableType securableType,
      String fullName,
      String subentityName) {
    return update(
        new UpdateTags()
            .setChanges(changes)
            .setSecurableType(securableType)
            .setFullName(fullName)
            .setSubentityName(subentityName));
  }

  /**
   * Update tags for a subentity.
   *
   * <p>Update tag assignments for a subentity associated with a securable entity. The caller must
   * be either the owner of the securable, or a metastore admin, or have at least USE / SELECT and
   * APPLY_TAG privilege on the associated securable.
   */
  public TagSubentityAssignmentsList update(UpdateTags request) {
    return impl.update(request);
  }

  public SubentityTagsService impl() {
    return impl;
  }
}
