// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
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

  public LibraryFullStatus setIsLibraryForAllClusters(Boolean isLibraryForAllClusters) {
    this.isLibraryForAllClusters = isLibraryForAllClusters;
    return this;
  }

  public Boolean getIsLibraryForAllClusters() {
    return isLibraryForAllClusters;
  }

  public LibraryFullStatus setLibrary(Library library) {
    this.library = library;
    return this;
  }

  public Library getLibrary() {
    return library;
  }

  public LibraryFullStatus setMessages(Collection<String> messages) {
    this.messages = messages;
    return this;
  }

  public Collection<String> getMessages() {
    return messages;
  }

  public LibraryFullStatus setStatus(LibraryFullStatusStatus status) {
    this.status = status;
    return this;
  }

  public LibraryFullStatusStatus getStatus() {
    return status;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(isLibraryForAllClusters, library, messages, status);
  }

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
