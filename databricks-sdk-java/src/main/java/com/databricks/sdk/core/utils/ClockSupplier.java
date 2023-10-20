package com.databricks.sdk.core.utils;

import java.time.Clock;

public interface ClockSupplier {
  Clock getClock();
}
