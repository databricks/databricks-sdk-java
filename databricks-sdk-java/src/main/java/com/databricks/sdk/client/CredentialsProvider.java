package com.databricks.sdk.client;

/**
 * <p>CredentialsProvider interface.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface CredentialsProvider {
  /**
   * <p>authType.</p>
   *
   * @return a {@link java.lang.String} object
   */
  String authType();

  /**
   * <p>configure.</p>
   *
   * @param config a {@link com.databricks.sdk.client.DatabricksConfig} object
   * @return a {@link com.databricks.sdk.client.HeaderFactory} object
   */
  HeaderFactory configure(DatabricksConfig config);
}
