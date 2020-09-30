DROP TABLE IF EXISTS instructor_detail;

CREATE TABLE instructor_detail (
	id SERIAL PRIMARY KEY,
	youtube_channel VARCHAR(128),
	hobby VARCHAR(45)
);