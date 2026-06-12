// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/**
 * Temporary Volume Credentials are short-lived, downscoped credentials used to access cloud storage
 * locations where volume data is stored in Databricks. These credentials provide secure and
 * time-limited access to data in cloud environments such as AWS, Azure, and Google Cloud. Each
 * cloud provider has its own type of credentials: AWS uses temporary session tokens through AWS
 * Security Token Service (STS), Azure uses Shared Access Signatures (SAS) for its data storage
 * services, and Google Cloud supports temporary credentials through OAuth 2.0.
 *
 * <p>Temporary volume credentials ensure that data access is limited in scope and duration,
 * reducing the risk of unauthorized access or misuse. To use the temporary volume credentials API,
 * a metastore admin must enable the external_access_enabled flag (off by default) at the metastore
 * level, and the user must be granted the EXTERNAL USE SCHEMA permission at the schema level by the
 * catalog owner. Note that EXTERNAL USE SCHEMA is a schema level permission that can only be
 * granted by the catalog owner explicitly and is not included in schema ownership or ALL PRIVILEGES
 * on the schema for security reasons.
 */
@Generated
public class TemporaryVolumeCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TemporaryVolumeCredentialsAPI.class);

  private final TemporaryVolumeCredentialsService impl;

  /** Regular-use constructor */
  public TemporaryVolumeCredentialsAPI(ApiClient apiClient) {
    impl = new TemporaryVolumeCredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public TemporaryVolumeCredentialsAPI(TemporaryVolumeCredentialsService mock) {
    impl = mock;
  }

  /**
   * Get a short-lived credential for directly accessing the volume data on cloud storage. The
   * metastore must have **external_access_enabled** flag set to true (default false). The caller
   * must have the **EXTERNAL_USE_SCHEMA** privilege on the parent schema and this privilege can
   * only be granted by catalog owners.
   */
  public GenerateTemporaryVolumeCredentialResponse generateTemporaryVolumeCredentials(
      GenerateTemporaryVolumeCredentialRequest request) {
    return impl.generateTemporaryVolumeCredentials(request);
  }

  public TemporaryVolumeCredentialsService impl() {
    return impl;
  }
}
