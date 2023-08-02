package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import com.databricks.sdk.service.files.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Base64;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DbfsExtTest {
  @Mock DbfsService mockDbfsService;

  @Test
  void write() throws IOException {
    String filePath = "/a/b/c";
    String data = Base64.getEncoder().encodeToString("test data".getBytes(StandardCharsets.UTF_8));

    DbfsExt mockedDbfsExt = new DbfsExt(mockDbfsService);

    // Mock external create, addBlock and close requests
    Mockito.doReturn(new CreateResponse().setHandle(0L))
        .when(mockDbfsService)
        .create(any(Create.class));
    Mockito.doNothing().when(mockDbfsService).addBlock(any(AddBlock.class));
    Mockito.doNothing().when(mockDbfsService).close(any(Close.class));

    String testPath =
        mockedDbfsExt
            .write(Paths.get(filePath), data.getBytes(StandardCharsets.UTF_8), true)
            .toString();

    // Returned path should match the original
    assertEquals(filePath, testPath);
  }
}
