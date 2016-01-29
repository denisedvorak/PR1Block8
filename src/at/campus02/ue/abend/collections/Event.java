package at.campus02.ue.abend.collections;

public class Event {

	private String ort;
	private String title;
	private double eintrittspreis;
	
	public Event(String ort, String title, double eintrittpreis) {
		super();
		this.ort = ort;
		this.title = title;
		this.eintrittspreis = eintrittpreis;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getEintrittspreis() {
		return eintrittspreis;
	}

	public void setEintrittspreis(double eintrittspreis) {
		this.eintrittspreis = eintrittspreis;
	}

	@Override
	public String toString() {
		return "Event [ort=" + ort + ", title=" + title + ", eintrittspreis=" + eintrittspreis + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ort == null) ? 0 : ort.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (ort == null) {
			if (other.ort != null)
				return false;
		} else if (!ort.equals(other.ort))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
