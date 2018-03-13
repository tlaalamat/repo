public class Cercle {
       
        public static void main(String[] args) {
        // TODO code application logic here
       
       Cercle c1 = new Cercle() ;
       Cercle c2 = new Cercle(4,5) ;
     
    }
       
   
       
	 private float x;

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
	 private float y; 

        

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Cercle other = (Cercle) obj;
            if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
                return false;
            }
            if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
                return false;
            }
            return true;
        }

        
	 
     Cercle(float x, float y) {
            this.x = x;
            this.y = y;
        }
      Cercle() {
            
        }
   
    @Override
        public String toString() {
            return "Cercle{" + "x=" + x + ", y=" + y + '}';
        }
        
  
       
   
}
   
   
