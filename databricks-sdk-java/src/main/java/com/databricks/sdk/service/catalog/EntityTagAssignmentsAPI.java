// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entity Tag Assignments provide a unified interface for managing tag assignments on Unity Catalog
 * entities.
 */
@Generated
public class EntityTagAssignmentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EntityTagAssignmentsAPI.class);

  private final EntityTagAssignmentsService impl;

  /** Regular-use constructor */
  public EntityTagAssignmentsAPI(ApiClient apiClient) {
    impl = new EntityTagAssignmentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public EntityTagAssignmentsAPI(EntityTagAssignmentsService mock) {
    impl = mock;
  }

  /** Create an tag assignment for an Unity Catalog entity. */
  public EntityTagAssignment create(CreateEntityTagAssignmentRequest request) {
    return impl.create(request);
  }

  public void delete(String entityName, String tagKey) {
    delete(new DeleteEntityTagAssignmentRequest().setEntityName(entityName).setTagKey(tagKey));
  }

  /** Delete a tag assignment for an Unity Catalog entity. */
  public void delete(DeleteEntityTagAssignmentRequest request) {
    impl.delete(request);
  }

  public EntityTagAssignment get(String entityName, String tagKey) {
    return get(new GetEntityTagAssignmentRequest().setEntityName(entityName).setTagKey(tagKey));
  }

  /** Get a tag assignment for an Unity Catalog entity. */
  public EntityTagAssignment get(GetEntityTagAssignmentRequest request) {
    return impl.get(request);
  }

  public Iterable<EntityTagAssignment> list(String entityName) {
    return list(new ListEntityTagAssignmentsRequest().setEntityName(entityName));
  }

  /** List tag assignments for an Unity Catalog entity */
  public Iterable<EntityTagAssignment> list(ListEntityTagAssignmentsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListEntityTagAssignmentsResponse::getTagAssignments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Update a tag assignment for an Unity Catalog entity */
  public EntityTagAssignment update(UpdateEntityTagAssignmentRequest request) {
    return impl.update(request);
  }

  public EntityTagAssignmentsService impl() {
    return impl;
  }
}
