// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Genie */
@Generated
class GenieImpl implements GenieService {
  private final ApiClient apiClient;

  public GenieImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GenieMessage createMessage(GenieCreateConversationMessageRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages",
            request.getSpaceId(), request.getConversationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, GenieMessage.class, headers);
  }

  @Override
  public GenieGetMessageQueryResultResponse executeMessageQuery(
      GenieExecuteMessageQueryRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/execute-query",
            request.getSpaceId(), request.getConversationId(), request.getMessageId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("POST", path, null, GenieGetMessageQueryResultResponse.class, headers);
  }

  @Override
  public GenieMessage getMessage(GenieGetConversationMessageRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s",
            request.getSpaceId(), request.getConversationId(), request.getMessageId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GenieMessage.class, headers);
  }

  @Override
  public GenieGetMessageQueryResultResponse getMessageQueryResult(
      GenieGetMessageQueryResultRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/query-result",
            request.getSpaceId(), request.getConversationId(), request.getMessageId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, request, GenieGetMessageQueryResultResponse.class, headers);
  }

  @Override
  public GenieStartConversationResponse startConversation(
      GenieStartConversationMessageRequest request) {
    String path =
        String.format("/api/2.0/genie/spaces/%s/start-conversation", request.getSpaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, GenieStartConversationResponse.class, headers);
  }
}
