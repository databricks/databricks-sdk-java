// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * External Lineage APIs enable defining and managing lineage relationships between Databricks
 * objects and external systems. These APIs allow users to capture data flows connecting Databricks
 * tables, models, and file paths with external metadata objects.
 *
 * <p>With these APIs, users can create, update, delete, and list lineage relationships with support
 * for column-level mappings and custom properties.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ExternalLineageService {
  /**
   * Creates an external lineage relationship between a Databricks or external metadata object and
   * another external metadata object.
   */
  ExternalLineageRelationship createExternalLineageRelationship(
      CreateExternalLineageRelationshipRequest createExternalLineageRelationshipRequest);

  /**
   * Deletes an external lineage relationship between a Databricks or external metadata object and
   * another external metadata object.
   */
  void deleteExternalLineageRelationship(
      DeleteExternalLineageRelationshipRequest deleteExternalLineageRelationshipRequest);

  /**
   * Lists external lineage relationships of a Databricks object or external metadata given a
   * supplied direction.
   */
  ListExternalLineageRelationshipsResponse listExternalLineageRelationships(
      ListExternalLineageRelationshipsRequest listExternalLineageRelationshipsRequest);

  /**
   * Updates an external lineage relationship between a Databricks or external metadata object and
   * another external metadata object.
   */
  ExternalLineageRelationship updateExternalLineageRelationship(
      UpdateExternalLineageRelationshipRequest updateExternalLineageRelationshipRequest);
}
