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
  public DirectGroupMember createDirectGroupMember(CreateDirectGroupMemberRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s/direct-members",
            apiClient.configuredAccountID(), request.getGroupId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDirectGroupMember()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DirectGroupMember.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
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
            "/api/2.0/identity/accounts/%s/service-principals", apiClient.configuredAccountID());
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
  public WorkspaceAssignment createWorkspaceAssignment(CreateWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignments",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getWorkspaceAssignment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignmentDetail createWorkspaceAssignmentDetail(
      CreateWorkspaceAssignmentDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignment-details",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getWorkspaceAssignmentDetail()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceAssignmentDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDirectGroupMember(DeleteDirectGroupMemberRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s/direct-members/%s",
            apiClient.configuredAccountID(), request.getGroupId(), request.getPrincipalId());
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
  public void deleteGroup(DeleteGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s",
            apiClient.configuredAccountID(), request.getGroupId());
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
            "/api/2.0/identity/accounts/%s/service-principals/%s",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
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
            apiClient.configuredAccountID(), request.getUserId());
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
  public void deleteWorkspaceAssignment(DeleteWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignments/%s",
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
  public void deleteWorkspaceAssignmentDetail(DeleteWorkspaceAssignmentDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignment-details/%s",
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
  public DirectGroupMember getDirectGroupMember(GetDirectGroupMemberRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s/direct-members/%s",
            apiClient.configuredAccountID(), request.getGroupId(), request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DirectGroupMember.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Group getGroup(GetGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s",
            apiClient.configuredAccountID(), request.getGroupId());
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
            "/api/2.0/identity/accounts/%s/service-principals/%s",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
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
            apiClient.configuredAccountID(), request.getUserId());
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
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-access-details/%s",
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
  public WorkspaceAssignment getWorkspaceAssignment(GetWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignments/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WorkspaceAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetail(
      GetWorkspaceAssignmentDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignment-details/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WorkspaceAssignmentDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDirectGroupMembersResponse listDirectGroupMembers(
      ListDirectGroupMembersRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/%s/direct-members",
            apiClient.configuredAccountID(), request.getGroupId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDirectGroupMembersResponse.class);
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
            "/api/2.0/identity/accounts/%s/service-principals", apiClient.configuredAccountID());
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
  public ListTransitiveParentGroupsResponse listTransitiveParentGroups(
      ListTransitiveParentGroupsRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/principals/%s/transitive-parent-groups",
            apiClient.configuredAccountID(), request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListTransitiveParentGroupsResponse.class);
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
  public ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetails(
      ListWorkspaceAssignmentDetailsRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignment-details",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListWorkspaceAssignmentDetailsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListWorkspaceAssignmentsResponse listWorkspaceAssignments(
      ListWorkspaceAssignmentsRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignments",
            apiClient.configuredAccountID(), request.getWorkspaceId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListWorkspaceAssignmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveGroupResponse resolveGroup(ResolveGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/resolve-by-external-id",
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
            "/api/2.0/identity/accounts/%s/service-principals/resolve-by-external-id",
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
            "/api/2.0/identity/accounts/%s/users/resolve-by-external-id",
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
            apiClient.configuredAccountID(), request.getGroupId());
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
            "/api/2.0/identity/accounts/%s/service-principals/%s",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
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
            apiClient.configuredAccountID(), request.getUserId());
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
  public WorkspaceAssignment updateWorkspaceAssignment(UpdateWorkspaceAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignments/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getWorkspaceAssignment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignmentDetail updateWorkspaceAssignmentDetail(
      UpdateWorkspaceAssignmentDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspace-assignment-details/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getWorkspaceAssignmentDetail()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WorkspaceAssignmentDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
