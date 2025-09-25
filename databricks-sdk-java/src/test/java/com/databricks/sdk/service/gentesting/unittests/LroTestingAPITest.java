package com.databricks.sdk.service.gentesting.unittests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.service.common.DatabricksServiceExceptionWithDetailsProto;
import com.databricks.sdk.service.common.ErrorCode;
import com.databricks.sdk.service.common.Operation;
import com.databricks.sdk.service.common.lro.LroOptions;
import com.databricks.sdk.service.lrotesting.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LroTestingAPITest {
  @Mock private LroTestingService mockImpl;
  private LroTestingAPI api;
  private ObjectMapper objectMapper;

  static class WaitTestCase {
    String name;
    List<Operation> operations;
    TestResource wantResult;
    boolean wantErr;

    WaitTestCase(String name, List<Operation> operations, TestResource wantResult, boolean wantErr) {
      this.name = name;
      this.operations = operations;
      this.wantResult = wantResult;
      this.wantErr = wantErr;
    }
  }

  static class CancelTestCase {
    String name;
    List<Operation> operations;
    boolean wantErr;

    CancelTestCase(String name, List<Operation> operations, boolean wantErr) {
      this.name = name;
      this.operations = operations;
      this.wantErr = wantErr;
    }
  }

  static class NameTestCase {
    String name;
    List<Operation> operations;
    String wantName;

    NameTestCase(String name, List<Operation> operations, String wantName) {
      this.name = name;
      this.operations = operations;
      this.wantName = wantName;
    }
  }

  static class MetadataTestCase {
    String name;
    List<Operation> operations;
    TestResourceOperationMetadata wantMetadata;
    boolean wantErr;

    MetadataTestCase(String name, List<Operation> operations, TestResourceOperationMetadata wantMetadata, boolean wantErr) {
      this.name = name;
      this.operations = operations;
      this.wantMetadata = wantMetadata;
      this.wantErr = wantErr;
    }
  }

  static class DoneTestCase {
    String name;
    List<Operation> operations;
    boolean wantDone;
    boolean wantErr;

    DoneTestCase(String name, List<Operation> operations, boolean wantDone, boolean wantErr) {
      this.name = name;
      this.operations = operations;
      this.wantDone = wantDone;
      this.wantErr = wantErr;
    }
  }

  @BeforeEach
  void setUp() {
    api = new LroTestingAPI(mockImpl);
    objectMapper = new ObjectMapper();
  }

  private ObjectNode createMetadata(String resourceId, int progressPercent) {
    ObjectNode metadata = objectMapper.createObjectNode();
    metadata.put("resource_id", resourceId);
    metadata.put("progress_percent", progressPercent);
    return metadata;
  }

  private ObjectNode createResponse(String id, String name) {
    ObjectNode response = objectMapper.createObjectNode();
    response.put("id", id);
    response.put("name", name);
    return response;
  }

  @Test
  void testLROCreateTestResourceWait() throws TimeoutException {
    List<WaitTestCase> tests = Arrays.asList(
        new WaitTestCase(
            "Success",
            Arrays.asList(
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 5))
                    .setName("operations/test-resource-create-12345"),
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 75))
                    .setName("operations/test-resource-create-12345"),
                new Operation()
                    .setDone(true)
                    .setMetadata(createMetadata("test-resource-123", 100))
                    .setName("operations/test-resource-create-12345")
                    .setResponse(createResponse("test-resource-123", "test-resource"))
            ),
            new TestResource().setId("test-resource-123").setName("test-resource"),
            false
        ),
        new WaitTestCase(
            "Error",
            Arrays.asList(
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 5))
                    .setName("operations/test-resource-create-12345"),
                new Operation()
                    .setDone(true)
                    .setName("operations/test-resource-create-12345")
                    .setError(
                        new DatabricksServiceExceptionWithDetailsProto()
                            .setErrorCode(ErrorCode.INTERNAL_ERROR)
                            .setMessage("Test error message")
                    )
            ),
            null,
            true
        )
    );

    for (WaitTestCase tt : tests) {
      // Reset mock
      reset(mockImpl);

      // Setup mocks
      when(mockImpl.createTestResource(any(CreateTestResourceRequest.class))).thenReturn(tt.operations.get(0));
      if (tt.operations.size() > 1) {
        Operation[] subsequentOps = tt.operations.subList(1, tt.operations.size()).toArray(new Operation[0]);
        when(mockImpl.getOperation(any(GetOperationRequest.class))).thenReturn(subsequentOps[0],
            Arrays.copyOfRange(subsequentOps, 1, subsequentOps.length));
      }

      // Execute test
      CreateTestResourceOperation operation =
          api.createTestResource(new CreateTestResourceRequest().setResource(new TestResource()));

      if (tt.wantErr) {
        assertThrows(DatabricksException.class, () ->
            operation.waitForCompletion(Optional.of(new LroOptions().setTimeout(Duration.ofMinutes(1)))),
            "Test case: " + tt.name);
      } else {
        TestResource result = operation.waitForCompletion(Optional.of(new LroOptions().setTimeout(Duration.ofMinutes(1))));
        assertEquals(tt.wantResult.getId(), result.getId(), "Test case: " + tt.name + " - ID mismatch");
        assertEquals(tt.wantResult.getName(), result.getName(), "Test case: " + tt.name + " - Name mismatch");
      }
    }
  }

  @Test
  void testLROCancelTestResourceCancel() {
    List<CancelTestCase> tests = Arrays.asList(
        new CancelTestCase(
            "Success",
            Arrays.asList(
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 5))
                    .setName("operations/test-resource-create-12345"),
                new Operation()
                    .setDone(true)
                    .setName("operations/test-resource-create-12345")
            ),
            false
        )
    );

    for (CancelTestCase tt : tests) {
      // Reset mock
      reset(mockImpl);

      // Setup mocks
      when(mockImpl.createTestResource(any(CreateTestResourceRequest.class))).thenReturn(tt.operations.get(0));
      if (tt.operations.size() > 1) {
        when(mockImpl.cancelOperation(any(CancelOperationRequest.class))).thenReturn(tt.operations.get(1));
      }

      // Execute test
      CreateTestResourceOperation operation =
          api.createTestResource(new CreateTestResourceRequest().setResource(new TestResource()));

      if (tt.wantErr) {
        assertThrows(Exception.class, () -> operation.cancel(), "Cancel should have failed for test case: " + tt.name);
      } else {
        assertDoesNotThrow(() -> operation.cancel(), "Cancel failed for test case: " + tt.name);
      }

      // Verify cancel was called
      verify(mockImpl).cancelOperation(argThat(req -> "operations/test-resource-create-12345".equals(req.getName())));
    }
  }

  @Test
  void testLROCreateTestResourceName() {
    List<NameTestCase> tests = Arrays.asList(
        new NameTestCase(
            "Success",
            Arrays.asList(
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 5))
                    .setName("operations/test-resource-create-12345")
            ),
            "operations/test-resource-create-12345"
        )
    );

    for (NameTestCase tt : tests) {
      // Reset mock
      reset(mockImpl);

      // Setup mocks
      when(mockImpl.createTestResource(any(CreateTestResourceRequest.class))).thenReturn(tt.operations.get(0));

      // Execute test
      CreateTestResourceOperation operation =
          api.createTestResource(new CreateTestResourceRequest().setResource(new TestResource()));
      String name = operation.getName();

      assertEquals(tt.wantName, name, "Name mismatch for test case: " + tt.name);
    }
  }

  @Test
  void testLROCreateTestResourceMetadata() {
    List<MetadataTestCase> tests = Arrays.asList(
        new MetadataTestCase(
            "Success",
            Arrays.asList(
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 5))
                    .setName("operations/test-resource-create-12345")
            ),
            new TestResourceOperationMetadata()
                .setProgressPercent(5L)
                .setResourceId("test-resource-123"),
            false
        )
    );

    for (MetadataTestCase tt : tests) {
      // Reset mock
      reset(mockImpl);

      // Setup mocks
      when(mockImpl.createTestResource(any(CreateTestResourceRequest.class))).thenReturn(tt.operations.get(0));

      // Execute test
      CreateTestResourceOperation operation =
          api.createTestResource(new CreateTestResourceRequest().setResource(new TestResource()));

      if (tt.wantErr) {
        assertThrows(Exception.class, () -> operation.getMetadata(), "Metadata should have failed for test case: " + tt.name);
      } else {
        TestResourceOperationMetadata metadata = operation.getMetadata();
        assertNotNull(metadata, "Metadata should not be null for test case: " + tt.name);
        assertEquals(tt.wantMetadata.getResourceId(), metadata.getResourceId(),
            "Resource ID mismatch for test case: " + tt.name);
        assertEquals(tt.wantMetadata.getProgressPercent(), metadata.getProgressPercent(),
            "Progress percent mismatch for test case: " + tt.name);
      }
    }
  }

  @Test
  void testLROCreateTestResourceDone() {
    List<DoneTestCase> tests = Arrays.asList(
        new DoneTestCase(
            "True",
            Arrays.asList(
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 5))
                    .setName("operations/test-resource-create-12345"),
                new Operation()
                    .setDone(true)
                    .setMetadata(createMetadata("test-resource-123", 100))
                    .setName("operations/test-resource-create-12345")
                    .setResponse(createResponse("test-resource-123", "test-resource"))
            ),
            true,
            false
        ),
        new DoneTestCase(
            "False",
            Arrays.asList(
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 5))
                    .setName("operations/test-resource-create-12345"),
                new Operation()
                    .setDone(false)
                    .setMetadata(createMetadata("test-resource-123", 75))
                    .setName("operations/test-resource-create-12345")
            ),
            false,
            false
        )
    );

    for (DoneTestCase tt : tests) {
      // Reset mock
      reset(mockImpl);

      // Setup mocks
      when(mockImpl.createTestResource(any(CreateTestResourceRequest.class))).thenReturn(tt.operations.get(0));
      if (tt.operations.size() > 1) {
        when(mockImpl.getOperation(any(GetOperationRequest.class))).thenReturn(tt.operations.get(1));
      }

      // Execute test
      CreateTestResourceOperation operation =
          api.createTestResource(new CreateTestResourceRequest().setResource(new TestResource()));

      if (tt.wantErr) {
        assertThrows(Exception.class, () -> operation.isDone(), "Done should have failed for test case: " + tt.name);
      } else {
        boolean done = operation.isDone();
        assertEquals(tt.wantDone, done, "Done mismatch for test case: " + tt.name);
      }
    }
  }
}