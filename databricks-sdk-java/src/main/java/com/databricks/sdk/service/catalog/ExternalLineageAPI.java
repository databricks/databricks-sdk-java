// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * External Lineage APIs enable defining and managing lineage relationships between Databricks
 * objects and external systems. These APIs allow users to capture data flows connecting Databricks
 * tables, models, and file paths with external metadata objects.
 *
 * <p>With these APIs, users can create, update, delete, and list lineage relationships with support
 * for column-level mappings and custom properties.
 */
@Generated
public class ExternalLineageAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ExternalLineageAPI.class);

  private final ExternalLineageService impl;

  /** Regular-use constructor */
  public ExternalLineageAPI(ApiClient apiClient) {
    impl = new ExternalLineageImpl(apiClient);
  }

  /** Constructor for mocks */
  public ExternalLineageAPI(ExternalLineageService mock) {
    impl = mock;
  }

  public ExternalLineageRelationship createExternalLineageRelationship(
      CreateRequestExternalLineage externalLineageRelationship) {
    return createExternalLineageRelationship(
        new CreateExternalLineageRelationshipRequest()
            .setExternalLineageRelationship(externalLineageRelationship));
  }

  /**
   * Creates an external lineage relationship between a Databricks or external metadata object and
   * another external metadata object.
   */
  public ExternalLineageRelationship createExternalLineageRelationship(
      CreateExternalLineageRelationshipRequest request) {
    return impl.createExternalLineageRelationship(request);
  }

  public void deleteExternalLineageRelationship(
      DeleteRequestExternalLineage externalLineageRelationship) {
    deleteExternalLineageRelationship(
        new DeleteExternalLineageRelationshipRequest()
            .setExternalLineageRelationship(externalLineageRelationship));
  }

  /**
   * Deletes an external lineage relationship between a Databricks or external metadata object and
   * another external metadata object.
   */
  public void deleteExternalLineageRelationship(DeleteExternalLineageRelationshipRequest request) {
    impl.deleteExternalLineageRelationship(request);
  }

  public Iterable<ExternalLineageInfo> listExternalLineageRelationships(
      ExternalLineageObject objectInfo, LineageDirection lineageDirection) {
    return listExternalLineageRelationships(
        new ListExternalLineageRelationshipsRequest()
            .setObjectInfo(objectInfo)
            .setLineageDirection(lineageDirection));
  }

  /**
   * Lists external lineage relationships of a Databricks object or external metadata given a
   * supplied direction.
   */
  public Iterable<ExternalLineageInfo> listExternalLineageRelationships(
      ListExternalLineageRelationshipsRequest request) {
    return new Paginator<>(
        request,
        impl::listExternalLineageRelationships,
        ListExternalLineageRelationshipsResponse::getExternalLineageRelationships,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ExternalLineageRelationship updateExternalLineageRelationship(
      UpdateRequestExternalLineage externalLineageRelationship, String updateMask) {
    return updateExternalLineageRelationship(
        new UpdateExternalLineageRelationshipRequest()
            .setExternalLineageRelationship(externalLineageRelationship)
            .setUpdateMask(updateMask));
  }

  /**
   * Updates an external lineage relationship between a Databricks or external metadata object and
   * another external metadata object.
   */
  public ExternalLineageRelationship updateExternalLineageRelationship(
      UpdateExternalLineageRelationshipRequest request) {
    return impl.updateExternalLineageRelationship(request);
  }

  public ExternalLineageService impl() {
    return impl;
  }
}
