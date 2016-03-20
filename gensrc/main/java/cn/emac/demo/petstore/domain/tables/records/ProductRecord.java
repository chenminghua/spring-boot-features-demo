/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.tables.records;


import cn.emac.demo.petstore.domain.tables.Product;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * Categorias
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductRecord extends UpdatableRecordImpl<ProductRecord> implements Record4<String, String, String, String> {

	private static final long serialVersionUID = 2066603434;

	/**
	 * Setter for <code>jpetstore.product.productid</code>.
	 */
	public ProductRecord setProductid(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.product.productid</code>.
	 */
	public String getProductid() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>jpetstore.product.category</code>.
	 */
	public ProductRecord setCategory(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.product.category</code>.
	 */
	public String getCategory() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>jpetstore.product.name</code>.
	 */
	public ProductRecord setName(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.product.name</code>.
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>jpetstore.product.descn</code>.
	 */
	public ProductRecord setDescn(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>jpetstore.product.descn</code>.
	 */
	public String getDescn() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Product.PRODUCT.PRODUCTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Product.PRODUCT.CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Product.PRODUCT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Product.PRODUCT.DESCN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getProductid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCategory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDescn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value1(String value) {
		setProductid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value2(String value) {
		setCategory(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value4(String value) {
		setDescn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord values(String value1, String value2, String value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProductRecord
	 */
	public ProductRecord() {
		super(Product.PRODUCT);
	}

	/**
	 * Create a detached, initialised ProductRecord
	 */
	public ProductRecord(String productid, String category, String name, String descn) {
		super(Product.PRODUCT);

		setValue(0, productid);
		setValue(1, category);
		setValue(2, name);
		setValue(3, descn);
	}
}