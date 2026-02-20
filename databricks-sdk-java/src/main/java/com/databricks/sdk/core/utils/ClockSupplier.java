package com.databricks.sdk.core.utils;

import com.databricks.sdk.support.InternalApi;
import java.time.Clock;

@InternalApi
public interface ClockSupplier {
  Clock getClock();
}
