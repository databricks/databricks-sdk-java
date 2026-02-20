package com.databricks.sdk.core.utils;

import com.databricks.sdk.support.InternalApi;
import java.time.Clock;

@InternalApi
public class UtcClockSupplier implements ClockSupplier {
  @Override
  public Clock getClock() {
    return Clock.systemUTC();
  }
}
