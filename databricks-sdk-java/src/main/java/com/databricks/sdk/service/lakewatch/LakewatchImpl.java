// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Lakewatch */
@Generated
class LakewatchImpl implements LakewatchService {
  private final ApiClient apiClient;

  public LakewatchImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Datasource createDatasource(CreateDatasourceRequest request) {
    String path = "/api/2.0/lakewatch/datasources";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDatasource()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Datasource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Rule createRule(CreateRuleRequest request) {
    String path = "/api/2.0/lakewatch/rules";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getRule()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Rule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDatasource(DeleteDatasourceRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteRule(DeleteRuleRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AlertConfig getAlertConfig(GetAlertConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, AlertConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CommonConfig getCommonConfig(GetCommonConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CommonConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Datasource getDatasource(GetDatasourceRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Datasource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatasourceConfig getDatasourceConfig(GetDatasourceConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DatasourceConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Rule getRule(GetRuleRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Rule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RuleConfig getRuleConfig(GetRuleConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RuleConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDatasourcesResponse listDatasources(ListDatasourcesRequest request) {
    String path = "/api/2.0/lakewatch/datasources";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListDatasourcesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListRulesResponse listRules(ListRulesRequest request) {
    String path = "/api/2.0/lakewatch/rules";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListRulesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AlertConfig updateAlertConfig(UpdateAlertConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getAlertConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, AlertConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CommonConfig updateCommonConfig(UpdateCommonConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getCommonConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CommonConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Datasource updateDatasource(UpdateDatasourceRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDatasource()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Datasource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DatasourceConfig updateDatasourceConfig(UpdateDatasourceConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getDatasourceConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DatasourceConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Rule updateRule(UpdateRuleRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getRule()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Rule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RuleConfig updateRuleConfig(UpdateRuleConfigRequest request) {
    String path = String.format("/api/2.0/lakewatch/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getRuleConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, RuleConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
