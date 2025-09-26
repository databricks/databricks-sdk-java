// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Manage tag assignments on workspace-scoped objects. */
@Generated
public class TagAssignmentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TagAssignmentsAPI.class);

  private final TagAssignmentsService impl;

  /** Regular-use constructor */
  public TagAssignmentsAPI(ApiClient apiClient) {
    impl = new TagAssignmentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public TagAssignmentsAPI(TagAssignmentsService mock) {
    impl = mock;
  }

  /** Create a tag assignment */
  public TagAssignment createTagAssignment(CreateTagAssignmentRequest request) {
    return impl.createTagAssignment(request);
  }

  public void deleteTagAssignment(String entityType, String entityId, String tagKey) {
    deleteTagAssignment(
        new DeleteTagAssignmentRequest()
            .setEntityType(entityType)
            .setEntityId(entityId)
            .setTagKey(tagKey));
  }

  /** Delete a tag assignment */
  public void deleteTagAssignment(DeleteTagAssignmentRequest request) {
    impl.deleteTagAssignment(request);
  }

  public TagAssignment getTagAssignment(String entityType, String entityId, String tagKey) {
    return getTagAssignment(
        new GetTagAssignmentRequest()
            .setEntityType(entityType)
            .setEntityId(entityId)
            .setTagKey(tagKey));
  }

  /** Get a tag assignment */
  public TagAssignment getTagAssignment(GetTagAssignmentRequest request) {
    return impl.getTagAssignment(request);
  }

  public Iterable<TagAssignment> listTagAssignments(String entityType, String entityId) {
    return listTagAssignments(
        new ListTagAssignmentsRequest().setEntityType(entityType).setEntityId(entityId));
  }

  /** List the tag assignments for an entity */
  public Iterable<TagAssignment> listTagAssignments(ListTagAssignmentsRequest request) {
    return new Paginator<>(
        request,
        impl::listTagAssignments,
        ListTagAssignmentsResponse::getTagAssignments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Update a tag assignment */
  public TagAssignment updateTagAssignment(UpdateTagAssignmentRequest request) {
    return impl.updateTagAssignment(request);
  }

  public TagAssignmentsService impl() {
    return impl;
  }
}
