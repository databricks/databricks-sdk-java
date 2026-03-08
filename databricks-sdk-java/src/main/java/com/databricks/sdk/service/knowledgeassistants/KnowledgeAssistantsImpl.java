// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of KnowledgeAssistants */
@Generated
class KnowledgeAssistantsImpl implements KnowledgeAssistantsService {
  private final ApiClient apiClient;

  public KnowledgeAssistantsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public KnowledgeAssistant createKnowledgeAssistant(CreateKnowledgeAssistantRequest request) {
    String path = "/api/2.1/knowledge-assistants";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getKnowledgeAssistant()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, KnowledgeAssistant.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KnowledgeSource createKnowledgeSource(CreateKnowledgeSourceRequest request) {
    String path = String.format("/api/2.1/%s/knowledge-sources", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getKnowledgeSource()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, KnowledgeSource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteKnowledgeAssistant(DeleteKnowledgeAssistantRequest request) {
    String path = String.format("/api/2.1/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteKnowledgeSource(DeleteKnowledgeSourceRequest request) {
    String path = String.format("/api/2.1/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KnowledgeAssistant getKnowledgeAssistant(GetKnowledgeAssistantRequest request) {
    String path = String.format("/api/2.1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, KnowledgeAssistant.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KnowledgeSource getKnowledgeSource(GetKnowledgeSourceRequest request) {
    String path = String.format("/api/2.1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, KnowledgeSource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListKnowledgeAssistantsResponse listKnowledgeAssistants(
      ListKnowledgeAssistantsRequest request) {
    String path = "/api/2.1/knowledge-assistants";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListKnowledgeAssistantsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListKnowledgeSourcesResponse listKnowledgeSources(ListKnowledgeSourcesRequest request) {
    String path = String.format("/api/2.1/%s/knowledge-sources", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListKnowledgeSourcesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void syncKnowledgeSources(SyncKnowledgeSourcesRequest request) {
    String path = String.format("/api/2.1/%s/knowledge-sources:sync", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KnowledgeAssistant updateKnowledgeAssistant(UpdateKnowledgeAssistantRequest request) {
    String path = String.format("/api/2.1/%s", request.getName());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getKnowledgeAssistant()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, KnowledgeAssistant.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KnowledgeSource updateKnowledgeSource(UpdateKnowledgeSourceRequest request) {
    String path = String.format("/api/2.1/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getKnowledgeSource()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, KnowledgeSource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
