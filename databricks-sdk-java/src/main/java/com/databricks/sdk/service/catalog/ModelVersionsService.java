// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Databricks provides a hosted version of MLflow Model Registry in Unity Catalog. Models in Unity
 * Catalog provide centralized access control, auditing, lineage, and discovery of ML models across
 * Databricks workspaces.
 *
 * <p>This API reference documents the REST endpoints for managing model versions in Unity Catalog.
 * For more details, see the [registered models API docs](/api/workspace/registeredmodels).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ModelVersionsService {
  /**
   * Delete a Model Version.
   *
   * <p>Deletes a model version from the specified registered model. Any aliases assigned to the
   * model version will also be deleted.
   *
   * <p>The caller must be a metastore admin or an owner of the parent registered model. For the
   * latter case, the caller must also be the owner or have the **USE_CATALOG** privilege on the
   * parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  DeleteResponse delete(DeleteModelVersionRequest deleteModelVersionRequest);

  /**
   * Get a Model Version.
   *
   * <p>Get a model version.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **EXECUTE** privilege on)
   * the parent registered model. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  RegisteredModelInfo get(GetModelVersionRequest getModelVersionRequest);

  /**
   * Get Model Version By Alias.
   *
   * <p>Get a model version by alias.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **EXECUTE** privilege on)
   * the registered model. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  ModelVersionInfo getByAlias(GetByAliasRequest getByAliasRequest);

  /**
   * List Model Versions.
   *
   * <p>List model versions. You can list model versions under a particular schema, or list all
   * model versions in the current metastore.
   *
   * <p>The returned models are filtered based on the privileges of the calling user. For example,
   * the metastore admin is able to list all the model versions. A regular user needs to be the
   * owner or have the **EXECUTE** privilege on the parent registered model to recieve the model
   * versions in the response. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   *
   * <p>There is no guarantee of a specific ordering of the elements in the response.
   */
  ListModelVersionsResponse list(ListModelVersionsRequest listModelVersionsRequest);

  /**
   * Update a Model Version.
   *
   * <p>Updates the specified model version.
   *
   * <p>The caller must be a metastore admin or an owner of the parent registered model. For the
   * latter case, the caller must also be the owner or have the **USE_CATALOG** privilege on the
   * parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>Currently only the comment of the model version can be updated.
   */
  ModelVersionInfo update(UpdateModelVersionRequest updateModelVersionRequest);
}
