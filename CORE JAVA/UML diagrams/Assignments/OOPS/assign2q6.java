package oops_prpgrams;
abstract class persistence {
    abstract public String persis();
}
class file extends persistence{
    @Override
    public String persis() {
        return "filepersistence";
    }
}
class database extends persistence{
    @Override
    public String persis() {
        return "datapersistence";
    }
}
public class assign2q6 {
	public static void main(String[] args) {
		file f1 = new file();
		System.out.println(f1.persis());
		database d1 = new database();
        System.out.println(d1.persis());
	}
}
