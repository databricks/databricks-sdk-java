package com.databricks.sdk.dbfs;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.service.files.FileInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
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

  @Override
  public void initialize(URI name, Configuration conf) throws IOException {
    // TODO: Add support for passing in custom configuration (e.g. "databricks.dbfs.KEY")
    w = new WorkspaceClient();
    Statistics statistics = new Statistics(SCHEME);
    workingDirectory = getHomeDirectory();
    resolver =
        new DatabricksFileSystemComponentResolver(
            new RemoteDbfsRootFileSystemComponent(w, statistics, this),
            new DatabricksFileSystemComponentMapping(
                new RemoteUnityCatalogFileSystemComponent(w, statistics, this),
                path -> path.toString().startsWith("dbfs:/Volumes")));
    super.initialize(name, conf);
  }

  private DatabricksFileSystemComponent getFileSystemComponent(Path path) throws IOException {
    return resolver.resolve(path);
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
    // Try listing. If there are no results, the file does not exist.
    Iterable<FileInfo> files = w.dbfs().list(getAbsolutePath(path).toString());
    FileInfo first = null;
    for (FileInfo file : files) {
      if (first == null) {
        first = file;
      } else {
        // If there is more than one file, it is a directory.
        return new FileStatus(0, true, 1, 0, 0, 0, PERMISSION, "", "", path);
      }
    }
    if (first == null) {
      throw new FileNotFoundException("File not found: " + path);
    }
    if (getAbsolutePath(first).equals(path)) {
      // If the path matches exactly, it is a file.
      return new FileStatus(
          first.getFileSize(), false, 1, 0, first.getModificationTime(), 0, null, "", "", path);
    } else {
      // Otherwise, it is a directory.
      return new FileStatus(0, true, 1, 0, 0, 0, PERMISSION, "", "", path);
    }
  }

  public Path getAbsolutePath(Path path) {
    if (path.isAbsolute()) {
      return path;
    } else {
      return new Path(getWorkingDirectory(), path);
    }
  }

  public Path getAbsolutePath(FileInfo fileInfo) {
    return new Path(getUri().getScheme(), getUri().getAuthority(), fileInfo.getPath());
  }
}
