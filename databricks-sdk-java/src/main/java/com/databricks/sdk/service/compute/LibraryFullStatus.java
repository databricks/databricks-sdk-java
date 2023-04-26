// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>LibraryFullStatus class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class LibraryFullStatus {
  /** Whether the library was set to be installed on all clusters via the libraries UI. */
  @JsonProperty("is_library_for_all_clusters")
  private Boolean isLibraryForAllClusters;

  /** Unique identifier for the library. */
  @JsonProperty("library")
  private Library library;

  /** All the info and warning messages that have occurred so far for this library. */
  @JsonProperty("messages")
  private Collection<String> messages;

  /** Status of installing the library on the cluster. */
  @JsonProperty("status")
  private LibraryFullStatusStatus status;

  /**
   * <p>Setter for the field <code>isLibraryForAllClusters</code>.</p>
   *
   * @param isLibraryForAllClusters a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.LibraryFullStatus} object
   */
  public LibraryFullStatus setIsLibraryForAllClusters(Boolean isLibraryForAllClusters) {
    this.isLibraryForAllClusters = isLibraryForAllClusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>isLibraryForAllClusters</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsLibraryForAllClusters() {
    return isLibraryForAllClusters;
  }

  /**
   * <p>Setter for the field <code>library</code>.</p>
   *
   * @param library a {@link com.databricks.sdk.service.compute.Library} object
   * @return a {@link com.databricks.sdk.service.compute.LibraryFullStatus} object
   */
  public LibraryFullStatus setLibrary(Library library) {
    this.library = library;
    return this;
  }

  /**
   * <p>Getter for the field <code>library</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.Library} object
   */
  public Library getLibrary() {
    return library;
  }

  /**
   * <p>Setter for the field <code>messages</code>.</p>
   *
   * @param messages a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.LibraryFullStatus} object
   */
  public LibraryFullStatus setMessages(Collection<String> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * <p>Getter for the field <code>messages</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getMessages() {
    return messages;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.compute.LibraryFullStatusStatus} object
   * @return a {@link com.databricks.sdk.service.compute.LibraryFullStatus} object
   */
  public LibraryFullStatus setStatus(LibraryFullStatusStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.LibraryFullStatusStatus} object
   */
  public LibraryFullStatusStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LibraryFullStatus that = (LibraryFullStatus) o;
    return Objects.equals(isLibraryForAllClusters, that.isLibraryForAllClusters)
        && Objects.equals(library, that.library)
        && Objects.equals(messages, that.messages)
        && Objects.equals(status, that.status);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(isLibraryForAllClusters, library, messages, status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LibraryFullStatus.class)
        .add("isLibraryForAllClusters", isLibraryForAllClusters)
        .add("library", library)
        .add("messages", messages)
        .add("status", status)
        .toString();
  }
}
