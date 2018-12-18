package code.sean.tableview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sean
 * @description:
 * @date: 2018/12/18 17:31
 **/
public class TableViewModel implements Serializable {

    /**
     * 是否是透视表
     */
    private boolean pivot = false;

    /**
     * 是否展示行总计
     */
    private boolean showGrantTotalForRow = false;

    /**
     * 是否展示列总计
     */
    private boolean showGrantTotalForCol = false;

    private List<TableField> rows = new ArrayList<>();
    private List<TableField> cols = new ArrayList<>();
    private List<TableField> measures = new ArrayList<>();

    private TableDataSet tableDataSet;

    public TableViewModel withView(List<TableField> fields) {
        if (fields == null || fields.size() == 0) {
            throw new IllegalArgumentException("");
        }
        for (int i = 0; i < fields.size(); i++) {
            TableField tableField = fields.get(i);
            if (tableField.getArea().equals(Area.ROW)) {
                rows.add(tableField);
            } else if (tableField.getArea().equals(Area.COL)) {
                cols.add(tableField);
            } else if (tableField.getArea().equals(Area.MEASURE)) {
                measures.add(tableField);
            }
        }

        return this;
    }

    public TableViewModel withData(TableDataSet tableDataSet) {
        this.tableDataSet = tableDataSet;
        return this;
    }

    public TableViewModel withPivot(boolean enable) {
        this.pivot = enable;
        return this;
    }

    public TableViewModel showGrantTotalForRow(boolean enable) {
        this.showGrantTotalForRow = enable;
        return this;
    }

    public TableViewModel showGrantTotalForCol(boolean enable) {
        this.showGrantTotalForCol = enable;
        return this;
    }

    public boolean isPivot() {
        return pivot;
    }

    public boolean isShowGrantTotalForRow() {
        return showGrantTotalForRow;
    }

    public boolean isShowGrantTotalForCol() {
        return showGrantTotalForCol;
    }

    public List<TableField> getRows() {
        return rows;
    }

    public List<TableField> getCols() {
        return cols;
    }

    public List<TableField> getMeasures() {
        return measures;
    }

    public TableDataSet getTableDataSet() {
        return tableDataSet;
    }


}
