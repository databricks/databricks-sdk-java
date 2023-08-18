// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tags are attributes containing keys and values that can be applied to different entities in Unity
 * Catalog. Tags are useful for organizing and categorizing different entities within a metastore.
 * SecurableTags are attached to Unity Catalog securable entities.
 */
@Generated
public class SecurableTagsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SecurableTagsAPI.class);

  private final SecurableTagsService impl;

  /** Regular-use constructor */
  public SecurableTagsAPI(ApiClient apiClient) {
    impl = new SecurableTagsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SecurableTagsAPI(SecurableTagsService mock) {
    impl = mock;
  }

  public Iterable<TagSecurableAssignment> list(ListSecurableType securableType, String fullName) {
    return list(
        new ListSecurableTagsRequest().setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Get tags for a securable.
   *
   * <p>Gets tag assignments for an entity. The caller must be either the owner of the securable, or
   * a metastore admin, or have at least USE / SELECT privilege on the associated securable.
   */
  public Iterable<TagSecurableAssignment> list(ListSecurableTagsRequest request) {
    return impl.list(request).getTagAssignments();
  }

  public TagSecurableAssignmentsList update(
      TagChanges changes, UpdateSecurableType securableType, String fullName) {
    return update(
        new UpdateTags().setChanges(changes).setSecurableType(securableType).setFullName(fullName));
  }

  /**
   * Update tags for a securable.
   *
   * <p>Update tag assignments for an entity The caller must be either the owner of the securable,
   * or a metastore admin, or have at least USE / SELECT and APPLY_TAG privilege on the associated
   * securable.
   */
  public TagSecurableAssignmentsList update(UpdateTags request) {
    return impl.update(request);
  }

  public SecurableTagsService impl() {
    return impl;
  }
}
