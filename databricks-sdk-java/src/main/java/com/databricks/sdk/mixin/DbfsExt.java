package com.databricks.sdk.mixin;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.service.files.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.*;

public class DbfsExt extends DbfsAPI {
  public DbfsExt(ApiClient apiClient) {
    super(apiClient);
  }

  public DbfsExt(DbfsService mock) {
    super(mock);
  }

  /**
   * Construct a new {@code java.io.BufferedReader} for the given file.
   *
   * <p>The returned implementation of {@code InputStream} internally buffers calls to the DBFS API
   * to reduce the number of requests made. The buffer has a maximum size of 1 MB, corresponding to
   * the maximum number of bytes that can be read in a single call to the DBFS API. The buffer is
   * refilled when {@code read()} is called after the buffer has been exhausted.
   */
  public InputStream getInputStream(String path) {
    DbfsExt outer = this;
    return new InputStream() {
      private long offset = 0;
      private byte[] buffer = new byte[0];
      private int bufferOffset = 0;

      @Override
      public int read() {
        if (bufferOffset >= buffer.length) {
          // Buffer is exhausted, refill it.
          ReadDbfsRequest request =
              new ReadDbfsRequest().setPath(path).setOffset(offset).setLength(1024 * 1024L);
          ReadResponse response = outer.read(request);
          buffer = Base64.getDecoder().decode(response.getData());
          bufferOffset = 0;
          offset += buffer.length;
        }

        if (bufferOffset >= buffer.length) {
          // Buffer is still exhausted, we're at EOF.
          return -1;
        }

        return buffer[bufferOffset++];
      }
    };
  }

  public byte[] readAllBytes(Path path) throws IOException {
    try (InputStream in = getInputStream(path.toString())) {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      byte[] buffer = new byte[1024 * 1024];
      int result;
      do {
        result = in.read(buffer);
        if (result > 0) {
          out.write(buffer, 0, result);
        }
      } while (result >= 0);
      return out.toByteArray();
    }
  }

  public List<String> readAllLines(Path path, Charset cs) throws IOException {
    // Read all bytes using readAllBytes API, then convert to a list of string using the given
    // charset.
    byte[] bytes = readAllBytes(path);
    CharBuffer charBuffer = cs.decode(ByteBuffer.wrap(bytes));
    // Split the CharBuffer into lines.
    List<String> lines = new ArrayList<>();
    int start = 0;
    for (int i = 0; i < charBuffer.length(); i++) {
      if (charBuffer.charAt(i) == '\n') {
        lines.add(charBuffer.subSequence(start, i).toString());
        start = i + 1;
      }
    }
    return lines;
  }

  /**
   * Returns an OutputStream that writes to the given file in DBFS.
   *
   * <p>This method first creates the given file in DBFS if it does not exist. If the file exists,
   * this method overwrites the existing file. Then, this method constructs an OutputStream that
   * writes to the file in DBFS. The returned OutputStream buffers writes to the file to reduce the
   * number of requests made to the DBFS API. The buffer has a maximum size of 1 MB, corresponding
   * to the maximum number of bytes that can be written in a single call to the DBFS AddBlock API,
   * and is flushed when full.
   */
  public OutputStream getOutputStream(String path) {
    DbfsExt outer = this;
    CreateResponse createResponse = outer.create(new Create().setPath(path).setOverwrite(true));
    long handle = createResponse.getHandle();
    return new OutputStream() {
      private final byte[] buffer = new byte[1024 * 1024];
      private int bufferOffset = 0;

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
          outer.addBlock(
              new AddBlock()
                  .setHandle(handle)
                  .setData(Base64.getEncoder().encodeToString(remainingBytes)));
          bufferOffset = 0;
        }
      }

      @Override
      public void close() {
        flush();
        outer.close(new Close().setHandle(handle));
      }
    };
  }

  public Path write(Path path, byte[] bytes) throws IOException {
    try (OutputStream out = getOutputStream(path.toString())) {
      out.write(bytes);
    }
    return path;
  }

  /** Recursively lists files in DBFS, starting from the provided directory. */
  public Iterable<FileInfo> recursiveList(String path) {
    List<FileInfo> allFiles = new ArrayList<>();
    Queue<String> dirsToVisit = new ArrayDeque<>();
    dirsToVisit.add(path);

    while (!dirsToVisit.isEmpty()) {
      String dir = dirsToVisit.remove();
      Iterable<FileInfo> files = list(dir);
      for (FileInfo file : files) {
        if (file.getIsDir()) {
          dirsToVisit.add(file.getPath());
        }
        allFiles.add(file);
      }
    }

    return allFiles;
  }
}
