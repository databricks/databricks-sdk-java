package com.databricks.sdk.core.utils;

import java.io.IOException;
import java.io.InputStream;

public class CustomCloseInputStream extends InputStream {
  private final InputStream inputStream;
  private final Runnable cleanup;

  public CustomCloseInputStream(InputStream inputStream, Runnable cleanup) {
    this.inputStream = inputStream;
    this.cleanup = cleanup;
  }

  @Override
  public int read() throws IOException {
    return inputStream.read();
  }

  @Override
  public void close() throws IOException {
    inputStream.close();
    cleanup.run();
  }
}
