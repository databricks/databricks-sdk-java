// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

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
 * <p>Note: The securable type for models is FUNCTION. When using REST APIs (e.g. tagging, grants)
 * that specify a securable type, use FUNCTION as the securable type.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface RegisteredModelsService {
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
  RegisteredModelInfo create(CreateRegisteredModelRequest createRegisteredModelRequest);

  /**
   * Deletes a registered model and all its model versions from the specified parent catalog and
   * schema.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  void delete(DeleteRegisteredModelRequest deleteRegisteredModelRequest);

  /**
   * Deletes a registered model alias.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  void deleteAlias(DeleteAliasRequest deleteAliasRequest);

  /**
   * Get a registered model.
   *
   * <p>The caller must be a metastore admin or an owner of (or have the **EXECUTE** privilege on)
   * the registered model. For the latter case, the caller must also be the owner or have the
   * **USE_CATALOG** privilege on the parent catalog and the **USE_SCHEMA** privilege on the parent
   * schema.
   */
  RegisteredModelInfo get(GetRegisteredModelRequest getRegisteredModelRequest);

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
  ListRegisteredModelsResponse list(ListRegisteredModelsRequest listRegisteredModelsRequest);

  /**
   * Set an alias on the specified registered model.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   */
  RegisteredModelAlias setAlias(SetRegisteredModelAliasRequest setRegisteredModelAliasRequest);

  /**
   * Updates the specified registered model.
   *
   * <p>The caller must be a metastore admin or an owner of the registered model. For the latter
   * case, the caller must also be the owner or have the **USE_CATALOG** privilege on the parent
   * catalog and the **USE_SCHEMA** privilege on the parent schema.
   *
   * <p>Currently only the name, the owner or the comment of the registered model can be updated.
   */
  RegisteredModelInfo update(UpdateRegisteredModelRequest updateRegisteredModelRequest);
}
