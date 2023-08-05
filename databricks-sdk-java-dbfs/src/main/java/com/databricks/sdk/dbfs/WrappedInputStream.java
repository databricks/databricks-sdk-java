package com.databricks.sdk.dbfs;

import org.apache.hadoop.fs.FSInputStream;

import java.io.IOException;
import java.io.InputStream;

public class WrappedInputStream extends FSInputStream {
  private final InputStream in;
  private int position = 0;
  public WrappedInputStream(InputStream in) {
    this.in = in;
  }

  @Override
  public int read() throws IOException {
    int res = in.read();
    if (res != -1) {
      position++;
    }
    return res;
  }

  @Override
  public void seek(long pos) throws IOException {
    if (pos < position) {
      throw new IOException("Cannot seek backwards");
    }
    long toSkip = pos - position;
    while (toSkip > 0) {
      long skipped = in.skip(toSkip);
      if (skipped == 0) {
        throw new IOException("Cannot seek forward");
      }
      toSkip -= skipped;
    }
    position = (int) pos;
  }

  @Override
  public long getPos() throws IOException {
    return position;
  }

  @Override
  public boolean seekToNewSource(long targetPos) throws IOException {
    return false;
  }
}
