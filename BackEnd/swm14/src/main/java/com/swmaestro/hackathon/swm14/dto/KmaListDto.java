package com.swmaestro.hackathon.swm14.dto;

import java.util.List;

public class KmaListDto {
	private String category;
	private List<KmaDto> kmaList;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<KmaDto> getKmaList() {
		return kmaList;
	}

	public void setKmaList(List<KmaDto> kmaList) {
		this.kmaList = kmaList;
	}

	@Override
	public String toString() {
		return "KmaListDto [category=" + category + ", kmaList=" + kmaList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((kmaList == null) ? 0 : kmaList.hashCode());
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
		KmaListDto other = (KmaListDto) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (kmaList == null) {
			if (other.kmaList != null)
				return false;
		} else if (!kmaList.equals(other.kmaList))
			return false;
		return true;
	}

}
