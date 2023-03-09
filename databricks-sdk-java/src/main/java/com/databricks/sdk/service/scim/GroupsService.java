// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.util.List;
import java.util.Map;

/**
 * Groups simplify identity management, making it easier to assign access to
 * Databricks Workspace, data, and other securable objects.
 * 
 * It is best practice to assign access to workspaces and access-control
 * policies in Unity Catalog to groups, instead of to users individually. All
 * Databricks Workspace identities can be assigned as members of groups, and
 * members inherit permissions that are assigned to their group.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface GroupsService {
	/**
     * Create a new group.
     * 
     * Creates a group in the Databricks Workspace with a unique name, using the
     * supplied group details.
     */
    Group create(Group group);
    
	/**
     * Delete a group.
     * 
     * Deletes a group from the Databricks Workspace.
     */
    void delete(DeleteGroupRequest deleteGroupRequest);
    
	/**
     * Get group details.
     * 
     * Gets the information for a specific group in the Databricks Workspace.
     */
    Group get(GetGroupRequest getGroupRequest);
    
	/**
     * List group details.
     * 
     * Gets all details of the groups associated with the Databricks Workspace.
     */
    ListGroupsResponse list(ListGroupsRequest listGroupsRequest);
    
	/**
     * Update group details.
     * 
     * Partially updates the details of a group.
     */
    void patch(PartialUpdate partialUpdate);
    
	/**
     * Replace a group.
     * 
     * Updates the details of a group by replacing the entire group entity.
     */
    void update(Group group);
    
}