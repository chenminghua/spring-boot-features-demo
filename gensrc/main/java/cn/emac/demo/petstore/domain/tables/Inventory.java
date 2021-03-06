/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables;


import cn.emac.demo.petstore.domain.Jpetstore;
import cn.emac.demo.petstore.domain.Keys;
import cn.emac.demo.petstore.domain.tables.records.InventoryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Inventory
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Inventory extends TableImpl<InventoryRecord> {

    private static final long serialVersionUID = 2067900429;

    /**
     * The reference instance of <code>jpetstore.inventory</code>
     */
    public static final Inventory INVENTORY = new Inventory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryRecord> getRecordType() {
        return InventoryRecord.class;
    }

    /**
     * The column <code>jpetstore.inventory.itemid</code>.
     */
    public final TableField<InventoryRecord, String> ITEMID = createField("itemid", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>jpetstore.inventory.qty</code>.
     */
    public final TableField<InventoryRecord, Integer> QTY = createField("qty", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>jpetstore.inventory</code> table reference
     */
    public Inventory() {
        this("inventory", null);
    }

    /**
     * Create an aliased <code>jpetstore.inventory</code> table reference
     */
    public Inventory(String alias) {
        this(alias, INVENTORY);
    }

    private Inventory(String alias, Table<InventoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Inventory(String alias, Table<InventoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Inventory");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jpetstore.JPETSTORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InventoryRecord> getPrimaryKey() {
        return Keys.KEY_INVENTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InventoryRecord>> getKeys() {
        return Arrays.<UniqueKey<InventoryRecord>>asList(Keys.KEY_INVENTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inventory as(String alias) {
        return new Inventory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory rename(String name) {
        return new Inventory(name, null);
    }
}
