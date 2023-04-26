package com.databricks.sdk.client.utils;

/**
 * <p>Timer interface.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface Timer {
  /**
   * <p>wait.</p>
   *
   * @param milliseconds a int
   * @throws java.lang.InterruptedException if any.
   */
  void wait(int milliseconds) throws InterruptedException;

  /**
   * <p>getCurrentTime.</p>
   *
   * @return a long
   */
  long getCurrentTime();
}
