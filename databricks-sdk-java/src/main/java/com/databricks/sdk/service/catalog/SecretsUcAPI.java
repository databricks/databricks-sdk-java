// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * A secret is a Unity Catalog securable object that stores sensitive credential data (such as
 * passwords, tokens, and keys) within a three-level namespace
 * (**catalog_name.schema_name.secret_name**).
 *
 * <p>Secrets can be managed using standard Unity Catalog permissions and are scoped to a schema
 * within a catalog.
 */
@Generated
public class SecretsUcAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SecretsUcAPI.class);

  private final SecretsUcService impl;

  /** Regular-use constructor */
  public SecretsUcAPI(ApiClient apiClient) {
    impl = new SecretsUcImpl(apiClient);
  }

  /** Constructor for mocks */
  public SecretsUcAPI(SecretsUcService mock) {
    impl = mock;
  }

  /**
   * Creates a new secret in Unity Catalog.
   *
   * <p>You must be the owner of the parent schema or have the **CREATE_SECRET** and **USE SCHEMA**
   * privileges on the parent schema and **USE CATALOG** on the parent catalog.
   *
   * <p>The secret is stored in the specified catalog and schema, and the **value** field contains
   * the sensitive data to be securely stored.
   */
  public Secret createSecret(CreateSecretRequest request) {
    return impl.createSecret(request);
  }

  public void deleteSecret(String fullName) {
    deleteSecret(new DeleteSecretRequest().setFullName(fullName));
  }

  /**
   * Deletes a secret by its three-level (fully qualified) name.
   *
   * <p>You must be the owner of the secret or a metastore admin.
   */
  public void deleteSecret(DeleteSecretRequest request) {
    impl.deleteSecret(request);
  }

  public Secret getSecret(String fullName) {
    return getSecret(new GetSecretRequest().setFullName(fullName));
  }

  /**
   * Gets a secret by its three-level (fully qualified) name.
   *
   * <p>You must be a metastore admin, the owner of the secret, or have the **MANAGE** privilege on
   * the secret.
   *
   * <p>The secret value isn't returned by default. To retrieve it, you must also have the
   * **READ_SECRET** privilege and set **include_value** to true in the request.
   */
  public Secret getSecret(GetSecretRequest request) {
    return impl.getSecret(request);
  }

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
  public Iterable<Secret> listSecrets(ListSecretsRequest request) {
    return new Paginator<>(
        request,
        impl::listSecrets,
        ListSecretsResponse::getSecrets,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates an existing secret in Unity Catalog.
   *
   * <p>You must be the owner of the secret or a metastore admin. If you are a metastore admin, only
   * the **owner** field can be changed.
   *
   * <p>Use the **update_mask** field to specify which fields to update. Supported updatable fields
   * include **value**, **comment**, **owner**, and **expire_time**.
   */
  public Secret updateSecret(UpdateSecretRequest request) {
    return impl.updateSecret(request);
  }

  public SecretsUcService impl() {
    return impl;
  }
}
