package code.sean.tableview;

import java.io.Serializable;

import code.sean.tableview.aggregator.Aggregator;

/**
 * @author sean
 * @description:
 * @date: 2018/12/18 17:21
 **/
public class TableField implements Serializable {

    /**
     * 名称
     */
    private String name;

    /**
     * 展示顺序,从0开始
     */
    private int index;

    /**
     * 展示区域
     */
    private Area area;

    /**
     * 针对度量(聚合类型)
     */
    private Aggregator aggregator;

    public TableField withName(String name) {
        this.name = name;
        return this;
    }

    public TableField withIndex(int index) {
        this.index = index;
        return this;
    }

    public TableField withArea(Area area) {
        this.area = area;
        return this;
    }

    public TableField withAggregator(Aggregator aggregator) {
        this.aggregator = aggregator;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public Area getArea() {
        return area;
    }

    public Aggregator getAggregator() {
        return aggregator;
    }
}
