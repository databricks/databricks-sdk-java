// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;

/**
 * Manage tag assignments on workspace-scoped objects.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceEntityTagAssignmentsService {
  /** Create a tag assignment */
  TagAssignment createTagAssignment(CreateTagAssignmentRequest createTagAssignmentRequest);

  /** Delete a tag assignment */
  void deleteTagAssignment(DeleteTagAssignmentRequest deleteTagAssignmentRequest);

  /** Get a tag assignment */
  TagAssignment getTagAssignment(GetTagAssignmentRequest getTagAssignmentRequest);

  /** List the tag assignments for an entity */
  ListTagAssignmentsResponse listTagAssignments(
      ListTagAssignmentsRequest listTagAssignmentsRequest);

  /** Update a tag assignment */
  TagAssignment updateTagAssignment(UpdateTagAssignmentRequest updateTagAssignmentRequest);
}
