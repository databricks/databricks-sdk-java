// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Temporary Path Credentials are short-lived, downscoped credentials used to access external cloud
 * storage locations registered in Databricks. These credentials provide secure and time-limited
 * access to data in cloud environments such as AWS, Azure, and Google Cloud. Each cloud provider
 * has its own type of credentials: AWS uses temporary session tokens through AWS Security Token
 * Service (STS), Azure uses Shared Access Signatures (SAS) for its data storage services, and
 * Google Cloud supports temporary credentials through OAuth 2.0.
 *
 * <p>Temporary path credentials ensure that data access is limited in scope and duration, reducing
 * the risk of unauthorized access or misuse. To use the temporary path credentials API, a metastore
 * admin must enable the external_access_enabled flag (off by default) at the metastore level. A
 * user must be granted the EXTERNAL USE LOCATION permission by the external location owner. For
 * requests on existing external tables and external volumes, the user must also be granted the
 * EXTERNAL USE SCHEMA permission at the schema level by the catalog owner.
 *
 * <p>Note that EXTERNAL USE SCHEMA is a schema level permission that can only be granted by the
 * catalog owner explicitly and is not included in schema ownership or ALL PRIVILEGES on the schema
 * for security reasons. Similarly, EXTERNAL USE LOCATION is an external location level permission
 * that can only be granted by the external location owner explicitly and is not included in
 * external location ownership or ALL PRIVILEGES on the external location for security reasons.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TemporaryPathCredentialsService {
  /**
   * Get a short-lived credential for directly accessing cloud storage locations registered in
   * Databricks. The Generate Temporary Path Credentials API is only supported for external storage
   * paths, specifically external locations and external tables. Managed tables are not supported by
   * this API. The metastore must have **external_access_enabled** flag set to true (default false).
   * The caller must have the **EXTERNAL_USE_LOCATION** privilege on the external location; this
   * privilege can only be granted by external location owners. For requests on existing external
   * tables, the caller must also have the **EXTERNAL_USE_SCHEMA** privilege on the parent schema;
   * this privilege can only be granted by catalog owners.
   */
  GenerateTemporaryPathCredentialResponse generateTemporaryPathCredentials(
      GenerateTemporaryPathCredentialRequest generateTemporaryPathCredentialRequest);
}
