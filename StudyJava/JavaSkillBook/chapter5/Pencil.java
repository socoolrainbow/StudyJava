package chapter5;

import java.awt.Color;

public class Pencil
{
    private Color color;
    
    private float thickness;
    
    public Pencil()
    {
        color = new Color(0, 0, 0);
        thickness = 2.0F;
    }
    
    public void drawLine()
    {
        System.out.println("-------------------------");
    }
    
    public void drawDot()
    {
        System.out.println(".........................");
    }
}
