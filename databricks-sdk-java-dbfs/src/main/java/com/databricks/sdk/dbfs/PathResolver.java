package com.databricks.sdk.dbfs;

import com.databricks.sdk.service.files.FileInfo;
import java.io.IOException;
import org.apache.hadoop.fs.Path;

public interface PathResolver {
  Path getAbsolutePath(Path path) throws IOException;

  Path getAbsolutePath(FileInfo fileInfo);
}
