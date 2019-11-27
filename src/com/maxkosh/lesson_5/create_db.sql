-- creating table
CREATE TABLE Jaegers (
	id			SERIAL PRIMARY KEY,
	modelName			TEXT,
	mark			CHAR(6),
	height			FLOAT(4),
	weight			FLOAT(4),
	status			TEXT,
	origin			TEXT,
	launch			DATE,
	kaijuKill			INTEGER
	);