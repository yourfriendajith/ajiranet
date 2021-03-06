DROP TABLE IF EXISTS TBL_DEVICES, TBL_CONNECTION;
  
CREATE TABLE TBL_DEVICE (
	device_name VARCHAR(250) PRIMARY KEY,
  	device_type VARCHAR(250) NOT NULL,
  	strength int
);

CREATE TABLE TBL_CONNECTION (
	connection_id int NOT NULL PRIMARY KEY,
  	source VARCHAR(250) NOT NULL,
  	targets VARCHAR(250) NOT NULL,
 	CONSTRAINT fk_source FOREIGN KEY (source) REFERENCES TBL_DEVICE(device_name)
);




