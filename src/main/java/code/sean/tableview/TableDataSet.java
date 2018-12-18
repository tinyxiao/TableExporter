package code.sean.tableview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sean
 * @description:
 * @date: 2018/12/18 17:32
 **/
public class TableDataSet implements Serializable {

    private List<String> columns;

    private Object[][] data;

    public TableDataSet withColumns(List<String> columns) {
        this.columns = new ArrayList<String>(columns);
        return this;
    }

    public TableDataSet withData(Object[][] data) {
        this.data = data;
        return this;
    }

    public String getColumn(int index) {
        if (index < 0 || index >= columns.size()) {
            throw new IndexOutOfBoundsException();
        }
        return columns.get(index);
    }

    public int indexOfColumn(String column) {
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).equals(column)) {
                return i;
            }
        }

        return -1;
    }

    public Object valueAt(int row, int col) {
        if (row < 0 || col < 0 || row >= data.length || col >= data[0].length) {
            throw new IndexOutOfBoundsException();
        }

        return data[row][col];
    }


}
