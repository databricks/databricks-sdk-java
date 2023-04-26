package com.databricks.sdk.client;

import java.util.Map;

/**
 * <p>HeaderFactory interface.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface HeaderFactory {
  /** @return a map of HTTP headers with refreshed tokens */
  /**
   * <p>headers.</p>
   *
   * @return a {@link java.util.Map} object
   */
  Map<String, String> headers();
}
