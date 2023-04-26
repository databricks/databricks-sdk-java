package com.databricks.sdk.client.utils;

/**
 * <p>RealTimer class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RealTimer implements Timer {
  /** {@inheritDoc} */
  @Override
  public void wait(int milliseconds) throws InterruptedException {
    Thread.sleep(milliseconds);
  }

  /** {@inheritDoc} */
  @Override
  public long getCurrentTime() {
    return System.currentTimeMillis();
  }
}
