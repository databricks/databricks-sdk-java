// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * DBFS API makes it simple to interact with various data sources without having to include a users
 * credentials every time to read a file.
 */
@Generated
public class DbfsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(DbfsAPI.class);

  private final DbfsService impl;

  /** Regular-use constructor */
  public DbfsAPI(ApiClient apiClient) {
    impl = new DbfsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DbfsAPI(DbfsService mock) {
    impl = mock;
  }

  /**
   * Appends a block of data to the stream specified by the input handle. If the handle does not
   * exist, this call will throw an exception with {@code RESOURCE_DOES_NOT_EXIST}.
   *
   * <p>If the block of data exceeds 1 MB, this call will throw an exception with {@code
   * MAX_BLOCK_SIZE_EXCEEDED}.
   */
  public void addBlock(AddBlock request) {
    impl.addBlock(request);
  }

  public void close(long handle) {
    close(new Close().setHandle(handle));
  }

  /**
   * Closes the stream specified by the input handle. If the handle does not exist, this call throws
   * an exception with {@code RESOURCE_DOES_NOT_EXIST}.
   */
  public void close(Close request) {
    impl.close(request);
  }

  /**
   * Opens a stream to write to a file and returns a handle to this stream. There is a 10 minute
   * idle timeout on this handle. If a file or directory already exists on the given path and
   * <b>overwrite</b> is set to false, this call will throw an exception with {@code
   * RESOURCE_ALREADY_EXISTS}.
   *
   * <p>A typical workflow for file upload would be:
   *
   * <ol>
   *   <li>Issue a {@code create} call and get a handle.
   *   <li>Issue one or more {@code add-block} calls with the handle you have.
   *   <li>Issue a {@code close} call with the handle you have.
   * </ol>
   */
  public CreateResponse create(Create request) {
    return impl.create(request);
  }

  /**
   * Delete the file or directory (optionally recursively delete all files in the directory). This
   * call throws an exception with {@code IO_ERROR} if the path is a non-empty directory and {@code
   * recursive} is set to {@code false} or on other similar errors.
   *
   * <p>When you delete a large number of files, the delete operation is done in increments. The
   * call returns a response after approximately 45 seconds with an error message (503 Service
   * Unavailable) asking you to re-invoke the delete operation until the directory structure is
   * fully deleted.
   *
   * <p>For operations that delete more than 10K files, we discourage using the DBFS REST API, but
   * advise you to perform such operations in the context of a cluster, using the <a
   * href="/dev-tools/databricks-utils.html#dbutils-fs">File system utility (dbutils.fs)</a>. {@code
   * dbutils.fs} covers the functional scope of the DBFS REST API, but from notebooks. Running such
   * operations using notebooks provides better control and manageability, such as selective
   * deletes, and the possibility to automate periodic delete jobs.
   */
  public void delete(Delete request) {
    impl.delete(request);
  }

  public FileInfo getStatus(String path) {
    return getStatus(new GetStatusRequest().setPath(path));
  }

  /**
   * Gets the file information for a file or directory. If the file or directory does not exist,
   * this call throws an exception with {@code RESOURCE_DOES_NOT_EXIST}.
   */
  public FileInfo getStatus(GetStatusRequest request) {
    return impl.getStatus(request);
  }

  public Iterable<FileInfo> list(String path) {
    return list(new ListDbfsRequest().setPath(path));
  }

  /**
   * List the contents of a directory, or details of the file. If the file or directory does not
   * exist, this call throws an exception with {@code RESOURCE_DOES_NOT_EXIST}.
   *
   * <p>When calling list on a large directory, the list operation will time out after approximately
   * 60 seconds. We strongly recommend using list only on directories containing less than 10K files
   * and discourage using the DBFS REST API for operations that list more than 10K files. Instead,
   * we recommend that you perform such operations in the context of a cluster, using the <a
   * href="/dev-tools/databricks-utils.html#dbutils-fs">File system utility (dbutils.fs)</a>, which
   * provides the same functionality without timing out.
   */
  public Iterable<FileInfo> list(ListDbfsRequest request) {
    return Paginator.newOffsetPagination(
        request, impl::list, ListStatusResponse::getFiles, response -> null);
  }

  public void mkdirs(String path) {
    mkdirs(new MkDirs().setPath(path));
  }

  /**
   * Creates the given directory and necessary parent directories if they do not exist. If a file
   * (not a directory) exists at any prefix of the input path, this call throws an exception with
   * {@code RESOURCE_ALREADY_EXISTS}. <b>Note</b>: If this operation fails, it might have succeeded
   * in creating some of the necessary parent directories.
   */
  public void mkdirs(MkDirs request) {
    impl.mkdirs(request);
  }

  /**
   * Moves a file from one location to another location within DBFS. If the source file does not
   * exist, this call throws an exception with {@code RESOURCE_DOES_NOT_EXIST}. If a file already
   * exists in the destination path, this call throws an exception with {@code
   * RESOURCE_ALREADY_EXISTS}. If the given source path is a directory, this call always recursively
   * moves all files.
   */
  public void move(Move request) {
    impl.move(request);
  }

  /**
   * Uploads a file through the use of multipart form post. It is mainly used for streaming uploads,
   * but can also be used as a convenient single call for data upload.
   *
   * <p>Alternatively you can pass contents as base64 string.
   *
   * <p>The amount of data that can be passed (when not streaming) using the <b>contents</b>
   * parameter is limited to 1 MB. {@code MAX_BLOCK_SIZE_EXCEEDED} will be thrown if this limit is
   * exceeded.
   *
   * <p>If you want to upload large files, use the streaming upload. For details, see
   * :method:dbfs/create, :method:dbfs/addBlock, :method:dbfs/close.
   */
  public void put(Put request) {
    impl.put(request);
  }

  public ReadResponse read(String path) {
    return read(new ReadDbfsRequest().setPath(path));
  }

  /**
   * Returns the contents of a file. If the file does not exist, this call throws an exception with
   * {@code RESOURCE_DOES_NOT_EXIST}. If the path is a directory, the read length is negative, or if
   * the offset is negative, this call throws an exception with {@code INVALID_PARAMETER_VALUE}. If
   * the read length exceeds 1 MB, this call throws an exception with {@code
   * MAX_READ_SIZE_EXCEEDED}.
   *
   * <p>If {@code offset + length} exceeds the number of bytes in a file, it reads the contents
   * until the end of file.
   */
  public ReadResponse read(ReadDbfsRequest request) {
    return impl.read(request);
  }

  public DbfsService impl() {
    return impl;
  }
}
