DROP TABLE IF EXISTS TBL_DEVICES;
  
CREATE TABLE TBL_DEVICE (
	name VARCHAR(250) PRIMARY KEY,
  	device_type VARCHAR(250) NOT NULL,
  	strength VARCHAR(250) DEFAULT NULL
);