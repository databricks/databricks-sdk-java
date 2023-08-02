package com.databricks.sdk.dbfs;

import com.databricks.sdk.service.files.FileInfo;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public interface PathResolver {
  Path getAbsolutePath(Path path) throws IOException;

  Path getAbsolutePath(FileInfo fileInfo);
}
