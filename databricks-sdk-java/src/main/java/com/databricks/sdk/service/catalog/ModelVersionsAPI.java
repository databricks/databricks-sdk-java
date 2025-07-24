// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Databricks provides a hosted version of MLflow Model Registry in Unity Catalog. Models in Unity
 * Catalog provide centralized access control, auditing, lineage, and discovery of ML models across
 * Databricks workspaces.
 *
 * <p>This API reference documents the REST endpoints for managing model versions in Unity Catalog.
 * For more details, see the [registered models API docs](/api/workspace/registeredmodels).
 */
@Generated
public class ModelVersionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ModelVersionsAPI.class);

  private final ModelVersionsService impl;

  /** Regular-use constructor */
  public ModelVersionsAPI(ApiClient apiClient) {
    impl = new ModelVersionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ModelVersionsAPI(ModelVersionsService mock) {
    impl = mock;
  }

  public void delete(String fullName, long version) {
    delete(new DeleteModelVersionRequest().setFullName(fullName).setVersion(version));
  }

  /**
   * Deletes a model version from the specified registered model. Any aliases assigned to the model
   * version will also be deleted.
   *
   * <p>The caller must be a metastore admin or an owner of the parent registered model. For the
   * latter case, the caller must also be the owner or have the **USE_CATALOG** privilege on the
   * parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  public void delete(DeleteModelVersionRequest request) {
    impl.delete(request);
  }

  public ModelVersionInfo get(String fullName, long version) {
    return get(new GetModelVersionRequest().setFullName(fullName).setVersion(version));
  }

  /**
   * Get a model version.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **EXECUTE** privilege on)
   * the parent registered model. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  public ModelVersionInfo get(GetModelVersionRequest request) {
    return impl.get(request);
  }

  public ModelVersionInfo getByAlias(String fullName, String alias) {
    return getByAlias(new GetByAliasRequest().setFullName(fullName).setAlias(alias));
  }

  /**
   * Get a model version by alias.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **EXECUTE** privilege on)
   * the registered model. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  public ModelVersionInfo getByAlias(GetByAliasRequest request) {
    return impl.getByAlias(request);
  }

  public Iterable<ModelVersionInfo> list(String fullName) {
    return list(new ListModelVersionsRequest().setFullName(fullName));
  }

  /**
   * List model versions. You can list model versions under a particular schema, or list all model
   * versions in the current metastore.
   *
   * <p>The returned models are filtered based on the privileges of the calling user. For example,
   * the metastore admin is able to list all the model versions. A regular user needs to be the
   * owner or have the **EXECUTE** privilege on the parent registered model to recieve the model
   * versions in the response. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   *
   * <p>There is no guarantee of a specific ordering of the elements in the response. The elements
   * in the response will not contain any aliases or tags.
   */
  public Iterable<ModelVersionInfo> list(ListModelVersionsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListModelVersionsResponse::getModelVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates the specified model version.
   *
   * <p>The caller must be a metastore admin or an owner of the parent registered model. For the
   * latter case, the caller must also be the owner or have the **USE_CATALOG** privilege on the
   * parent catalog and the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>Currently only the comment of the model version can be updated.
   */
  public ModelVersionInfo update(UpdateModelVersionRequest request) {
    return impl.update(request);
  }

  public ModelVersionsService impl() {
    return impl;
  }
}
