package com.databricks.sdk.core;

/**
 * CredentialsProvider is an interface that provides a HeaderFactory to authenticate requests to the
 * Databricks API.
 *
 * <p>Users can implement this interface to provide custom authentication mechanisms. Once
 * implemented, the custom provider can be set on {@link DatabricksConfig} using {@link
 * DatabricksConfig#setCredentialsProvider(CredentialsProvider)}.
 *
 * <p><b>Note:</b> The methods in this interface are called internally by the SDK clients
 * (WorkspaceClient and AccountClient) during request authentication. Users implementing this
 * interface should not call these methods directly.
 */
public interface CredentialsProvider {
  /**
   * Returns the authentication type identifier for this credentials provider.
   *
   * <p><b>This method is called internally by the SDK</b> and should not be invoked directly by
   * users. It is used for logging and user-agent identification purposes.
   *
   * @return the authentication type as a string
   */
  String authType();

  /**
   * Creates and returns a new HeaderFactory to authenticate requests to the Databricks API.
   *
   * <p><b>This method is called internally by the SDK</b> during client initialization and should
   * not be invoked directly by users. The SDK will call this method to obtain a HeaderFactory that
   * will be used to add authentication headers to each API request.
   *
   * <p>Note: A new HeaderFactory instance is returned on each invocation.
   *
   * @param config the Databricks configuration to use for authentication
   * @return a new HeaderFactory configured for authenticating API requests
   */
  HeaderFactory configure(DatabricksConfig config);
}
