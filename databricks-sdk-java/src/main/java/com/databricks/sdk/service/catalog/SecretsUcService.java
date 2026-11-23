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
   * <p>You must be a metastore admin or the owner of the secret, or have the **MANAGE** privilege
   * on the secret (together with **USE CATALOG** on its catalog and **USE SCHEMA** on its schema),
   * on its schema (together with **USE CATALOG** on its catalog), or on its catalog. Alternatively,
   * you can have the **READ_SECRET**, **WRITE_SECRET**, or **REFERENCE_SECRET** privilege on the
   * secret, its schema, or its catalog, together with **USE CATALOG** on its catalog and **USE
   * SCHEMA** on its schema.
   *
   * <p>The secret value isn't returned by default. To retrieve it, set **include_value** to true in
   * the request; this requires ownership of the secret or the **READ_SECRET** privilege.
   */
  Secret getSecret(GetSecretRequest getSecretRequest);

  /**
   * Lists the secrets in a schema.
   *
   * <p>With **USE CATALOG** on the catalog and **USE SCHEMA** on the schema, the response contains
   * the secrets that you own or hold a privilege on. Metastore admins, principals with the
   * **MANAGE** privilege on the catalog, and principals with the **MANAGE** privilege on the schema
   * together with **USE CATALOG** on the catalog see every secret in the schema.
   *
   * <p>Secrets are listed within a single schema, so both **catalog_name** and **schema_name** must
   * be specified. Results are paginated; pass the **next_page_token** value from the response as
   * **page_token** to retrieve the next page.
   */
  ListSecretsResponse listSecrets(ListSecretsRequest listSecretsRequest);

  /**
   * Updates an existing secret in Unity Catalog.
   *
   * <p>To change **value**, you must be the owner of the secret, or have the **WRITE_SECRET**
   * privilege on it together with **USE CATALOG** on its catalog and **USE SCHEMA** on its schema.
   * To change **comment** or **expire_time**, you must be the owner or have the **MANAGE**
   * privilege on the secret (together with **USE CATALOG** on its catalog and **USE SCHEMA** on its
   * schema), on its schema (together with **USE CATALOG** on its catalog), or on its catalog. To
   * change **owner**, you must be the owner, a metastore admin, or have the **MANAGE** privilege on
   * the secret (together with **USE CATALOG** on its catalog and **USE SCHEMA** on its schema), on
   * its schema (together with **USE CATALOG** on its catalog), or on its catalog. A metastore admin
   * can change only the **owner** field.
   *
   * <p>Use the **update_mask** field to specify which fields to update.
   */
  Secret updateSecret(UpdateSecretRequest updateSecretRequest);
}
