// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;

/**
 * Database Projects provide access to a database via REST API or direct SQL.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DatabaseProjectService {
  /** Create a Database Branch. */
  DatabaseBranch createDatabaseBranch(CreateDatabaseBranchRequest createDatabaseBranchRequest);

  /** Create a Database Endpoint. */
  DatabaseEndpoint createDatabaseEndpoint(
      CreateDatabaseEndpointRequest createDatabaseEndpointRequest);

  /** Create a Database Project. */
  DatabaseProject createDatabaseProject(CreateDatabaseProjectRequest createDatabaseProjectRequest);

  /** Delete a Database Branch. */
  void deleteDatabaseBranch(DeleteDatabaseBranchRequest deleteDatabaseBranchRequest);

  /** Delete a Database Endpoint. */
  void deleteDatabaseEndpoint(DeleteDatabaseEndpointRequest deleteDatabaseEndpointRequest);

  /** Delete a Database Project. */
  void deleteDatabaseProject(DeleteDatabaseProjectRequest deleteDatabaseProjectRequest);

  /** Get a Database Branch. */
  DatabaseBranch getDatabaseBranch(GetDatabaseBranchRequest getDatabaseBranchRequest);

  /** Get a Database Endpoint. */
  DatabaseEndpoint getDatabaseEndpoint(GetDatabaseEndpointRequest getDatabaseEndpointRequest);

  /** Get a Database Project. */
  DatabaseProject getDatabaseProject(GetDatabaseProjectRequest getDatabaseProjectRequest);

  /** List Database Branches. */
  ListDatabaseBranchesResponse listDatabaseBranches(
      ListDatabaseBranchesRequest listDatabaseBranchesRequest);

  /** List Database Endpoints. */
  ListDatabaseEndpointsResponse listDatabaseEndpoints(
      ListDatabaseEndpointsRequest listDatabaseEndpointsRequest);

  /** List Database Instances. */
  ListDatabaseProjectsResponse listDatabaseProjects(
      ListDatabaseProjectsRequest listDatabaseProjectsRequest);

  /** Restart a Database Endpoint. TODO: should return databricks.longrunning.Operation */
  DatabaseEndpoint restartDatabaseEndpoint(
      RestartDatabaseEndpointRequest restartDatabaseEndpointRequest);

  /** Update a Database Branch. */
  DatabaseBranch updateDatabaseBranch(UpdateDatabaseBranchRequest updateDatabaseBranchRequest);

  /** Update a Database Endpoint. TODO: should return databricks.longrunning.Operation { */
  DatabaseEndpoint updateDatabaseEndpoint(
      UpdateDatabaseEndpointRequest updateDatabaseEndpointRequest);

  /** Update a Database Project. */
  DatabaseProject updateDatabaseProject(UpdateDatabaseProjectRequest updateDatabaseProjectRequest);
}
