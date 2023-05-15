package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.service.files.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Base64;
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
      assertEquals(filePath, testPath);
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }
}
