CREATE DATABASE physio;
CREATE USER 'user'@'localhost' IDENTIFIED BY 'weak';
GRANT ALL ON physio.* TO 'user'@'localhost';
FLUSH PRIVILEGES;


