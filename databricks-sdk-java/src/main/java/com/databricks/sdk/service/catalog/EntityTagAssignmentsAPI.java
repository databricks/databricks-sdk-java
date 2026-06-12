// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Tags are attributes that include keys and optional values that you can use to organize and
 * categorize entities in Unity Catalog. Entity tagging is currently supported on catalogs, schemas,
 * tables (including views), columns, volumes. With these APIs, users can create, update, delete,
 * and list tag assignments across Unity Catalog entities
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

  /**
   * Creates a tag assignment for an Unity Catalog entity.
   *
   * <p>To add tags to Unity Catalog entities, you must own the entity or have the following
   * privileges:
   *
   * <ul>
   *   <li><b>APPLY TAG</b> on the entity
   *   <li><b>USE SCHEMA</b> on the entity's parent schema
   *   <li><b>USE CATALOG</b> on the entity's parent catalog
   * </ul>
   *
   * <p>To add a governed tag to Unity Catalog entities, you must also have the <b>ASSIGN</b> or
   * <b>MANAGE</b> permission on the tag policy. See <a
   * href="https://docs.databricks.com/aws/en/admin/tag-policies/manage-permissions">Manage tag
   * policy permissions</a>.
   */
  public EntityTagAssignment create(CreateEntityTagAssignmentRequest request) {
    return impl.create(request);
  }

  public void delete(String entityType, String entityName, String tagKey) {
    delete(
        new DeleteEntityTagAssignmentRequest()
            .setEntityType(entityType)
            .setEntityName(entityName)
            .setTagKey(tagKey));
  }

  /**
   * Deletes a tag assignment for an Unity Catalog entity by its key.
   *
   * <p>To delete tags from Unity Catalog entities, you must own the entity or have the following
   * privileges:
   *
   * <ul>
   *   <li><b>APPLY TAG</b> on the entity
   *   <li><b>USE_SCHEMA</b> on the entity's parent schema
   *   <li><b>USE_CATALOG</b> on the entity's parent catalog
   * </ul>
   *
   * <p>To delete a governed tag from Unity Catalog entities, you must also have the <b>ASSIGN</b>
   * or <b>MANAGE</b> permission on the tag policy. See <a
   * href="https://docs.databricks.com/aws/en/admin/tag-policies/manage-permissions">Manage tag
   * policy permissions</a>.
   */
  public void delete(DeleteEntityTagAssignmentRequest request) {
    impl.delete(request);
  }

  public EntityTagAssignment get(String entityType, String entityName, String tagKey) {
    return get(
        new GetEntityTagAssignmentRequest()
            .setEntityType(entityType)
            .setEntityName(entityName)
            .setTagKey(tagKey));
  }

  /** Gets a tag assignment for an Unity Catalog entity by tag key. */
  public EntityTagAssignment get(GetEntityTagAssignmentRequest request) {
    return impl.get(request);
  }

  public Iterable<EntityTagAssignment> list(String entityType, String entityName) {
    return list(
        new ListEntityTagAssignmentsRequest().setEntityType(entityType).setEntityName(entityName));
  }

  /**
   * List tag assignments for an Unity Catalog entity
   *
   * <p>PAGINATION BEHAVIOR: The API is by default paginated, a page may contain zero results while
   * still providing a next_page_token. Clients must continue reading pages until next_page_token is
   * absent, which is the only indication that the end of results has been reached.
   */
  public Iterable<EntityTagAssignment> list(ListEntityTagAssignmentsRequest request) {
    return Paginator.newTokenPagination(
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

  /**
   * Updates an existing tag assignment for an Unity Catalog entity.
   *
   * <p>To update tags to Unity Catalog entities, you must own the entity or have the following
   * privileges:
   *
   * <ul>
   *   <li><b>APPLY TAG</b> on the entity
   *   <li><b>USE SCHEMA</b> on the entity's parent schema
   *   <li><b>USE CATALOG</b> on the entity's parent catalog
   * </ul>
   *
   * <p>To update a governed tag to Unity Catalog entities, you must also have the <b>ASSIGN</b> or
   * <b>MANAGE</b> permission on the tag policy. See <a
   * href="https://docs.databricks.com/aws/en/admin/tag-policies/manage-permissions">Manage tag
   * policy permissions</a>.
   */
  public EntityTagAssignment update(UpdateEntityTagAssignmentRequest request) {
    return impl.update(request);
  }

  public EntityTagAssignmentsService impl() {
    return impl;
  }
}
