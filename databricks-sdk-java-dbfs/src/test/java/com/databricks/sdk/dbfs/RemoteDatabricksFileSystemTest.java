package com.databricks.sdk.dbfs;

import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import java.io.IOException;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.RemoteIterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class RemoteDatabricksFileSystemTest {
  @Test
  public void testListDbfsRoot() throws IOException {
    Configuration c = new Configuration();
    c.set("fs.dbfs.impl", "com.databricks.sdk.dbfs.RemoteDatabricksFileSystem");
    FileSystem fs = FileSystem.get(URI.create("dbfs:/"), c);
    RemoteIterator<LocatedFileStatus> files =
        fs.listFiles(new org.apache.hadoop.fs.Path("/"), false);
    while (files.hasNext()) {
      LocatedFileStatus file = files.next();
      System.out.println(file.getPath());
    }
  }
}
