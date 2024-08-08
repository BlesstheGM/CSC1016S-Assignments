// Program to create a Horizontal line sketcher Model
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023

public class HLine extends VectorObject {
   
   private int len;
    
   public HLine (int id, int x, int y, int len) {
      super(id, x, y);
      this.len = len;
   }
   
    @Override
    public void draw(char[][] matrix) {
        int newX = super.x-1;
        for (int i = 0; i < len; i++) {
            newX += 1;
            int newY = super.y;
            if (newX >= 0 && newX < matrix[0].length && newY >= 0 && newY < matrix.length) {
                matrix[newY][newX] = '*';
            }
        }
    }
}