package com.databricks.sdk.dbfs;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import java.io.IOException;
import org.apache.hadoop.fs.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("ucws")
@ExtendWith(EnvTest.class)
public class RemoteDatabricksFileSystemTest {
  @Test
  public void testListDbfsRoot(WorkspaceClient w) throws IOException {
    //    Configuration c = new Configuration();
    //    c.set("fs.dbfs.impl", "com.databricks.sdk.dbfs.RemoteDatabricksFileSystem");
    //    FileSystem fs = FileSystem.get(URI.create("dbfs:/"), c);
    try (FileSystem fs = new RemoteDatabricksFileSystem(w)) {
      RemoteIterator<LocatedFileStatus> files =
          fs.listFiles(new org.apache.hadoop.fs.Path("/FileStore"), true);
      while (files.hasNext()) {
        LocatedFileStatus file = files.next();
        System.out.println(file.getPath());
      }
    }
  }

  private void testFile(WorkspaceClient w, String basePath) throws IOException {
    try (FileSystem fs = new RemoteDatabricksFileSystem(w)) {
      Path path = new Path(basePath + "test.txt");
      try (FSDataOutputStream out = fs.create(path)) {
        out.writeBytes("Hello World!");
      }

      FileStatus status = fs.getFileStatus(path);
      Assertions.assertEquals(12, status.getLen());

      try (FSDataInputStream in = fs.open(path)) {
        byte[] buffer = new byte[1024];
        int bytesRead = in.read(buffer);
        String retrieved = new String(buffer, 0, bytesRead);
        Assertions.assertEquals("Hello World!", retrieved);
      }

      Assertions.assertTrue(fs.delete(path, false));
    }
  }

  @Test
  public void testFileInUnityCatalog(WorkspaceClient w) throws IOException {
    String basePath = "/Volumes/main/miles/miles-volume/";
    testFile(w, basePath);
  }

  @Test
  public void testFileInDbfsRoot(WorkspaceClient w) throws IOException {
    String basePath = "/";
    testFile(w, basePath);
  }
}
