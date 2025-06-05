// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, GenieMessage.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieGetMessageQueryResultResponse executeMessageAttachmentQuery(
      GenieExecuteMessageAttachmentQueryRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/attachments/%s/execute-query",
            request.getSpaceId(),
            request.getConversationId(),
            request.getMessageId(),
            request.getAttachmentId());
    try {
      Request req = new Request("POST", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieGetMessageQueryResultResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieGetMessageQueryResultResponse executeMessageQuery(
      GenieExecuteMessageQueryRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/execute-query",
            request.getSpaceId(), request.getConversationId(), request.getMessageId());
    try {
      Request req = new Request("POST", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieGetMessageQueryResultResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieGenerateDownloadFullQueryResultResponse generateDownloadFullQueryResult(
      GenieGenerateDownloadFullQueryResultRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/attachments/%s/downloads",
            request.getSpaceId(),
            request.getConversationId(),
            request.getMessageId(),
            request.getAttachmentId());
    try {
      Request req = new Request("POST", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieGenerateDownloadFullQueryResultResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieGetDownloadFullQueryResultResponse getDownloadFullQueryResult(
      GenieGetDownloadFullQueryResultRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/attachments/%s/downloads/%s",
            request.getSpaceId(),
            request.getConversationId(),
            request.getMessageId(),
            request.getAttachmentId(),
            request.getDownloadId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieGetDownloadFullQueryResultResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieMessage getMessage(GenieGetConversationMessageRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s",
            request.getSpaceId(), request.getConversationId(), request.getMessageId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieMessage.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieGetMessageQueryResultResponse getMessageAttachmentQueryResult(
      GenieGetMessageAttachmentQueryResultRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/attachments/%s/query-result",
            request.getSpaceId(),
            request.getConversationId(),
            request.getMessageId(),
            request.getAttachmentId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieGetMessageQueryResultResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieGetMessageQueryResultResponse getMessageQueryResult(
      GenieGetMessageQueryResultRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/query-result",
            request.getSpaceId(), request.getConversationId(), request.getMessageId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieGetMessageQueryResultResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieGetMessageQueryResultResponse getMessageQueryResultByAttachment(
      GenieGetQueryResultByAttachmentRequest request) {
    String path =
        String.format(
            "/api/2.0/genie/spaces/%s/conversations/%s/messages/%s/query-result/%s",
            request.getSpaceId(),
            request.getConversationId(),
            request.getMessageId(),
            request.getAttachmentId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieGetMessageQueryResultResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieSpace getSpace(GenieGetSpaceRequest request) {
    String path = String.format("/api/2.0/genie/spaces/%s", request.getSpaceId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieSpace.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieListSpacesResponse listSpaces(GenieListSpacesRequest request) {
    String path = "/api/2.0/genie/spaces";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GenieListSpacesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GenieStartConversationResponse startConversation(
      GenieStartConversationMessageRequest request) {
    String path =
        String.format("/api/2.0/genie/spaces/%s/start-conversation", request.getSpaceId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, GenieStartConversationResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
