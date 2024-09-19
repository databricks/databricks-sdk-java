// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Temporary Table Credentials refer to short-lived, downscoped credentials used to access cloud
 * storage locationswhere table data is stored in Databricks. These credentials are employed to
 * provide secure and time-limitedaccess to data in cloud environments such as AWS, Azure, and
 * Google Cloud. Each cloud provider has its own typeof credentials: AWS uses temporary session
 * tokens via AWS Security Token Service (STS), Azure utilizesShared Access Signatures (SAS) for its
 * data storage services, and Google Cloud supports temporary credentialsthrough OAuth 2.0.Temporary
 * table credentials ensure that data access is limited in scope and duration, reducing the risk
 * ofunauthorized access or misuse. To use the temporary table credentials API, a metastore admin
 * needs to enable the external_access_enabled flag (off by default) at the metastore level, and
 * user needs to be granted the EXTERNAL USE SCHEMA permission at the schema level by catalog admin.
 * Note that EXTERNAL USE SCHEMA is a schema level permission that can only be granted by catalog
 * admin explicitly and is not included in schema ownership or ALL PRIVILEGES on the schema for
 * security reason.
 */
@Generated
public class TemporaryTableCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TemporaryTableCredentialsAPI.class);

  private final TemporaryTableCredentialsService impl;

  /** Regular-use constructor */
  public TemporaryTableCredentialsAPI(ApiClient apiClient) {
    impl = new TemporaryTableCredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public TemporaryTableCredentialsAPI(TemporaryTableCredentialsService mock) {
    impl = mock;
  }

  /**
   * Generate a temporary table credential.
   *
   * <p>Get a short-lived credential for directly accessing the table data on cloud storage. The
   * metastore must have external_access_enabled flag set to true (default false). The caller must
   * have EXTERNAL_USE_SCHEMA privilege on the parent schema and this privilege can only be granted
   * by catalog owners.
   */
  public GenerateTemporaryTableCredentialResponse generateTemporaryTableCredentials(
      GenerateTemporaryTableCredentialRequest request) {
    return impl.generateTemporaryTableCredentials(request);
  }

  public TemporaryTableCredentialsService impl() {
    return impl;
  }
}
