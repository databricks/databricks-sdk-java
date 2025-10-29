package com.databricks.sdk.core;

/**
 * CredentialsProvider is an interface that provides a HeaderFactory to authenticate requests to the
 * Databricks API.
 */
public interface CredentialsProvider {
  /**
   * Returns the authentication type identifier for this credentials provider.
   *
   * @return the authentication type as a string
   */
  String authType();

  /**
   * Creates and returns a new HeaderFactory to authenticate requests to the Databricks API.
   *
   * <p>Note: A new HeaderFactory instance is returned on each invocation.
   *
   * @param config the Databricks configuration to use for authentication
   * @return a new HeaderFactory configured for authenticating API requests
   */
  HeaderFactory configure(DatabricksConfig config);
}
