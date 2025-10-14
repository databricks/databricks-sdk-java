// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.utils.SerDeUtils;
import com.databricks.sdk.service.common.lro.LroOptions;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper for interacting with a long-running createTestResource operation. Provides methods to
 * wait for completion, check status, cancel, and access metadata.
 */
@Generated
public class CreateTestResourceOperation {
  private static final Logger LOG = LoggerFactory.getLogger(CreateTestResourceOperation.class);
  private static final Duration DEFAULT_TIMEOUT = Duration.ofMinutes(20);

  private final LroTestingService impl;
  private Operation operation;
  private final ObjectMapper objectMapper;

  public CreateTestResourceOperation(LroTestingService impl, Operation operation) {
    this.impl = impl;
    this.operation = operation;
    this.objectMapper = SerDeUtils.createMapper();
  }

  /**
   * Wait for the operation to complete and return the resulting TestResource. Uses the default
   * timeout of 20 minutes.
   *
   * @return the created TestResource
   * @throws TimeoutException if the operation doesn't complete within the timeout
   * @throws DatabricksException if the operation fails
   */
  public TestResource waitForCompletion() throws TimeoutException {
    return waitForCompletion(Optional.empty());
  }

  /**
   * Wait for the operation to complete and return the resulting TestResource.
   *
   * @param options the options for configuring the wait behavior, can be empty for defaults
   * @return the created TestResource
   * @throws TimeoutException if the operation doesn't complete within the timeout
   * @throws DatabricksException if the operation fails
   */
  public TestResource waitForCompletion(Optional<LroOptions> options) throws TimeoutException {
    Duration timeout = options.flatMap(LroOptions::getTimeout).orElse(DEFAULT_TIMEOUT);
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    String statusMessage = "polling operation...";
    int attempt = 1;

    while (System.currentTimeMillis() < deadline) {
      // Refresh the operation state
      refreshOperation();

      if (operation.getDone() != null && operation.getDone()) {
        // Operation completed, check for success or failure
        if (operation.getError() != null) {
          String errorMsg = "unknown error";
          if (operation.getError().getMessage() != null
              && !operation.getError().getMessage().isEmpty()) {
            errorMsg = operation.getError().getMessage();
          }

          if (operation.getError().getErrorCode() != null) {
            errorMsg = String.format("[%s] %s", operation.getError().getErrorCode(), errorMsg);
          }

          throw new DatabricksException("Operation failed: " + errorMsg);
        }

        // Operation completed successfully, unmarshal response
        if (operation.getResponse() == null) {
          throw new DatabricksException("Operation completed but no response available");
        }

        try {
          JsonNode responseJson = objectMapper.valueToTree(operation.getResponse());
          return objectMapper.treeToValue(responseJson, TestResource.class);
        } catch (JsonProcessingException e) {
          throw new DatabricksException(
              "Failed to unmarshal testResource response: " + e.getMessage(), e);
        }
      }

      // Operation still in progress, wait before polling again
      String prefix = String.format("operation=%s", operation.getName());
      int sleep = Math.min(attempt, 10); // sleep 10s max per attempt
      LOG.info("{}: operation in progress (sleeping ~{}s)", prefix, sleep);

      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }

    throw new TimeoutException(
        String.format("Operation timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * Cancel the operation.
   *
   * @throws DatabricksException if the cancellation fails
   */
  public void cancel() {
    impl.cancelOperation(new CancelOperationRequest().setName(operation.getName()));
  }

  /**
   * Get the operation name.
   *
   * @return the operation name
   */
  public String getName() {
    return operation.getName();
  }

  /**
   * Get the operation metadata.
   *
   * @return the operation metadata, or null if not available
   * @throws DatabricksException if the metadata cannot be deserialized
   */
  public TestResourceOperationMetadata getMetadata() {
    if (operation.getMetadata() == null) {
      return null;
    }

    try {
      JsonNode metadataJson = objectMapper.valueToTree(operation.getMetadata());
      return objectMapper.treeToValue(metadataJson, TestResourceOperationMetadata.class);
    } catch (JsonProcessingException e) {
      throw new DatabricksException("Failed to unmarshal operation metadata: " + e.getMessage(), e);
    }
  }

  /**
   * Check if the operation is done. This method refreshes the operation state before checking.
   *
   * @return true if the operation is complete, false otherwise
   * @throws DatabricksException if the status check fails
   */
  public boolean isDone() {
    refreshOperation();
    return operation.getDone() != null && operation.getDone();
  }

  /** Refresh the operation state by polling the server. */
  private void refreshOperation() {
    operation = impl.getOperation(new GetOperationRequest().setName(operation.getName()));
  }
}
