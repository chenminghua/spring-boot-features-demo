/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.tables.daos;


import cn.emac.demo.petstore.domain.tables.Item;
import cn.emac.demo.petstore.domain.tables.records.ItemRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.List;


/**
 * Itens
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class ItemDao extends DAOImpl<ItemRecord, cn.emac.demo.petstore.domain.tables.pojos.Item, String> {

	/**
	 * Create a new ItemDao without any configuration
	 */
	public ItemDao() {
		super(Item.ITEM, cn.emac.demo.petstore.domain.tables.pojos.Item.class);
	}

	/**
	 * Create a new ItemDao with an attached configuration
	 */
	@Autowired
	public ItemDao(Configuration configuration) {
		super(Item.ITEM, cn.emac.demo.petstore.domain.tables.pojos.Item.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getId(cn.emac.demo.petstore.domain.tables.pojos.Item object) {
		return object.getItemid();
	}

	/**
	 * Fetch records that have <code>itemid IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByItemid(String... values) {
		return fetch(Item.ITEM.ITEMID, values);
	}

	/**
	 * Fetch a unique record that has <code>itemid = value</code>
	 */
	public cn.emac.demo.petstore.domain.tables.pojos.Item fetchOneByItemid(String value) {
		return fetchOne(Item.ITEM.ITEMID, value);
	}

	/**
	 * Fetch records that have <code>productid IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByProductid(String... values) {
		return fetch(Item.ITEM.PRODUCTID, values);
	}

	/**
	 * Fetch records that have <code>listprice IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByListprice(BigDecimal... values) {
		return fetch(Item.ITEM.LISTPRICE, values);
	}

	/**
	 * Fetch records that have <code>unitcost IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByUnitcost(BigDecimal... values) {
		return fetch(Item.ITEM.UNITCOST, values);
	}

	/**
	 * Fetch records that have <code>supplier IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchBySupplier(Integer... values) {
		return fetch(Item.ITEM.SUPPLIER, values);
	}

	/**
	 * Fetch records that have <code>status IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByStatus(String... values) {
		return fetch(Item.ITEM.STATUS, values);
	}

	/**
	 * Fetch records that have <code>attr1 IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByAttr1(String... values) {
		return fetch(Item.ITEM.ATTR1, values);
	}

	/**
	 * Fetch records that have <code>attr2 IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByAttr2(String... values) {
		return fetch(Item.ITEM.ATTR2, values);
	}

	/**
	 * Fetch records that have <code>attr3 IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByAttr3(String... values) {
		return fetch(Item.ITEM.ATTR3, values);
	}

	/**
	 * Fetch records that have <code>attr4 IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByAttr4(String... values) {
		return fetch(Item.ITEM.ATTR4, values);
	}

	/**
	 * Fetch records that have <code>attr5 IN (values)</code>
	 */
	public List<cn.emac.demo.petstore.domain.tables.pojos.Item> fetchByAttr5(String... values) {
		return fetch(Item.ITEM.ATTR5, values);
	}
}
