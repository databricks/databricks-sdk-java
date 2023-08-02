package com.databricks.sdk.dbfs;

import com.databricks.sdk.WorkspaceClient;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsAction;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RemoteUnityCatalogFileSystemComponent implements DatabricksFileSystemComponent {

  private final WorkspaceClient w;
  private final FileSystem.Statistics statistics;

  private final PathResolver pathResolver;
  private static final FsPermission PERMISSION =
      new FsPermission(FsAction.READ_WRITE, FsAction.READ_WRITE, FsAction.READ_WRITE);

  public RemoteUnityCatalogFileSystemComponent(WorkspaceClient w, FileSystem.Statistics statistics, PathResolver pathResolver) {
    this.w = w;
    this.statistics = statistics;
    this.pathResolver = pathResolver;
  }

  @Override
  public String getComponentName() {
    return "UnityCatalog";
  }

  @Override
  public FSDataInputStream open(Path path, int i) throws IOException {
    return null;
  }

  @Override
  public FSDataOutputStream create(Path path, FsPermission fsPermission, boolean b, int i, short i1, long l, Progressable progressable) throws IOException {
    return null;
  }

  @Override
  public FSDataOutputStream append(Path path, int i, Progressable progressable) throws IOException {
    return null;
  }

  @Override
  public boolean rename(Path path, Path path1) throws IOException {
    return false;
  }

  @Override
  public boolean delete(Path path, boolean b) throws IOException {
    return false;
  }

  @Override
  public FileStatus[] listStatus(Path path) throws FileNotFoundException, IOException {
    return new FileStatus[0];
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
