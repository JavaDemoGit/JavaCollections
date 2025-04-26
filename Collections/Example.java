public class Example implements Comparable<Example>{
 
  private int x;
  private int y;

  public Example(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
  
  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public int hashCode() {
    return x;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Example) {
      Example e = (Example)obj;
      return this.x == e.x && this.y == e.y;
    }
    return false;
  }

 @Override
 public int compareTo(Example e) {
  return this.x-e.x;   //Default sorting order.
 }

 @Override
 public String toString() {
   return "Example [x="+x+",y="+y+"]";
 }
}