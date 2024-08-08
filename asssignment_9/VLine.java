// Program to create a vectical line sketcher
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023


public class VLine extends VectorObject {
   
   private int len;
      
   public VLine (int id, int x, int y, int len) {
      super(id, x, y);
      this.len = len;
   }
   
   @Override
    public void draw(char[][] matrix) {
        for (int i = 0; i < len; i++) {
            int newX = super.x;
            int newY = super.y + i;
            if (newX >= 0 && newX < matrix[0].length && newY >= 0 && newY < matrix.length) {
                matrix[newY][newX] = '*';
            }
        }
    }

}