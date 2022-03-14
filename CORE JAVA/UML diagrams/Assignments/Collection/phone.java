public class phone implements Comparable<phone>{
	private Long phoneno;

	public phone(Long phoneno) {
		super();
		this.phoneno = phoneno;
	}
	
	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "phone [phoneno=" + phoneno + "]";
	}

	@Override
	public int compareTo(phone o) {
		return o.getPhoneno().compareTo(this.getPhoneno());
	}
	
}
