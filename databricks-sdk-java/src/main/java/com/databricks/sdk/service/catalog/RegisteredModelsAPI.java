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
 * <p>An MLflow registered model resides in the third layer of Unity Catalog’s three-level
 * namespace. Registered models contain model versions, which correspond to actual ML models (MLflow
 * models). Creating new model versions currently requires use of the MLflow Python client. Once
 * model versions are created, you can load them for batch inference using MLflow Python client
 * APIs, or deploy them for real-time serving using Databricks Model Serving.
 *
 * <p>All operations on registered models and model versions require USE_CATALOG permissions on the
 * enclosing catalog and USE_SCHEMA permissions on the enclosing schema. In addition, the following
 * additional privileges are required for various operations:
 *
 * <p>* To create a registered model, users must additionally have the CREATE_MODEL permission on
 * the target schema. * To view registered model or model version metadata, model version data
 * files, or invoke a model version, users must additionally have the EXECUTE permission on the
 * registered model * To update registered model or model version tags, users must additionally have
 * APPLY TAG permissions on the registered model * To update other registered model or model version
 * metadata (comments, aliases) create a new model version, or update permissions on the registered
 * model, users must be owners of the registered model.
 *
 * <p>Note: The securable type for models is "FUNCTION". When using REST APIs (e.g. tagging, grants)
 * that specify a securable type, use "FUNCTION" as the securable type.
 */
@Generated
public class RegisteredModelsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RegisteredModelsAPI.class);

  private final RegisteredModelsService impl;

  /** Regular-use constructor */
  public RegisteredModelsAPI(ApiClient apiClient) {
    impl = new RegisteredModelsImpl(apiClient);
  }

  /** Constructor for mocks */
  public RegisteredModelsAPI(RegisteredModelsService mock) {
    impl = mock;
  }

  public RegisteredModelInfo create(String catalogName, String schemaName, String name) {
    return create(
        new CreateRegisteredModelRequest()
            .setCatalogName(catalogName)
            .setSchemaName(schemaName)
            .setName(name));
  }

  /**
   * Creates a new registered model in Unity Catalog.
   *
   * <p>File storage for model versions in the registered model will be located in the default
   * location which is specified by the parent schema, or the parent catalog, or the Metastore.
   *
   * <p>For registered model creation to succeed, the user must satisfy the following conditions: -
   * The caller must be a metastore admin, or be the owner of the parent catalog and schema, or have
   * the **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the
   * parent schema. - The caller must have the **CREATE MODEL** or **CREATE FUNCTION** privilege on
   * the parent schema.
   */
  public RegisteredModelInfo create(CreateRegisteredModelRequest request) {
    return impl.create(request);
  }

  public void delete(String fullName) {
    delete(new DeleteRegisteredModelRequest().setFullName(fullName));
  }

  /**
   * Deletes a registered model and all its model versions from the specified parent catalog and
   * schema.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  public void delete(DeleteRegisteredModelRequest request) {
    impl.delete(request);
  }

  public void deleteAlias(String fullName, String alias) {
    deleteAlias(new DeleteAliasRequest().setFullName(fullName).setAlias(alias));
  }

  /**
   * Deletes a registered model alias.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  public void deleteAlias(DeleteAliasRequest request) {
    impl.deleteAlias(request);
  }

  public RegisteredModelInfo get(String fullName) {
    return get(new GetRegisteredModelRequest().setFullName(fullName));
  }

  /**
   * Get a registered model.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **EXECUTE** privilege on)
   * the registered model. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  public RegisteredModelInfo get(GetRegisteredModelRequest request) {
    return impl.get(request);
  }

  /**
   * List registered models. You can list registered models under a particular schema, or list all
   * registered models in the current metastore.
   *
   * <p>The returned models are filtered based on the privileges of the calling user. For example,
   * the metastore admin is able to list all the registered models. A regular user needs to be the
   * owner or have the **EXECUTE** privilege on the registered model to recieve the registered
   * models in the response. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   *
   * <p>There is no guarantee of a specific ordering of the elements in the response.
   */
  public Iterable<RegisteredModelInfo> list(ListRegisteredModelsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListRegisteredModelsResponse::getRegisteredModels,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public RegisteredModelAlias setAlias(String fullName, String alias, long versionNum) {
    return setAlias(
        new SetRegisteredModelAliasRequest()
            .setFullName(fullName)
            .setAlias(alias)
            .setVersionNum(versionNum));
  }

  /**
   * Set an alias on the specified registered model.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  public RegisteredModelAlias setAlias(SetRegisteredModelAliasRequest request) {
    return impl.setAlias(request);
  }

  public RegisteredModelInfo update(String fullName) {
    return update(new UpdateRegisteredModelRequest().setFullName(fullName));
  }

  /**
   * Updates the specified registered model.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>Currently only the name, the owner or the comment of the registered model can be updated.
   */
  public RegisteredModelInfo update(UpdateRegisteredModelRequest request) {
    return impl.update(request);
  }

  public RegisteredModelsService impl() {
    return impl;
  }
}
