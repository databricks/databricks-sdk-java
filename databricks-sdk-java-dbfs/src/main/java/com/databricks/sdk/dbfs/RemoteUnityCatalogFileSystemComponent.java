package com.databricks.sdk.dbfs;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.service.files.FileInfo;
import com.databricks.sdk.service.files.UploadFileRequest;

import java.io.*;
import java.nio.ByteBuffer;

import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsAction;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;

public class RemoteUnityCatalogFileSystemComponent implements DatabricksFileSystemComponent {

  private final WorkspaceClient w;
  private final FileSystem.Statistics statistics;

  private final PathResolver pathResolver;
  private static final FsPermission PERMISSION =
      new FsPermission(FsAction.READ_WRITE, FsAction.READ_WRITE, FsAction.READ_WRITE);

  public RemoteUnityCatalogFileSystemComponent(
      WorkspaceClient w, FileSystem.Statistics statistics, PathResolver pathResolver) {
    this.w = w;
    this.statistics = statistics;
    this.pathResolver = pathResolver;
  }

  @Override
  public String getComponentName() {
    return "UnityCatalog";
  }

  @Override
  public FSDataInputStream open(Path path, int bufferSize) throws IOException {
    InputStream in = w.files().downloadFile(pathResolver.getAbsolutePath(path).toString());
    WrappedInputStream win = new WrappedInputStream(in);
    return new FSDataInputStream(win);
  }

  @Override
  public FSDataOutputStream create(
      Path path,
      FsPermission fsPermission,
      boolean overwrite,
      int bufferSize,
      short replication,
      long blockSize,
      Progressable progressable) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    return new FSDataOutputStream(baos, statistics) {
      @Override
      public void close() throws IOException {
        super.close();
        byte[] data = baos.toByteArray();
        InputStream in = new ByteArrayInputStream(data);
        String pathStr = pathResolver.getAbsolutePath(path).toString();
        w.files().uploadFile(new UploadFileRequest().setFilePath(pathStr).setBody(in));
      }
    };
  }

  @Override
  public FSDataOutputStream append(Path path, int bufferSize, Progressable progressable) {
    throw new DatabricksException("DBFS does not support append");
  }

  @Override
  public boolean rename(Path src, Path target) throws IOException {
    String srcStr = pathResolver.getAbsolutePath(src).toString();
    InputStream file = w.files().downloadFile(srcStr);
    String targetStr = pathResolver.getAbsolutePath(target).toString();
    w.files().uploadFile(new UploadFileRequest().setFilePath(targetStr).setBody(file));
    // What to return here?
    return true;
  }

  @Override
  public boolean delete(Path path, boolean b) throws IOException {
    w.files().deleteFile(pathResolver.getAbsolutePath(path).toString());
    // What to return here?
    return true;
  }

  @Override
  public FileStatus[] listStatus(Path path) {
    throw new DatabricksException(getComponentName() + " does not currently support listing files");
  }

  @Override
  public boolean mkdirs(Path path, FsPermission fsPermission) {
    throw new DatabricksException(getComponentName() + " does not currently support listing files");
  }

  @Override
  public FileStatus getFileStatus(Path path) throws IOException {
    FileInfo fileInfo = w.files().getStatus(pathResolver.getAbsolutePath(path).toString());
    return pathResolver.fromFileInfo(fileInfo);
  }
}
