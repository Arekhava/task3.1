package by.entity;

public class Triangle {
    private int id;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(int id, Point pointA, Point pointB, Point pointC) {
        if (pointA == null || pointB == null || pointC == null)
            throw new IllegalArgumentException("Points can't be null!");
        this.id = id;
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    @Override
    public int hashCode() {
        int result;
        result = getPointA() != null ? getPointA().hashCode() : 0;
        result = 31 * result + (getPointB() != null ? getPointB().hashCode() : 0);
        result = 31 * result + (getPointC() != null ? getPointC().hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) obj;

        if (getPointA() != null ? !getPointA().equals(triangle.getPointA()) : triangle.getPointA() != null) {
            return false;
        }
        if (getPointB() != null ? !getPointB().equals(triangle.getPointB()) : triangle.getPointB() != null) {
            return false;
        }
       return  (getPointC() != null ? !getPointA().equals(triangle.getPointC()) : triangle.getPointC() != null);

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("id=").append(id).append(",");
        sb.append("PointA:").append(pointA.toString());
        sb.append(";");
        sb.append("PointB:").append(pointB.toString());
        sb.append(";");
        sb.append("PointC:").append(pointC.toString());
        return sb.toString();
    }
}




