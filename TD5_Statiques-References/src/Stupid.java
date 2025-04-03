import geometry.Point;

import java.util.ArrayList;

public class Stupid {
    private int m_integer;
    private ArrayList<Point> m_points;

    public Stupid(int integer)
    {
        m_integer=integer;
        m_points = new ArrayList<Point>();
    }

    public Stupid(Stupid other)
    {
        m_integer= other.m_integer;
        m_points = new ArrayList<Point>(other.m_points);
    }

    public void setInteger(int newInteger)
    {
        m_integer= newInteger;
    }

    public void addYear(Point element)
    {
        m_points.add(element);
    }

    public void changePoint(int position, Point newPoint)
    {
        m_points.set(position, newPoint);
    }

    public void movePoint(int position, Point vector)
    {
        Point toMove = m_points.get(position);
        toMove.move(vector);
        m_points.set(position, toMove);
    }


    @Override
    public String toString()
    {
        return "Stupid(integer:"+m_integer+", years:"+ m_points.toString()+")";
    }
}


