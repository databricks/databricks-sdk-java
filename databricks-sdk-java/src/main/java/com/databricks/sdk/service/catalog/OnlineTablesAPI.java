// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Online tables provide lower latency and higher QPS access to data from Delta tables. */
@Generated
public class OnlineTablesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(OnlineTablesAPI.class);

  private final OnlineTablesService impl;

  /** Regular-use constructor */
  public OnlineTablesAPI(ApiClient apiClient) {
    impl = new OnlineTablesImpl(apiClient);
  }

  /** Constructor for mocks */
  public OnlineTablesAPI(OnlineTablesService mock) {
    impl = mock;
  }

  public OnlineTable waitGetOnlineTableActive(String name) throws TimeoutException {
    return waitGetOnlineTableActive(name, Duration.ofMinutes(20), null);
  }

  public OnlineTable waitGetOnlineTableActive(
      String name, Duration timeout, Consumer<OnlineTable> callback) throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<ProvisioningInfoState> targetStates =
        Arrays.asList(ProvisioningInfoState.ACTIVE);
    java.util.List<ProvisioningInfoState> failureStates =
        Arrays.asList(ProvisioningInfoState.FAILED);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      OnlineTable poll = get(new GetOnlineTableRequest().setName(name));
      ProvisioningInfoState status = poll.getUnityCatalogProvisioningState();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg = String.format("failed to reach ACTIVE, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("name=%s", name);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /** Create a new Online Table. */
  public Wait<OnlineTable, OnlineTable> create(CreateOnlineTableRequest request) {
    OnlineTable response = impl.create(request);
    return new Wait<>(
        (timeout, callback) -> waitGetOnlineTableActive(response.getName(), timeout, callback),
        response);
  }

  public void delete(String name) {
    delete(new DeleteOnlineTableRequest().setName(name));
  }

  /**
   * Delete an online table. Warning: This will delete all the data in the online table. If the
   * source Delta table was deleted or modified since this Online Table was created, this will lose
   * the data forever!
   */
  public void delete(DeleteOnlineTableRequest request) {
    impl.delete(request);
  }

  public OnlineTable get(String name) {
    return get(new GetOnlineTableRequest().setName(name));
  }

  /** Get information about an existing online table and its status. */
  public OnlineTable get(GetOnlineTableRequest request) {
    return impl.get(request);
  }

  public OnlineTablesService impl() {
    return impl;
  }
}
