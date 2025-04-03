package geometry;

/*
Classe d'un point en 2D contenant ses coordonnees
@member x  abscisse (double) du point
@member y  ordonnee (double) du point
*/
public class Point
{
  private  double m_x;
  private  double m_y;

  /**
  Constructeur, initialise un point à l'orgine (0,0)
  */
  public Point()
  {
    m_x=0.0;
    m_y=0.0;
  }

  /**
  Constructeur, initialise un point aux coordonnées spécifiées
  @param x abscisse du point
  @param y ordonnée du point
  */
  public Point(double x, double y)
  {
    m_x=x;
    m_y=y;
  }

  /**
    Calcule la distance du point avec un autre point
    @param other  l autre point
    @return  la distance euclidienne entre le point courant et le point other
  */
  public double distance(Point other)
  {
    return Math.sqrt( (m_x-other.m_x)*(m_x-other.m_x) + (m_y-other.m_y)*(m_y-other.m_y) );
  }

  /**
    Cree un string affichant les coordonnées du point
    @return  String affichant "(x,y)"
      ou x et y sont l abscisse et l ordonnee respectives de p
  */
  @Override
  public String toString()
  {
    return "geometry.Point("+m_x+","+m_y+")";
  }

  /**
    Decale le point
    @param vector vector de translation
    @return le point translate par le vector
  */
  public void move(Point vector)
  {
    m_x+= vector.m_x;
    m_y+= vector.m_y;
  }

  /**
   * @return la coordonnee X du point
   */
  public double getX()
  {
    return m_x;
  }

  /**
  @return la coordonne Y du point
   */
  public double getY()
  {
    return m_y;
  }
}
