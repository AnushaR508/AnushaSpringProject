package com.cg.leavemanagement.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HolidaysEntity {
	    @Id
	    /**
	     * Serial number as primary key
	     */
		private int srNo;
	    /**
	     * Year of the holiday list
	     */
		private int year;
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + srNo;
			result = prime * result + year;
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
			HolidaysEntity other = (HolidaysEntity) obj;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (srNo != other.srNo)
				return false;
			if (year != other.year)
				return false;
			return true;
		}
		/**
	     * Date of holiday
	     */
		private String date;
		public HolidaysEntity(int srNo, int year, String date, String description) {
			super();
			this.srNo = srNo;
			this.year = year;
			this.date = date;
			this.description = description;
		}
		public HolidaysEntity() {
			super();
		}
		/**
	     * Desciption of holiday
	     */
		private String description;
	  
		public int getSrNo() {
			return srNo;
		}
		public void setSrNo(int srNo) {
			this.srNo = srNo;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
	}


