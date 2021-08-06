package org.zkz.es.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.zkz.es.entity.EsItem;

import java.util.List;

/**
 * @Author Yoke
 * @Date 2018/12/13 上午9:46
 */
public interface ItemRepository extends ElasticsearchRepository<EsItem, String> {

    List<EsItem> findByName(String keyword);

    Page<EsItem> findByName(String name, Pageable page);

    EsItem findByItemId(String itemId);

    List<EsItem> findByItemIdIn(List<String> itemIds);

}
