package com.databricks.sdk.core;

import java.util.Objects;
import java.util.function.Function;

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
   * Creates a credentials provider backed by a configuration function.
   *
   * <p>This is useful for custom authentication mechanisms that do not need a dedicated provider
   * class. Runtime exceptions from {@code configureFn} are propagated to the caller.
   *
   * @param authType the authentication type used for logging and user-agent identification
   * @param configureFn creates the header factory for a Databricks configuration
   * @return a credentials provider backed by {@code configureFn}
   */
  static CredentialsProvider from(
      String authType, Function<DatabricksConfig, HeaderFactory> configureFn) {
    Objects.requireNonNull(authType, "authType");
    Objects.requireNonNull(configureFn, "configureFn");
    return new CredentialsProvider() {
      @Override
      public String authType() {
        return authType;
      }

      @Override
      public HeaderFactory configure(DatabricksConfig config) {
        return configureFn.apply(config);
      }
    };
  }

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
   * <p>Note: A new HeaderFactory instance is returned on each invocation.
   *
   * <p><b>This method is called internally by the SDK</b> during client initialization and should
   * not be invoked directly by users. The SDK will call this method to obtain a HeaderFactory that
   * will be used to add authentication headers to each API request.
   *
   * @param config the Databricks configuration to use for authentication
   * @return a new HeaderFactory configured for authenticating API requests
   */
  HeaderFactory configure(DatabricksConfig config);
}
