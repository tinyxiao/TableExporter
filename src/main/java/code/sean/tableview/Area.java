package code.sean.tableview;


/**
 * @author sean
 * @description:
 * @date: 2018/12/18 17:24
 **/
public enum Area {
    ROW("行维度"),
    COL("列维度"),
    MEASURE("度量");

    private String name;

    private Area(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
