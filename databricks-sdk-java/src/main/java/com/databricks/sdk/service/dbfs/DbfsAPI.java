// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dbfs;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * DBFS API makes it simple to interact with various data sources without having
 * to include a users credentials every time to read a file.
 */
public class DbfsAPI implements DbfsService {
    private final ApiClient apiClient;

    public DbfsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Append data block.
     * 
     * Appends a block of data to the stream specified by the input handle. If
     * the handle does not exist, this call will throw an exception with
     * `RESOURCE_DOES_NOT_EXIST`.
     * 
     * If the block of data exceeds 1 MB, this call will throw an exception with
     * `MAX_BLOCK_SIZE_EXCEEDED`.
     */
    @Override
    public void addBlock(AddBlock request) {
        String path = "/api/2.0/dbfs/add-block";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Close the stream.
     * 
     * Closes the stream specified by the input handle. If the handle does not
     * exist, this call throws an exception with `RESOURCE_DOES_NOT_EXIST`.
     */
    @Override
    public void close(Close request) {
        String path = "/api/2.0/dbfs/close";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Open a stream.
     * 
     * "Opens a stream to write to a file and returns a handle to this stream.
     * There is a 10 minute idle timeout on this handle. If a file or directory
     * already exists on the given path and __overwrite__ is set to `false`,
     * this call throws an exception with `RESOURCE_ALREADY_EXISTS`.
     * 
     * A typical workflow for file upload would be:
     * 
     * 1. Issue a `create` call and get a handle. 2. Issue one or more
     * `add-block` calls with the handle you have. 3. Issue a `close` call with
     * the handle you have.
     */
    @Override
    public CreateResponse create(Create request) {
        String path = "/api/2.0/dbfs/create";
        return apiClient.POST(path, request, CreateResponse.class);
    }
    
	/**
     * Delete a file/directory.
     * 
     * Delete the file or directory (optionally recursively delete all files in
     * the directory). This call throws an exception with `IO_ERROR` if the path
     * is a non-empty directory and `recursive` is set to `false` or on other
     * similar errors.
     * 
     * When you delete a large number of files, the delete operation is done in
     * increments. The call returns a response after approximately 45 seconds
     * with an error message (503 Service Unavailable) asking you to re-invoke
     * the delete operation until the directory structure is fully deleted.
     * 
     * For operations that delete more than 10K files, we discourage using the
     * DBFS REST API, but advise you to perform such operations in the context
     * of a cluster, using the [File system utility
     * (dbutils.fs)](/dev-tools/databricks-utils.html#dbutils-fs). `dbutils.fs`
     * covers the functional scope of the DBFS REST API, but from notebooks.
     * Running such operations using notebooks provides better control and
     * manageability, such as selective deletes, and the possibility to automate
     * periodic delete jobs.
     */
    @Override
    public void delete(Delete request) {
        String path = "/api/2.0/dbfs/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Get the information of a file or directory.
     * 
     * Gets the file information for a file or directory. If the file or
     * directory does not exist, this call throws an exception with
     * `RESOURCE_DOES_NOT_EXIST`.
     */
    @Override
    public FileInfo getStatus(GetStatus request) {
        String path = "/api/2.0/dbfs/get-status";
        return apiClient.GET(path, request, FileInfo.class);
    }
    
	/**
     * List directory contents or file details.
     * 
     * List the contents of a directory, or details of the file. If the file or
     * directory does not exist, this call throws an exception with
     * `RESOURCE_DOES_NOT_EXIST`.
     * 
     * When calling list on a large directory, the list operation will time out
     * after approximately 60 seconds. We strongly recommend using list only on
     * directories containing less than 10K files and discourage using the DBFS
     * REST API for operations that list more than 10K files. Instead, we
     * recommend that you perform such operations in the context of a cluster,
     * using the [File system utility
     * (dbutils.fs)](/dev-tools/databricks-utils.html#dbutils-fs), which
     * provides the same functionality without timing out.
     */
    @Override
    public ListStatusResponse list(List request) {
        String path = "/api/2.0/dbfs/list";
        return apiClient.GET(path, request, ListStatusResponse.class);
    }
    
	/**
     * Create a directory.
     * 
     * Creates the given directory and necessary parent directories if they do
     * not exist. If a file (not a directory) exists at any prefix of the input
     * path, this call throws an exception with `RESOURCE_ALREADY_EXISTS`.
     * **Note**: If this operation fails, it might have succeeded in creating
     * some of the necessary parent directories.
     */
    @Override
    public void mkdirs(MkDirs request) {
        String path = "/api/2.0/dbfs/mkdirs";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Move a file.
     * 
     * Moves a file from one location to another location within DBFS. If the
     * source file does not exist, this call throws an exception with
     * `RESOURCE_DOES_NOT_EXIST`. If a file already exists in the destination
     * path, this call throws an exception with `RESOURCE_ALREADY_EXISTS`. If
     * the given source path is a directory, this call always recursively moves
     * all files.",
     */
    @Override
    public void move(Move request) {
        String path = "/api/2.0/dbfs/move";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Upload a file.
     * 
     * Uploads a file through the use of multipart form post. It is mainly used
     * for streaming uploads, but can also be used as a convenient single call
     * for data upload.
     * 
     * Alternatively you can pass contents as base64 string.
     * 
     * The amount of data that can be passed (when not streaming) using the
     * __contents__ parameter is limited to 1 MB. `MAX_BLOCK_SIZE_EXCEEDED` will
     * be thrown if this limit is exceeded.
     * 
     * If you want to upload large files, use the streaming upload. For details,
     * see :method:dbfs/create, :method:dbfs/addBlock, :method:dbfs/close.
     */
    @Override
    public void put(Put request) {
        String path = "/api/2.0/dbfs/put";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Get the contents of a file.
     * 
     * "Returns the contents of a file. If the file does not exist, this call
     * throws an exception with `RESOURCE_DOES_NOT_EXIST`. If the path is a
     * directory, the read length is negative, or if the offset is negative,
     * this call throws an exception with `INVALID_PARAMETER_VALUE`. If the read
     * length exceeds 1 MB, this call throws an exception with
     * `MAX_READ_SIZE_EXCEEDED`.
     * 
     * If `offset + length` exceeds the number of bytes in a file, it reads the
     * contents until the end of file.",
     */
    @Override
    public ReadResponse read(Read request) {
        String path = "/api/2.0/dbfs/read";
        return apiClient.GET(path, request, ReadResponse.class);
    }
    
}