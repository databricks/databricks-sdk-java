// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;

/**
 * DBFS API makes it simple to interact with various data sources without having to include a users
 * credentials every time to read a file.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface DbfsService {
  /**
   * Appends a block of data to the stream specified by the input handle. If the handle does not
   * exist, this call will throw an exception with {@code RESOURCE_DOES_NOT_EXIST}.
   *
   * <p>If the block of data exceeds 1 MB, this call will throw an exception with {@code
   * MAX_BLOCK_SIZE_EXCEEDED}.
   */
  void addBlock(AddBlock addBlock);

  /**
   * Closes the stream specified by the input handle. If the handle does not exist, this call throws
   * an exception with {@code RESOURCE_DOES_NOT_EXIST}.
   */
  void close(Close close);

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
  CreateResponse create(Create create);

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
  void delete(Delete delete);

  /**
   * Gets the file information for a file or directory. If the file or directory does not exist,
   * this call throws an exception with {@code RESOURCE_DOES_NOT_EXIST}.
   */
  FileInfo getStatus(GetStatusRequest getStatusRequest);

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
  ListStatusResponse list(ListDbfsRequest listDbfsRequest);

  /**
   * Creates the given directory and necessary parent directories if they do not exist. If a file
   * (not a directory) exists at any prefix of the input path, this call throws an exception with
   * {@code RESOURCE_ALREADY_EXISTS}. <b>Note</b>: If this operation fails, it might have succeeded
   * in creating some of the necessary parent directories.
   */
  void mkdirs(MkDirs mkDirs);

  /**
   * Moves a file from one location to another location within DBFS. If the source file does not
   * exist, this call throws an exception with {@code RESOURCE_DOES_NOT_EXIST}. If a file already
   * exists in the destination path, this call throws an exception with {@code
   * RESOURCE_ALREADY_EXISTS}. If the given source path is a directory, this call always recursively
   * moves all files.
   */
  void move(Move move);

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
  void put(Put put);

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
  ReadResponse read(ReadDbfsRequest readDbfsRequest);
}
