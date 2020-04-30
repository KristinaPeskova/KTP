import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.pow;

/**
 * ��������� ����� �����.
 **/
public class Point3d {
    public static void main(String[] args) {
        System.out.println();
    }

    /**
     * ���������� X
     **/
    private double xCoord;
    /**
     * ���������� Y
     **/
    private double yCoord;
    /**
     * ���������� Z
     **/
    private double zCoord;

    /**
     * ����������� �������������
     **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /**
     * ����������� �� ���������.
     **/
    public Point3d() {
//�������� ����������� � ����� ����������� � ���������� ��������.
        this(0, 0, 0);
    }

    public double distanceTo(Point3d point) {
        return BigDecimal.valueOf(Math.sqrt(pow(xCoord - point.getX(), 2)
                                            + pow(yCoord - point.getY(), 2)
                                            + pow(zCoord - point.getZ(), 2)))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point3d)) return false;

        Point3d point = (Point3d) obj;
        return xCoord == point.getX()
                && yCoord == point.getY()
                && zCoord == point.getZ();
    }

    /**
     * ����������� ���������� X
     **/
    public double getX() {
        return xCoord;
    }

    /**
     * ����������� ���������� Y
     **/
    public double getY() {
        return yCoord;
    }

    /**
     * ����������� ���������� Z
     **/
    public double getZ() {
        return zCoord;
    }

    /**
     * ��������� �������� ���������� X.
     **/
    public void setX(double val) {
        xCoord = val;
    }

    /**
     * ��������� �������� ���������� Y.
     **/
    public void setY(double val) {
        yCoord = val;
    }

    /**
     * ��������� �������� ���������� Z.
     **/
    public void setZ(double val) {
        zCoord = val;
    }

}