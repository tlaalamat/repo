  public class Cercle {
	 private float x;
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
   
    @Override
        public String toString() {
            return "Cercle{" + "x=" + x + ", y=" + y + '}';
        }

       
   
}
