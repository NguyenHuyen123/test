package unitTest;

public class Point {
    private int _x, _y;

    public Point() {
        this._x = 1;
        this._y = 1;
    }

    public Point(int x) {
        this._x = x;

    }

    public Point(int x, int y) {
        this._x = x;
        this._y = y;
    }

    public int get_x() {
        return _x;
    }

    public int get_y() {
        return _y;
    }

    public double distance(Point another) {
        double dx = another._x - this._x;
        double dy = another._y - this._y;
        return Math.sqrt(dx * dx + dy * dy);
    }


}
