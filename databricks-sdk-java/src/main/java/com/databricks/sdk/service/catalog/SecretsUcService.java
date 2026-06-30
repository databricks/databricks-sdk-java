// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A secret is a Unity Catalog securable object that stores sensitive credential data (such as
 * passwords, tokens, and keys) within a three-level namespace
 * (**catalog_name.schema_name.secret_name**).
 *
 * <p>Secrets can be managed using standard Unity Catalog permissions and are scoped to a schema
 * within a catalog.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SecretsUcService {
  /**
   * Creates a new secret in Unity Catalog.
   *
   * <p>You must be the owner of the parent schema or have the **CREATE_SECRET** and **USE SCHEMA**
   * privileges on the parent schema and **USE CATALOG** on the parent catalog.
   *
   * <p>The secret is stored in the specified catalog and schema, and the **value** field contains
   * the sensitive data to be securely stored.
   */
  Secret createSecret(CreateSecretRequest createSecretRequest);

  /**
   * Deletes a secret by its three-level (fully qualified) name.
   *
   * <p>You must be the owner of the secret or a metastore admin.
   */
  void deleteSecret(DeleteSecretRequest deleteSecretRequest);

  /**
   * Gets a secret by its three-level (fully qualified) name.
   *
   * <p>You must be a metastore admin, the owner of the secret, or have the **MANAGE** privilege on
   * the secret.
   *
   * <p>The secret value isn't returned by default. To retrieve it, you must also have the
   * **READ_SECRET** privilege and set **include_value** to true in the request.
   */
  Secret getSecret(GetSecretRequest getSecretRequest);

  /**
   * Lists secrets in Unity Catalog.
   *
   * <p>You must be a metastore admin, the owner of the secret, or have the **MANAGE** privilege on
   * the secret.
   *
   * <p>Both **catalog_name** and **schema_name** must be specified together to filter secrets
   * within a specific schema. Results are paginated; use the **page_token** field from the response
   * to retrieve subsequent pages.
   */
  ListSecretsResponse listSecrets(ListSecretsRequest listSecretsRequest);

  /**
   * Updates an existing secret in Unity Catalog.
   *
   * <p>You must be the owner of the secret or a metastore admin. If you are a metastore admin, only
   * the **owner** field can be changed.
   *
   * <p>Use the **update_mask** field to specify which fields to update. Supported updatable fields
   * include **value**, **comment**, **owner**, and **expire_time**.
   */
  Secret updateSecret(UpdateSecretRequest updateSecretRequest);
}
