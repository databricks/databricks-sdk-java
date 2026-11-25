// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Use the Genie Migrate API to create and manage migration projects and the source files to
 * convert.
 */
@Generated
public class GenieMigrateAPI {
  private static final Logger LOG = LoggerFactory.getLogger(GenieMigrateAPI.class);

  private final GenieMigrateService impl;

  /** Regular-use constructor */
  public GenieMigrateAPI(ApiClient apiClient) {
    impl = new GenieMigrateImpl(apiClient);
  }

  /** Constructor for mocks */
  public GenieMigrateAPI(GenieMigrateService mock) {
    impl = mock;
  }

  /**
   * Adds source files to a migration project. Files that are already in the project are skipped and
   * keep their conversion results.
   */
  public AddProjectFilesResponse addFiles(AddProjectFilesRequest request) {
    return impl.addFiles(request);
  }

  /**
   * Requests cancellation of a long-running operation. Requires `CAN_EDIT` permission on the
   * project. Cancellation is best effort: the operation can complete before cancellation takes
   * effect. Call `GetOperation` to see its final state.
   */
  public void cancelOperation(CancelOperationRequest request) {
    impl.cancelOperation(request);
  }

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
  public ConvertProjectFilesOperation convertProjectFiles(ConvertProjectFilesRequest request) {
    Operation operation = impl.convertProjectFiles(request);
    return new ConvertProjectFilesOperation(impl, operation);
  }

  /**
   * Creates a migration project in a workspace folder. The server assigns the project ID. Add
   * source files to the project with `AddProjectFiles`.
   */
  public Project create(CreateProjectRequest request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteProjectRequest().setName(name));
  }

  /**
   * Moves a migration project to the workspace trash. The project keeps its ID until it's removed
   * from the trash.
   */
  public void delete(DeleteProjectRequest request) {
    impl.delete(request);
  }

  public Project get(String name) {
    return get(new GetProjectRequest().setName(name));
  }

  /**
   * Gets a migration project, including its conversion settings and whether they're locked. To list
   * the project's source files, call `ListProjectFiles`. To track a conversion, call
   * `GetOperation`.
   */
  public Project get(GetProjectRequest request) {
    return impl.get(request);
  }

  public ProjectFile getFile(String name) {
    return getFile(new GetProjectFileRequest().setName(name));
  }

  /**
   * Gets a file of a migration project, including the conversion details stored with its converted
   * file, when available. Requires `CAN_READ` permission on the project and, once the file is
   * converted, on the converted file.
   */
  public ProjectFile getFile(GetProjectFileRequest request) {
    return impl.getFile(request);
  }

  public Operation getOperation(String name) {
    return getOperation(new GetOperationRequest().setName(name));
  }

  /**
   * Gets the latest state of a long-running operation, such as a conversion started by
   * `ConvertProjectFiles`. Operation names have the format
   * `projects/{project_id}/operations/{operation_id}`. Use the full name that the service returned,
   * and treat the operation ID as opaque. Requires `CAN_READ` permission on the project.
   */
  public Operation getOperation(GetOperationRequest request) {
    return impl.getOperation(request);
  }

  /**
   * Lists the migration projects in a workspace folder. Select the folder with `filter`; without a
   * filter, lists the caller's home folder. Listing every project in the workspace isn't supported.
   *
   * <p>Returns project summaries without conversion settings; call `GetProject` for the full
   * project. A page can be empty even when more pages follow, so keep requesting pages until
   * `next_page_token` is empty.
   */
  public Iterable<Project> list(ListProjectsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListProjectsResponse::getProjects,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<ProjectFile> listFiles(String parent) {
    return listFiles(new ListProjectFilesRequest().setParent(parent));
  }

  /**
   * Lists the files of a migration project with their latest conversion statuses. To read a file's
   * changes, to-do items, blockers, and notes, call `GetProjectFile`. A page can have fewer files
   * than requested, or none, even when more pages follow; keep requesting pages until
   * `next_page_token` is empty.
   */
  public Iterable<ProjectFile> listFiles(ListProjectFilesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listFiles,
        ListProjectFilesResponse::getProjectFiles,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Removes files from a migration project by their resource names. The source files and their
   * converted output stay in the workspace.
   */
  public RemoveProjectFilesResponse removeFiles(RemoveProjectFilesRequest request) {
    return impl.removeFiles(request);
  }

  /**
   * Marks files of a migration project as reviewed, accepting their converted output. Each file's
   * status becomes `FILE_STATUS_REVIEWED`, and reviewed files aren't converted again. Files that
   * are already reviewed don't change. Returns the files in request order.
   */
  public ReviewProjectFilesResponse reviewProjectFiles(ReviewProjectFilesRequest request) {
    return impl.reviewProjectFiles(request);
  }

  /**
   * Removes the reviewed status from files of a migration project. Each file returns to the status
   * it had before it was reviewed. Files that aren't reviewed don't change. Returns the files in
   * request order.
   */
  public UnreviewProjectFilesResponse unreviewProjectFiles(UnreviewProjectFilesRequest request) {
    return impl.unreviewProjectFiles(request);
  }

  /**
   * Updates a migration project. Only the fields listed in `update_mask` change. An empty mask, or
   * a mask with an unsupported field, returns `INVALID_PARAMETER_VALUE`. When `changes_locked` is
   * `true`, the source dialect and target framework can't be changed.
   */
  public Project update(UpdateProjectRequest request) {
    return impl.update(request);
  }

  public GenieMigrateService impl() {
    return impl;
  }
}
