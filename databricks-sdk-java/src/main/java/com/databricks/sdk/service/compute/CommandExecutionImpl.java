// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of CommandExecution */
class CommandExecutionImpl implements CommandExecutionService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for CommandExecutionImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public CommandExecutionImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void cancel(CancelCommand request) {
    String path = "/api/1.2/commands/cancel";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public CommandStatusResponse commandStatus(CommandStatusRequest request) {
    String path = "/api/1.2/commands/status";
    return apiClient.GET(path, request, CommandStatusResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ContextStatusResponse contextStatus(ContextStatusRequest request) {
    String path = "/api/1.2/contexts/status";
    return apiClient.GET(path, request, ContextStatusResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public Created create(CreateContext request) {
    String path = "/api/1.2/contexts/create";
    return apiClient.POST(path, request, Created.class);
  }

  /** {@inheritDoc} */
  @Override
  public void destroy(DestroyContext request) {
    String path = "/api/1.2/contexts/destroy";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Created execute(Command request) {
    String path = "/api/1.2/commands/execute";
    return apiClient.POST(path, request, Created.class);
  }
}
