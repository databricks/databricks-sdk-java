// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of WorkspaceIamV2 */
@Generated
class WorkspaceIamV2Impl implements WorkspaceIamV2Service {
  private final ApiClient apiClient;

  public WorkspaceIamV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Group createGroupProxy(CreateGroupProxyRequest request) {
    String path = "/api/2.0/identity/groups";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getGroup()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Group.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServicePrincipal createServicePrincipalProxy(CreateServicePrincipalProxyRequest request) {
    String path = "/api/2.0/identity/servicePrincipals";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getServicePrincipal()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public User createUserProxy(CreateUserProxyRequest request) {
    String path = "/api/2.0/identity/users";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getUser()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, User.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAccessDetail createWorkspaceAccessDetailLocal(
      CreateWorkspaceAccessDetailLocalRequest request) {
    String path = "/api/2.0/identity/workspaceAccessDetails";
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getWorkspaceAccessDetail()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceAccessDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteGroupProxy(DeleteGroupProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s", request.getInternalId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteServicePrincipalProxy(DeleteServicePrincipalProxyRequest request) {
    String path = String.format("/api/2.0/identity/servicePrincipals/%s", request.getInternalId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteUserProxy(DeleteUserProxyRequest request) {
    String path = String.format("/api/2.0/identity/users/%s", request.getInternalId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteWorkspaceAccessDetailLocal(DeleteWorkspaceAccessDetailLocalRequest request) {
    String path =
        String.format("/api/2.0/identity/workspaceAccessDetails/%s", request.getPrincipalId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Group getGroupProxy(GetGroupProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s", request.getInternalId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Group.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServicePrincipal getServicePrincipalProxy(GetServicePrincipalProxyRequest request) {
    String path = String.format("/api/2.0/identity/servicePrincipals/%s", request.getInternalId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public User getUserProxy(GetUserProxyRequest request) {
    String path = String.format("/api/2.0/identity/users/%s", request.getInternalId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, User.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAccessDetail getWorkspaceAccessDetailLocal(
      GetWorkspaceAccessDetailLocalRequest request) {
    String path =
        String.format("/api/2.0/identity/workspaceAccessDetails/%s", request.getPrincipalId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WorkspaceAccessDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListGroupsResponse listGroupsProxy(ListGroupsProxyRequest request) {
    String path = "/api/2.0/identity/groups";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListGroupsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListServicePrincipalsResponse listServicePrincipalsProxy(
      ListServicePrincipalsProxyRequest request) {
    String path = "/api/2.0/identity/servicePrincipals";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListServicePrincipalsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListUsersResponse listUsersProxy(ListUsersProxyRequest request) {
    String path = "/api/2.0/identity/users";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListUsersResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListWorkspaceAccessDetailsResponse listWorkspaceAccessDetailsLocal(
      ListWorkspaceAccessDetailsLocalRequest request) {
    String path = "/api/2.0/identity/workspaceAccessDetails";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListWorkspaceAccessDetailsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveGroupResponse resolveGroupProxy(ResolveGroupProxyRequest request) {
    String path = "/api/2.0/identity/groups/resolveByExternalId";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ResolveGroupResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveServicePrincipalResponse resolveServicePrincipalProxy(
      ResolveServicePrincipalProxyRequest request) {
    String path = "/api/2.0/identity/servicePrincipals/resolveByExternalId";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ResolveServicePrincipalResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveUserResponse resolveUserProxy(ResolveUserProxyRequest request) {
    String path = "/api/2.0/identity/users/resolveByExternalId";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ResolveUserResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Group updateGroupProxy(UpdateGroupProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s", request.getInternalId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getGroup()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Group.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServicePrincipal updateServicePrincipalProxy(UpdateServicePrincipalProxyRequest request) {
    String path = String.format("/api/2.0/identity/servicePrincipals/%s", request.getInternalId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getServicePrincipal()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public User updateUserProxy(UpdateUserProxyRequest request) {
    String path = String.format("/api/2.0/identity/users/%s", request.getInternalId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getUser()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, User.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAccessDetail updateWorkspaceAccessDetailLocal(
      UpdateWorkspaceAccessDetailLocalRequest request) {
    String path =
        String.format("/api/2.0/identity/workspaceAccessDetails/%s", request.getPrincipalId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getWorkspaceAccessDetail()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceAccessDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
