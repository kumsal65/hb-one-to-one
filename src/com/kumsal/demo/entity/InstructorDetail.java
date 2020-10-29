package com.kumsal.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		private int id;
		
		@Column(name="youtube_chanel")
		private String youTube;
		
		@Column(name="hobby")
		private String hobby;

		public InstructorDetail(int id, String youTube, String hobby) {
			super();
			this.id = id;
			this.youTube = youTube;
			this.hobby = hobby;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getYouTube() {
			return youTube;
		}

		public void setYouTube(String youTube) {
			this.youTube = youTube;
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		
}
