package vn.com.vti.springexam.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PrefectureForm {
	@NotNull
	private Integer id;
	@NotBlank
	private String name;
	@NotNull
	private Integer population;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}
}