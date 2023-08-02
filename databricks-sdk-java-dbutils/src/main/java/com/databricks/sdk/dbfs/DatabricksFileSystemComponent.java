package com.databricks.sdk.dbfs;

import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DatabricksFileSystemComponent {
  String getComponentName();
  FSDataInputStream open(Path path, int bufferSize) throws IOException;

  FSDataOutputStream create(
      Path path,
      FsPermission fsPermission,
      boolean overwrite,
      int bufferSize,
      short replication,
      long blockSize,
      Progressable progressable)
      throws IOException;

  FSDataOutputStream append(Path path, int bufferSize, Progressable progressable)
      throws IOException;

  boolean rename(Path source, Path target) throws IOException;

  boolean delete(Path path, boolean recursive) throws IOException;

  FileStatus[] listStatus(Path path) throws FileNotFoundException, IOException;

  boolean mkdirs(Path path, FsPermission fsPermission) throws IOException;

  FileStatus getFileStatus(Path path) throws IOException;
}
