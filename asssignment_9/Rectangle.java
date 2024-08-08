// Program to create a rectangle sketcher
// Name: Blessing Hlongwane
// Student Number: HLNBLE002
// Date: 02 October 2023


public class Rectangle extends VectorObject {
   
   private int xLen;
   private int yLen;
   
   public Rectangle(int id, int x, int y, int xLen, int yLen) {
        super(id, x, y);
        this.xLen = xLen;
        this.yLen = yLen;
   } 

    @Override
    public void draw(char[][] matrix) {
        for (int i = 0; i < yLen; i++) {
            for (int j = 0; j < xLen; j++) {
                int newX = super.x + j;
                int newY = super.y + i;
                if (newX >= 0 && newX < matrix[0].length && newY >= 0 && newY < matrix.length) {
                    matrix[newY][newX] = '*';
                }
            }
        }
    }
    
  }