package com.databricks.sdk.mixin;

import com.databricks.sdk.service.files.AddBlock;
import com.databricks.sdk.service.files.Close;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Base64;

public class DbfsOutputStream extends OutputStream {
  private final DbfsExt dbfs;
  private final long handle;
  private final byte[] buffer;
  private int bufferOffset = 0;

  public DbfsOutputStream(DbfsExt dbfs, long handle) {
    this(dbfs, handle, 1024 * 1024);
  }

  public DbfsOutputStream(DbfsExt dbfs, long handle, int bufferSize) {
    this.dbfs = dbfs;
    this.handle = handle;
    this.buffer = new byte[bufferSize];
  }

  @Override
  public void write(int b) {
    buffer[bufferOffset++] = (byte) b;

    if (bufferOffset >= buffer.length) {
      // Buffer is full, flush it.
      flush();
    }
  }

  @Override
  public void flush() {
    if (bufferOffset > 0) {
      // Flush the remaining bytes in the buffer.
      byte[] remainingBytes = Arrays.copyOfRange(buffer, 0, bufferOffset);
      dbfs.addBlock(
          new AddBlock()
              .setHandle(handle)
              .setData(Base64.getEncoder().encodeToString(remainingBytes)));
      bufferOffset = 0;
    }
  }

  @Override
  public void close() {
    flush();
    dbfs.close(new Close().setHandle(handle));
  }
}
