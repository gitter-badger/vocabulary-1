package org.gbif.vocabulary.persistence.mappers;

import org.gbif.vocabulary.model.VocabularyEntity;
import org.gbif.vocabulary.model.search.KeyNameResult;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * Base mappers for {@link VocabularyEntity} entities.
 *
 * @param <T> type of the mapper. It has to implement {@link VocabularyEntity}
 */
public interface BaseMapper<T extends VocabularyEntity> {

  T get(@Param("key") int key);

  void create(T entity);

  void update(T entity);

  List<KeyNameResult> suggest(@Param("query") String query);

  /** Searchs for a similar entity. */
  List<KeyNameResult> findSimilarities(T entity);
}
