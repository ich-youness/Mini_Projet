package mini_proj;

public class model {
	private int x;
	public String[] bx = {"Triangle","Carre","Cercle","Rectangle","Ellipse","Cube","Sphere","Cylindre","Pyramide"};// je dois ajouter un segment

	   public model() {
	      x = 0;
	   }
	   public model(int x) {
	      this.x = x;
	   }
	    public void setX(){
	      x++;
	   }
	   public int getX() {
	      return x;
	   }
	   public String[] getList() {
		   return this.bx;
	   }
}
