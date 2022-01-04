public class HeavyBox implements Comparable <HeavyBox>{
	private int weight;
	private int size;
	
	public HeavyBox() {
		this.weight = (int) (Math.random()*100);
		this.size = (int) (Math.random()*20 + 1);
	}
	
	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int compareTo(HeavyBox o) {
		if(getWeight() != o.getWeight()) {
			return getWeight() - o.getWeight();
		}else {
			return getSize() - o.getSize();
		}
	}
}
