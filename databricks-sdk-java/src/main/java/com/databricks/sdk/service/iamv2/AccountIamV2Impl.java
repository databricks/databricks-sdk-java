// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountIamV2 */
@Generated
class AccountIamV2Impl implements AccountIamV2Service {
  private final ApiClient apiClient;

  public AccountIamV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Group createGroup(CreateGroupRequest request) {
    String path =
        String.format("/api/2.0/identity/accounts/%s/groups", apiClient.configuredAccountID());
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
  public ServicePrincipal createServicePrincipal(CreateServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/servicePrincipals", apiClient.configuredAccountID());
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
  public User createUser(CreateUserRequest request) {
    String path =
        String.format("/api/2.0/identity/accounts/%s/users", apiClient.configuredAccountID());
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
  public WorkspaceAccessDetail createWorkspaceAccessDetail(
      CreateWorkspaceAccessDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspaceAccessDetails",
            apiClient.configuredAccountID(), request.getParent());
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
  public void deleteGroup(DeleteGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public void deleteServicePrincipal(DeleteServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/servicePrincipals/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public void deleteUser(DeleteUserRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/users/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public void deleteWorkspaceAccessDetail(DeleteWorkspaceAccessDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspaceAccessDetails/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
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
  public Group getGroup(GetGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public ServicePrincipal getServicePrincipal(GetServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/servicePrincipals/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public User getUser(GetUserRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/users/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public WorkspaceAccessDetail getWorkspaceAccessDetail(GetWorkspaceAccessDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspaceAccessDetails/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
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
  public ListGroupsResponse listGroups(ListGroupsRequest request) {
    String path =
        String.format("/api/2.0/identity/accounts/%s/groups", apiClient.configuredAccountID());
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
  public ListServicePrincipalsResponse listServicePrincipals(ListServicePrincipalsRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/servicePrincipals", apiClient.configuredAccountID());
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
  public ListUsersResponse listUsers(ListUsersRequest request) {
    String path =
        String.format("/api/2.0/identity/accounts/%s/users", apiClient.configuredAccountID());
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
  public ListWorkspaceAccessDetailsResponse listWorkspaceAccessDetails(
      ListWorkspaceAccessDetailsRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspaceAccessDetails",
            apiClient.configuredAccountID(), request.getWorkspaceId());
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
  public ResolveGroupResponse resolveGroup(ResolveGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/resolveByExternalId",
            apiClient.configuredAccountID());
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
  public ResolveServicePrincipalResponse resolveServicePrincipal(
      ResolveServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/servicePrincipals/resolveByExternalId",
            apiClient.configuredAccountID());
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
  public ResolveUserResponse resolveUser(ResolveUserRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/users/resolveByExternalId",
            apiClient.configuredAccountID());
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
  public Group updateGroup(UpdateGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public ServicePrincipal updateServicePrincipal(UpdateServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/servicePrincipals/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public User updateUser(UpdateUserRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/users/%s",
            apiClient.configuredAccountID(), request.getInternalId());
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
  public WorkspaceAccessDetail updateWorkspaceAccessDetail(
      UpdateWorkspaceAccessDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspaceAccessDetails/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
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
