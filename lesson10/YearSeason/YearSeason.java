public enum YearSeason {
	AUTUMN("Autumn", 91),
	WINTER("Winter", 90),
	SPRING("Spring", 92),
	SUMMER("Summer", 92);
	
	private String description;
	private int countOfDays;
	
	YearSeason(String description, int countOfDays) {
		this.setDescription(description);
		this.setCountOfDays(countOfDays);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCountOfDays() {
		return countOfDays;
	}

	public void setCountOfDays(int countOfDays) {
		this.countOfDays = countOfDays;
	}
}
