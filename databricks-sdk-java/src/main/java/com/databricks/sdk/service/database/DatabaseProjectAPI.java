// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Database Projects provide access to a database via REST API or direct SQL. */
@Generated
public class DatabaseProjectAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DatabaseProjectAPI.class);

  private final DatabaseProjectService impl;

  /** Regular-use constructor */
  public DatabaseProjectAPI(ApiClient apiClient) {
    impl = new DatabaseProjectImpl(apiClient);
  }

  /** Constructor for mocks */
  public DatabaseProjectAPI(DatabaseProjectService mock) {
    impl = mock;
  }

  /** Create a Database Branch. */
  public DatabaseBranch createDatabaseBranch(CreateDatabaseBranchRequest request) {
    return impl.createDatabaseBranch(request);
  }

  /** Create a Database Endpoint. */
  public DatabaseEndpoint createDatabaseEndpoint(CreateDatabaseEndpointRequest request) {
    return impl.createDatabaseEndpoint(request);
  }

  /** Create a Database Project. */
  public DatabaseProject createDatabaseProject(CreateDatabaseProjectRequest request) {
    return impl.createDatabaseProject(request);
  }

  public void deleteDatabaseBranch(String projectId, String branchId) {
    deleteDatabaseBranch(
        new DeleteDatabaseBranchRequest().setProjectId(projectId).setBranchId(branchId));
  }

  /** Delete a Database Branch. */
  public void deleteDatabaseBranch(DeleteDatabaseBranchRequest request) {
    impl.deleteDatabaseBranch(request);
  }

  public void deleteDatabaseEndpoint(String projectId, String branchId, String endpointId) {
    deleteDatabaseEndpoint(
        new DeleteDatabaseEndpointRequest()
            .setProjectId(projectId)
            .setBranchId(branchId)
            .setEndpointId(endpointId));
  }

  /** Delete a Database Endpoint. */
  public void deleteDatabaseEndpoint(DeleteDatabaseEndpointRequest request) {
    impl.deleteDatabaseEndpoint(request);
  }

  public void deleteDatabaseProject(String projectId) {
    deleteDatabaseProject(new DeleteDatabaseProjectRequest().setProjectId(projectId));
  }

  /** Delete a Database Project. */
  public void deleteDatabaseProject(DeleteDatabaseProjectRequest request) {
    impl.deleteDatabaseProject(request);
  }

  public DatabaseBranch getDatabaseBranch(String projectId, String branchId) {
    return getDatabaseBranch(
        new GetDatabaseBranchRequest().setProjectId(projectId).setBranchId(branchId));
  }

  /** Get a Database Branch. */
  public DatabaseBranch getDatabaseBranch(GetDatabaseBranchRequest request) {
    return impl.getDatabaseBranch(request);
  }

  public DatabaseEndpoint getDatabaseEndpoint(
      String projectId, String branchId, String endpointId) {
    return getDatabaseEndpoint(
        new GetDatabaseEndpointRequest()
            .setProjectId(projectId)
            .setBranchId(branchId)
            .setEndpointId(endpointId));
  }

  /** Get a Database Endpoint. */
  public DatabaseEndpoint getDatabaseEndpoint(GetDatabaseEndpointRequest request) {
    return impl.getDatabaseEndpoint(request);
  }

  public DatabaseProject getDatabaseProject(String projectId) {
    return getDatabaseProject(new GetDatabaseProjectRequest().setProjectId(projectId));
  }

  /** Get a Database Project. */
  public DatabaseProject getDatabaseProject(GetDatabaseProjectRequest request) {
    return impl.getDatabaseProject(request);
  }

  public Iterable<DatabaseBranch> listDatabaseBranches(String projectId) {
    return listDatabaseBranches(new ListDatabaseBranchesRequest().setProjectId(projectId));
  }

  /** List Database Branches. */
  public Iterable<DatabaseBranch> listDatabaseBranches(ListDatabaseBranchesRequest request) {
    return new Paginator<>(
        request,
        impl::listDatabaseBranches,
        ListDatabaseBranchesResponse::getDatabaseBranches,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<DatabaseEndpoint> listDatabaseEndpoints(String projectId, String branchId) {
    return listDatabaseEndpoints(
        new ListDatabaseEndpointsRequest().setProjectId(projectId).setBranchId(branchId));
  }

  /** List Database Endpoints. */
  public Iterable<DatabaseEndpoint> listDatabaseEndpoints(ListDatabaseEndpointsRequest request) {
    return new Paginator<>(
        request,
        impl::listDatabaseEndpoints,
        ListDatabaseEndpointsResponse::getDatabaseEndpoints,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** List Database Instances. */
  public Iterable<DatabaseProject> listDatabaseProjects(ListDatabaseProjectsRequest request) {
    return new Paginator<>(
        request,
        impl::listDatabaseProjects,
        ListDatabaseProjectsResponse::getDatabaseProjects,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Restart a Database Endpoint. TODO: should return databricks.longrunning.Operation */
  public DatabaseEndpoint restartDatabaseEndpoint(RestartDatabaseEndpointRequest request) {
    return impl.restartDatabaseEndpoint(request);
  }

  /** Update a Database Branch. */
  public DatabaseBranch updateDatabaseBranch(UpdateDatabaseBranchRequest request) {
    return impl.updateDatabaseBranch(request);
  }

  /** Update a Database Endpoint. TODO: should return databricks.longrunning.Operation { */
  public DatabaseEndpoint updateDatabaseEndpoint(UpdateDatabaseEndpointRequest request) {
    return impl.updateDatabaseEndpoint(request);
  }

  /** Update a Database Project. */
  public DatabaseProject updateDatabaseProject(UpdateDatabaseProjectRequest request) {
    return impl.updateDatabaseProject(request);
  }

  public DatabaseProjectService impl() {
    return impl;
  }
}
