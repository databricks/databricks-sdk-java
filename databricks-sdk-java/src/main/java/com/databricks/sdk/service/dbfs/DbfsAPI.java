// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/**
 * DBFS API makes it simple to interact with various data sources without having to include a users
 * credentials every time to read a file.
 */
public class DbfsAPI {
  private final DbfsService impl;

  /** Regular-use constructor */
  public DbfsAPI(ApiClient apiClient) {
    impl = new DbfsImpl(apiClient);
  }

  /** Constructor for mocks */
  public DbfsAPI(DbfsService mock) {
    impl = mock;
  }

  public void addBlock(long handle, String data) {
    addBlock(new AddBlock().setHandle(handle).setData(data));
  }

  /**
   * Append data block.
   *
   * <p>Appends a block of data to the stream specified by the input handle. If the handle does not
   * exist, this call will throw an exception with `RESOURCE_DOES_NOT_EXIST`.
   *
   * <p>If the block of data exceeds 1 MB, this call will throw an exception with
   * `MAX_BLOCK_SIZE_EXCEEDED`.
   */
  public void addBlock(AddBlock request) {
    impl.addBlock(request);
  }

  public void close(long handle) {
    close(new Close().setHandle(handle));
  }

  /**
   * Close the stream.
   *
   * <p>Closes the stream specified by the input handle. If the handle does not exist, this call
   * throws an exception with `RESOURCE_DOES_NOT_EXIST`.
   */
  public void close(Close request) {
    impl.close(request);
  }

  public CreateResponse create(String path) {
    return create(new Create().setPath(path));
  }

  /**
   * Open a stream.
   *
   * <p>"Opens a stream to write to a file and returns a handle to this stream. There is a 10 minute
   * idle timeout on this handle. If a file or directory already exists on the given path and
   * __overwrite__ is set to `false`, this call throws an exception with `RESOURCE_ALREADY_EXISTS`.
   *
   * <p>A typical workflow for file upload would be:
   *
   * <p>1. Issue a `create` call and get a handle. 2. Issue one or more `add-block` calls with the
   * handle you have. 3. Issue a `close` call with the handle you have.
   */
  public CreateResponse create(Create request) {
    return impl.create(request);
  }

  public void delete(String path) {
    delete(new Delete().setPath(path));
  }

  /**
   * Delete a file/directory.
   *
   * <p>Delete the file or directory (optionally recursively delete all files in the directory).
   * This call throws an exception with `IO_ERROR` if the path is a non-empty directory and
   * `recursive` is set to `false` or on other similar errors.
   *
   * <p>When you delete a large number of files, the delete operation is done in increments. The
   * call returns a response after approximately 45 seconds with an error message (503 Service
   * Unavailable) asking you to re-invoke the delete operation until the directory structure is
   * fully deleted.
   *
   * <p>For operations that delete more than 10K files, we discourage using the DBFS REST API, but
   * advise you to perform such operations in the context of a cluster, using the [File system
   * utility (dbutils.fs)](/dev-tools/databricks-utils.html#dbutils-fs). `dbutils.fs` covers the
   * functional scope of the DBFS REST API, but from notebooks. Running such operations using
   * notebooks provides better control and manageability, such as selective deletes, and the
   * possibility to automate periodic delete jobs.
   */
  public void delete(Delete request) {
    impl.delete(request);
  }

  public FileInfo getStatus(String path) {
    return getStatus(new GetStatus().setPath(path));
  }

  /**
   * Get the information of a file or directory.
   *
   * <p>Gets the file information for a file or directory. If the file or directory does not exist,
   * this call throws an exception with `RESOURCE_DOES_NOT_EXIST`.
   */
  public FileInfo getStatus(GetStatus request) {
    return impl.getStatus(request);
  }

  public ListStatusResponse list(String path) {
    return list(new List().setPath(path));
  }

  /**
   * List directory contents or file details.
   *
   * <p>List the contents of a directory, or details of the file. If the file or directory does not
   * exist, this call throws an exception with `RESOURCE_DOES_NOT_EXIST`.
   *
   * <p>When calling list on a large directory, the list operation will time out after approximately
   * 60 seconds. We strongly recommend using list only on directories containing less than 10K files
   * and discourage using the DBFS REST API for operations that list more than 10K files. Instead,
   * we recommend that you perform such operations in the context of a cluster, using the [File
   * system utility (dbutils.fs)](/dev-tools/databricks-utils.html#dbutils-fs), which provides the
   * same functionality without timing out.
   */
  public ListStatusResponse list(List request) {
    return impl.list(request);
  }

  public void mkdirs(String path) {
    mkdirs(new MkDirs().setPath(path));
  }

  /**
   * Create a directory.
   *
   * <p>Creates the given directory and necessary parent directories if they do not exist. If a file
   * (not a directory) exists at any prefix of the input path, this call throws an exception with
   * `RESOURCE_ALREADY_EXISTS`. **Note**: If this operation fails, it might have succeeded in
   * creating some of the necessary parent directories.
   */
  public void mkdirs(MkDirs request) {
    impl.mkdirs(request);
  }

  public void move(String sourcePath, String destinationPath) {
    move(new Move().setSourcePath(sourcePath).setDestinationPath(destinationPath));
  }

  /**
   * Move a file.
   *
   * <p>Moves a file from one location to another location within DBFS. If the source file does not
   * exist, this call throws an exception with `RESOURCE_DOES_NOT_EXIST`. If a file already exists
   * in the destination path, this call throws an exception with `RESOURCE_ALREADY_EXISTS`. If the
   * given source path is a directory, this call always recursively moves all files.",
   */
  public void move(Move request) {
    impl.move(request);
  }

  public void put(String path) {
    put(new Put().setPath(path));
  }

  /**
   * Upload a file.
   *
   * <p>Uploads a file through the use of multipart form post. It is mainly used for streaming
   * uploads, but can also be used as a convenient single call for data upload.
   *
   * <p>Alternatively you can pass contents as base64 string.
   *
   * <p>The amount of data that can be passed (when not streaming) using the __contents__ parameter
   * is limited to 1 MB. `MAX_BLOCK_SIZE_EXCEEDED` will be thrown if this limit is exceeded.
   *
   * <p>If you want to upload large files, use the streaming upload. For details, see
   * :method:dbfs/create, :method:dbfs/addBlock, :method:dbfs/close.
   */
  public void put(Put request) {
    impl.put(request);
  }

  public ReadResponse read(String path) {
    return read(new Read().setPath(path));
  }

  /**
   * Get the contents of a file.
   *
   * <p>"Returns the contents of a file. If the file does not exist, this call throws an exception
   * with `RESOURCE_DOES_NOT_EXIST`. If the path is a directory, the read length is negative, or if
   * the offset is negative, this call throws an exception with `INVALID_PARAMETER_VALUE`. If the
   * read length exceeds 1 MB, this call throws an exception with `MAX_READ_SIZE_EXCEEDED`.
   *
   * <p>If `offset + length` exceeds the number of bytes in a file, it reads the contents until the
   * end of file.",
   */
  public ReadResponse read(Read request) {
    return impl.read(request);
  }

  public DbfsService impl() {
    return impl;
  }
}
