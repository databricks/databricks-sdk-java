package com.databricks.sdk.dbutils;

import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class RemoteDatabricksFileSystem extends FileSystem {
  @Override
  public URI getUri() {
    return null;
  }

  @Override
  public FSDataInputStream open(Path path, int bufferSize) throws IOException {
    return null;
  }

  @Override
  public FSDataOutputStream create(Path path, FsPermission fsPermission, boolean overwrite, int bufferSize, short replication, long blockSize, Progressable progressable) throws IOException {
    return null;
  }

  @Override
  public FSDataOutputStream append(Path path, int bufferSize, Progressable progressable) throws IOException {
    return null;
  }

  @Override
  public boolean rename(Path source, Path target) throws IOException {
    return false;
  }

  @Override
  public boolean delete(Path path, boolean recursive) throws IOException {
    return false;
  }

  @Override
  public FileStatus[] listStatus(Path path) throws FileNotFoundException, IOException {
    return new FileStatus[0];
  }

  @Override
  public void setWorkingDirectory(Path path) {

  }

  @Override
  public Path getWorkingDirectory() {
    return null;
  }

  @Override
  public boolean mkdirs(Path path, FsPermission fsPermission) throws IOException {
    return false;
  }

  @Override
  public FileStatus getFileStatus(Path path) throws IOException {
    return null;
  }
}
