// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of CommandExecution */
@Generated
class CommandExecutionImpl implements CommandExecutionService {
  private final ApiClient apiClient;

  public CommandExecutionImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void cancel(CancelCommand request) {
    String path = "/api/1.2/commands/cancel";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, CancelResponse.class, headers);
  }

  @Override
  public CommandStatusResponse commandStatus(CommandStatusRequest request) {
    String path = "/api/1.2/commands/status";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, CommandStatusResponse.class, headers);
  }

  @Override
  public ContextStatusResponse contextStatus(ContextStatusRequest request) {
    String path = "/api/1.2/contexts/status";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ContextStatusResponse.class, headers);
  }

  @Override
  public Created create(CreateContext request) {
    String path = "/api/1.2/contexts/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, Created.class, headers);
  }

  @Override
  public void destroy(DestroyContext request) {
    String path = "/api/1.2/contexts/destroy";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, DestroyResponse.class, headers);
  }

  @Override
  public Created execute(Command request) {
    String path = "/api/1.2/commands/execute";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, Created.class, headers);
  }
}
