package com.databricks.sdk.dbfs;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.service.files.Delete;
import com.databricks.sdk.service.files.FileInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsAction;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;

/** An implementation of {@code FileSystem} for the Databricks File System. */
public class RemoteDbfsRootFileSystemComponent implements DatabricksFileSystemComponent {
  private final WorkspaceClient w;
  private final FileSystem.Statistics statistics;

  private final PathResolver pathResolver;
  private static final FsPermission PERMISSION =
      new FsPermission(FsAction.READ_WRITE, FsAction.READ_WRITE, FsAction.READ_WRITE);

  public RemoteDbfsRootFileSystemComponent(
      WorkspaceClient w, FileSystem.Statistics statistics, PathResolver pathResolver) {
    this.w = w;
    this.statistics = statistics;
    this.pathResolver = pathResolver;
  }

  @Override
  public String getComponentName() {
    return "DbfsRoot";
  }

  public FSDataInputStream open(Path path, int bufferSize) throws IOException {
    InputStream in = w.dbfs().open(pathResolver.getAbsolutePath(path).toString(), bufferSize);
    return new FSDataInputStream(in);
  }

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
    // Ignore the replication and block size, as DBFS does not support them.
    // TODO: Add support for progressable
    OutputStream out =
        w.dbfs()
            .getOutputStream(pathResolver.getAbsolutePath(path).toString(), overwrite, bufferSize);
    return new FSDataOutputStream(out, statistics);
  }

  public FSDataOutputStream append(Path path, int bufferSize, Progressable progressable)
      throws IOException {
    throw new DatabricksException("DBFS does not support append");
  }

  public boolean rename(Path source, Path target) throws IOException {
    w.dbfs()
        .move(
            pathResolver.getAbsolutePath(source).toString(),
            pathResolver.getAbsolutePath(target).toString());
    // What to return here?
    return true;
  }

  public boolean delete(Path path, boolean recursive) throws IOException {
    w.dbfs()
        .delete(
            new Delete()
                .setPath(pathResolver.getAbsolutePath(path).toString())
                .setRecursive(recursive));
    // What to return here?
    return true;
  }

  public FileStatus[] listStatus(Path path) throws FileNotFoundException, IOException {
    Iterable<FileInfo> files = w.dbfs().list(pathResolver.getAbsolutePath(path).toString());
    List<FileStatus> res = new ArrayList<>();
    for (FileInfo file : files) {
      Path filePath = pathResolver.getAbsolutePath(file);
      res.add(
          new FileStatus(
              file.getFileSize(),
              file.getIsDir(),
              1,
              0,
              file.getModificationTime(),
              0,
              PERMISSION,
              "",
              "",
              filePath));
    }
    return res.toArray(new FileStatus[0]);
  }

  public boolean mkdirs(Path path, FsPermission fsPermission) throws IOException {
    w.dbfs().mkdirs(path.toString());
    // What to return here?
    return true;
  }

  public FileStatus getFileStatus(Path path) throws IOException {
    // Try listing. If there are no results, the file does not exist.
    Iterable<FileInfo> files = w.dbfs().list(pathResolver.getAbsolutePath(path).toString());
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
    if (pathResolver.getAbsolutePath(first).equals(path)) {
      // If the path matches exactly, it is a file.
      return new FileStatus(
          first.getFileSize(), false, 1, 0, first.getModificationTime(), 0, null, "", "", path);
    } else {
      // Otherwise, it is a directory.
      return new FileStatus(0, true, 1, 0, 0, 0, PERMISSION, "", "", path);
    }
  }
}
