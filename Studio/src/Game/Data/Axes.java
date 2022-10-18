package Game.Data;

public class Axes {
    
    public boolean x, y, z;
    public boolean top, bottom, left, right, back, front;

    public void SetAxesData(boolean X, boolean Y, boolean Z,
    boolean TOP, boolean BOTTOM, boolean LEFT, boolean RIGHT, boolean BACK, boolean FRONT)

    {

         this.x = X;
         this.y = Y;
         this.z = Z;

         this.top = TOP;
         this.bottom = BOTTOM;
         this.left = LEFT;
         this.right = RIGHT;
         this.back = BACK;
         this.front = FRONT;

    }
}
