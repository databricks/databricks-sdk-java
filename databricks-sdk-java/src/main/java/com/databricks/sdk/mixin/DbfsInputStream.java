package com.databricks.sdk.mixin;

import com.databricks.sdk.service.files.ReadDbfsRequest;
import com.databricks.sdk.service.files.ReadResponse;
import java.io.InputStream;
import java.util.Base64;

public class DbfsInputStream extends InputStream {
  private final DbfsExt dbfs;
  private final String path;
  private final long bufferSize;
  private long offset = 0;
  private byte[] buffer;
  private int bufferOffset = 0;

  public DbfsInputStream(DbfsExt dbfs, String path, long bufferSize) {
    this.dbfs = dbfs;
    this.path = path;
    this.bufferSize = bufferSize;
  }

  @Override
  public int read() {
    if (buffer == null || bufferOffset >= buffer.length) {
      // Buffer is exhausted, refill it.
      ReadDbfsRequest request =
          new ReadDbfsRequest().setPath(path).setOffset(offset).setLength(bufferSize);
      ReadResponse response = dbfs.read(request);
      buffer = Base64.getDecoder().decode(response.getData());
      bufferOffset = 0;
      offset += buffer.length;
    }

    if (bufferOffset >= buffer.length) {
      // Buffer is still exhausted, we're at EOF.
      return -1;
    }

    byte b = buffer[bufferOffset++];
    if (b == -1) {
      return 255;
    }
    return b;
  }
}
