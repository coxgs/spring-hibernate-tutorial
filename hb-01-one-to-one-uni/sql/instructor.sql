DROP TABLE IF EXISTS instructor;

CREATE TABLE instructor (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(45),
	last_name VARCHAR(45),
	email VARCHAR(45),
	instructor_detail_id INT,
	FOREIGN KEY (instructor_detail_id)
		REFERENCES instructor_detail (id)
);