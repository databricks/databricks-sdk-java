// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



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
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public CommandStatusResponse commandStatus(CommandStatusRequest request) {
    String path = "/api/1.2/commands/status";
    return apiClient.GET(path, request, CommandStatusResponse.class);
  }
  
  @Override
  public ContextStatusResponse contextStatus(ContextStatusRequest request) {
    String path = "/api/1.2/contexts/status";
    return apiClient.GET(path, request, ContextStatusResponse.class);
  }
  
  @Override
  public Created create(CreateContext request) {
    String path = "/api/1.2/contexts/create";
    return apiClient.POST(path, request, Created.class);
  }
  
  @Override
  public void destroy(DestroyContext request) {
    String path = "/api/1.2/contexts/destroy";
    apiClient.POST(path, request, Void.class);
    
  }
  
  @Override
  public Created execute(Command request) {
    String path = "/api/1.2/commands/execute";
    return apiClient.POST(path, request, Created.class);
  }
  
}