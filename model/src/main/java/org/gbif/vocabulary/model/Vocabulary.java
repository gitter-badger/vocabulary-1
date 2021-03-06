package org.gbif.vocabulary.model;

import org.gbif.api.model.registry.LenientEquals;
import org.gbif.api.vocabulary.Language;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Models a Vocabulary.
 *
 * <p>A vocabulary should be identified by its name, which should be unique.
 */
public class Vocabulary implements VocabularyEntity, LenientEquals<Vocabulary> {

  private Integer key;
  private String namespace;
  private String name;
  private Map<Language, String> label = new EnumMap<>(Language.class);
  private Map<Language, String> definition = new EnumMap<>(Language.class);
  private List<URI> externalDefinitions = new ArrayList<>();
  private List<String> editorialNotes = new ArrayList<>();

  // audit fields
  private LocalDateTime created;
  private String createdBy;
  private LocalDateTime modified;
  private String modifiedBy;
  private LocalDateTime deleted;

  @Override
  public Integer getKey() {
    return key;
  }

  @Override
  public void setKey(Integer key) {
    this.key = key;
  }

  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public Map<Language, String> getLabel() {
    return label;
  }

  @Override
  public void setLabel(Map<Language, String> label) {
    this.label = label;
  }

  @Override
  public Map<Language, String> getDefinition() {
    return definition;
  }

  @Override
  public void setDefinition(Map<Language, String> definition) {
    this.definition = definition;
  }

  @Override
  public List<URI> getExternalDefinitions() {
    return externalDefinitions;
  }

  @Override
  public void setExternalDefinitions(List<URI> externalDefinitions) {
    this.externalDefinitions = externalDefinitions;
  }

  @Override
  public List<String> getEditorialNotes() {
    return editorialNotes;
  }

  @Override
  public void setEditorialNotes(List<String> editorialNotes) {
    this.editorialNotes = editorialNotes;
  }

  @Override
  public LocalDateTime getCreated() {
    return created;
  }

  @Override
  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  @Override
  public String getCreatedBy() {
    return createdBy;
  }

  @Override
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public LocalDateTime getModified() {
    return modified;
  }

  @Override
  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  @Override
  public String getModifiedBy() {
    return modifiedBy;
  }

  @Override
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  @Override
  public LocalDateTime getDeleted() {
    return deleted;
  }

  @Override
  public void setDeleted(LocalDateTime deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vocabulary that = (Vocabulary) o;
    return Objects.equals(key, that.key)
        && Objects.equals(namespace, that.namespace)
        && Objects.equals(name, that.name)
        && Objects.equals(label, that.label)
        && Objects.equals(definition, that.definition)
        && Objects.equals(externalDefinitions, that.externalDefinitions)
        && Objects.equals(editorialNotes, that.editorialNotes)
        && Objects.equals(created, that.created)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(modified, that.modified)
        && Objects.equals(modifiedBy, that.modifiedBy)
        && Objects.equals(deleted, that.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        key,
        namespace,
        name,
        label,
        definition,
        externalDefinitions,
        editorialNotes,
        created,
        createdBy,
        modified,
        modifiedBy,
        deleted);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Vocabulary.class.getSimpleName() + "[", "]")
        .add("key=" + key)
        .add("namespace='" + namespace + "'")
        .add("name='" + name + "'")
        .add("label=" + label)
        .add("definition=" + definition)
        .add("externalDefinitions=" + externalDefinitions)
        .add("editorialNotes=" + editorialNotes)
        .add("created=" + created)
        .add("createdBy='" + createdBy + "'")
        .add("modified=" + modified)
        .add("modifiedBy='" + modifiedBy + "'")
        .add("deleted=" + deleted)
        .toString();
  }

  @Override
  public boolean lenientEquals(Vocabulary other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    return Objects.equals(key, other.key)
        && Objects.equals(namespace, other.namespace)
        && Objects.equals(name, other.name)
        && Objects.equals(label, other.label)
        && Objects.equals(definition, other.definition)
        && Objects.equals(externalDefinitions, other.externalDefinitions)
        && Objects.equals(editorialNotes, other.editorialNotes)
        && Objects.equals(deleted, other.deleted);
  }
}
