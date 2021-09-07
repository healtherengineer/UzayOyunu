
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;

class Ates{
    
    private int x;
    private int y;  

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
    
}

public class OyunEkrani extends JFrame
{
    private int gecen_sure =0;
    private int harcanan_ates = 0;
    
    private BufferedImage image;
    
     private ArrayList <Ates> atesler = new ArrayList<Ates>();

     private int atesdirY = 1;
     private int topX =0;
     private int topdirX = 2;
     
    public OyunEkrani(String title) throws HeadlessException
    {
        super(title);
    }
    

    
    public static void main(String[] args)
    {
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          ekran.setResizable(false);
          ekran.setFocusable(false);
          
          ekran.setSize(800, 600);
          
          Oyun oyun = new Oyun();
          
          oyun.requestFocus();
          
          oyun.addKeyListener(oyun); // add key listener bir interface ou hallet 

          oyun.setFocusable(false);
          
          oyun.setFocusTraversalKeysEnabled(false);
          ekran.add(oyun);
          ekran.setVisible(true);
          
          

      
        
        
        
        
    }

    
}
