package oops_prpgrams;
class Rect extends shape {
    @Override
    public String draw() {
        return "draw rectangle";
    }
}
class line extends shape{
    @Override
    public String draw() {
        return "Sraw line";
    }
}
class cube extends shape {
    @Override
    public String draw() {
        return "draw cube ";
    }
}
abstract class shape {
    abstract public String draw();
}
public class assign2q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
