package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.service.files.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DbfsExtTest {
  @Test
  void write() {
    try {
      String filePath = "/a/b/c";
      String data =
          Base64.getEncoder().encodeToString("test data".getBytes(StandardCharsets.UTF_8));

      ApiClient apiClient = new ApiClient();
      DbfsExt mockedDbfsExt = Mockito.spy(new DbfsExt(apiClient));

      // Mock external create, addBlock and close requests
      Mockito.doReturn(new CreateResponse().setHandle(0L))
          .when(mockedDbfsExt)
          .create(any(Create.class));
      Mockito.doNothing().when(mockedDbfsExt).addBlock(any(AddBlock.class));
      Mockito.doNothing().when(mockedDbfsExt).close(any(Close.class));

      String testPath =
          mockedDbfsExt
              .write(Paths.get(filePath), data.getBytes(StandardCharsets.UTF_8))
              .toString();

      // Returned path should match the original
      assertEquals(testPath, filePath);
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  @Test
  void read() {
    String filePath = "/a/b/c";
    String data = Base64.getEncoder().encodeToString("test data".getBytes(StandardCharsets.UTF_8));

    ApiClient apiClient = new ApiClient();
    DbfsExt mockedDbfsExt = Mockito.spy(new DbfsExt(apiClient));

    // Mocking read() leads to an infinite loop, since we aren't going to use the API response,
    // mocking open()  instead of read() in DbfsExt
    Mockito.doReturn(
            new InputStream() {
              @Override
              public int read() {
                return -1;
              }
            })
        .when(mockedDbfsExt)
        .open(any(String.class));

    try {
      List<String> readData =
          mockedDbfsExt.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
      String a = readData.toString();
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }
}
