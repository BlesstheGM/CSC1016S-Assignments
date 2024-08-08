// Program to create a Pt Model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

public class PtLine extends VectorObject {
   
   private int bx;
   private int by;
   
   public PtLine (int id, int x, int y, int bx, int by) {
      super(id, x, y);
      this.bx = bx;
      this.by = by;
     
   }
   
    public void draw(char[][] matrix) {
    int x0 = super.y;
    int y0 = super.x;
    int y1 = bx; 
    int x1 = by;
    boolean steep = Math.abs(y1 - y0) > Math.abs(x1 - x0);

    if (steep) {
        // Swap x0, y0
        int temp = x0;
        x0 = y0;
        y0 = temp;

        // Swap x1, y1
        temp = x1;
        x1 = y1;
        y1 = temp;
    }

    if (x0 > x1) {
        // Swap x0, x1
        int temp = x0;
        x0 = x1;
        x1 = temp;

        // Swap y0, y1
        temp = y0;
        y0 = y1;
        y1 = temp;
    }

    int deltaY = Math.abs(y1 - y0);
    int ys = (y0 < y1) ? 1 : -1;
    double m = (double) deltaY / (x1 - x0);
    int y = y0;
    double error = 0;

    for (int x = x0; x <= x1; x++) {
        if (steep) {
            matrix[y][x] = '*';
        } else {
            matrix[x][y] = '*';
        }

        error += m;

        if (error > 0.5) {
            y += ys;
            error -= 1.0;
        }
    }
}
}