package com.databricks.sdk.client.http;

import java.io.IOException;

/**
 * <p>HttpClient interface.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface HttpClient {
  /**
   * <p>execute.</p>
   *
   * @param in a {@link com.databricks.sdk.client.http.Request} object
   * @return a {@link com.databricks.sdk.client.http.Response} object
   * @throws java.io.IOException if any.
   */
  Response execute(Request in) throws IOException;
}
