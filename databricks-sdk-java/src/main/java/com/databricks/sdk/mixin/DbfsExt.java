package com.databricks.sdk.mixin;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.service.files.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.*;

/**
 * Utility methods for the DBFS API.
 *
 * <p>This class provides utility methods for the DBFS API that are not part of the official API
 * surface. These methods are subject to change without notice.
 */
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
   *
   * @param path the path to the file to read
   * @return an InputStream that reads from the given file in DBFS
   */
  public InputStream open(String path) {
    return open(path, 1024 * 1024L);
  }

  public InputStream open(String path, long bufferSize) {
    return new DbfsInputStream(this, path, bufferSize);
  }

  /**
   * Returns the contents of the given file as a byte array.
   *
   * <p>This method is analogous to {@code Files.readAllBytes(path)} in Java 8, but it reads the
   * file from DBFS instead of the local filesystem.
   *
   * @param path the path to the file to read
   * @return the contents of the file as a byte array
   * @throws IOException if an I/O error occurs
   */
  public byte[] readAllBytes(Path path) throws IOException {
    try (InputStream in = open(path.toString())) {
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

  /**
   * Returns the contents of the given file as a list of strings, where each string corresponds to a
   * line in the file.
   *
   * <p>This method is analogous to {@code Files.readAllLines(path, cs)} in Java 8, but it reads the
   * file from DBFS instead of the local filesystem.
   *
   * @param path the path to the file to read
   * @param cs the charset to use when decoding the file
   * @return the contents of the file as a list of strings
   * @throws IOException if an I/O error occurs
   */
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
   *
   * @param path the path to the file to read
   * @return an OutputStream that writes to the given file in DBFS
   */
  public OutputStream getOutputStream(String path, boolean overwrite, int bufferSize) {
    CreateResponse createResponse = this.create(new Create().setPath(path).setOverwrite(overwrite));
    long handle = createResponse.getHandle();
    return new DbfsOutputStream(this, handle, bufferSize);
  }

  /**
   * Writes the given bytes to the given file in DBFS.
   *
   * <p>This methods is analogous to {@code Files.write(path, bytes)} in Java 8, but it writes the
   * file to DBFS instead of the local filesystem.
   *
   * @param path the path to the file to write
   * @param bytes the bytes to write
   * @return the path to the file in DBFS
   * @throws IOException if an I/O error occurs
   */
  public Path write(Path path, byte[] bytes, boolean overwrite) throws IOException {
    try (OutputStream out = getOutputStream(path.toString(), overwrite, 1024 * 1024)) {
      out.write(bytes);
    }
    return path;
  }

  /** An iterator which iterates over the files in a directory lazily. */
  private class LazyDirectoryIterator implements Iterator<FileInfo> {
    private final Queue<String> dirsToVisit;
    private Iterator<FileInfo> currentFiles;

    public LazyDirectoryIterator(String path) {
      this.dirsToVisit = new ArrayDeque<>();
      this.dirsToVisit.add(path);
      this.currentFiles = Collections.emptyIterator();
    }

    @Override
    public boolean hasNext() {
      while (!currentFiles.hasNext() && !dirsToVisit.isEmpty()) {
        String nextDir = dirsToVisit.remove();
        currentFiles = list(nextDir).iterator();
      }

      return currentFiles.hasNext();
    }

    @Override
    public FileInfo next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }

      FileInfo nextFile = currentFiles.next();
      if (nextFile.getIsDir()) {
        dirsToVisit.add(nextFile.getPath());
      }
      return nextFile;
    }
  }

  /**
   * Recursively lists files in DBFS, starting from the provided directory.
   *
   * @param path the path to the directory to list
   * @return an iterable of FileInfo objects, one for each file and directory listing in the
   *     directory, recursively
   */
  public Iterable<FileInfo> recursiveList(String path) {
    return () -> new LazyDirectoryIterator(path);
  }
}
