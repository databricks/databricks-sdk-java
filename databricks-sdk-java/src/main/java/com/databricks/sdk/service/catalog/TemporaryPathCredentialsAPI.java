// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Temporary Path Credentials refer to short-lived, downscoped credentials used to access external
 * cloud storage locations registered in Databricks. These credentials are employed to provide
 * secure and time-limited access to data in cloud environments such as AWS, Azure, and Google
 * Cloud. Each cloud provider has its own type of credentials: AWS uses temporary session tokens via
 * AWS Security Token Service (STS), Azure utilizes Shared Access Signatures (SAS) for its data
 * storage services, and Google Cloud supports temporary credentials through OAuth 2.0.
 *
 * <p>Temporary path credentials ensure that data access is limited in scope and duration, reducing
 * the risk of unauthorized access or misuse. To use the temporary path credentials API, a metastore
 * admin needs to enable the external_access_enabled flag (off by default) at the metastore level. A
 * user needs to be granted the EXTERNAL USE LOCATION permission by external location owner. For
 * requests on existing external tables, user also needs to be granted the EXTERNAL USE SCHEMA
 * permission at the schema level by catalog admin.
 *
 * <p>Note that EXTERNAL USE SCHEMA is a schema level permission that can only be granted by catalog
 * admin explicitly and is not included in schema ownership or ALL PRIVILEGES on the schema for
 * security reasons. Similarly, EXTERNAL USE LOCATION is an external location level permission that
 * can only be granted by external location owner explicitly and is not included in external
 * location ownership or ALL PRIVILEGES on the external location for security reasons.
 *
 * <p>This API only supports temporary path credentials for external locations and external tables,
 * and volumes will be supported in the future.
 */
@Generated
public class TemporaryPathCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TemporaryPathCredentialsAPI.class);

  private final TemporaryPathCredentialsService impl;

  /** Regular-use constructor */
  public TemporaryPathCredentialsAPI(ApiClient apiClient) {
    impl = new TemporaryPathCredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public TemporaryPathCredentialsAPI(TemporaryPathCredentialsService mock) {
    impl = mock;
  }

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
  public GenerateTemporaryPathCredentialResponse generateTemporaryPathCredentials(
      GenerateTemporaryPathCredentialRequest request) {
    return impl.generateTemporaryPathCredentials(request);
  }

  public TemporaryPathCredentialsService impl() {
    return impl;
  }
}
