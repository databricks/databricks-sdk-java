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
  public DirectGroupMember createDirectGroupMemberProxy(
      CreateDirectGroupMemberProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s/direct-members", request.getGroupId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getDirectGroupMember()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DirectGroupMember.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Group createGroupProxy(CreateGroupProxyRequest request) {
    String path = "/api/2.0/identity/groups";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getGroup()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Group.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServicePrincipal createServicePrincipalProxy(CreateServicePrincipalProxyRequest request) {
    String path = "/api/2.0/identity/service-principals";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getServicePrincipal()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
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
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, User.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignmentDetail createWorkspaceAssignmentDetailProxy(
      CreateWorkspaceAssignmentDetailProxyRequest request) {
    String path = "/api/2.0/identity/workspace-assignment-details";
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getWorkspaceAssignmentDetail()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceAssignmentDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignment createWorkspaceAssignmentProxy(
      CreateWorkspaceAssignmentProxyRequest request) {
    String path = "/api/2.0/identity/workspace-assignments";
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getWorkspaceAssignment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDirectGroupMemberProxy(DeleteDirectGroupMemberProxyRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/groups/%s/direct-members/%s",
            request.getGroupId(), request.getPrincipalId());
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
  public void deleteGroupProxy(DeleteGroupProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s", request.getGroupId());
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
  public void deleteServicePrincipalProxy(DeleteServicePrincipalProxyRequest request) {
    String path =
        String.format("/api/2.0/identity/service-principals/%s", request.getServicePrincipalId());
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
  public void deleteUserProxy(DeleteUserProxyRequest request) {
    String path = String.format("/api/2.0/identity/users/%s", request.getUserId());
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
  public void deleteWorkspaceAssignmentDetailProxy(
      DeleteWorkspaceAssignmentDetailProxyRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/workspace-assignment-details/%s", request.getPrincipalId());
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
  public void deleteWorkspaceAssignmentProxy(DeleteWorkspaceAssignmentProxyRequest request) {
    String path =
        String.format("/api/2.0/identity/workspace-assignments/%s", request.getPrincipalId());
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
  public DirectGroupMember getDirectGroupMemberProxy(GetDirectGroupMemberProxyRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/groups/%s/direct-members/%s",
            request.getGroupId(), request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, DirectGroupMember.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExternalGroup getExternalGroupProxy(GetExternalGroupProxyRequest request) {
    String path = String.format("/api/2.0/identity/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ExternalGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExternalServicePrincipal getExternalServicePrincipalProxy(
      GetExternalServicePrincipalProxyRequest request) {
    String path = String.format("/api/2.0/identity/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ExternalServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExternalUser getExternalUserProxy(GetExternalUserProxyRequest request) {
    String path = String.format("/api/2.0/identity/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ExternalUser.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Group getGroupProxy(GetGroupProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s", request.getGroupId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Group.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServicePrincipal getServicePrincipalProxy(GetServicePrincipalProxyRequest request) {
    String path =
        String.format("/api/2.0/identity/service-principals/%s", request.getServicePrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public User getUserProxy(GetUserProxyRequest request) {
    String path = String.format("/api/2.0/identity/users/%s", request.getUserId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, User.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAccessDetail getWorkspaceAccessDetailLocal(
      GetWorkspaceAccessDetailLocalRequest request) {
    String path =
        String.format("/api/2.0/identity/workspace-access-details/%s", request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceAccessDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetailProxy(
      GetWorkspaceAssignmentDetailProxyRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/workspace-assignment-details/%s", request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceAssignmentDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignment getWorkspaceAssignmentProxy(
      GetWorkspaceAssignmentProxyRequest request) {
    String path =
        String.format("/api/2.0/identity/workspace-assignments/%s", request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceIdentityDetail getWorkspaceIdentityDetail(
      GetWorkspaceIdentityDetailRequest request) {
    String path =
        String.format("/api/2.0/identity/workspace-identity-details/%s", request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceIdentityDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDirectGroupMembersResponse listDirectGroupMembersProxy(
      ListDirectGroupMembersProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s/direct-members", request.getGroupId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListDirectGroupMembersResponse.class);
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
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListGroupsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListServicePrincipalsResponse listServicePrincipalsProxy(
      ListServicePrincipalsProxyRequest request) {
    String path = "/api/2.0/identity/service-principals";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListServicePrincipalsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListTransitiveParentGroupsResponse listTransitiveParentGroupsProxy(
      ListTransitiveParentGroupsProxyRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/principals/%s/transitive-parent-groups", request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListTransitiveParentGroupsResponse.class);
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
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListUsersResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetailsProxy(
      ListWorkspaceAssignmentDetailsProxyRequest request) {
    String path = "/api/2.0/identity/workspace-assignment-details";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListWorkspaceAssignmentDetailsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListWorkspaceAssignmentsResponse listWorkspaceAssignmentsProxy(
      ListWorkspaceAssignmentsProxyRequest request) {
    String path = "/api/2.0/identity/workspace-assignments";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListWorkspaceAssignmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveGroupResponse resolveGroupProxy(ResolveGroupProxyRequest request) {
    String path = "/api/2.0/identity/groups/resolve-by-external-id";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ResolveGroupResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveServicePrincipalResponse resolveServicePrincipalProxy(
      ResolveServicePrincipalProxyRequest request) {
    String path = "/api/2.0/identity/service-principals/resolve-by-external-id";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ResolveServicePrincipalResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveUserResponse resolveUserProxy(ResolveUserProxyRequest request) {
    String path = "/api/2.0/identity/users/resolve-by-external-id";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ResolveUserResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Group updateGroupProxy(UpdateGroupProxyRequest request) {
    String path = String.format("/api/2.0/identity/groups/%s", request.getGroupId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getGroup()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, Group.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServicePrincipal updateServicePrincipalProxy(UpdateServicePrincipalProxyRequest request) {
    String path =
        String.format("/api/2.0/identity/service-principals/%s", request.getServicePrincipalId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getServicePrincipal()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public User updateUserProxy(UpdateUserProxyRequest request) {
    String path = String.format("/api/2.0/identity/users/%s", request.getUserId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getUser()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, User.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignmentDetail updateWorkspaceAssignmentDetailProxy(
      UpdateWorkspaceAssignmentDetailProxyRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/workspace-assignment-details/%s", request.getPrincipalId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getWorkspaceAssignmentDetail()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceAssignmentDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceAssignment updateWorkspaceAssignmentProxy(
      UpdateWorkspaceAssignmentProxyRequest request) {
    String path =
        String.format("/api/2.0/identity/workspace-assignments/%s", request.getPrincipalId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getWorkspaceAssignment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WorkspaceIdentityDetail updateWorkspaceIdentityDetail(
      UpdateWorkspaceIdentityDetailRequest request) {
    String path =
        String.format("/api/2.0/identity/workspace-identity-details/%s", request.getPrincipalId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getWorkspaceIdentityDetail()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Workspace-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, WorkspaceIdentityDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
