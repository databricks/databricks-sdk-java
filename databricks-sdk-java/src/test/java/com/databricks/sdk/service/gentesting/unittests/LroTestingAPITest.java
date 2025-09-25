package com.databricks.sdk.service.gentesting.unittests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.service.common.DatabricksServiceExceptionWithDetailsProto;
import com.databricks.sdk.service.common.ErrorCode;
import com.databricks.sdk.service.common.Operation;
import com.databricks.sdk.service.common.lro.LroOptions;
import com.databricks.sdk.service.lrotesting.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LroTestingAPITest {
  @Mock private ApiClient mockApiClient;
  private ObjectMapper objectMapper;

  static class HTTPFixture {
    String method;
    String resource;
    Operation response;

    HTTPFixture(String method, String resource, Operation response) {
      this.method = method;
      this.resource = resource;
      this.response = response;
    }
  }

  static class WaitTestCase {
    String name;
    List<HTTPFixture> fixtures;
    TestResource wantResult;
    boolean wantErr;

    WaitTestCase(String name, List<HTTPFixture> fixtures, TestResource wantResult, boolean wantErr) {
      this.name = name;
      this.fixtures = fixtures;
      this.wantResult = wantResult;
      this.wantErr = wantErr;
    }
  }

  static class CancelTestCase {
    String name;
    List<HTTPFixture> fixtures;
    boolean wantErr;

    CancelTestCase(String name, List<HTTPFixture> fixtures, boolean wantErr) {
      this.name = name;
      this.fixtures = fixtures;
      this.wantErr = wantErr;
    }
  }

  static class NameTestCase {
    String name;
    List<HTTPFixture> fixtures;
    String wantName;

    NameTestCase(String name, List<HTTPFixture> fixtures, String wantName) {
      this.name = name;
      this.fixtures = fixtures;
      this.wantName = wantName;
    }
  }

  static class MetadataTestCase {
    String name;
    List<HTTPFixture> fixtures;
    TestResourceOperationMetadata wantMetadata;
    boolean wantErr;

    MetadataTestCase(String name, List<HTTPFixture> fixtures, TestResourceOperationMetadata wantMetadata, boolean wantErr) {
      this.name = name;
      this.fixtures = fixtures;
      this.wantMetadata = wantMetadata;
      this.wantErr = wantErr;
    }
  }

  static class DoneTestCase {
    String name;
    List<HTTPFixture> fixtures;
    boolean wantDone;
    boolean wantErr;

    DoneTestCase(String name, List<HTTPFixture> fixtures, boolean wantDone, boolean wantErr) {
      this.name = name;
      this.fixtures = fixtures;
      this.wantDone = wantDone;
      this.wantErr = wantErr;
    }
  }

  @BeforeEach
  void setUp() {
    objectMapper = new ObjectMapper();
  }

  private void applyFixtures(List<HTTPFixture> fixtures) throws Exception {
    // Create a custom Answer that validates requests and returns responses in sequence
    final int[] callCount = {0};

    when(mockApiClient.execute(any(Request.class), eq(Operation.class))).thenAnswer(invocation -> {
      Request request = invocation.getArgument(0);

      if (callCount[0] >= fixtures.size()) {
        throw new RuntimeException("More API calls than expected fixtures");
      }

      HTTPFixture expectedFixture = fixtures.get(callCount[0]);

      // Validate HTTP method
      if (!expectedFixture.method.equals(request.getMethod())) {
        throw new AssertionError(String.format(
            "Call %d: Expected method %s but got %s",
            callCount[0], expectedFixture.method, request.getMethod()));
      }

      // Validate URL path
      String expectedPath = expectedFixture.resource.replace("?", "");
      if (!request.getUrl().contains(expectedPath) && !request.getUrl().endsWith(expectedPath)) {
        throw new AssertionError(String.format(
            "Call %d: Expected URL to contain %s but got %s",
            callCount[0], expectedPath, request.getUrl()));
      }

      Operation response = expectedFixture.response;
      callCount[0]++;
      return response;
    });
  }

  @Test
  void testLROCreateTestResourceWait() throws Exception {
    List<WaitTestCase> tests = Arrays.asList(
        new WaitTestCase(
            "Success",
            Arrays.asList(
                new HTTPFixture("POST", "/api/2.0/lro-testing/resources",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 5))
                        .setName("operations/test-resource-create-12345")),
                new HTTPFixture("GET", "/api/2.0/lro-testing/operations/operations/test-resource-create-12345?",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 75))
                        .setName("operations/test-resource-create-12345")),
                new HTTPFixture("GET", "/api/2.0/lro-testing/operations/operations/test-resource-create-12345?",
                    new Operation()
                        .setDone(true)
                        .setMetadata(createMetadata("test-resource-123", 100))
                        .setName("operations/test-resource-create-12345")
                        .setResponse(createResponse("test-resource-123", "test-resource")))
            ),
            new TestResource().setId("test-resource-123").setName("test-resource"),
            false
        ),
        new WaitTestCase(
            "Error",
            Arrays.asList(
                new HTTPFixture("POST", "/api/2.0/lro-testing/resources",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 5))
                        .setName("operations/test-resource-create-12345")),
                new HTTPFixture("GET", "/api/2.0/lro-testing/operations/operations/test-resource-create-12345?",
                    new Operation()
                        .setDone(true)
                        .setError(new DatabricksServiceExceptionWithDetailsProto()
                            .setErrorCode(ErrorCode.INTERNAL_ERROR)
                            .setMessage("Test error message"))
                        .setName("operations/test-resource-create-12345"))
            ),
            null,
            true
        )
    );

    for (WaitTestCase tt : tests) {
      // Reset mock and apply fixtures
      reset(mockApiClient);
      applyFixtures(tt.fixtures);

      // Create API and proper request
      LroTestingAPI api = new LroTestingAPI(mockApiClient);
      CreateTestResourceOperation operation = api.createTestResource(
          new CreateTestResourceRequest().setResource(new TestResource()));

      if (tt.wantErr) {
        assertThrows(Exception.class, () ->
            operation.waitForCompletion(Optional.of(LroOptions.withTimeout(Duration.ofMinutes(1)))),
            "Test case: " + tt.name);
      } else {
        TestResource result = operation.waitForCompletion(Optional.of(LroOptions.withTimeout(Duration.ofMinutes(1))));
        assertEquals(tt.wantResult.getId(), result.getId(), "Test case: " + tt.name + " - ID mismatch");
        assertEquals(tt.wantResult.getName(), result.getName(), "Test case: " + tt.name + " - Name mismatch");
      }
    }
  }

  @Test
  void testLROCancelTestResourceCancel() throws Exception {
    List<CancelTestCase> tests = Arrays.asList(
        new CancelTestCase(
            "Success",
            Arrays.asList(
                new HTTPFixture("POST", "/api/2.0/lro-testing/resources",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 5))
                        .setName("operations/test-resource-create-12345")),
                new HTTPFixture("POST", "/api/2.0/lro-testing/operations/operations/test-resource-create-12345/cancel",
                    new Operation()
                        .setDone(true)
                        .setName("operations/test-resource-create-12345"))
            ),
            false
        )
    );

    for (CancelTestCase tt : tests) {
      // Reset mock and apply fixtures
      reset(mockApiClient);
      applyFixtures(tt.fixtures);

      // Create API and execute test
      LroTestingAPI api = new LroTestingAPI(mockApiClient);
      CreateTestResourceOperation operation = api.createTestResource(
          new CreateTestResourceRequest().setResource(new TestResource()));

      if (tt.wantErr) {
        assertThrows(Exception.class, () -> operation.cancel(), "Cancel should have failed for test case: " + tt.name);
      } else {
        assertDoesNotThrow(() -> operation.cancel(), "Cancel failed for test case: " + tt.name);
      }
    }
  }

  @Test
  void testLROCreateTestResourceName() throws Exception {
    List<NameTestCase> tests = Arrays.asList(
        new NameTestCase(
            "Success",
            Arrays.asList(
                new HTTPFixture("POST", "/api/2.0/lro-testing/resources",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 5))
                        .setName("operations/test-resource-create-12345"))
            ),
            "operations/test-resource-create-12345"
        )
    );

    for (NameTestCase tt : tests) {
      // Reset mock and apply fixtures
      reset(mockApiClient);
      applyFixtures(tt.fixtures);

      // Create API and execute test
      LroTestingAPI api = new LroTestingAPI(mockApiClient);
      CreateTestResourceOperation operation = api.createTestResource(
          new CreateTestResourceRequest().setResource(new TestResource()));
      String name = operation.getName();

      assertEquals(tt.wantName, name, "Name mismatch for test case: " + tt.name);
    }
  }

  @Test
  void testLROCreateTestResourceMetadata() throws Exception {
    List<MetadataTestCase> tests = Arrays.asList(
        new MetadataTestCase(
            "Success",
            Arrays.asList(
                new HTTPFixture("POST", "/api/2.0/lro-testing/resources",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 5))
                        .setName("operations/test-resource-create-12345"))
            ),
            new TestResourceOperationMetadata()
                .setProgressPercent(5L)
                .setResourceId("test-resource-123"),
            false
        )
    );

    for (MetadataTestCase tt : tests) {
      // Reset mock and apply fixtures
      reset(mockApiClient);
      applyFixtures(tt.fixtures);

      // Create API and execute test
      LroTestingAPI api = new LroTestingAPI(mockApiClient);
      CreateTestResourceOperation operation = api.createTestResource(
          new CreateTestResourceRequest().setResource(new TestResource()));

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
  void testLROCreateTestResourceDone() throws Exception {
    List<DoneTestCase> tests = Arrays.asList(
        new DoneTestCase(
            "True",
            Arrays.asList(
                new HTTPFixture("POST", "/api/2.0/lro-testing/resources",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 5))
                        .setName("operations/test-resource-create-12345")),
                new HTTPFixture("GET", "/api/2.0/lro-testing/operations/operations/test-resource-create-12345?",
                    new Operation()
                        .setDone(true)
                        .setMetadata(createMetadata("test-resource-123", 100))
                        .setName("operations/test-resource-create-12345")
                        .setResponse(createResponse("test-resource-123", "test-resource")))
            ),
            true,
            false
        ),
        new DoneTestCase(
            "False",
            Arrays.asList(
                new HTTPFixture("POST", "/api/2.0/lro-testing/resources",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 5))
                        .setName("operations/test-resource-create-12345")),
                new HTTPFixture("GET", "/api/2.0/lro-testing/operations/operations/test-resource-create-12345?",
                    new Operation()
                        .setDone(false)
                        .setMetadata(createMetadata("test-resource-123", 75))
                        .setName("operations/test-resource-create-12345"))
            ),
            false,
            false
        )
    );

    for (DoneTestCase tt : tests) {
      // Reset mock and apply fixtures
      reset(mockApiClient);
      applyFixtures(tt.fixtures);

      // Create API and execute test
      LroTestingAPI api = new LroTestingAPI(mockApiClient);
      CreateTestResourceOperation operation = api.createTestResource(
          new CreateTestResourceRequest().setResource(new TestResource()));

      if (tt.wantErr) {
        assertThrows(Exception.class, () -> operation.isDone(), "Done should have failed for test case: " + tt.name);
      } else {
        boolean done = operation.isDone();
        assertEquals(tt.wantDone, done, "Done mismatch for test case: " + tt.name);
      }
    }
  }

  private JsonNode createMetadata(String resourceId, int progressPercent) {
    ObjectNode metadata = objectMapper.createObjectNode();
    metadata.put("resource_id", resourceId);
    metadata.put("progress_percent", progressPercent);
    return metadata;
  }

  private JsonNode createResponse(String id, String name) {
    ObjectNode response = objectMapper.createObjectNode();
    response.put("id", id);
    response.put("name", name);
    return response;
  }
}