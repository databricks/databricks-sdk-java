package com.databricks.sdk.dbfs;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.service.files.FileInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import org.apache.hadoop.classification.VisibleForTesting;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsAction;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;

public class RemoteDatabricksFileSystem extends FileSystem implements PathResolver {
  @FunctionalInterface
  interface PathMatcher {
    boolean matches(Path path) throws IOException;
  }

  static class DatabricksFileSystemComponentMapping {
    private final DatabricksFileSystemComponent component;
    private final PathMatcher matcher;

    DatabricksFileSystemComponentMapping(
        DatabricksFileSystemComponent component, PathMatcher matcher) {
      this.component = component;
      this.matcher = matcher;
    }

    PathMatcher getMatcher() {
      return matcher;
    }

    DatabricksFileSystemComponent getComponent() {
      return component;
    }
  }

  static class DatabricksFileSystemComponentResolver {
    private final DatabricksFileSystemComponent fallbackComponent;
    private final DatabricksFileSystemComponentMapping[] components;

    DatabricksFileSystemComponentResolver(
        DatabricksFileSystemComponent fallbackComponent,
        DatabricksFileSystemComponentMapping... components) {
      this.fallbackComponent = fallbackComponent;
      this.components = components;
    }

    DatabricksFileSystemComponent resolve(Path path) throws IOException {
      for (DatabricksFileSystemComponentMapping component : components) {
        if (component.getMatcher().matches(path)) {
          return component.getComponent();
        }
      }
      return fallbackComponent;
    }
  }

  private WorkspaceClient w;
  private volatile Path workingDirectory;

  public static final String SCHEME = "dbfs";
  private static final FsPermission PERMISSION =
      new FsPermission(FsAction.READ_WRITE, FsAction.READ_WRITE, FsAction.READ_WRITE);

  private DatabricksFileSystemComponentResolver resolver;

  @VisibleForTesting
  public RemoteDatabricksFileSystem(WorkspaceClient w) throws IOException {
    // For testing only
    this.w = w;
    Configuration c = new Configuration();
    this.setConf(c);
    initialize(URI.create(SCHEME + ":/"), c);
  }

  @Override
  public void initialize(URI name, Configuration conf) throws IOException {
    // TODO: Add support for passing in custom configuration (e.g. "databricks.dbfs.KEY")
    w = w == null ? new WorkspaceClient() : w;
    Statistics statistics = new Statistics(SCHEME);
    workingDirectory = getHomeDirectory();
    resolver =
        new DatabricksFileSystemComponentResolver(
            new RemoteDbfsRootFileSystemComponent(w, statistics, this),
            new DatabricksFileSystemComponentMapping(
                new RemoteUnityCatalogFileSystemComponent(w, statistics, this),
                path -> path.toString().startsWith("/Volumes")));
    super.initialize(name, conf);
  }

  private DatabricksFileSystemComponent getFileSystemComponent(Path path) throws IOException {
    return resolver.resolve(getAbsolutePath(path));
  }

  @Override
  public String getScheme() {
    return SCHEME;
  }

  @Override
  public URI getUri() {
    return URI.create(getScheme() + ":/");
  }

  @Override
  public FSDataInputStream open(Path path, int bufferSize) throws IOException {
    return getFileSystemComponent(path).open(path, bufferSize);
  }

  @Override
  public FSDataOutputStream create(
      Path path,
      FsPermission fsPermission,
      boolean overwrite,
      int bufferSize,
      short replication,
      long blockSize,
      Progressable progressable)
      throws IOException {
    // DBFS has no permissions, so we ignore fsPermission. The only check is that the execute and
    // sticky bits are not set.
    if (fsPermission.getStickyBit()) {
      throw new DatabricksException("DBFS does not support sticky bits");
    }
    if (fsPermission.getUserAction().implies(FsAction.EXECUTE)
        || fsPermission.getGroupAction().implies(FsAction.EXECUTE)
        || fsPermission.getOtherAction().implies(FsAction.EXECUTE)) {
      throw new DatabricksException("DBFS does not support execute bits");
    }
    return getFileSystemComponent(path)
        .create(path, fsPermission, overwrite, bufferSize, replication, blockSize, progressable);
  }

  @Override
  public FSDataOutputStream append(Path path, int bufferSize, Progressable progressable)
      throws IOException {
    return getFileSystemComponent(path).append(path, bufferSize, progressable);
  }

  @Override
  public boolean rename(Path source, Path target) throws IOException {
    DatabricksFileSystemComponent component = getFileSystemComponent(source);
    String sourceComponentName = component.getComponentName();
    String targetComponentName = getFileSystemComponent(target).getComponentName();
    if (!sourceComponentName.equals(targetComponentName)) {
      throw new IOException(
          "Cannot rename file from " + sourceComponentName + " to " + targetComponentName);
    }
    return component.rename(source, target);
  }

  @Override
  public boolean delete(Path path, boolean recursive) throws IOException {
    return getFileSystemComponent(path).delete(path, recursive);
  }

  @Override
  public FileStatus[] listStatus(Path path) throws FileNotFoundException, IOException {
    return getFileSystemComponent(path).listStatus(path);
  }

  @Override
  public void setWorkingDirectory(Path path) {
    workingDirectory = path;
  }

  @Override
  public Path getWorkingDirectory() {
    return workingDirectory;
  }

  @Override
  public boolean mkdirs(Path path, FsPermission fsPermission) throws IOException {
    w.dbfs().mkdirs(path.toString());
    // What to return here?
    return true;
  }

  @Override
  public FileStatus getFileStatus(Path path) throws IOException {
    return getFileSystemComponent(path).getFileStatus(path);
  }

  public Path getAbsolutePath(Path path) {
    // Note: we explicitly strip the scheme from the prefix.
    if (path.isAbsolute()) {
      return new Path(path.toUri().getPath());
    } else {
      return new Path(getWorkingDirectory(), path);
    }
  }

  public Path getAbsolutePath(FileInfo fileInfo) {
    return new Path(fileInfo.getPath());
  }

  public FileStatus fromFileInfo(FileInfo file) {
    Path filePath = getAbsolutePath(file);
    return new FileStatus(
        file.getFileSize(),
        file.getIsDir(),
        1,
        0,
        file.getModificationTime(),
        0,
        PERMISSION,
        "",
        "",
        filePath);
  }
}
