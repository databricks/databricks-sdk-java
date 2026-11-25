// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;

/**
 * Use the Genie Migrate API to create and manage migration projects and the source files to
 * convert.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface GenieMigrateService {
  /**
   * Adds source files to a migration project. Files that are already in the project are skipped and
   * keep their conversion results.
   */
  AddProjectFilesResponse addFiles(AddProjectFilesRequest addProjectFilesRequest);

  /**
   * Requests cancellation of a long-running operation. Requires `CAN_EDIT` permission on the
   * project. Cancellation is best effort: the operation can complete before cancellation takes
   * effect. Call `GetOperation` to see its final state.
   */
  void cancelOperation(CancelOperationRequest cancelOperationRequest);

  /**
   * Converts files of a migration project in a background job. Returns an operation; poll it with
   * `GetOperation`. The operation's metadata is the current `ConversionRun`, with the run's state
   * and the status of each file. When the run completes, the operation's response is a
   * `ConvertProjectFilesResponse`. A failed or cancelled run sets the operation's `error` instead.
   * Files that fail to convert don't fail the run.
   *
   * <p>To stop a conversion, call `CancelOperation`. Cancellation is best effort, and the
   * conversion can complete first. `GetOperation` reports the final outcome.
   */
  Operation convertProjectFiles(ConvertProjectFilesRequest convertProjectFilesRequest);

  /**
   * Creates a migration project in a workspace folder. The server assigns the project ID. Add
   * source files to the project with `AddProjectFiles`.
   */
  Project create(CreateProjectRequest createProjectRequest);

  /**
   * Moves a migration project to the workspace trash. The project keeps its ID until it's removed
   * from the trash.
   */
  void delete(DeleteProjectRequest deleteProjectRequest);

  /**
   * Gets a migration project, including its conversion settings and whether they're locked. To list
   * the project's source files, call `ListProjectFiles`. To track a conversion, call
   * `GetOperation`.
   */
  Project get(GetProjectRequest getProjectRequest);

  /**
   * Gets a file of a migration project, including the conversion details stored with its converted
   * file, when available. Requires `CAN_READ` permission on the project and, once the file is
   * converted, on the converted file.
   */
  ProjectFile getFile(GetProjectFileRequest getProjectFileRequest);

  /**
   * Gets the latest state of a long-running operation, such as a conversion started by
   * `ConvertProjectFiles`. Operation names have the format
   * `projects/{project_id}/operations/{operation_id}`. Use the full name that the service returned,
   * and treat the operation ID as opaque. Requires `CAN_READ` permission on the project.
   */
  Operation getOperation(GetOperationRequest getOperationRequest);

  /**
   * Lists the migration projects in a workspace folder. Select the folder with `filter`; without a
   * filter, lists the caller's home folder. Listing every project in the workspace isn't supported.
   *
   * <p>Returns project summaries without conversion settings; call `GetProject` for the full
   * project. A page can be empty even when more pages follow, so keep requesting pages until
   * `next_page_token` is empty.
   */
  ListProjectsResponse list(ListProjectsRequest listProjectsRequest);

  /**
   * Lists the files of a migration project with their latest conversion statuses. To read a file's
   * changes, to-do items, blockers, and notes, call `GetProjectFile`. A page can have fewer files
   * than requested, or none, even when more pages follow; keep requesting pages until
   * `next_page_token` is empty.
   */
  ListProjectFilesResponse listFiles(ListProjectFilesRequest listProjectFilesRequest);

  /**
   * Removes files from a migration project by their resource names. The source files and their
   * converted output stay in the workspace.
   */
  RemoveProjectFilesResponse removeFiles(RemoveProjectFilesRequest removeProjectFilesRequest);

  /**
   * Marks files of a migration project as reviewed, accepting their converted output. Each file's
   * status becomes `FILE_STATUS_REVIEWED`, and reviewed files aren't converted again. Files that
   * are already reviewed don't change. Returns the files in request order.
   */
  ReviewProjectFilesResponse reviewProjectFiles(
      ReviewProjectFilesRequest reviewProjectFilesRequest);

  /**
   * Removes the reviewed status from files of a migration project. Each file returns to the status
   * it had before it was reviewed. Files that aren't reviewed don't change. Returns the files in
   * request order.
   */
  UnreviewProjectFilesResponse unreviewProjectFiles(
      UnreviewProjectFilesRequest unreviewProjectFilesRequest);

  /**
   * Updates a migration project. Only the fields listed in `update_mask` change. An empty mask, or
   * a mask with an unsupported field, returns `INVALID_PARAMETER_VALUE`. When `changes_locked` is
   * `true`, the source dialect and target framework can't be changed.
   */
  Project update(UpdateProjectRequest updateProjectRequest);
}
