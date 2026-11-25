// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.geniemigrate;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A source file in a migration project, with its latest conversion results. The service sets the
 * conversion results. To accept the converted output, call `ReviewProjectFiles`; to undo that, call
 * `UnreviewProjectFiles`. Neither method changes the conversion results.
 */
@Generated
public class ProjectFile {
  /**
   * Issues that block the conversion. Returned only by `GetProjectFile`, which reads them from the
   * converted file.
   */
  @JsonProperty("blockers")
  private Collection<String> blockers;

  /**
   * The changes made during conversion. Returned only by `GetProjectFile`, which reads them from
   * the converted file.
   */
  @JsonProperty("changes")
  private Collection<String> changes;

  /**
   * The location of the asset that this file was derived from. Absent if the file wasn't derived
   * from another asset.
   */
  @JsonProperty("derived_from")
  private Location derivedFrom;

  /** The location of the converted file. Absent until a conversion writes it. */
  @JsonProperty("destination")
  private Location destination;

  /** The kind of the converted file, when recorded. */
  @JsonProperty("destination_kind")
  private DestinationKind destinationKind;

  /** The Databricks job or pipeline that conversion created for this file, if any. */
  @JsonProperty("destination_resource")
  private DestinationResource destinationResource;

  /**
   * The error reported for this file, if any. `GetProjectFile` returns the error stored with the
   * converted file when available, and otherwise the latest error recorded for the project file.
   */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * Whether the file has conversion notes. Returned by `ListProjectFiles`; call `GetProjectFile` to
   * read the notes.
   */
  @JsonProperty("has_notes")
  private Boolean hasNotes;

  /**
   * The resource name of the file, in the format `projects/{project_id}/files/{file_id}`. For
   * example, `projects/123/files/789`. The server assigns `file_id`, an opaque value of at most 63
   * characters.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Informational notes about the conversion that need no decision. Returned only by
   * `GetProjectFile`, which reads them from the converted file.
   */
  @JsonProperty("notes")
  private Collection<String> notes;

  /** The location of the source file. */
  @JsonProperty("source")
  private Location source;

  /**
   * The file's latest conversion status across all runs. For its status in a specific run, read
   * `ConversionRun.files` in that run's operation metadata.
   */
  @JsonProperty("status")
  private FileStatus status;

  /**
   * Follow-up work (to-do items) identified during conversion. Returned only by `GetProjectFile`,
   * which reads them from the converted file.
   */
  @JsonProperty("todos")
  private Collection<String> todos;

  public ProjectFile setBlockers(Collection<String> blockers) {
    this.blockers = blockers;
    return this;
  }

  public Collection<String> getBlockers() {
    return blockers;
  }

  public ProjectFile setChanges(Collection<String> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<String> getChanges() {
    return changes;
  }

  public ProjectFile setDerivedFrom(Location derivedFrom) {
    this.derivedFrom = derivedFrom;
    return this;
  }

  public Location getDerivedFrom() {
    return derivedFrom;
  }

  public ProjectFile setDestination(Location destination) {
    this.destination = destination;
    return this;
  }

  public Location getDestination() {
    return destination;
  }

  public ProjectFile setDestinationKind(DestinationKind destinationKind) {
    this.destinationKind = destinationKind;
    return this;
  }

  public DestinationKind getDestinationKind() {
    return destinationKind;
  }

  public ProjectFile setDestinationResource(DestinationResource destinationResource) {
    this.destinationResource = destinationResource;
    return this;
  }

  public DestinationResource getDestinationResource() {
    return destinationResource;
  }

  public ProjectFile setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public ProjectFile setHasNotes(Boolean hasNotes) {
    this.hasNotes = hasNotes;
    return this;
  }

  public Boolean getHasNotes() {
    return hasNotes;
  }

  public ProjectFile setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ProjectFile setNotes(Collection<String> notes) {
    this.notes = notes;
    return this;
  }

  public Collection<String> getNotes() {
    return notes;
  }

  public ProjectFile setSource(Location source) {
    this.source = source;
    return this;
  }

  public Location getSource() {
    return source;
  }

  public ProjectFile setStatus(FileStatus status) {
    this.status = status;
    return this;
  }

  public FileStatus getStatus() {
    return status;
  }

  public ProjectFile setTodos(Collection<String> todos) {
    this.todos = todos;
    return this;
  }

  public Collection<String> getTodos() {
    return todos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProjectFile that = (ProjectFile) o;
    return Objects.equals(blockers, that.blockers)
        && Objects.equals(changes, that.changes)
        && Objects.equals(derivedFrom, that.derivedFrom)
        && Objects.equals(destination, that.destination)
        && Objects.equals(destinationKind, that.destinationKind)
        && Objects.equals(destinationResource, that.destinationResource)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(hasNotes, that.hasNotes)
        && Objects.equals(name, that.name)
        && Objects.equals(notes, that.notes)
        && Objects.equals(source, that.source)
        && Objects.equals(status, that.status)
        && Objects.equals(todos, that.todos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        blockers,
        changes,
        derivedFrom,
        destination,
        destinationKind,
        destinationResource,
        errorMessage,
        hasNotes,
        name,
        notes,
        source,
        status,
        todos);
  }

  @Override
  public String toString() {
    return new ToStringer(ProjectFile.class)
        .add("blockers", blockers)
        .add("changes", changes)
        .add("derivedFrom", derivedFrom)
        .add("destination", destination)
        .add("destinationKind", destinationKind)
        .add("destinationResource", destinationResource)
        .add("errorMessage", errorMessage)
        .add("hasNotes", hasNotes)
        .add("name", name)
        .add("notes", notes)
        .add("source", source)
        .add("status", status)
        .add("todos", todos)
        .toString();
  }
}
